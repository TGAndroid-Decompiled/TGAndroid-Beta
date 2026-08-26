package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
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
import org.telegram.tgnet.TLObject;
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
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.WallpapersListActivity;

public class ChatThemeBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private final Adapter adapter;
    private final View applyButton;
    private AnimatedTextView applySubTextView;
    private AnimatedTextView applyTextView;
    private final BackDrawable backButtonDrawable;
    private final ImageView backButtonView;
    private TL_stories.TL_premium_boostsStatus boostsStatus;
    private TextView cancelOrResetTextView;
    private View changeDayNightView;
    private ValueAnimator changeDayNightViewAnimator;
    private float changeDayNightViewProgress;
    private final ChatActivity chatActivity;
    public ChatAttachAlert chatAttachAlert;
    private FrameLayout chatAttachButton;
    private AnimatedTextView chatAttachButtonText;
    private boolean checkedBoostsLevel;
    private boolean checkingBoostsLevel;
    private TextView chooseBackgroundTextView;
    private EmojiThemes currentTheme;
    private TLRPC.WallPaper currentWallpaper;
    private final RLottieDrawable darkThemeDrawable;
    private final RLottieImageView darkThemeView;
    private boolean dataLoaded;
    private boolean forceDark;
    HintView hintView;
    private boolean isApplyClicked;
    private boolean isLightDarkChangeAnimation;
    private final LinearLayoutManager layoutManager;
    private ColoredImageSpan lockSpan;
    private final boolean originalIsDark;
    private final EmojiThemes originalTheme;
    BaseFragment overlayFragment;
    private int prevSelectedPosition;
    private final FlickerLoadingView progressView;
    private final RecyclerListView recyclerView;
    private FrameLayout rootLayout;
    private final LinearSmoothScroller scroller;
    private ChatThemeItem selectedItem;
    private float subTextTranslation;
    private ValueAnimator subTextTranslationAnimator;
    private final ChatActivity.ThemeDelegate themeDelegate;
    private TextView themeHintTextView;
    private boolean themesLoading;
    private final TextView titleView;

    public class AnonymousClass13 implements ChatAttachAlert.ChatAttachViewDelegate {
        long start;
        final TL_stories.TL_premium_boostsStatus val$cachedBoostsStatus;
        final ChatAttachAlert val$chatAttachAlert;
        final long val$dialogId;
        final BaseFragment val$fragment;
        final Utilities.Callback val$onSet;
        final Theme.ResourcesProvider val$resourcesProvider;
        final ThemePreviewActivity.DayNightSwitchDelegate val$toggleTheme;

        public AnonymousClass13(ChatAttachAlert chatAttachAlert, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, Theme.ResourcesProvider resourcesProvider, ThemePreviewActivity.DayNightSwitchDelegate dayNightSwitchDelegate, long j, Utilities.Callback callback, BaseFragment baseFragment) {
            this.val$chatAttachAlert = chatAttachAlert;
            this.val$cachedBoostsStatus = tL_premium_boostsStatus;
            this.val$resourcesProvider = resourcesProvider;
            this.val$toggleTheme = dayNightSwitchDelegate;
            this.val$dialogId = j;
            this.val$onSet = callback;
            this.val$fragment = baseFragment;
        }

        public static void lambda$didPressedButton$0(ChatAttachAlert chatAttachAlert, Utilities.Callback callback, TLRPC.WallPaper wallPaper) {
            chatAttachAlert.dismissInternal();
            if (callback != null) {
                callback.run(wallPaper);
            }
        }

        public static void lambda$onWallpaperSelected$1(ChatAttachAlert chatAttachAlert, Utilities.Callback callback, TLRPC.WallPaper wallPaper) {
            chatAttachAlert.dismissInternal();
            if (callback != null) {
                callback.run(wallPaper);
            }
        }

        @Override
        public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
            try {
                HashMap<Object, Object> selectedPhotos = this.val$chatAttachAlert.getPhotoLayout().getSelectedPhotos();
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
                    ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(new WallpapersListActivity.FileWallpaper("", file, file), bitmapLoadBitmap) {
                        @Override
                        public boolean insideBottomSheet() {
                            return true;
                        }
                    };
                    themePreviewActivity.boostsStatus = this.val$cachedBoostsStatus;
                    themePreviewActivity.setResourceProvider(this.val$resourcesProvider);
                    themePreviewActivity.setOnSwitchDayNightDelegate(this.val$toggleTheme);
                    themePreviewActivity.setInitialModes(false, false, 0.2f);
                    themePreviewActivity.setDialogId(this.val$dialogId);
                    themePreviewActivity.setDelegate(new ChatThemeBottomSheet$13$$ExternalSyntheticLambda0(this.val$chatAttachAlert, this.val$onSet, 0));
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    bottomSheetParams.occupyNavigationBar = true;
                    this.val$fragment.showAsSheet(themePreviewActivity, bottomSheetParams);
                    this.val$chatAttachAlert.lambda$showGiftOfferSheet$15();
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        @Override
        public final void didSelectBot(TLRPC.User user) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
        }

        @Override
        public final void doOnIdle(Runnable runnable) {
            runnable.run();
        }

        @Override
        public final View getRevealView() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
        }

        @Override
        public final boolean needEnterComment() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
        }

        @Override
        public final void onCameraOpened() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
        }

        @Override
        public void onWallpaperSelected(Object obj) {
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(obj, null, true, false) {
                @Override
                public boolean insideBottomSheet() {
                    return true;
                }
            };
            themePreviewActivity.boostsStatus = this.val$cachedBoostsStatus;
            themePreviewActivity.setResourceProvider(this.val$resourcesProvider);
            themePreviewActivity.setOnSwitchDayNightDelegate(this.val$toggleTheme);
            themePreviewActivity.setDialogId(this.val$dialogId);
            themePreviewActivity.setDelegate(new ChatThemeBottomSheet$13$$ExternalSyntheticLambda0(this.val$chatAttachAlert, this.val$onSet, 1 == true ? 1 : 0));
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.occupyNavigationBar = true;
            this.val$fragment.showAsSheet(themePreviewActivity, bottomSheetParams);
        }

        @Override
        public final void openAvatarsSearch() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
        }

        @Override
        public boolean selectItemOnClicking() {
            this.start = System.currentTimeMillis();
            return true;
        }

        @Override
        public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
        }
    }

    public class AnonymousClass14 implements ChatAttachAlert.ChatAttachViewDelegate {
        long start;

        public AnonymousClass14() {
        }

        public void lambda$didPressedButton$0(TLRPC.WallPaper wallPaper) {
            ChatThemeBottomSheet.this.chatAttachAlert.dismissInternal();
            ChatThemeBottomSheet.this.lambda$showGiftOfferSheet$15();
        }

        public void lambda$onWallpaperSelected$1(TLRPC.WallPaper wallPaper) {
            ChatThemeBottomSheet.this.chatAttachAlert.dismissInternal();
            ChatThemeBottomSheet.this.lambda$showGiftOfferSheet$15();
        }

        @Override
        public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
            try {
                HashMap<Object, Object> selectedPhotos = ChatThemeBottomSheet.this.chatAttachAlert.getPhotoLayout().getSelectedPhotos();
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
                    ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(new WallpapersListActivity.FileWallpaper("", file, file), bitmapLoadBitmap) {
                        @Override
                        public boolean insideBottomSheet() {
                            return true;
                        }
                    };
                    themePreviewActivity.boostsStatus = ChatThemeBottomSheet.this.boostsStatus;
                    themePreviewActivity.setInitialModes(false, false, 0.2f);
                    themePreviewActivity.setDialogId(ChatThemeBottomSheet.this.chatActivity.getDialogId());
                    themePreviewActivity.setDelegate(new ChatThemeBottomSheet$14$$ExternalSyntheticLambda0(this, 1));
                    ChatThemeBottomSheet.this.showAsSheet(themePreviewActivity);
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        @Override
        public final void didSelectBot(TLRPC.User user) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
        }

        @Override
        public final void doOnIdle(Runnable runnable) {
            runnable.run();
        }

        @Override
        public final View getRevealView() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
        }

        @Override
        public final boolean needEnterComment() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
        }

        @Override
        public final void onCameraOpened() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
        }

        @Override
        public void onWallpaperSelected(Object obj) {
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(obj, null, true, false) {
                @Override
                public boolean insideBottomSheet() {
                    return true;
                }
            };
            themePreviewActivity.boostsStatus = ChatThemeBottomSheet.this.boostsStatus;
            themePreviewActivity.setDialogId(ChatThemeBottomSheet.this.chatActivity.getDialogId());
            themePreviewActivity.setDelegate(new ChatThemeBottomSheet$14$$ExternalSyntheticLambda0(this, 0));
            ChatThemeBottomSheet.this.showAsSheet(themePreviewActivity);
        }

        @Override
        public final void openAvatarsSearch() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
        }

        @Override
        public boolean selectItemOnClicking() {
            this.start = System.currentTimeMillis();
            return true;
        }

        @Override
        public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
        }
    }

    public class AnonymousClass7 implements ResultCallback<List<EmojiThemes>> {
        final ChatThemeController val$chatThemeController;

        public AnonymousClass7(ChatThemeController chatThemeController) {
            this.val$chatThemeController = chatThemeController;
        }

        public void lambda$onComplete$0(List list) {
            ChatThemeBottomSheet.this.onDataLoaded(list);
        }

        @Override
        public final void onError(Throwable th) {
            ResultCallback.CC.$default$onError(this, th);
        }

        @Override
        public void onComplete(List<EmojiThemes> list) {
            NotificationCenter.getInstance(((BottomSheet) ChatThemeBottomSheet.this).currentAccount).doOnIdle(new EmojiView$2$$ExternalSyntheticLambda0(3, this, this.val$chatThemeController.getEmojiThemes(7)));
            ChatThemeBottomSheet.this.themesLoading = false;
        }

        @Override
        public void onError(TLRPC.TL_error tL_error) {
            Toast.makeText(ChatThemeBottomSheet.this.getContext(), tL_error.text, 0).show();
        }
    }

    public class AnonymousClass8 implements ResultCallback<Void> {
        final ChatThemeController val$chatThemeController;

        public AnonymousClass8(ChatThemeController chatThemeController) {
            this.val$chatThemeController = chatThemeController;
        }

        public void lambda$onComplete$0(List list) {
            ChatThemeBottomSheet.this.onDataLoaded(list);
        }

        @Override
        public final void onError(Throwable th) {
            ResultCallback.CC.$default$onError(this, th);
        }

        @Override
        public void onComplete(Void r5) {
            ChatThemeController chatThemeController = this.val$chatThemeController;
            NotificationCenter.getInstance(((BottomSheet) ChatThemeBottomSheet.this).currentAccount).doOnIdle(new EmojiView$2$$ExternalSyntheticLambda0(4, this, chatThemeController.getEmojiThemes((chatThemeController.isGiftThemesFullyLoaded() ? 2 : 0) | 5)));
            ChatThemeBottomSheet.this.themesLoading = false;
        }

        @Override
        public void onError(TLRPC.TL_error tL_error) {
            Toast.makeText(ChatThemeBottomSheet.this.getContext(), tL_error.text, 0).show();
        }
    }

    public static class Adapter extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        private final int currentViewType;
        public List<ChatThemeItem> items;
        private HashMap<String, Theme.ThemeInfo> loadingThemes;
        private HashMap<Theme.ThemeInfo, String> loadingWallpapers;
        private final long parentDialogId;
        private final Theme.ResourcesProvider resourcesProvider;
        private int selectedItemPosition;
        private WeakReference<ThemeSmallPreviewView> selectedViewRef;

        public Adapter(int i, Theme.ResourcesProvider resourcesProvider, int i2) {
            this(i, 0L, resourcesProvider, i2);
        }

        public void lambda$parseTheme$0(TLObject tLObject, Theme.ThemeInfo themeInfo) {
            if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                themeInfo.badWallpaper = true;
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
            String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
            if (this.loadingThemes.containsKey(attachFileName)) {
                return;
            }
            this.loadingThemes.put(attachFileName, themeInfo);
            FileLoader.getInstance(themeInfo.account).loadFile(wallPaper.document, wallPaper, 1, 1);
        }

        public void lambda$parseTheme$1(Theme.ThemeInfo themeInfo, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda1(this, tLObject, themeInfo, 18));
        }

        private boolean parseTheme(Theme.ThemeInfo themeInfo) {
            int iStringKeyToInt;
            int iIntValue;
            String[] strArrSplit;
            if (themeInfo == null || themeInfo.pathToFile == null) {
                return false;
            }
            boolean z = true;
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(themeInfo.pathToFile));
                int i = 0;
                boolean z2 = false;
                while (true) {
                    try {
                        int i2 = fileInputStream.read(ThemesHorizontalListCell.bytes);
                        if (i2 == -1) {
                            break;
                        }
                        int i3 = i;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i2) {
                            byte[] bArr = ThemesHorizontalListCell.bytes;
                            if (bArr[i4] == 10) {
                                int i6 = i4 - i5;
                                int i7 = i6 + 1;
                                String str = new String(bArr, i5, i6, "UTF-8");
                                if (!str.startsWith("WLS=")) {
                                    if (str.startsWith("WPS")) {
                                        themeInfo.previewWallpaperOffset = i7 + i3;
                                        z2 = true;
                                        break;
                                    }
                                    int iIndexOf = str.indexOf(61);
                                    if (iIndexOf != -1 && ((iStringKeyToInt = OKLCH.stringKeyToInt(str.substring(0, iIndexOf))) == Theme.key_chat_inBubble || iStringKeyToInt == Theme.key_chat_outBubble || iStringKeyToInt == Theme.key_chat_wallpaper || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to1 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to2 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to3)) {
                                        String strSubstring = str.substring(iIndexOf + 1);
                                        if (strSubstring.length() <= 0 || strSubstring.charAt(0) != '#') {
                                            iIntValue = Utilities.parseInt((CharSequence) strSubstring).intValue();
                                        } else {
                                            try {
                                                iIntValue = Color.parseColor(strSubstring);
                                            } catch (Exception unused) {
                                                iIntValue = Utilities.parseInt((CharSequence) strSubstring).intValue();
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
                                    FileLog.e(th);
                                    if (themeInfo.pathToWallpaper != null || themeInfo.badWallpaper || new File(themeInfo.pathToWallpaper).exists()) {
                                        themeInfo.previewParsed = true;
                                        return true;
                                    }
                                    if (this.loadingWallpapers.containsKey(themeInfo)) {
                                        return false;
                                    }
                                    this.loadingWallpapers.put(themeInfo, themeInfo.slug);
                                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                    tL_inputWallPaperSlug.slug = themeInfo.slug;
                                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                    ConnectionsManager.getInstance(themeInfo.account).sendRequest(getwallpaper, new ShareAlert$$ExternalSyntheticLambda13(6, this, themeInfo));
                                    return false;
                                }
                                String strSubstring2 = str.substring(4);
                                Uri uri = Uri.parse(strSubstring2);
                                themeInfo.slug = uri.getQueryParameter("slug");
                                themeInfo.pathToWallpaper = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strSubstring2) + ".wp").getAbsolutePath();
                                String queryParameter = uri.getQueryParameter("mode");
                                if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                                    for (String str2 : strArrSplit) {
                                        if ("blur".equals(str2)) {
                                            themeInfo.isBlured = z;
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
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        String queryParameter3 = uri.getQueryParameter("rotation");
                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                            themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                        }
                                    } catch (Exception unused3) {
                                    }
                                    String queryParameter4 = uri.getQueryParameter("intensity");
                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                        themeInfo.patternIntensity = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                    }
                                    if (themeInfo.patternIntensity == 0) {
                                        themeInfo.patternIntensity = 50;
                                    }
                                }
                                i5 += i7;
                                i3 += i7;
                            }
                            i4++;
                            z = true;
                        }
                        if (z2 || i == i3) {
                            break;
                            break;
                        }
                        fileInputStream.getChannel().position(i3);
                        i = i3;
                        z = true;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                fileInputStream.close();
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
            if (themeInfo.pathToWallpaper != null) {
            }
            themeInfo.previewParsed = true;
            return true;
        }

        @Override
        public int getItemCount() {
            List<ChatThemeItem> list = this.items;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) viewHolder.itemView;
            Theme.ThemeInfo themeInfo = ((EmojiThemes.ThemeItem) this.items.get(i).chatTheme.items.get(this.items.get(i).themeIndex)).themeInfo;
            if (themeInfo != null && themeInfo.pathToFile != null && !themeInfo.previewParsed && new File(themeInfo.pathToFile).exists()) {
                parseTheme(themeInfo);
            }
            ChatThemeItem chatThemeItem = this.items.get(i);
            ChatThemeItem chatThemeItem2 = themeSmallPreviewView.chatThemeItem;
            boolean z = chatThemeItem2 != null && ThemeKey.equals(chatThemeItem2.chatTheme.key, chatThemeItem.chatTheme.key) && !DialogsActivity.switchingTheme && themeSmallPreviewView.lastThemeIndex == chatThemeItem.themeIndex;
            themeSmallPreviewView.setFocusable(true);
            themeSmallPreviewView.setEnabled(true);
            themeSmallPreviewView.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackgroundGray, false));
            themeSmallPreviewView.setItem(chatThemeItem, this.parentDialogId, z);
            themeSmallPreviewView.setSelected(i == this.selectedItemPosition, z);
            if (i == this.selectedItemPosition) {
                this.selectedViewRef = new WeakReference<>(themeSmallPreviewView);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new ThemeSmallPreviewView(viewGroup.getContext(), this.currentAccount, this.resourcesProvider, this.currentViewType));
        }

        public void setItems(List<ChatThemeItem> list) {
            this.items = list;
            notifyDataSetChanged();
        }

        public void setSelectedItem(int i) {
            int i2 = this.selectedItemPosition;
            if (i2 == i) {
                return;
            }
            if (i2 >= 0) {
                lambda$onBindViewHolder$31(i2);
                WeakReference<ThemeSmallPreviewView> weakReference = this.selectedViewRef;
                ThemeSmallPreviewView themeSmallPreviewView = weakReference == null ? null : weakReference.get();
                if (themeSmallPreviewView != null) {
                    themeSmallPreviewView.setSelected(false);
                }
            }
            this.selectedItemPosition = i;
            lambda$onBindViewHolder$31(i);
        }

        public Adapter(int i, long j, Theme.ResourcesProvider resourcesProvider, int i2) {
            this.selectedItemPosition = -1;
            this.loadingThemes = new HashMap<>();
            this.loadingWallpapers = new HashMap<>();
            this.currentViewType = i2;
            this.parentDialogId = j;
            this.resourcesProvider = resourcesProvider;
            this.currentAccount = i;
        }
    }

    public static class ChatThemeItem {
        public float animationProgress = 1.0f;
        public final EmojiThemes chatTheme;
        public Bitmap icon;
        public boolean isSelected;
        public Drawable previewDrawable;
        public int themeIndex;

        public ChatThemeItem(EmojiThemes emojiThemes) {
            this.chatTheme = emojiThemes;
        }

        @Deprecated
        public String getEmoticon() {
            EmojiThemes emojiThemes = this.chatTheme;
            if (emojiThemes == null || emojiThemes.showAsDefaultStub) {
                return null;
            }
            return emojiThemes.emoji;
        }
    }

    public ChatThemeBottomSheet(ChatActivity chatActivity, ChatActivity.ThemeDelegate themeDelegate) {
        super(chatActivity.getParentActivity(), true, false, themeDelegate);
        int i = 1;
        this.prevSelectedPosition = -1;
        this.checkingBoostsLevel = false;
        this.checkedBoostsLevel = false;
        this.subTextTranslation = 0.0f;
        this.chatActivity = chatActivity;
        this.themeDelegate = themeDelegate;
        this.originalTheme = themeDelegate.getCurrentTheme();
        this.currentWallpaper = themeDelegate.getCurrentWallpaper();
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
        this.rootLayout = frameLayout;
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
        this.rootLayout.addView(imageView, LayoutHelper.createFrame(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        this.rootLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i3 = Theme.key_featuredStickers_addButton;
        int themedColor = getThemedColor(i3);
        int iDp2 = AndroidUtilities.dp(28.0f);
        int i4 = R.raw.sun_outline;
        String firstName = "";
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, Fragment$$ExternalSyntheticOutline0.m(i4, ""), iDp2, iDp2, false, null);
        this.darkThemeDrawable = rLottieDrawable;
        this.forceDark = !Theme.currentTheme.isDark();
        setForceDark(Theme.currentTheme.isDark(), false);
        rLottieDrawable.setAllowDecodeSingleFrame(true);
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        rLottieDrawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        RLottieImageView rLottieImageView = new RLottieImageView(getContext()) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (ChatThemeBottomSheet.this.forceDark) {
                    accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToDayTheme));
                } else {
                    accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToNightTheme));
                }
            }
        };
        this.darkThemeView = rLottieImageView;
        rLottieImageView.setAnimation(rLottieDrawable);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setOnClickListener(new ChatThemeBottomSheet$$ExternalSyntheticLambda4(this, 2));
        this.rootLayout.addView(rLottieImageView, LayoutHelper.createFrame(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.scroller = new LinearSmoothScroller(getContext()) {
            @Override
            public int calculateTimeForScrolling(int i5) {
                return super.calculateTimeForScrolling(i5) * 6;
            }
        };
        RecyclerListView recyclerListView = new RecyclerListView(getContext());
        this.recyclerView = recyclerListView;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setDrawSelection(false);
        recyclerListView.setClipChildren(false);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setHasFixedSize(true);
        recyclerListView.lambda$onCellEnter$52(null);
        recyclerListView.setNestedScrollingEnabled(false);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        recyclerListView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        recyclerListView.setOnItemClickListener(new StarAppsSheet$$ExternalSyntheticLambda0(this, 6));
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                super.onScrolled(recyclerView, i5, i6);
                if (ChatThemeBottomSheet.this.layoutManager.findLastCompletelyVisibleItemPosition() + 10 >= ChatThemeBottomSheet.this.adapter.getItemCount()) {
                    ChatThemeBottomSheet.this.loadNext();
                }
            }
        });
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext(), this.resourcesProvider);
        this.progressView = flickerLoadingView;
        flickerLoadingView.setViewType(14);
        flickerLoadingView.setVisibility(0);
        this.rootLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.rootLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.applyButton = view;
        int iDp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i3);
        int themedColor3 = getThemedColor(Theme.key_featuredStickers_addButtonPressed);
        view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new ChatThemeBottomSheet$$ExternalSyntheticLambda4(this, 3));
        this.rootLayout.addView(view, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.chooseBackgroundTextView = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.chooseBackgroundTextView.setGravity(17);
        this.chooseBackgroundTextView.setLines(1);
        this.chooseBackgroundTextView.setSingleLine(true);
        if (this.currentWallpaper == null) {
            this.chooseBackgroundTextView.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            this.chooseBackgroundTextView.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        this.chooseBackgroundTextView.setTextSize(1, 15.0f);
        this.chooseBackgroundTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                ChatThemeBottomSheet.this.openGalleryForBackground();
            }
        });
        this.rootLayout.addView(this.chooseBackgroundTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), true, true, true);
        this.applyTextView = animatedTextView;
        animatedTextView.getDrawable().setEllipsizeByGradient(true);
        AnimatedTextView animatedTextView2 = this.applyTextView;
        animatedTextView2.adaptWidth = false;
        animatedTextView2.setGravity(17);
        AnimatedTextView animatedTextView3 = this.applyTextView;
        int i5 = Theme.key_featuredStickers_buttonText;
        animatedTextView3.setTextColor(getThemedColor(i5));
        this.applyTextView.setTextSize(AndroidUtilities.dp(15.0f));
        this.applyTextView.setTypeface(AndroidUtilities.bold());
        this.rootLayout.addView(this.applyTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        AnimatedTextView animatedTextView4 = new AnimatedTextView(getContext(), true, true, true);
        this.applySubTextView = animatedTextView4;
        animatedTextView4.getDrawable().setEllipsizeByGradient(true);
        AnimatedTextView animatedTextView5 = this.applySubTextView;
        animatedTextView5.adaptWidth = false;
        animatedTextView5.setGravity(17);
        this.applySubTextView.setTextColor(getThemedColor(i5));
        this.applySubTextView.setTextSize(AndroidUtilities.dp(12.0f));
        this.applySubTextView.setAlpha(0.0f);
        this.applySubTextView.setTranslationY(AndroidUtilities.dp(11.0f));
        this.rootLayout.addView(this.applySubTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.currentWallpaper != null) {
            TextView textView3 = new TextView(getContext());
            this.cancelOrResetTextView = textView3;
            textView3.setEllipsize(truncateAt);
            this.cancelOrResetTextView.setGravity(17);
            this.cancelOrResetTextView.setLines(1);
            this.cancelOrResetTextView.setSingleLine(true);
            this.cancelOrResetTextView.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            this.cancelOrResetTextView.setTextSize(1, 15.0f);
            this.cancelOrResetTextView.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(21, this, chatActivity));
            this.rootLayout.addView(this.cancelOrResetTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.themeHintTextView = textView4;
            textView4.setEllipsize(truncateAt);
            this.themeHintTextView.setGravity(17);
            this.themeHintTextView.setLines(1);
            this.themeHintTextView.setSingleLine(true);
            if (chatActivity.getCurrentUser() != null) {
                firstName = UserObject.getFirstName(chatActivity.getCurrentUser());
            } else if (chatActivity.getCurrentChat() != null) {
                firstName = chatActivity.getCurrentChat().title;
            }
            this.themeHintTextView.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, firstName));
            this.themeHintTextView.setTextSize(1, 15.0f);
            this.rootLayout.addView(this.themeHintTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        updateButtonColors();
        updateState(false);
    }

    private void applySelectedTheme() {
        applySelectedTheme(false);
    }

    private void checkBoostsLevel() {
        ChatActivity chatActivity = this.chatActivity;
        if (chatActivity == null || this.checkingBoostsLevel || this.checkedBoostsLevel || this.boostsStatus != null) {
            return;
        }
        this.checkingBoostsLevel = true;
        chatActivity.getMessagesController().getBoostsController().getBoostsStats(this.chatActivity.getDialogId(), new ChatThemeBottomSheet$$ExternalSyntheticLambda17(this, 0));
    }

    public void lambda$showAsSheet$21() {
        if (isDismissed() || this.isApplyClicked) {
            return;
        }
        Theme.disallowChangeServiceMessageColor = false;
        TLRPC.WallPaper currentWallpaper = hasChanges() ? null : this.themeDelegate.getCurrentWallpaper();
        EmojiThemes emojiThemes = this.selectedItem.chatTheme;
        if (emojiThemes.showAsDefaultStub) {
            this.themeDelegate.setCurrentTheme(null, currentWallpaper, false, Boolean.valueOf(this.forceDark), true);
        } else {
            this.themeDelegate.setCurrentTheme(emojiThemes, currentWallpaper, false, Boolean.valueOf(this.forceDark), true);
        }
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            ChatAttachAlertColorsLayout chatAttachAlertColorsLayout = chatAttachAlert.colorsLayout;
            if (chatAttachAlertColorsLayout != null) {
                chatAttachAlertColorsLayout.updateColors(this.forceDark);
            }
            this.chatAttachAlert.checkColors();
        }
        Adapter adapter = this.adapter;
        if (adapter == null || adapter.items == null) {
            return;
        }
        for (int i = 0; i < this.adapter.items.size(); i++) {
            this.adapter.items.get(i).themeIndex = this.forceDark ? 1 : 0;
        }
        this.adapter.notifyDataSetChanged();
    }

    public boolean hasChanges() {
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

    public void lambda$applySelectedTheme$13() {
        showAsSheet(StatisticActivity.create(this.chatActivity.getMessagesController().getChat(Long.valueOf(-this.chatActivity.getDialogId()))));
    }

    public void lambda$applySelectedTheme$14(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(22, this.chatActivity, getContext(), this.currentAccount, this.resourcesProvider);
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(this.boostsStatus, true);
        limitReachedBottomSheet.setDialogId(this.chatActivity.getDialogId());
        limitReachedBottomSheet.showStatisticButtonInLink(new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 2));
        limitReachedBottomSheet.show();
    }

    public void lambda$applySelectedTheme$15() {
        applySelectedTheme(true);
    }

    public void lambda$checkBoostsLevel$5(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.boostsStatus = tL_premium_boostsStatus;
        this.checkedBoostsLevel = true;
        updateState(true);
        this.checkingBoostsLevel = false;
    }

    public void lambda$close$8(AlertDialog alertDialog, int i) {
        applySelectedTheme();
    }

    public void lambda$close$9(AlertDialog alertDialog, int i) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$didReceivedNotification$10() {
        this.adapter.notifyDataSetChanged();
    }

    public void lambda$new$0(View view) {
        if (!hasChanges()) {
            lambda$showGiftOfferSheet$15();
        } else {
            resetToPrimaryState(true);
            updateState(true);
        }
    }

    public void lambda$new$1(View view) {
        if (this.changeDayNightViewAnimator != null) {
            return;
        }
        setupLightDarkTheme(!this.forceDark);
    }

    public void lambda$new$2(View view, final int i) {
        if (this.adapter.items.get(i) == this.selectedItem || this.changeDayNightView != null) {
            return;
        }
        this.selectedItem = this.adapter.items.get(i);
        previewSelectedTheme();
        this.adapter.setSelectedItem(i);
        this.containerView.postDelayed(new Runnable() {
            @Override
            public void run() {
                RecyclerView.LayoutManager layoutManager = ChatThemeBottomSheet.this.recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    ChatThemeBottomSheet.this.scroller.setTargetPosition(i > ChatThemeBottomSheet.this.prevSelectedPosition ? Math.min(i + 1, ChatThemeBottomSheet.this.adapter.items.size() - 1) : Math.max(i - 1, 0));
                    layoutManager.startSmoothScroll(ChatThemeBottomSheet.this.scroller);
                }
                ChatThemeBottomSheet.this.prevSelectedPosition = i;
            }
        }, 100L);
        for (int i2 = 0; i2 < this.recyclerView.getChildCount(); i2++) {
            ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.recyclerView.getChildAt(i2);
            if (themeSmallPreviewView != view) {
                themeSmallPreviewView.cancelAnimation();
            }
        }
        if (!this.adapter.items.get(i).chatTheme.showAsDefaultStub) {
            ((ThemeSmallPreviewView) view).playEmojiAnimation();
        }
        updateState(true);
    }

    public void lambda$new$3(View view) {
        applySelectedTheme();
    }

    public void lambda$new$4(ChatActivity chatActivity, View view) {
        if (this.currentWallpaper == null) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        this.currentWallpaper = null;
        lambda$showGiftOfferSheet$15();
        ChatThemeController.getInstance(this.currentAccount).clearWallpaper(chatActivity.getDialogId(), true);
    }

    public void lambda$onCreate$7() {
        this.hintView.showForView(this.darkThemeView, true);
    }

    public void lambda$openGalleryForBackground$16(View view) {
        if (this.chatAttachAlert.getCurrentAttachLayout() == this.chatAttachAlert.getPhotoLayout()) {
            this.chatAttachButtonText.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
            this.chatAttachAlert.openColorsLayout();
            this.chatAttachAlert.colorsLayout.updateColors(this.forceDark);
        } else {
            this.chatAttachButtonText.setText(LocaleController.getString(R.string.SetColorAsBackground));
            ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
            chatAttachAlert.showLayout(chatAttachAlert.getPhotoLayout());
        }
    }

    public static boolean lambda$setupLightDarkTheme$11(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$setupLightDarkTheme$12(boolean z) {
        Adapter adapter = this.adapter;
        if (adapter == null || adapter.items == null || isDismissed()) {
            return;
        }
        setForceDark(z, true);
        if (this.selectedItem != null) {
            this.isLightDarkChangeAnimation = true;
            TLRPC.WallPaper currentWallpaper = hasChanges() ? null : this.themeDelegate.getCurrentWallpaper();
            EmojiThemes emojiThemes = this.selectedItem.chatTheme;
            if (emojiThemes.showAsDefaultStub) {
                this.themeDelegate.setCurrentTheme(null, currentWallpaper, false, Boolean.valueOf(z));
            } else {
                this.themeDelegate.setCurrentTheme(emojiThemes, currentWallpaper, false, Boolean.valueOf(z));
            }
        }
        Adapter adapter2 = this.adapter;
        if (adapter2 == null || adapter2.items == null) {
            return;
        }
        for (int i = 0; i < this.adapter.items.size(); i++) {
            this.adapter.items.get(i).themeIndex = z ? 1 : 0;
        }
        this.adapter.notifyDataSetChanged();
    }

    public static void lambda$showAsSheet$17() throws FileNotFoundException {
        PhotoViewer.getInstance().closePhoto(false, false);
    }

    public void lambda$showAsSheet$19() {
        this.overlayFragment = null;
    }

    public static void lambda$showAsSheet$20() throws FileNotFoundException {
        PhotoViewer.getInstance().closePhoto(false, false);
    }

    public void lambda$showAsSheet$22() {
        this.overlayFragment = null;
    }

    public void lambda$updateApplySubTextTranslation$6(ValueAnimator valueAnimator) {
        this.subTextTranslation = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.applyTextView.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.subTextTranslation);
    }

    public void loadNext() {
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

    public void onAnimationEnd() {
        this.isLightDarkChangeAnimation = false;
    }

    public void onAnimationStart() {
        List<ChatThemeItem> list;
        Adapter adapter = this.adapter;
        if (adapter != null && (list = adapter.items) != null) {
            Iterator<ChatThemeItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().themeIndex = this.forceDark ? 1 : 0;
            }
        }
        if (this.isLightDarkChangeAnimation) {
            return;
        }
        setItemsAnimationProgress(1.0f);
    }

    public void onDataLoaded(List<EmojiThemes> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ChatThemeItem chatThemeItem = new ChatThemeItem(list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.dataLoaded) {
            EmojiThemes currentTheme = this.themeDelegate.getCurrentTheme();
            this.currentTheme = currentTheme;
            if (currentTheme != null) {
                currentTheme.initColors();
            }
        }
        arrayList.add(0, chatThemeItem);
        if (!this.dataLoaded) {
            this.selectedItem = chatThemeItem;
        }
        EmojiThemes emojiThemes = this.currentTheme;
        ThemeKey themeKey = emojiThemes != null ? emojiThemes.key : null;
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            EmojiThemes emojiThemes2 = list.get(i);
            ChatThemeItem chatThemeItem2 = new ChatThemeItem(emojiThemes2);
            emojiThemes2.loadPreviewColors(this.currentAccount);
            chatThemeItem2.themeIndex = this.forceDark ? 1 : 0;
            if (ThemeKey.equals(emojiThemes2.key, themeKey)) {
                arrayList.add(1, chatThemeItem2);
                z = true;
            } else {
                arrayList.add(chatThemeItem2);
            }
        }
        EmojiThemes emojiThemes3 = this.currentTheme;
        if (emojiThemes3 != null && !z) {
            ChatThemeItem chatThemeItem3 = new ChatThemeItem(emojiThemes3);
            this.currentTheme.loadPreviewColors(this.currentAccount);
            chatThemeItem3.themeIndex = this.forceDark ? 1 : 0;
            arrayList.add(1, chatThemeItem3);
        }
        this.adapter.setItems(arrayList);
        this.darkThemeView.setVisibility(0);
        if (!this.dataLoaded) {
            resetToPrimaryState(false);
            this.recyclerView.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.dataLoaded = true;
        updateState(true);
    }

    public static void openGalleryForBackground(Activity activity, BaseFragment baseFragment, long j, Theme.ResourcesProvider resourcesProvider, Utilities.Callback<TLRPC.WallPaper> callback, ThemePreviewActivity.DayNightSwitchDelegate dayNightSwitchDelegate, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(activity, baseFragment, false, false, false, resourcesProvider);
        chatAttachAlert.drawNavigationBar = true;
        chatAttachAlert.setupPhotoPicker(LocaleController.getString(R.string.ChooseBackground));
        chatAttachAlert.setDelegate(new AnonymousClass13(chatAttachAlert, tL_premium_boostsStatus, resourcesProvider, dayNightSwitchDelegate, j, callback, baseFragment));
        chatAttachAlert.setMaxSelectedPhotos(1, false);
        chatAttachAlert.init();
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.show();
    }

    private void previewSelectedTheme() {
        if (isDismissed() || this.isApplyClicked) {
            return;
        }
        this.isLightDarkChangeAnimation = false;
        this.chatActivity.forceDisallowApplyWallpeper = false;
        TLRPC.WallPaper wallPaper = hasChanges() ? null : this.currentWallpaper;
        EmojiThemes emojiThemes = this.selectedItem.chatTheme;
        if (emojiThemes.showAsDefaultStub) {
            this.themeDelegate.setCurrentTheme(null, wallPaper, true, Boolean.valueOf(this.forceDark));
        } else {
            this.themeDelegate.setCurrentTheme(emojiThemes, wallPaper, true, Boolean.valueOf(this.forceDark));
        }
    }

    private void resetToPrimaryState(boolean z) {
        List<ChatThemeItem> list = this.adapter.items;
        if (this.currentTheme != null) {
            int i = 0;
            while (true) {
                if (i == list.size()) {
                    i = -1;
                    break;
                } else {
                    if (ThemeKey.equals(list.get(i).chatTheme.key, this.currentTheme.key)) {
                        this.selectedItem = list.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (i != -1) {
                this.prevSelectedPosition = i;
                this.adapter.setSelectedItem(i);
                if (i > 0 && i < list.size() / 2) {
                    i--;
                }
                int iMin = Math.min(i, this.adapter.items.size() - 1);
                if (z) {
                    this.recyclerView.smoothScrollToPosition(iMin);
                } else {
                    this.layoutManager.scrollToPositionWithOffset(iMin, 0);
                }
            }
        } else {
            this.selectedItem = list.get(0);
            this.adapter.setSelectedItem(0);
            if (z) {
                this.recyclerView.smoothScrollToPosition(0);
            } else {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            }
        }
        previewSelectedTheme();
    }

    private void setDarkButtonColor(int i) {
        this.darkThemeDrawable.setLayerColor("Sunny", i);
        this.darkThemeDrawable.setLayerColor("Path", i);
        this.darkThemeDrawable.setLayerColor("Path 10", i);
        this.darkThemeDrawable.setLayerColor("Path 11", i);
    }

    private void setForceDark(boolean z, boolean z2) {
        if (this.forceDark == z) {
            return;
        }
        this.forceDark = z;
        if (z2) {
            RLottieDrawable rLottieDrawable = this.darkThemeDrawable;
            rLottieDrawable.setCustomEndFrame(z ? rLottieDrawable.getFramesCount() : 0);
            RLottieImageView rLottieImageView = this.darkThemeView;
            if (rLottieImageView != null) {
                rLottieImageView.playAnimation();
                return;
            }
            return;
        }
        int framesCount = z ? this.darkThemeDrawable.getFramesCount() - 1 : 0;
        this.darkThemeDrawable.setCurrentFrame(framesCount, false, true);
        this.darkThemeDrawable.setCustomEndFrame(framesCount);
        RLottieImageView rLottieImageView2 = this.darkThemeView;
        if (rLottieImageView2 != null) {
            rLottieImageView2.invalidate();
        }
    }

    public void setItemsAnimationProgress(float f) {
        for (int i = 0; i < this.adapter.getItemCount(); i++) {
            this.adapter.items.get(i).animationProgress = f;
        }
    }

    private void showAsSheet(BaseFragment baseFragment) {
        if (baseFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        baseFragment.setResourceProvider(this.chatActivity.getResourceProvider());
        bottomSheetParams.onOpenAnimationFinished = new UndoView$$ExternalSyntheticLambda7(15);
        bottomSheetParams.onPreFinished = new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 4);
        bottomSheetParams.onDismiss = new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 5);
        bottomSheetParams.occupyNavigationBar = true;
        ChatActivity chatActivity = this.chatActivity;
        this.overlayFragment = baseFragment;
        chatActivity.showAsSheet(baseFragment, bottomSheetParams);
    }

    private void updateApplySubTextTranslation(final boolean z, boolean z2) {
        int i = 1;
        ValueAnimator valueAnimator = this.subTextTranslationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.subTextTranslationAnimator = null;
        }
        if (!z2) {
            this.subTextTranslation = z ? 1.0f : 0.0f;
            this.applyTextView.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.subTextTranslation);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.subTextTranslation, z ? 1.0f : 0.0f);
        this.subTextTranslationAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, i));
        this.subTextTranslationAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ChatThemeBottomSheet.this.subTextTranslation = z ? 1.0f : 0.0f;
                ChatThemeBottomSheet.this.applyTextView.setTranslationY(ChatThemeBottomSheet.this.subTextTranslation * (-AndroidUtilities.dp(7.0f)));
            }
        });
        this.subTextTranslationAnimator.start();
    }

    public void updateButtonColors() {
        TextView textView = this.themeHintTextView;
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_dialogTextGray));
            TextView textView2 = this.themeHintTextView;
            int iDp = AndroidUtilities.dp(6.0f);
            int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_featuredStickers_addButton), 76);
            textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        }
        TextView textView3 = this.cancelOrResetTextView;
        if (textView3 != null) {
            int i = Theme.key_text_RedRegular;
            textView3.setTextColor(getThemedColor(i));
            TextView textView4 = this.cancelOrResetTextView;
            int iDp2 = AndroidUtilities.dp(6.0f);
            int alphaComponent2 = ColorUtils.setAlphaComponent(getThemedColor(i), 76);
            textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, alphaComponent2, alphaComponent2));
        }
        ImageView imageView = this.backButtonView;
        int i2 = Theme.key_dialogTextBlack;
        imageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i2), 30), 1, -1));
        BackDrawable backDrawable = this.backButtonDrawable;
        backDrawable.color = getThemedColor(i2);
        backDrawable.invalidateSelf();
        BackDrawable backDrawable2 = this.backButtonDrawable;
        backDrawable2.rotatedColor = getThemedColor(i2);
        backDrawable2.invalidateSelf();
        this.backButtonView.invalidate();
        RLottieImageView rLottieImageView = this.darkThemeView;
        int i3 = Theme.key_featuredStickers_addButton;
        rLottieImageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i3), 30), 1, -1));
        this.chooseBackgroundTextView.setTextColor(getThemedColor(Theme.key_dialogTextBlue));
        TextView textView5 = this.chooseBackgroundTextView;
        int iDp3 = AndroidUtilities.dp(6.0f);
        int alphaComponent3 = ColorUtils.setAlphaComponent(getThemedColor(i3), 76);
        textView5.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, 0, alphaComponent3, alphaComponent3));
    }

    private void updateState(boolean z) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        boolean z2;
        boolean z3;
        EmojiThemes emojiThemes;
        TLRPC.Chat currentChat = this.chatActivity.getCurrentChat();
        if (currentChat != null) {
            checkBoostsLevel();
        }
        if (!this.dataLoaded) {
            this.backButtonDrawable.setRotation(1.0f, z);
            this.applyButton.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(this.chooseBackgroundTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cancelOrResetTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyButton, false, 1.0f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applySubTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.themeHintTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.progressView, true, 1.0f, true, z);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 1.0f, true, z);
        if (!hasChanges()) {
            this.backButtonDrawable.setRotation(1.0f, z);
            this.applyButton.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(this.chooseBackgroundTextView, true, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cancelOrResetTextView, true, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyButton, false, 1.0f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applySubTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.themeHintTextView, false, 0.9f, false, z);
            return;
        }
        this.backButtonDrawable.setRotation(0.0f, z);
        this.applyButton.setEnabled(true);
        ChatThemeItem chatThemeItem = this.selectedItem;
        if (chatThemeItem == null || (emojiThemes = chatThemeItem.chatTheme) == null || !emojiThemes.showAsDefaultStub) {
            this.applyTextView.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (currentChat != null && (tL_premium_boostsStatus = this.boostsStatus) != null && tL_premium_boostsStatus.level < this.chatActivity.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.lockSpan == null) {
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
                    this.lockSpan = coloredImageSpan;
                    coloredImageSpan.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.lockSpan, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", this.chatActivity.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                this.applySubTextView.setText(spannableStringBuilder);
                z2 = true;
            }
            if (z || this.applyTextView.getAlpha() <= 0.8f) {
                z3 = false;
            } else {
                z3 = true;
            }
            updateApplySubTextTranslation(z2, z3);
            AndroidUtilities.updateViewVisibilityAnimated(this.chooseBackgroundTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cancelOrResetTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyButton, true, 1.0f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyTextView, true, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applySubTextView, z2, 0.9f, false, 0.7f, z, null);
            AndroidUtilities.updateViewVisibilityAnimated(this.themeHintTextView, true, 0.9f, false, z);
        }
        this.applyTextView.setText(LocaleController.getString(R.string.ChatResetTheme));
        z2 = false;
        if (z) {
            z3 = false;
        } else {
            z3 = false;
        }
        updateApplySubTextTranslation(z2, z3);
        AndroidUtilities.updateViewVisibilityAnimated(this.chooseBackgroundTextView, false, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.cancelOrResetTextView, false, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.applyButton, true, 1.0f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.applyTextView, true, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.applySubTextView, z2, 0.9f, false, 0.7f, z, null);
        AndroidUtilities.updateViewVisibilityAnimated(this.themeHintTextView, true, 0.9f, false, z);
    }

    public void close() {
        if (!hasChanges()) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        final int i = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.ChatThemeSaveDialogTitle));
        builder.setMessage(LocaleController.getString(R.string.ChatThemeSaveDialogText));
        builder.setPositiveButton(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new AlertDialog.OnButtonClickListener(this) {
            public final ChatThemeBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$close$8(alertDialog, i2);
                        break;
                    default:
                        this.f$0.lambda$close$9(alertDialog, i2);
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
            public final void onClick(AlertDialog alertDialog, int i3) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$close$8(alertDialog, i3);
                        break;
                    default:
                        this.f$0.lambda$close$9(alertDialog, i3);
                        break;
                }
            }
        });
        builder.show();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 0));
        }
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        Theme.ThemeInfo themeInfo;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.lambda$showGiftOfferSheet$15();
        this.chatActivity.forceDisallowApplyWallpeper = false;
        if (!this.isApplyClicked) {
            TLRPC.WallPaper currentWallpaper = this.themeDelegate.getCurrentWallpaper();
            if (currentWallpaper == null) {
                currentWallpaper = this.currentWallpaper;
            }
            this.themeDelegate.setCurrentTheme(this.originalTheme, currentWallpaper, true, Boolean.valueOf(this.originalIsDark));
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

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        int i = 0;
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            private boolean isAnimationStarted = false;

            @Override
            public void didSetColor() {
            }

            @Override
            public void onAnimationProgress(float f) {
                if (f == 0.0f && !this.isAnimationStarted) {
                    ChatThemeBottomSheet.this.onAnimationStart();
                    this.isAnimationStarted = true;
                }
                RLottieDrawable rLottieDrawable = ChatThemeBottomSheet.this.darkThemeDrawable;
                ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
                int i2 = Theme.key_featuredStickers_addButton;
                rLottieDrawable.setColorFilter(new PorterDuffColorFilter(chatThemeBottomSheet.getThemedColor(i2), PorterDuff.Mode.MULTIPLY));
                ChatThemeBottomSheet chatThemeBottomSheet2 = ChatThemeBottomSheet.this;
                chatThemeBottomSheet2.setOverlayNavBarColor(chatThemeBottomSheet2.getThemedColor(Theme.key_windowBackgroundGray));
                if (ChatThemeBottomSheet.this.isLightDarkChangeAnimation) {
                    ChatThemeBottomSheet.this.setItemsAnimationProgress(f);
                }
                if (f == 1.0f && this.isAnimationStarted) {
                    ChatThemeBottomSheet.this.isLightDarkChangeAnimation = false;
                    ChatThemeBottomSheet.this.onAnimationEnd();
                    this.isAnimationStarted = false;
                }
                ChatThemeBottomSheet.this.updateButtonColors();
                if (ChatThemeBottomSheet.this.chatAttachButton != null) {
                    FrameLayout frameLayout = ChatThemeBottomSheet.this.chatAttachButton;
                    int iDp = AndroidUtilities.dp(0.0f);
                    int themedColor = ChatThemeBottomSheet.this.getThemedColor(Theme.key_windowBackgroundWhite);
                    int alphaComponent = ColorUtils.setAlphaComponent(ChatThemeBottomSheet.this.getThemedColor(i2), 76);
                    frameLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, themedColor, alphaComponent, alphaComponent));
                }
                if (ChatThemeBottomSheet.this.chatAttachButtonText != null) {
                    ChatThemeBottomSheet.this.chatAttachButtonText.setTextColor(ChatThemeBottomSheet.this.getThemedColor(i2));
                }
                ChatThemeBottomSheet chatThemeBottomSheet3 = ChatThemeBottomSheet.this;
                chatThemeBottomSheet3.setBackgroundColor(chatThemeBottomSheet3.getThemedColor(Theme.key_dialogBackground));
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
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
        arrayList.add(new ThemeDescription(this.applyButton, 32, null, null, null, null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.applyButton, 65568, null, null, null, null, Theme.key_featuredStickers_addButtonPressed));
        int size = arrayList.size();
        while (i < size) {
            ThemeDescription themeDescription = arrayList.get(i);
            i++;
            themeDescription.resourcesProvider = this.themeDelegate;
        }
        return arrayList;
    }

    @Override
    public void lambda$openCrafting$8() {
        close();
    }

    @Override
    public boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || !hasChanges()) {
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
    public void onContainerTranslationYChanged(float f) {
        HintView hintView = this.hintView;
        if (hintView != null) {
            hintView.hide();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
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
            loadNext();
        }
        if (this.chatActivity.getCurrentUser() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || this.chatActivity.getCurrentUser().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        HintView hintView = new HintView(getContext(), 9, this.chatActivity.getResourceProvider());
        this.hintView = hintView;
        hintView.setVisibility(4);
        this.hintView.setShowingDuration(5000L);
        this.hintView.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.forceDark) {
            this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 1), 1500L);
        this.container.addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public void setupLightDarkTheme(final boolean z) {
        if (isDismissed()) {
            return;
        }
        ValueAnimator valueAnimator = this.changeDayNightViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) this.chatActivity.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.darkThemeView.setAlpha(0.0f);
        frameLayout.draw(canvas);
        frameLayout2.draw(canvas);
        this.darkThemeView.setAlpha(1.0f);
        final Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        final Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.darkThemeView.getLocationInWindow(iArr);
        final float f = iArr[0];
        final float f2 = iArr[1];
        final float measuredWidth = (this.darkThemeView.getMeasuredWidth() / 2.0f) + f;
        final float measuredHeight = (this.darkThemeView.getMeasuredHeight() / 2.0f) + f2;
        final float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) * 0.9f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        View view = new View(getContext()) {
            @Override
            public void onDraw(Canvas canvas2) {
                super.onDraw(canvas2);
                if (z) {
                    if (ChatThemeBottomSheet.this.changeDayNightViewProgress > 0.0f) {
                        canvas.drawCircle(measuredWidth, measuredHeight, ChatThemeBottomSheet.this.changeDayNightViewProgress * fMax, paint);
                    }
                    canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
                } else {
                    canvas2.drawCircle(measuredWidth, measuredHeight, (1.0f - ChatThemeBottomSheet.this.changeDayNightViewProgress) * fMax, paint2);
                }
                canvas2.save();
                canvas2.translate(f, f2);
                ChatThemeBottomSheet.this.darkThemeView.draw(canvas2);
                canvas2.restore();
            }
        };
        this.changeDayNightView = view;
        view.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(21));
        this.changeDayNightViewProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.changeDayNightViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            boolean changedNavigationBarColor = false;

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ChatThemeBottomSheet.this.changeDayNightViewProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ChatThemeBottomSheet.this.changeDayNightView.invalidate();
                if (this.changedNavigationBarColor || ChatThemeBottomSheet.this.changeDayNightViewProgress <= 0.5f) {
                    return;
                }
                this.changedNavigationBarColor = true;
            }
        });
        this.changeDayNightViewAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ChatThemeBottomSheet.this.changeDayNightView != null) {
                    if (ChatThemeBottomSheet.this.changeDayNightView.getParent() != null) {
                        ((ViewGroup) ChatThemeBottomSheet.this.changeDayNightView.getParent()).removeView(ChatThemeBottomSheet.this.changeDayNightView);
                    }
                    ChatThemeBottomSheet.this.changeDayNightView = null;
                }
                ChatThemeBottomSheet.this.changeDayNightViewAnimator = null;
                super.onAnimationEnd(animator);
            }
        });
        this.changeDayNightViewAnimator.setDuration(400L);
        this.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
        this.changeDayNightViewAnimator.start();
        frameLayout2.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new MediaActivity$$ExternalSyntheticLambda5(this, z, 5));
    }

    private void applySelectedTheme(boolean z) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i = 1;
        if (this.checkingBoostsLevel) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.chatActivity.getMessagesController().channelWallpaperLevelMin) {
            this.chatActivity.getMessagesController().getBoostsController().userCanBoostChannel(this.chatActivity.getDialogId(), this.boostsStatus, new ChatThemeBottomSheet$$ExternalSyntheticLambda17(this, i));
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
                AlertsCreator.showGiftThemeApplyConfirm(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 3));
                return;
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(this.chatActivity.getDialogId(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(this.chatActivity.getDialogId(), chatTheme, true);
            TLRPC.WallPaper currentWallpaper = hasChanges() ? null : this.themeDelegate.getCurrentWallpaper();
            if (emojiThemes.showAsDefaultStub) {
                this.themeDelegate.setCurrentTheme(null, currentWallpaper, true, Boolean.valueOf(this.originalIsDark));
            } else {
                this.themeDelegate.setCurrentTheme(emojiThemes, currentWallpaper, true, Boolean.valueOf(this.originalIsDark));
            }
            this.isApplyClicked = true;
            TLRPC.User currentUser = this.chatActivity.getCurrentUser();
            if (currentUser != null && !currentUser.self) {
                boolean z2 = emojiThemes.showAsDefaultStub;
                StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(getContext(), null, -1, emojiThemes.getEmojiAnimatedSticker(), this.chatActivity.getResourceProvider());
                stickerSetBulletinLayout.subtitleTextView.setVisibility(8);
                if (z2) {
                    stickerSetBulletinLayout.titleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, currentUser.first_name)));
                } else {
                    stickerSetBulletinLayout.titleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, currentUser.first_name)));
                }
                stickerSetBulletinLayout.titleTextView.setTypeface(null);
                bulletinMake = Bulletin.make(this.chatActivity, stickerSetBulletinLayout, 2750);
            }
        }
        lambda$showGiftOfferSheet$15();
        if (bulletinMake != null) {
            bulletinMake.show();
        }
    }

    public void openGalleryForBackground() {
        Activity parentActivity = this.chatActivity.getParentActivity();
        ChatActivity chatActivity = this.chatActivity;
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(parentActivity, chatActivity, false, false, false, chatActivity.getResourceProvider());
        this.chatAttachAlert = chatAttachAlert;
        chatAttachAlert.drawNavigationBar = true;
        chatAttachAlert.setupPhotoPicker(LocaleController.getString(R.string.ChooseBackground));
        this.chatAttachAlert.setDelegate(new AnonymousClass14());
        this.chatAttachAlert.setMaxSelectedPhotos(1, false);
        this.chatAttachAlert.init();
        this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        this.chatAttachAlert.show();
        this.chatAttachButton = new FrameLayout(getContext()) {
            Paint paint = new Paint();

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.paint.setColor(ChatThemeBottomSheet.this.getThemedColor(Theme.key_divider));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.paint);
            }

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
            }
        };
        AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), true, true, true);
        this.chatAttachButtonText = animatedTextView;
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        this.chatAttachButtonText.setText(LocaleController.getString(R.string.SetColorAsBackground));
        this.chatAttachButtonText.setGravity(17);
        AnimatedTextView animatedTextView2 = this.chatAttachButtonText;
        int i = Theme.key_featuredStickers_addButton;
        animatedTextView2.setTextColor(getThemedColor(i));
        this.chatAttachButton.addView(this.chatAttachButtonText, LayoutHelper.createFrame(-1, -2, 17));
        FrameLayout frameLayout = this.chatAttachButton;
        int iDp = AndroidUtilities.dp(0.0f);
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
        int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(i), 76);
        frameLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, themedColor, alphaComponent, alphaComponent));
        this.chatAttachButton.setOnClickListener(new ChatThemeBottomSheet$$ExternalSyntheticLambda4(this, 0));
        this.chatAttachAlert.sizeNotifierFrameLayout.addView(this.chatAttachButton, LayoutHelper.createFrame(-1, -2, 80));
    }

    public void showAsSheet(ThemePreviewActivity themePreviewActivity) {
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        themePreviewActivity.setResourceProvider(this.chatActivity.getResourceProvider());
        themePreviewActivity.setOnSwitchDayNightDelegate(new ThemePreviewActivity.DayNightSwitchDelegate() {
            private Runnable fixRedraw;

            @Override
            public boolean isDark() {
                return ChatThemeBottomSheet.this.forceDark;
            }

            @Override
            public boolean supportsAnimation() {
                return true;
            }

            @Override
            public void switchDayNight(boolean z) {
                ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
                chatThemeBottomSheet.forceDark = !chatThemeBottomSheet.forceDark;
                if (ChatThemeBottomSheet.this.selectedItem != null) {
                    ChatThemeBottomSheet.this.isLightDarkChangeAnimation = true;
                    ChatThemeBottomSheet.this.chatActivity.forceDisallowRedrawThemeDescriptions = true;
                    TLRPC.WallPaper currentWallpaper = ChatThemeBottomSheet.this.hasChanges() ? null : ChatThemeBottomSheet.this.themeDelegate.getCurrentWallpaper();
                    if (ChatThemeBottomSheet.this.selectedItem.chatTheme.showAsDefaultStub) {
                        ChatThemeBottomSheet.this.themeDelegate.setCurrentTheme(null, currentWallpaper, z, Boolean.valueOf(ChatThemeBottomSheet.this.forceDark));
                    } else {
                        ChatThemeBottomSheet.this.themeDelegate.setCurrentTheme(ChatThemeBottomSheet.this.selectedItem.chatTheme, currentWallpaper, z, Boolean.valueOf(ChatThemeBottomSheet.this.forceDark));
                    }
                    ChatThemeBottomSheet.this.chatActivity.forceDisallowRedrawThemeDescriptions = false;
                }
            }
        });
        bottomSheetParams.onOpenAnimationFinished = new UndoView$$ExternalSyntheticLambda7(16);
        bottomSheetParams.onPreFinished = new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 6);
        bottomSheetParams.onDismiss = new ChatThemeBottomSheet$$ExternalSyntheticLambda0(this, 7);
        bottomSheetParams.occupyNavigationBar = true;
        this.overlayFragment = themePreviewActivity;
        this.chatActivity.showAsSheet(themePreviewActivity, bottomSheetParams);
    }
}
