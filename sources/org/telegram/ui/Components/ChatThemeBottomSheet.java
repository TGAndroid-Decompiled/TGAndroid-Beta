package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.internal.zzr;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.WallpapersListActivity;

public final class ChatThemeBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public final Adapter adapter;
    public final View applyButton;
    public final AnimatedTextView applySubTextView;
    public final AnimatedTextView applyTextView;
    public final BackDrawable backButtonDrawable;
    public final ImageView backButtonView;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public final TextView cancelOrResetTextView;
    public StoryRecorder.AnonymousClass31 changeDayNightView;
    public ValueAnimator changeDayNightViewAnimator;
    public float changeDayNightViewProgress;
    public final ChatActivity chatActivity;
    public ChatAttachAlert chatAttachAlert;
    public IntroActivity.AnonymousClass1 chatAttachButton;
    public AnimatedTextView chatAttachButtonText;
    public boolean checkedBoostsLevel;
    public boolean checkingBoostsLevel;
    public final TextView chooseBackgroundTextView;
    public EmojiThemes currentTheme;
    public TLRPC.WallPaper currentWallpaper;
    public final RLottieDrawable darkThemeDrawable;
    public final AnonymousClass1 darkThemeView;
    public boolean dataLoaded;
    public boolean forceDark;
    public HintView hintView;
    public boolean isApplyClicked;
    public boolean isLightDarkChangeAnimation;
    public final LinearLayoutManager layoutManager;
    public ColoredImageSpan lockSpan;
    public final boolean originalIsDark;
    public final EmojiThemes originalTheme;
    public BaseFragment overlayFragment;
    public int prevSelectedPosition;
    public final FlickerLoadingView progressView;
    public final RecyclerListView recyclerView;
    public final AnonymousClass2 scroller;
    public ChatThemeItem selectedItem;
    public float subTextTranslation;
    public ValueAnimator subTextTranslationAnimator;
    public final ChatActivity.ThemeDelegate themeDelegate;
    public final TextView themeHintTextView;
    public boolean themesLoading;
    public final TextView titleView;

    public final class AnonymousClass14 implements ChatAttachAlert.ChatAttachViewDelegate {
        public AnonymousClass14() {
        }

        @Override
        public final void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
            ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
            try {
                HashMap<Object, Object> selectedPhotos = chatThemeBottomSheet.chatAttachAlert.photoLayout.getSelectedPhotos();
                if (selectedPhotos.isEmpty()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                if (str != null) {
                    File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                    bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    WallpapersListActivity.AnonymousClass6 anonymousClass6 = new WallpapersListActivity.AnonymousClass6(false, new WallpapersListActivity.FileWallpaper(file, file, ""), bitmapLoadBitmap, 3);
                    anonymousClass6.boostsStatus = chatThemeBottomSheet.boostsStatus;
                    anonymousClass6.isBlurred = false;
                    anonymousClass6.isMotion = false;
                    anonymousClass6.dimAmount = 0.2f;
                    anonymousClass6.setDialogId(chatThemeBottomSheet.chatActivity.getDialogId());
                    anonymousClass6.delegate = new ChatThemeBottomSheet$14$$ExternalSyntheticLambda0(this, 0);
                    chatThemeBottomSheet.showAsSheet(anonymousClass6);
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        @Override
        public final void didSelectBot(TLRPC.User user) {
        }

        @Override
        public final void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
            chatAttachAlert$$ExternalSyntheticLambda7.run();
        }

        @Override
        public final boolean needEnterComment() {
            return false;
        }

        @Override
        public final void onCameraOpened() {
        }

        @Override
        public final void onWallpaperSelected(Object obj) {
            WallpapersListActivity.AnonymousClass6 anonymousClass6 = new WallpapersListActivity.AnonymousClass6(true, obj, null, 4);
            ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
            anonymousClass6.boostsStatus = chatThemeBottomSheet.boostsStatus;
            anonymousClass6.setDialogId(chatThemeBottomSheet.chatActivity.getDialogId());
            anonymousClass6.delegate = new ChatThemeBottomSheet$14$$ExternalSyntheticLambda0(this, 1);
            chatThemeBottomSheet.showAsSheet(anonymousClass6);
        }

        @Override
        public final void openAvatarsSearch() {
        }

        @Override
        public final boolean selectItemOnClicking() {
            System.currentTimeMillis();
            return true;
        }

        @Override
        public final void sendAudio(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        }
    }

    public final class AnonymousClass2 extends LinearSmoothScroller {
        @Override
        public final int calculateTimeForScrolling(int i) {
            return super.calculateTimeForScrolling(i) * 6;
        }
    }

    public final class AnonymousClass7 implements ResultCallback {
        public final ChatThemeController val$chatThemeController;

        public AnonymousClass7(ChatThemeController chatThemeController) {
            this.val$chatThemeController = chatThemeController;
        }

        @Override
        public final void onComplete(Object obj) {
            List<EmojiThemes> emojiThemes = this.val$chatThemeController.getEmojiThemes(7);
            ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
            NotificationCenter.getInstance(((BottomSheet) chatThemeBottomSheet).currentAccount).doOnIdle(new EmojiView$2$$ExternalSyntheticLambda1(11, this, emojiThemes));
            chatThemeBottomSheet.themesLoading = false;
        }

        @Override
        public final void onError(Throwable th) {
            ResultCallback.CC.$default$onError(this, th);
        }

        @Override
        public final void onError(TLRPC.TL_error tL_error) {
            Toast.makeText(ChatThemeBottomSheet.this.getContext(), tL_error.text, 0).show();
        }
    }

    public final class AnonymousClass8 implements ResultCallback {
        public final ChatThemeController val$chatThemeController;

        public AnonymousClass8(ChatThemeController chatThemeController) {
            this.val$chatThemeController = chatThemeController;
        }

        @Override
        public final void onComplete(Object obj) {
            ChatThemeController chatThemeController = this.val$chatThemeController;
            List<EmojiThemes> emojiThemes = chatThemeController.getEmojiThemes((chatThemeController.isGiftThemesFullyLoaded() ? 2 : 0) | 5);
            ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
            NotificationCenter.getInstance(((BottomSheet) chatThemeBottomSheet).currentAccount).doOnIdle(new EmojiView$2$$ExternalSyntheticLambda1(12, this, emojiThemes));
            chatThemeBottomSheet.themesLoading = false;
        }

        @Override
        public final void onError(Throwable th) {
            ResultCallback.CC.$default$onError(this, th);
        }

        @Override
        public final void onError(TLRPC.TL_error tL_error) {
            Toast.makeText(ChatThemeBottomSheet.this.getContext(), tL_error.text, 0).show();
        }
    }

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public final int currentAccount;
        public final int currentViewType;
        public ArrayList items;
        public final long parentDialogId;
        public final Theme.ResourcesProvider resourcesProvider;
        public WeakReference selectedViewRef;
        public int selectedItemPosition = -1;
        public final HashMap loadingThemes = new HashMap();
        public final HashMap loadingWallpapers = new HashMap();

        public Adapter(int i, long j, Theme.ResourcesProvider resourcesProvider, int i2) {
            this.currentViewType = i2;
            this.parentDialogId = j;
            this.resourcesProvider = resourcesProvider;
            this.currentAccount = i;
        }

        @Override
        public final int getItemCount() {
            ArrayList arrayList = this.items;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            FileInputStream fileInputStream;
            int iStringKeyToInt;
            int iIntValue;
            String[] strArrSplit;
            ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) viewHolder.itemView;
            Theme.ThemeInfo themeInfo = ((EmojiThemes.ThemeItem) ((ChatThemeItem) this.items.get(i)).chatTheme.items.get(((ChatThemeItem) this.items.get(i)).themeIndex)).themeInfo;
            if (themeInfo != null && themeInfo.pathToFile != null && !themeInfo.previewParsed && new File(themeInfo.pathToFile).exists() && themeInfo.pathToFile != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(themeInfo.pathToFile));
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        try {
                            int i3 = fileInputStream2.read(ThemesHorizontalListCell.bytes);
                            if (i3 == -1) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            int i4 = i2;
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                if (i5 >= i3) {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                                byte[] bArr = ThemesHorizontalListCell.bytes;
                                if (bArr[i5] == 10) {
                                    int i7 = i5 - i6;
                                    int i8 = i7 + 1;
                                    String str = new String(bArr, i6, i7, "UTF-8");
                                    if (str.startsWith("WLS=")) {
                                        String strSubstring = str.substring(4);
                                        Uri uri = Uri.parse(strSubstring);
                                        themeInfo.slug = uri.getQueryParameter("slug");
                                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                        StringBuilder sb = new StringBuilder();
                                        fileInputStream = fileInputStream2;
                                        try {
                                            sb.append(Utilities.MD5(strSubstring));
                                            sb.append(".wp");
                                            themeInfo.pathToWallpaper = new File(filesDirFixed, sb.toString()).getAbsolutePath();
                                            String queryParameter = uri.getQueryParameter("mode");
                                            if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                                                for (String str2 : strArrSplit) {
                                                    if ("blur".equals(str2)) {
                                                        themeInfo.isBlured = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!TextUtils.isEmpty(uri.getQueryParameter("pattern"))) {
                                                try {
                                                    String queryParameter2 = uri.getQueryParameter("bg_color");
                                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                                        themeInfo.patternBgColor = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                            themeInfo.patternBgGradientColor1 = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                            themeInfo.patternBgGradientColor2 = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                            themeInfo.patternBgGradientColor3 = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                try {
                                                    String queryParameter3 = uri.getQueryParameter("rotation");
                                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                                        themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                String queryParameter4 = uri.getQueryParameter("intensity");
                                                if (!TextUtils.isEmpty(queryParameter4)) {
                                                    themeInfo.patternIntensity = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                }
                                                if (themeInfo.patternIntensity == 0) {
                                                    themeInfo.patternIntensity = 50;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            Throwable th2 = th;
                                            try {
                                                fileInputStream.close();
                                                throw th2;
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        fileInputStream = fileInputStream2;
                                        if (str.startsWith("WPS")) {
                                            themeInfo.previewWallpaperOffset = i8 + i4;
                                            z = true;
                                            break;
                                        }
                                        int iIndexOf = str.indexOf(61);
                                        if (iIndexOf != -1 && ((iStringKeyToInt = OKLCH.stringKeyToInt(str.substring(0, iIndexOf))) == Theme.key_chat_inBubble || iStringKeyToInt == Theme.key_chat_outBubble || iStringKeyToInt == Theme.key_chat_wallpaper || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to1 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to2 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to3)) {
                                            String strSubstring2 = str.substring(iIndexOf + 1);
                                            if (strSubstring2.length() <= 0 || strSubstring2.charAt(0) != '#') {
                                                iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                            } else {
                                                try {
                                                    iIntValue = Color.parseColor(strSubstring2);
                                                } catch (Exception unused3) {
                                                    iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                                }
                                            }
                                            if (iStringKeyToInt == Theme.key_chat_inBubble) {
                                                themeInfo.previewInColor = iIntValue;
                                            } else if (iStringKeyToInt == Theme.key_chat_outBubble) {
                                                themeInfo.previewOutColor = iIntValue;
                                            } else if (iStringKeyToInt == Theme.key_chat_wallpaper) {
                                                themeInfo.previewBackgroundColor = iIntValue;
                                            } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to1) {
                                                themeInfo.previewBackgroundGradientColor1 = iIntValue;
                                            } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to2) {
                                                themeInfo.previewBackgroundGradientColor2 = iIntValue;
                                            } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to3) {
                                                themeInfo.previewBackgroundGradientColor3 = iIntValue;
                                            }
                                        }
                                    }
                                    i6 += i8;
                                    i4 += i8;
                                } else {
                                    fileInputStream = fileInputStream2;
                                }
                                i5++;
                                fileInputStream2 = fileInputStream;
                            }
                            if (z || i2 == i4) {
                                break;
                                break;
                            } else {
                                fileInputStream.getChannel().position(i4);
                                i2 = i4;
                                fileInputStream2 = fileInputStream;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = fileInputStream2;
                        }
                    }
                    fileInputStream.close();
                } catch (Throwable th5) {
                    FileLog.e(th5);
                }
                if (themeInfo.pathToWallpaper == null || themeInfo.badWallpaper || new File(themeInfo.pathToWallpaper).exists()) {
                    themeInfo.previewParsed = true;
                } else {
                    HashMap map = this.loadingWallpapers;
                    if (!map.containsKey(themeInfo)) {
                        map.put(themeInfo, themeInfo.slug);
                        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = themeInfo.slug;
                        getwallpaper.wallpaper = tL_inputWallPaperSlug;
                        ConnectionsManager.getInstance(themeInfo.account).sendRequest(getwallpaper, new ChatActivity$$ExternalSyntheticLambda208(27, this, themeInfo));
                    }
                }
            }
            ChatThemeItem chatThemeItem = (ChatThemeItem) this.items.get(i);
            ChatThemeItem chatThemeItem2 = themeSmallPreviewView.chatThemeItem;
            boolean z2 = chatThemeItem2 != null && ThemeKey.equals(chatThemeItem2.chatTheme.key, chatThemeItem.chatTheme.key) && !DialogsActivity.switchingTheme && themeSmallPreviewView.lastThemeIndex == chatThemeItem.themeIndex;
            themeSmallPreviewView.setFocusable(true);
            themeSmallPreviewView.setEnabled(true);
            themeSmallPreviewView.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackgroundGray, false));
            themeSmallPreviewView.setItem(chatThemeItem, this.parentDialogId, z2);
            themeSmallPreviewView.setSelected(i == this.selectedItemPosition, z2);
            if (i == this.selectedItemPosition) {
                this.selectedViewRef = new WeakReference(themeSmallPreviewView);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Context context = viewGroup.getContext();
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            return new RecyclerListView.Holder(new ThemeSmallPreviewView(this.currentAccount, this.currentViewType, context, resourcesProvider));
        }

        public final void setSelectedItem(int i) {
            int i2 = this.selectedItemPosition;
            if (i2 == i) {
                return;
            }
            if (i2 >= 0) {
                notifyItemChanged(i2);
                WeakReference weakReference = this.selectedViewRef;
                ThemeSmallPreviewView themeSmallPreviewView = weakReference == null ? null : (ThemeSmallPreviewView) weakReference.get();
                if (themeSmallPreviewView != null) {
                    themeSmallPreviewView.setSelected(false);
                }
            }
            this.selectedItemPosition = i;
            notifyItemChanged(i);
        }
    }

    public final class ChatThemeItem {
        public final EmojiThemes chatTheme;
        public Bitmap icon;
        public boolean isSelected;
        public Drawable previewDrawable;
        public int themeIndex;

        public ChatThemeItem(EmojiThemes emojiThemes) {
            this.chatTheme = emojiThemes;
        }
    }

    public ChatThemeBottomSheet(ChatActivity chatActivity, ChatActivity.ThemeDelegate themeDelegate) {
        super(chatActivity.getParentActivity(), themeDelegate, true, false);
        int i = 0;
        this.prevSelectedPosition = -1;
        this.checkingBoostsLevel = false;
        this.checkedBoostsLevel = false;
        this.subTextTranslation = 0.0f;
        this.chatActivity = chatActivity;
        this.themeDelegate = themeDelegate;
        this.originalTheme = themeDelegate.chatTheme;
        this.currentWallpaper = themeDelegate.wallpaper;
        this.originalIsDark = Theme.currentTheme.isDark();
        Adapter adapter = new Adapter(this.currentAccount, chatActivity.getDialogId(), themeDelegate, 0);
        this.adapter = adapter;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i2 = Theme.key_dialogBackgroundGray;
            this.navBarColor = getThemedColor(i2);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i2), false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        } else {
            fixNavigationBar(getThemedColor(Theme.key_dialogBackgroundGray));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.titleView = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.backButtonView = imageView;
        int iDp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        BackDrawable backDrawable = new BackDrawable(false);
        this.backButtonDrawable = backDrawable;
        imageView.setImageDrawable(backDrawable);
        imageView.setOnClickListener(new ChatThemeBottomSheet$$ExternalSyntheticLambda4(this, i));
        frameLayout.addView(imageView, LayoutHelper.createFrame(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i3 = Theme.key_featuredStickers_addButton;
        int themedColor = getThemedColor(i3);
        int iDp2 = AndroidUtilities.dp(28.0f);
        int i4 = R.raw.sun_outline;
        String firstName = "";
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, SurfaceContainer$$ExternalSyntheticOutline0.m(i4, ""), iDp2, iDp2, false, null);
        this.darkThemeDrawable = rLottieDrawable;
        this.forceDark = !Theme.currentTheme.isDark();
        setForceDark$1(Theme.currentTheme.isDark(), false);
        rLottieDrawable.decodeSingleFrame = true;
        rLottieDrawable.scheduleNextGetFrame();
        rLottieDrawable.playInDirectionOfCustomEndFrame = true;
        rLottieDrawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        ?? r6 = new RLottieImageView(getContext()) {
            @Override
            public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (ChatThemeBottomSheet.this.forceDark) {
                    accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToDayTheme));
                } else {
                    accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToNightTheme));
                }
            }
        };
        this.darkThemeView = r6;
        r6.setAnimation(rLottieDrawable);
        r6.setScaleType(ImageView.ScaleType.CENTER);
        r6.setOnClickListener(new ChatThemeBottomSheet$$ExternalSyntheticLambda4(this, 2));
        frameLayout.addView((View) r6, LayoutHelper.createFrame(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.scroller = new AnonymousClass2(getContext());
        RecyclerListView recyclerListView = new RecyclerListView(getContext(), null);
        this.recyclerView = recyclerListView;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setDrawSelection(false);
        recyclerListView.setClipChildren(false);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setHasFixedSize(true);
        recyclerListView.setItemAnimator(null);
        recyclerListView.setNestedScrollingEnabled(false);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        recyclerListView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        recyclerListView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 12));
        recyclerListView.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 23));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext(), this.resourcesProvider);
        this.progressView = flickerLoadingView;
        flickerLoadingView.setViewType(14);
        flickerLoadingView.setVisibility(0);
        frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.applyButton = view;
        int iDp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i3);
        int themedColor3 = getThemedColor(Theme.key_featuredStickers_addButtonPressed);
        view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new ChatThemeBottomSheet$$ExternalSyntheticLambda4(this, 3));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.chooseBackgroundTextView = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.currentWallpaper == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new ChatActivity.AnonymousClass109(this, 5));
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), true, true, true);
        this.applyTextView = animatedTextView;
        AnimatedTextView.AnimatedTextDrawable drawable = animatedTextView.getDrawable();
        drawable.ellipsizeByGradient = true;
        drawable.invalidateSelf();
        animatedTextView.adaptWidth = false;
        animatedTextView.setGravity(17);
        int i5 = Theme.key_featuredStickers_buttonText;
        animatedTextView.setTextColor(getThemedColor(i5));
        animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(animatedTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(getContext(), true, true, true);
        this.applySubTextView = animatedTextView2;
        AnimatedTextView.AnimatedTextDrawable drawable2 = animatedTextView2.getDrawable();
        drawable2.ellipsizeByGradient = true;
        drawable2.invalidateSelf();
        animatedTextView2.adaptWidth = false;
        animatedTextView2.setGravity(17);
        animatedTextView2.setTextColor(getThemedColor(i5));
        animatedTextView2.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextView2.setAlpha(0.0f);
        animatedTextView2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(animatedTextView2, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.currentWallpaper != null) {
            TextView textView3 = new TextView(getContext());
            this.cancelOrResetTextView = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            zzkq.m(15.0f, R.string.RestToDefaultBackground, textView3);
            textView3.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(16, this, chatActivity));
            frameLayout.addView(textView3, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.themeHintTextView = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (chatActivity.getCurrentUser() != null) {
                firstName = UserObject.getFirstName(chatActivity.getCurrentUser());
            } else {
                TLRPC.Chat chat = chatActivity.currentChat;
                if (chat != null) {
                    firstName = chat.title;
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, firstName));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        updateButtonColors();
        updateState(false);
    }

    public final void applySelectedTheme(boolean z) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i = 1;
        if (this.checkingBoostsLevel) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        ChatActivity chatActivity = this.chatActivity;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < chatActivity.getMessagesController().channelWallpaperLevelMin) {
            chatActivity.getMessagesController().getBoostsController().userCanBoostChannel(chatActivity.getDialogId(), this.boostsStatus, new ChatThemeBottomSheet$$ExternalSyntheticLambda12(this, 1));
            return;
        }
        EmojiThemes emojiThemes = this.selectedItem.chatTheme;
        Bulletin bulletinMake = null;
        if (emojiThemes != this.currentTheme) {
            TLRPC.ChatTheme chatTheme = !emojiThemes.showAsDefaultStub ? emojiThemes.chatTheme : null;
            long giftThemeUser = emojiThemes.chatTheme instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(emojiThemes.currentAccount).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) emojiThemes.chatTheme).gift.slug) : 0L;
            TLRPC.ChatTheme chatTheme2 = emojiThemes.chatTheme;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme2).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                } else {
                    tL_starGiftUnique = null;
                }
            } else {
                tL_starGiftUnique = null;
            }
            if (giftThemeUser != 0 && tL_starGiftUnique != null && !z) {
                AlertsCreator.showGiftThemeApplyConfirm(this.currentAccount, giftThemeUser, getContext(), new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, i), tL_starGiftUnique, this.resourcesProvider);
                return;
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(chatActivity.getDialogId(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(chatActivity.getDialogId(), chatTheme, true);
            TLRPC.WallPaper wallPaper = hasChanges$1() ? null : this.themeDelegate.wallpaper;
            boolean z2 = emojiThemes.showAsDefaultStub;
            boolean z3 = this.originalIsDark;
            if (z2) {
                this.themeDelegate.setCurrentTheme(null, wallPaper, true, Boolean.valueOf(z3), false);
            } else {
                this.themeDelegate.setCurrentTheme(emojiThemes, wallPaper, true, Boolean.valueOf(z3), false);
            }
            this.isApplyClicked = true;
            TLRPC.User currentUser = chatActivity.getCurrentUser();
            if (currentUser != null && !currentUser.self) {
                boolean z4 = emojiThemes.showAsDefaultStub;
                StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(getContext(), null, 1, -1, emojiThemes.getEmojiAnimatedSticker(), chatActivity.getResourceProvider());
                stickerSetBulletinLayout.subtitleTextView.setVisibility(8);
                TextView textView = stickerSetBulletinLayout.titleTextView;
                if (z4) {
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, currentUser.first_name)));
                } else {
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, currentUser.first_name)));
                }
                textView.setTypeface(null);
                bulletinMake = Bulletin.make(chatActivity, stickerSetBulletinLayout, 2750);
            }
        }
        lambda$showGiftOfferSheet$15();
        if (bulletinMake != null) {
            bulletinMake.show();
        }
    }

    public final void close() {
        if (!hasChanges$1()) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        final int i = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        String string = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.ChatThemeSaveDialogText);
        builder.setPositiveButton(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new AlertDialog.OnButtonClickListener(this) {
            public final ChatThemeBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog2, int i2) {
                switch (i) {
                    case 0:
                        this.f$0.applySelectedTheme(false);
                        break;
                    default:
                        this.f$0.lambda$close$9(alertDialog2, i2);
                        break;
                }
            }
        });
        final int i2 = 1;
        builder.setNegativeButton(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new AlertDialog.OnButtonClickListener(this) {
            public final ChatThemeBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog2, int i3) {
                switch (i2) {
                    case 0:
                        this.f$0.applySelectedTheme(false);
                        break;
                    default:
                        this.f$0.lambda$close$9(alertDialog2, i3);
                        break;
                }
            }
        });
        builder.show();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 0));
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        Theme.ThemeInfo themeInfo;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.lambda$showGiftOfferSheet$15();
        this.chatActivity.getClass();
        if (!this.isApplyClicked) {
            ChatActivity.ThemeDelegate themeDelegate = this.themeDelegate;
            TLRPC.WallPaper wallPaper = themeDelegate.wallpaper;
            if (wallPaper == null) {
                wallPaper = this.currentWallpaper;
            }
            themeDelegate.setCurrentTheme(this.originalTheme, wallPaper, true, Boolean.valueOf(this.originalIsDark), false);
        }
        if (this.forceDark != this.originalIsDark) {
            if (Theme.currentTheme.isDark() == this.originalIsDark) {
                themeInfo = Theme.currentTheme;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                HashMap map = Theme.themesDict;
                if (((Theme.ThemeInfo) map.get(string)) != null && !((Theme.ThemeInfo) map.get(string)).isDark()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (((Theme.ThemeInfo) map.get(string2)) != null && ((Theme.ThemeInfo) map.get(string2)).isDark()) {
                    str2 = string2;
                }
                themeInfo = this.originalIsDark ? (Theme.ThemeInfo) map.get(str2) : (Theme.ThemeInfo) map.get(str);
            }
            Theme.applyTheme(themeInfo, false, this.originalIsDark);
        }
    }

    public final void fixColorsAfterAnotherWindow() {
        if (isDismissed() || this.isApplyClicked) {
            return;
        }
        Theme.disallowChangeServiceMessageColor = false;
        TLRPC.WallPaper wallPaper = hasChanges$1() ? null : this.themeDelegate.wallpaper;
        EmojiThemes emojiThemes = this.selectedItem.chatTheme;
        if (emojiThemes.showAsDefaultStub) {
            this.themeDelegate.setCurrentTheme(null, wallPaper, false, Boolean.valueOf(this.forceDark), true);
        } else {
            this.themeDelegate.setCurrentTheme(emojiThemes, wallPaper, false, Boolean.valueOf(this.forceDark), true);
        }
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            ChatAttachAlertColorsLayout chatAttachAlertColorsLayout = chatAttachAlert.colorsLayout;
            if (chatAttachAlertColorsLayout != null) {
                boolean z = this.forceDark;
                BottomSheetWithRecyclerListView.AnonymousClass8 anonymousClass8 = chatAttachAlertColorsLayout.adapter;
                ((ArrayList) anonymousClass8.val$adapter).clear();
                WallpapersListActivity.fillDefaultColors((ArrayList) anonymousClass8.val$adapter, z);
                anonymousClass8.mObservable.notifyChanged();
            }
            this.chatAttachAlert.checkColors();
        }
        Adapter adapter = this.adapter;
        if (adapter == null || adapter.items == null) {
            return;
        }
        for (int i = 0; i < adapter.items.size(); i++) {
            ((ChatThemeItem) adapter.items.get(i)).themeIndex = this.forceDark ? 1 : 0;
        }
        adapter.mObservable.notifyChanged();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i = 0;
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            public boolean isAnimationStarted = false;

            @Override
            public final void didSetColor() {
            }

            @Override
            public final void onAnimationProgress(float f) {
                ArrayList arrayList;
                ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
                Adapter adapter = chatThemeBottomSheet.adapter;
                if (f == 0.0f && !this.isAnimationStarted) {
                    if (adapter != null && (arrayList = adapter.items) != null) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            ((ChatThemeItem) obj).themeIndex = chatThemeBottomSheet.forceDark ? 1 : 0;
                        }
                    }
                    if (!chatThemeBottomSheet.isLightDarkChangeAnimation) {
                        for (int i3 = 0; i3 < adapter.getItemCount(); i3++) {
                            ((ChatThemeItem) adapter.items.get(i3)).getClass();
                        }
                    }
                    this.isAnimationStarted = true;
                }
                RLottieDrawable rLottieDrawable = chatThemeBottomSheet.darkThemeDrawable;
                int i4 = Theme.key_featuredStickers_addButton;
                rLottieDrawable.setColorFilter(new PorterDuffColorFilter(chatThemeBottomSheet.getThemedColor(i4), PorterDuff.Mode.MULTIPLY));
                chatThemeBottomSheet.setOverlayNavBarColor(chatThemeBottomSheet.getThemedColor(Theme.key_windowBackgroundGray));
                if (chatThemeBottomSheet.isLightDarkChangeAnimation) {
                    for (int i5 = 0; i5 < adapter.getItemCount(); i5++) {
                        ((ChatThemeItem) adapter.items.get(i5)).getClass();
                    }
                }
                if (f == 1.0f && this.isAnimationStarted) {
                    chatThemeBottomSheet.isLightDarkChangeAnimation = false;
                    this.isAnimationStarted = false;
                }
                chatThemeBottomSheet.updateButtonColors();
                IntroActivity.AnonymousClass1 anonymousClass1 = chatThemeBottomSheet.chatAttachButton;
                if (anonymousClass1 != null) {
                    int iDp = AndroidUtilities.dp(0.0f);
                    int themedColor = chatThemeBottomSheet.getThemedColor(Theme.key_windowBackgroundWhite);
                    int alphaComponent = ColorUtils.setAlphaComponent(chatThemeBottomSheet.getThemedColor(i4), 76);
                    anonymousClass1.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, themedColor, alphaComponent, alphaComponent));
                }
                AnimatedTextView animatedTextView = chatThemeBottomSheet.chatAttachButtonText;
                if (animatedTextView != null) {
                    animatedTextView.setTextColor(chatThemeBottomSheet.getThemedColor(i4));
                }
                chatThemeBottomSheet.setBackgroundColor(chatThemeBottomSheet.getThemedColor(Theme.key_dialogBackground));
            }
        };
        ArrayList arrayList = new ArrayList();
        if (this.chatActivity.forceDisallowRedrawThemeDescriptions) {
            BaseFragment baseFragment = this.overlayFragment;
            if (baseFragment instanceof ThemePreviewActivity) {
                arrayList.addAll(((ThemePreviewActivity) baseFragment).getThemeDescriptionsInternal());
                return arrayList;
            }
        }
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            arrayList.addAll(chatAttachAlert.getThemeDescriptions());
        }
        arrayList.add(new ThemeDescription(null, 32, null, null, new Drawable[]{this.shadowDrawable}, themeDescriptionDelegate, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(this.titleView, 4, null, null, null, null, Theme.key_dialogTextBlack));
        arrayList.add(new ThemeDescription(this.recyclerView, 16, new Class[]{ThemeSmallPreviewView.class}, null, null, null, Theme.key_dialogBackgroundGray));
        View view = this.applyButton;
        arrayList.add(new ThemeDescription(view, 32, null, null, null, null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(view, 65568, null, null, null, null, Theme.key_featuredStickers_addButtonPressed));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ThemeDescription) obj).resourcesProvider = this.themeDelegate;
        }
        return arrayList;
    }

    public final boolean hasChanges$1() {
        ChatThemeItem chatThemeItem = this.selectedItem;
        if (chatThemeItem == null) {
            return false;
        }
        EmojiThemes emojiThemes = this.currentTheme;
        ThemeKey themeKey = emojiThemes != null ? emojiThemes.key : null;
        if (themeKey == null) {
            themeKey = new ThemeKey("❌", null);
        }
        EmojiThemes emojiThemes2 = chatThemeItem.chatTheme;
        ThemeKey themeKey2 = emojiThemes2 != null ? emojiThemes2.key : null;
        if (themeKey2 == null) {
            themeKey2 = new ThemeKey("❌", null);
        }
        return !ThemeKey.equals(themeKey, themeKey2);
    }

    public final void lambda$applySelectedTheme$14(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (getContext() == null) {
            return;
        }
        Context context = getContext();
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(22, this.currentAccount, context, this.chatActivity, this.resourcesProvider);
        limitReachedBottomSheet.canApplyBoost = canApplyBoost;
        limitReachedBottomSheet.updateButton$2();
        limitReachedBottomSheet.updatePremiumButtonText();
        limitReachedBottomSheet.boostsStatus = this.boostsStatus;
        limitReachedBottomSheet.isCurrentChat = true;
        limitReachedBottomSheet.updateRows$7();
        limitReachedBottomSheet.dialogId = this.chatActivity.getDialogId();
        limitReachedBottomSheet.updateRows$7();
        limitReachedBottomSheet.statisticClickRunnable = new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 2);
        limitReachedBottomSheet.show();
    }

    public final void lambda$new$2(int i, View view) {
        Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0;
        Adapter adapter = this.adapter;
        if (adapter.items.get(i) == this.selectedItem || this.changeDayNightView != null) {
            return;
        }
        this.selectedItem = (ChatThemeItem) adapter.items.get(i);
        previewSelectedTheme();
        adapter.setSelectedItem(i);
        this.containerView.postDelayed(new zzr(this, i, 6), 100L);
        int i2 = 0;
        while (true) {
            RecyclerListView recyclerListView = this.recyclerView;
            if (i2 >= recyclerListView.getChildCount()) {
                break;
            }
            ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) recyclerListView.getChildAt(i2);
            if (themeSmallPreviewView != view && (tooltip$$ExternalSyntheticLambda0 = themeSmallPreviewView.animationCancelRunnable) != null) {
                AndroidUtilities.cancelRunOnUIThread(tooltip$$ExternalSyntheticLambda0);
                themeSmallPreviewView.animationCancelRunnable.run();
            }
            i2++;
        }
        if (!((ChatThemeItem) adapter.items.get(i)).chatTheme.showAsDefaultStub) {
            ((ThemeSmallPreviewView) view).playEmojiAnimation();
        }
        updateState(true);
    }

    public final void lambda$new$4(ChatActivity chatActivity) {
        if (this.currentWallpaper == null) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        this.currentWallpaper = null;
        lambda$showGiftOfferSheet$15();
        ChatThemeController.getInstance(this.currentAccount).clearWallpaper(chatActivity.getDialogId(), true);
    }

    public final void loadNext$1() {
        if (this.themesLoading) {
            return;
        }
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        if (chatThemeController.isAllThemesFullyLoaded()) {
            return;
        }
        this.themesLoading = true;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            chatThemeController.requestAllChatThemes(new AnonymousClass7(chatThemeController), false);
        } else {
            chatThemeController.loadNextChatThemes(new AnonymousClass8(chatThemeController));
        }
    }

    @Override
    public final void lambda$openCrafting$8() {
        close();
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || !hasChanges$1()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.containerView.getTop() && x >= this.containerView.getLeft() && x <= this.containerView.getRight()) {
            return false;
        }
        this.chatActivity.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void onContainerTranslationYChanged(float f) {
        HintView hintView = this.hintView;
        if (hintView != null) {
            hintView.hide(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.isApplyClicked = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            onDataLoaded(chatThemeController.getEmojiThemes(7));
        } else {
            loadNext$1();
        }
        ChatActivity chatActivity = this.chatActivity;
        if (chatActivity.getCurrentUser() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || chatActivity.getCurrentUser().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        HintView hintView = new HintView(9, getContext(), chatActivity.getResourceProvider(), false);
        this.hintView = hintView;
        hintView.setVisibility(4);
        this.hintView.setShowingDuration(5000L);
        this.hintView.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.forceDark) {
            this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 7), 1500L);
        this.container.addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    public final void onDataLoaded(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ChatThemeItem chatThemeItem = new ChatThemeItem((EmojiThemes) list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.dataLoaded) {
            EmojiThemes emojiThemes = this.themeDelegate.chatTheme;
            this.currentTheme = emojiThemes;
            if (emojiThemes != null) {
                emojiThemes.initColors();
            }
        }
        arrayList.add(0, chatThemeItem);
        if (!this.dataLoaded) {
            this.selectedItem = chatThemeItem;
        }
        EmojiThemes emojiThemes2 = this.currentTheme;
        ThemeKey themeKey = emojiThemes2 != null ? emojiThemes2.key : null;
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            EmojiThemes emojiThemes3 = (EmojiThemes) list.get(i);
            ChatThemeItem chatThemeItem2 = new ChatThemeItem(emojiThemes3);
            emojiThemes3.loadPreviewColors(this.currentAccount);
            chatThemeItem2.themeIndex = this.forceDark ? 1 : 0;
            if (ThemeKey.equals(emojiThemes3.key, themeKey)) {
                arrayList.add(1, chatThemeItem2);
                z = true;
            } else {
                arrayList.add(chatThemeItem2);
            }
        }
        EmojiThemes emojiThemes4 = this.currentTheme;
        if (emojiThemes4 != null && !z) {
            ChatThemeItem chatThemeItem3 = new ChatThemeItem(emojiThemes4);
            emojiThemes4.loadPreviewColors(this.currentAccount);
            chatThemeItem3.themeIndex = this.forceDark ? 1 : 0;
            arrayList.add(1, chatThemeItem3);
        }
        Adapter adapter = this.adapter;
        adapter.items = arrayList;
        adapter.mObservable.notifyChanged();
        setVisibility(0);
        if (!this.dataLoaded) {
            resetToPrimaryState(false);
            this.recyclerView.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.dataLoaded = true;
        updateState(true);
    }

    public final void previewSelectedTheme() {
        if (isDismissed() || this.isApplyClicked) {
            return;
        }
        this.isLightDarkChangeAnimation = false;
        this.chatActivity.getClass();
        TLRPC.WallPaper wallPaper = hasChanges$1() ? null : this.currentWallpaper;
        EmojiThemes emojiThemes = this.selectedItem.chatTheme;
        if (emojiThemes.showAsDefaultStub) {
            this.themeDelegate.setCurrentTheme(null, wallPaper, true, Boolean.valueOf(this.forceDark), false);
        } else {
            this.themeDelegate.setCurrentTheme(emojiThemes, wallPaper, true, Boolean.valueOf(this.forceDark), false);
        }
    }

    public final void resetToPrimaryState(boolean z) {
        Adapter adapter = this.adapter;
        ArrayList arrayList = adapter.items;
        EmojiThemes emojiThemes = this.currentTheme;
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        RecyclerListView recyclerListView = this.recyclerView;
        if (emojiThemes != null) {
            int i = 0;
            while (true) {
                if (i == arrayList.size()) {
                    i = -1;
                    break;
                } else {
                    if (ThemeKey.equals(((ChatThemeItem) arrayList.get(i)).chatTheme.key, this.currentTheme.key)) {
                        this.selectedItem = (ChatThemeItem) arrayList.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (i != -1) {
                this.prevSelectedPosition = i;
                adapter.setSelectedItem(i);
                if (i > 0 && i < arrayList.size() / 2) {
                    i--;
                }
                int iMin = Math.min(i, adapter.items.size() - 1);
                if (z) {
                    recyclerListView.smoothScrollToPosition(iMin);
                } else {
                    linearLayoutManager.scrollToPositionWithOffset(iMin, 0, linearLayoutManager.mShouldReverseLayout);
                }
            }
        } else {
            this.selectedItem = (ChatThemeItem) arrayList.get(0);
            adapter.setSelectedItem(0);
            if (z) {
                recyclerListView.smoothScrollToPosition(0);
            } else {
                linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
            }
        }
        previewSelectedTheme();
    }

    public final void setForceDark$1(boolean z, boolean z2) {
        if (this.forceDark == z) {
            return;
        }
        this.forceDark = z;
        RLottieDrawable rLottieDrawable = this.darkThemeDrawable;
        AnonymousClass1 anonymousClass1 = this.darkThemeView;
        if (z2) {
            rLottieDrawable.setCustomEndFrame(z ? rLottieDrawable.metaData[0] : 0);
            if (anonymousClass1 != null) {
                anonymousClass1.playAnimation();
                return;
            }
            return;
        }
        int i = z ? rLottieDrawable.metaData[0] - 1 : 0;
        rLottieDrawable.setCurrentFrame(i, false, true);
        rLottieDrawable.setCustomEndFrame(i);
        if (anonymousClass1 != null) {
            anonymousClass1.invalidate();
        }
    }

    public final void setupLightDarkTheme(boolean z) {
        if (isDismissed()) {
            return;
        }
        ValueAnimator valueAnimator = this.changeDayNightViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) this.chatActivity.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        AnonymousClass1 anonymousClass1 = this.darkThemeView;
        anonymousClass1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        frameLayout2.draw(canvas);
        anonymousClass1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        anonymousClass1.getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        float measuredWidth = (anonymousClass1.getMeasuredWidth() / 2.0f) + f;
        float measuredHeight = (anonymousClass1.getMeasuredHeight() / 2.0f) + f2;
        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) * 0.9f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        StoryRecorder.AnonymousClass31 anonymousClass31 = new StoryRecorder.AnonymousClass31(this, getContext(), z, canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f, f2, 1);
        this.changeDayNightView = anonymousClass31;
        anonymousClass31.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(15));
        this.changeDayNightViewProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.changeDayNightViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public boolean changedNavigationBarColor = false;

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
                chatThemeBottomSheet.changeDayNightViewProgress = fFloatValue;
                chatThemeBottomSheet.changeDayNightView.invalidate();
                if (this.changedNavigationBarColor || chatThemeBottomSheet.changeDayNightViewProgress <= 0.5f) {
                    return;
                }
                this.changedNavigationBarColor = true;
            }
        });
        this.changeDayNightViewAnimator.addListener(new CheckBox.AnonymousClass1(this, 20));
        this.changeDayNightViewAnimator.setDuration(400L);
        this.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
        this.changeDayNightViewAnimator.start();
        frameLayout2.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda1(14, this, z));
    }

    public final void showAsSheet(ThemePreviewActivity themePreviewActivity) {
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        ChatActivity chatActivity = this.chatActivity;
        themePreviewActivity.themeDelegate.parentProvider = chatActivity.getResourceProvider();
        themePreviewActivity.onSwitchDayNightDelegate = new ThemePreviewActivity.DayNightSwitchDelegate() {
            @Override
            public final boolean isDark() {
                return ChatThemeBottomSheet.this.forceDark;
            }

            @Override
            public final boolean supportsAnimation() {
                return true;
            }

            @Override
            public final void switchDayNight(boolean z) {
                ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
                chatThemeBottomSheet.forceDark = !chatThemeBottomSheet.forceDark;
                if (chatThemeBottomSheet.selectedItem != null) {
                    chatThemeBottomSheet.isLightDarkChangeAnimation = true;
                    ChatActivity chatActivity2 = chatThemeBottomSheet.chatActivity;
                    chatActivity2.forceDisallowRedrawThemeDescriptions = true;
                    TLRPC.WallPaper wallPaper = chatThemeBottomSheet.hasChanges$1() ? null : chatThemeBottomSheet.themeDelegate.wallpaper;
                    EmojiThemes emojiThemes = chatThemeBottomSheet.selectedItem.chatTheme;
                    if (emojiThemes.showAsDefaultStub) {
                        chatThemeBottomSheet.themeDelegate.setCurrentTheme(null, wallPaper, z, Boolean.valueOf(chatThemeBottomSheet.forceDark), false);
                    } else {
                        chatThemeBottomSheet.themeDelegate.setCurrentTheme(emojiThemes, wallPaper, z, Boolean.valueOf(chatThemeBottomSheet.forceDark), false);
                    }
                    chatActivity2.forceDisallowRedrawThemeDescriptions = false;
                }
            }
        };
        bottomSheetParams.onOpenAnimationFinished = new ChatActivity$$ExternalSyntheticLambda470(20);
        bottomSheetParams.onPreFinished = new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 5);
        bottomSheetParams.onDismiss = new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 6);
        bottomSheetParams.occupyNavigationBar = true;
        this.overlayFragment = themePreviewActivity;
        chatActivity.showAsSheet(themePreviewActivity, bottomSheetParams);
    }

    public final void updateButtonColors() {
        TextView textView = this.themeHintTextView;
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_dialogTextGray));
            int iDp = AndroidUtilities.dp(6.0f);
            int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_featuredStickers_addButton), 76);
            textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        }
        TextView textView2 = this.cancelOrResetTextView;
        if (textView2 != null) {
            int i = Theme.key_text_RedRegular;
            textView2.setTextColor(getThemedColor(i));
            int iDp2 = AndroidUtilities.dp(6.0f);
            int alphaComponent2 = ColorUtils.setAlphaComponent(getThemedColor(i), 76);
            textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, alphaComponent2, alphaComponent2));
        }
        int i2 = Theme.key_dialogTextBlack;
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i2), 30), 1, -1);
        ImageView imageView = this.backButtonView;
        imageView.setBackground(rippleDrawableSafeCreateSelectorDrawable);
        int themedColor = getThemedColor(i2);
        BackDrawable backDrawable = this.backButtonDrawable;
        backDrawable.color = themedColor;
        backDrawable.invalidateSelf();
        backDrawable.rotatedColor = getThemedColor(i2);
        backDrawable.invalidateSelf();
        imageView.invalidate();
        int i3 = Theme.key_featuredStickers_addButton;
        setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i3), 30), 1, -1));
        int themedColor2 = getThemedColor(Theme.key_dialogTextBlue);
        TextView textView3 = this.chooseBackgroundTextView;
        textView3.setTextColor(themedColor2);
        int iDp3 = AndroidUtilities.dp(6.0f);
        int alphaComponent3 = ColorUtils.setAlphaComponent(getThemedColor(i3), 76);
        textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, 0, alphaComponent3, alphaComponent3));
    }

    public final void updateState(boolean z) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        boolean z2;
        boolean z3;
        ValueAnimator valueAnimator;
        float f;
        float f2;
        EmojiThemes emojiThemes;
        ChatActivity chatActivity = this.chatActivity;
        TLRPC.Chat chat = chatActivity.currentChat;
        if (chat != null && !this.checkingBoostsLevel && !this.checkedBoostsLevel && this.boostsStatus == null) {
            this.checkingBoostsLevel = true;
            chatActivity.getMessagesController().getBoostsController().getBoostsStats(chatActivity.getDialogId(), new ChatThemeBottomSheet$$ExternalSyntheticLambda12(this, 0));
        }
        boolean z4 = this.dataLoaded;
        FlickerLoadingView flickerLoadingView = this.progressView;
        TextView textView = this.themeHintTextView;
        AnimatedTextView animatedTextView = this.applySubTextView;
        TextView textView2 = this.cancelOrResetTextView;
        TextView textView3 = this.chooseBackgroundTextView;
        View view = this.applyButton;
        AnimatedTextView animatedTextView2 = this.applyTextView;
        BackDrawable backDrawable = this.backButtonDrawable;
        if (!z4) {
            backDrawable.setRotation(1.0f, z);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(animatedTextView2, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(animatedTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(flickerLoadingView, true, 1.0f, true, z);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(flickerLoadingView, false, 1.0f, true, z);
        if (!hasChanges$1()) {
            backDrawable.setRotation(1.0f, z);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, true, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, true, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(animatedTextView2, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(animatedTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z);
            return;
        }
        backDrawable.setRotation(0.0f, z);
        view.setEnabled(true);
        ChatThemeItem chatThemeItem = this.selectedItem;
        if (chatThemeItem == null || (emojiThemes = chatThemeItem.chatTheme) == null || !emojiThemes.showAsDefaultStub) {
            animatedTextView2.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (chat != null && (tL_premium_boostsStatus = this.boostsStatus) != null && tL_premium_boostsStatus.level < chatActivity.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.lockSpan == null) {
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
                    this.lockSpan = coloredImageSpan;
                    coloredImageSpan.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.lockSpan, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", chatActivity.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                animatedTextView.setText(spannableStringBuilder);
                z2 = true;
            }
            if (z || animatedTextView2.getAlpha() <= 0.8f) {
                z3 = false;
            } else {
                z3 = true;
            }
            valueAnimator = this.subTextTranslationAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.subTextTranslationAnimator = null;
            }
            if (z3) {
                float f3 = this.subTextTranslation;
                if (z2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                int i = 2;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f2);
                this.subTextTranslationAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, i));
                this.subTextTranslationAnimator.addListener(new ChatActivity.AnonymousClass77(18, this, z2));
                this.subTextTranslationAnimator.start();
            } else {
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                this.subTextTranslation = f;
                animatedTextView2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.subTextTranslation);
            }
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(animatedTextView2, true, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(animatedTextView, z2, 0.9f, false, 0.7f, z, null);
            AndroidUtilities.updateViewVisibilityAnimated(textView, true, 0.9f, false, z);
        }
        animatedTextView2.setText(LocaleController.getString(R.string.ChatResetTheme));
        z2 = false;
        if (z) {
            z3 = false;
        } else {
            z3 = false;
        }
        valueAnimator = this.subTextTranslationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.subTextTranslationAnimator = null;
        }
        if (z3) {
            float f4 = this.subTextTranslation;
            if (z2) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            int i2 = 2;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f4, f2);
            this.subTextTranslationAnimator = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, i2));
            this.subTextTranslationAnimator.addListener(new ChatActivity.AnonymousClass77(18, this, z2));
            this.subTextTranslationAnimator.start();
        } else {
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.subTextTranslation = f;
            animatedTextView2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.subTextTranslation);
        }
        AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(animatedTextView2, true, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(animatedTextView, z2, 0.9f, false, 0.7f, z, null);
        AndroidUtilities.updateViewVisibilityAnimated(textView, true, 0.9f, false, z);
    }
}
