package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_account_getWallPaper;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputWallPaperSlug;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DrawerProfileCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.WallpapersListActivity;
public class ChatThemeBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private final Adapter adapter;
    private final View applyButton;
    private AnimatedTextView applyTextView;
    private final BackDrawable backButtonDrawable;
    private final ImageView backButtonView;
    private TextView cancelOrResetTextView;
    private View changeDayNightView;
    private ValueAnimator changeDayNightViewAnimator;
    private float changeDayNightViewProgress;
    private final ChatActivity chatActivity;
    public ChatAttachAlert chatAttachAlert;
    private FrameLayout chatAttachButton;
    private AnimatedTextView chatAttachButtonText;
    private TextView chooseBackgroundTextView;
    private EmojiThemes currentTheme;
    private TLRPC$WallPaper currentWallpaper;
    private final RLottieDrawable darkThemeDrawable;
    private final RLottieImageView darkThemeView;
    private boolean dataLoaded;
    private boolean forceDark;
    HintView hintView;
    private boolean isApplyClicked;
    private boolean isLightDarkChangeAnimation;
    private final LinearLayoutManager layoutManager;
    private final boolean originalIsDark;
    private final EmojiThemes originalTheme;
    ThemePreviewActivity overlayFragment;
    private int prevSelectedPosition;
    private final FlickerLoadingView progressView;
    private final RecyclerListView recyclerView;
    private FrameLayout rootLayout;
    private final LinearSmoothScroller scroller;
    private ChatThemeItem selectedItem;
    private final ChatActivity.ThemeDelegate themeDelegate;
    private TextView themeHintTextView;
    private final TextView titleView;

    public ChatThemeBottomSheet(final ChatActivity chatActivity, ChatActivity.ThemeDelegate themeDelegate) {
        super(chatActivity.getParentActivity(), true, themeDelegate);
        this.prevSelectedPosition = -1;
        this.chatActivity = chatActivity;
        this.themeDelegate = themeDelegate;
        this.originalTheme = themeDelegate.getCurrentTheme();
        this.currentWallpaper = themeDelegate.getCurrentWallpaper();
        this.originalIsDark = Theme.getActiveTheme().isDark();
        Adapter adapter = new Adapter(this.currentAccount, themeDelegate, 0);
        this.adapter = adapter;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        this.drawNavigationBar = true;
        fixNavigationBar();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.rootLayout = frameLayout;
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.titleView = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
        textView.setTextColor(getThemedColor("dialogTextBlack"));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.backButtonView = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        BackDrawable backDrawable = new BackDrawable(false);
        this.backButtonDrawable = backDrawable;
        imageView.setImageDrawable(backDrawable);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatThemeBottomSheet.this.lambda$new$0(view);
            }
        });
        this.rootLayout.addView(imageView, LayoutHelper.createFrame(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        this.rootLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int themedColor = getThemedColor("featuredStickers_addButton");
        int dp2 = AndroidUtilities.dp(28.0f);
        int i = R.raw.sun_outline;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "" + i, dp2, dp2, false, null);
        this.darkThemeDrawable = rLottieDrawable;
        this.forceDark = Theme.getActiveTheme().isDark() ^ true;
        setForceDark(Theme.getActiveTheme().isDark(), false);
        rLottieDrawable.setAllowDecodeSingleFrame(true);
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        rLottieDrawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        RLottieImageView rLottieImageView = new RLottieImageView(getContext()) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (ChatThemeBottomSheet.this.forceDark) {
                    accessibilityNodeInfo.setText(LocaleController.getString("AccDescrSwitchToDayTheme", R.string.AccDescrSwitchToDayTheme));
                } else {
                    accessibilityNodeInfo.setText(LocaleController.getString("AccDescrSwitchToNightTheme", R.string.AccDescrSwitchToNightTheme));
                }
            }
        };
        this.darkThemeView = rLottieImageView;
        rLottieImageView.setAnimation(rLottieDrawable);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatThemeBottomSheet.this.lambda$new$1(view);
            }
        });
        this.rootLayout.addView(rLottieImageView, LayoutHelper.createFrame(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.scroller = new LinearSmoothScroller(this, getContext()) {
            @Override
            public int calculateTimeForScrolling(int i2) {
                return super.calculateTimeForScrolling(i2) * 6;
            }
        };
        RecyclerListView recyclerListView = new RecyclerListView(getContext());
        this.recyclerView = recyclerListView;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setDrawSelection(false);
        recyclerListView.setClipChildren(false);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setHasFixedSize(true);
        recyclerListView.setItemAnimator(null);
        recyclerListView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        recyclerListView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                ChatThemeBottomSheet.this.lambda$new$2(view, i2);
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
        view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), getThemedColor("featuredStickers_addButton"), getThemedColor("featuredStickers_addButtonPressed")));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChatThemeBottomSheet.this.lambda$new$3(view2);
            }
        });
        this.rootLayout.addView(view, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.chooseBackgroundTextView = textView2;
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        this.chooseBackgroundTextView.setGravity(17);
        this.chooseBackgroundTextView.setLines(1);
        this.chooseBackgroundTextView.setSingleLine(true);
        if (this.currentWallpaper == null) {
            this.chooseBackgroundTextView.setText(LocaleController.getString("ChooseBackgroundFromGallery", R.string.ChooseBackgroundFromGallery));
        } else {
            this.chooseBackgroundTextView.setText(LocaleController.getString("ChooseANewWallpaper", R.string.ChooseANewWallpaper));
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
        this.applyTextView.setTextColor(getThemedColor("featuredStickers_buttonText"));
        this.applyTextView.setTextSize(AndroidUtilities.dp(15.0f));
        this.applyTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.rootLayout.addView(this.applyTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.currentWallpaper != null) {
            TextView textView3 = new TextView(getContext());
            this.cancelOrResetTextView = textView3;
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            this.cancelOrResetTextView.setGravity(17);
            this.cancelOrResetTextView.setLines(1);
            this.cancelOrResetTextView.setSingleLine(true);
            this.cancelOrResetTextView.setText(LocaleController.getString("RestToDefaultBackground", R.string.RestToDefaultBackground));
            this.cancelOrResetTextView.setTextSize(1, 15.0f);
            this.cancelOrResetTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatThemeBottomSheet.this.lambda$new$4(chatActivity, view2);
                }
            });
            this.rootLayout.addView(this.cancelOrResetTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 216.0f, 16.0f, 16.0f));
            TextView textView4 = new TextView(getContext());
            this.themeHintTextView = textView4;
            textView4.setEllipsize(TextUtils.TruncateAt.END);
            this.themeHintTextView.setGravity(17);
            this.themeHintTextView.setLines(1);
            this.themeHintTextView.setSingleLine(true);
            this.themeHintTextView.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, chatActivity.getCurrentUser().first_name));
            this.themeHintTextView.setTextSize(1, 15.0f);
            this.rootLayout.addView(this.themeHintTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 216.0f, 16.0f, 16.0f));
        }
        updateButtonColors();
        updateState(false);
    }

    public void lambda$new$0(View view) {
        if (hasChanges()) {
            resetToPrimaryState(true);
            updateState(true);
            return;
        }
        dismiss();
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
                int max;
                RecyclerView.LayoutManager layoutManager = ChatThemeBottomSheet.this.recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    if (i > ChatThemeBottomSheet.this.prevSelectedPosition) {
                        max = Math.min(i + 1, ChatThemeBottomSheet.this.adapter.items.size() - 1);
                    } else {
                        max = Math.max(i - 1, 0);
                    }
                    ChatThemeBottomSheet.this.scroller.setTargetPosition(max);
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
        if (this.currentWallpaper != null) {
            this.currentWallpaper = null;
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(chatActivity.getDialogId());
            dismiss();
            return;
        }
        dismiss();
    }

    public void updateButtonColors() {
        TextView textView = this.themeHintTextView;
        if (textView != null) {
            textView.setTextColor(getThemedColor("dialogTextGray"));
            this.themeHintTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), 0, ColorUtils.setAlphaComponent(getThemedColor("featuredStickers_addButton"), 76)));
        }
        TextView textView2 = this.cancelOrResetTextView;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor("text_RedRegular"));
            this.cancelOrResetTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), 0, ColorUtils.setAlphaComponent(getThemedColor("text_RedRegular"), 76)));
        }
        this.backButtonView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getThemedColor("dialogTextBlack"), 30), 1));
        this.backButtonDrawable.setColor(getThemedColor("dialogTextBlack"));
        this.backButtonDrawable.setRotatedColor(getThemedColor("dialogTextBlack"));
        this.backButtonView.invalidate();
        this.darkThemeView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getThemedColor("featuredStickers_addButton"), 30), 1));
        this.chooseBackgroundTextView.setTextColor(getThemedColor("dialogTextBlue"));
        this.chooseBackgroundTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), 0, ColorUtils.setAlphaComponent(getThemedColor("featuredStickers_addButton"), 76)));
    }

    private void previewSelectedTheme() {
        this.isLightDarkChangeAnimation = false;
        this.chatActivity.forceDisallowApplyWallpeper = false;
        EmojiThemes emojiThemes = this.selectedItem.chatTheme;
        if (emojiThemes.showAsDefaultStub) {
            this.themeDelegate.setCurrentTheme(null, this.currentWallpaper, true, Boolean.valueOf(this.forceDark));
        } else {
            this.themeDelegate.setCurrentTheme(emojiThemes, this.currentWallpaper, true, Boolean.valueOf(this.forceDark));
        }
    }

    private void updateState(boolean z) {
        EmojiThemes emojiThemes;
        if (!this.dataLoaded) {
            this.backButtonDrawable.setRotation(1.0f, z);
            this.applyButton.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(this.chooseBackgroundTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cancelOrResetTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyButton, false, 1.0f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.themeHintTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.progressView, true, 1.0f, true, z);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 1.0f, true, z);
        if (hasChanges()) {
            this.backButtonDrawable.setRotation(0.0f, z);
            this.applyButton.setEnabled(true);
            AndroidUtilities.updateViewVisibilityAnimated(this.chooseBackgroundTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cancelOrResetTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyButton, true, 1.0f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyTextView, true, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.themeHintTextView, true, 0.9f, false, z);
            ChatThemeItem chatThemeItem = this.selectedItem;
            if (chatThemeItem != null && (emojiThemes = chatThemeItem.chatTheme) != null && emojiThemes.showAsDefaultStub && emojiThemes.wallpaper == null) {
                this.applyTextView.setText(LocaleController.getString("ChatResetTheme", R.string.ChatResetTheme));
                return;
            } else {
                this.applyTextView.setText(LocaleController.getString("ChatApplyTheme", R.string.ChatApplyTheme));
                return;
            }
        }
        this.backButtonDrawable.setRotation(1.0f, z);
        this.applyButton.setEnabled(false);
        AndroidUtilities.updateViewVisibilityAnimated(this.chooseBackgroundTextView, true, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.cancelOrResetTextView, true, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.applyButton, false, 1.0f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.applyTextView, false, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.themeHintTextView, false, 0.9f, false, z);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ChatThemeController.preloadAllWallpaperThumbs(true);
        ChatThemeController.preloadAllWallpaperThumbs(false);
        ChatThemeController.preloadAllWallpaperImages(true);
        ChatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.isApplyClicked = false;
        List<EmojiThemes> cachedThemes = this.themeDelegate.getCachedThemes();
        if (cachedThemes == null || cachedThemes.isEmpty()) {
            ChatThemeController.requestAllChatThemes(new AnonymousClass5(), true);
        } else {
            onDataLoaded(cachedThemes);
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
        this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDayNightSwitchTooltip", R.string.ChatThemeDayNightSwitchTooltip, this.chatActivity.getCurrentUser().first_name)));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.this.lambda$onCreate$5();
            }
        }, 1500L);
        this.container.addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    public class AnonymousClass5 implements ResultCallback<List<EmojiThemes>> {
        AnonymousClass5() {
        }

        @Override
        public void onComplete(final List<EmojiThemes> list) {
            if (list != null && !list.isEmpty()) {
                ChatThemeBottomSheet.this.themeDelegate.setCachedThemes(list);
            }
            NotificationCenter.getInstance(((BottomSheet) ChatThemeBottomSheet.this).currentAccount).doOnIdle(new Runnable() {
                @Override
                public final void run() {
                    ChatThemeBottomSheet.AnonymousClass5.this.lambda$onComplete$0(list);
                }
            });
        }

        public void lambda$onComplete$0(List list) {
            ChatThemeBottomSheet.this.onDataLoaded(list);
        }

        @Override
        public void onError(TLRPC$TL_error tLRPC$TL_error) {
            Toast.makeText(ChatThemeBottomSheet.this.getContext(), tLRPC$TL_error.text, 0).show();
        }
    }

    public void lambda$onCreate$5() {
        this.hintView.showForView(this.darkThemeView, true);
    }

    @Override
    public void onContainerTranslationYChanged(float f) {
        HintView hintView = this.hintView;
        if (hintView != null) {
            hintView.hide();
        }
    }

    @Override
    public void onBackPressed() {
        close();
    }

    @Override
    public void dismiss() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.chatActivity.forceDisallowApplyWallpeper = false;
        if (this.isApplyClicked) {
            return;
        }
        ChatActivity.ThemeDelegate themeDelegate = this.themeDelegate;
        themeDelegate.setCurrentTheme(this.originalTheme, themeDelegate.getCurrentWallpaper(), true, Boolean.valueOf(this.originalIsDark));
    }

    public void close() {
        if (hasChanges()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
            builder.setTitle(LocaleController.getString("ChatThemeSaveDialogTitle", R.string.ChatThemeSaveDialogTitle));
            builder.setSubtitle(LocaleController.getString("ChatThemeSaveDialogText", R.string.ChatThemeSaveDialogText));
            builder.setPositiveButton(LocaleController.getString("ChatThemeSaveDialogApply", R.string.ChatThemeSaveDialogApply), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatThemeBottomSheet.this.lambda$close$6(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("ChatThemeSaveDialogDiscard", R.string.ChatThemeSaveDialogDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatThemeBottomSheet.this.lambda$close$7(dialogInterface, i);
                }
            });
            builder.show();
            return;
        }
        dismiss();
    }

    public void lambda$close$6(DialogInterface dialogInterface, int i) {
        applySelectedTheme();
    }

    public void lambda$close$7(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
                @Override
                public final void run() {
                    ChatThemeBottomSheet.this.lambda$didReceivedNotification$8();
                }
            });
        }
    }

    public void lambda$didReceivedNotification$8() {
        this.adapter.notifyDataSetChanged();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ThemePreviewActivity themePreviewActivity;
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
                ChatThemeBottomSheet.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(ChatThemeBottomSheet.this.getThemedColor("featuredStickers_addButton"), PorterDuff.Mode.MULTIPLY));
                ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
                chatThemeBottomSheet.setOverlayNavBarColor(chatThemeBottomSheet.getThemedColor("windowBackgroundGray"));
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
                    ChatThemeBottomSheet.this.chatAttachButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(0.0f), ChatThemeBottomSheet.this.getThemedColor("windowBackgroundWhite"), ColorUtils.setAlphaComponent(ChatThemeBottomSheet.this.getThemedColor("featuredStickers_addButton"), 76)));
                }
                if (ChatThemeBottomSheet.this.chatAttachButtonText != null) {
                    ChatThemeBottomSheet.this.chatAttachButtonText.setTextColor(ChatThemeBottomSheet.this.getThemedColor("featuredStickers_addButton"));
                }
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        if (this.chatActivity.forceDisallowRedrawThemeDescriptions && (themePreviewActivity = this.overlayFragment) != null) {
            arrayList.addAll(themePreviewActivity.getThemeDescriptionsInternal());
            return arrayList;
        }
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            arrayList.addAll(chatAttachAlert.getThemeDescriptions());
        }
        arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, new Drawable[]{this.shadowDrawable}, themeDescriptionDelegate, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.titleView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.recyclerView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ThemeSmallPreviewView.class}, null, null, null, "dialogBackgroundGray"));
        arrayList.add(new ThemeDescription(this.applyButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "featuredStickers_addButton"));
        arrayList.add(new ThemeDescription(this.applyButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "featuredStickers_addButtonPressed"));
        Iterator<ThemeDescription> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().resourcesProvider = this.themeDelegate;
        }
        return arrayList;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setupLightDarkTheme(final boolean z) {
        ValueAnimator valueAnimator = this.changeDayNightViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView();
        final Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(createBitmap);
        this.darkThemeView.setAlpha(0.0f);
        ((FrameLayout) this.chatActivity.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
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
        final float measuredWidth = f + (this.darkThemeView.getMeasuredWidth() / 2.0f);
        final float measuredHeight = f2 + (this.darkThemeView.getMeasuredHeight() / 2.0f);
        final float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        this.changeDayNightView = new View(getContext()) {
            @Override
            protected void onDraw(Canvas canvas2) {
                super.onDraw(canvas2);
                if (z) {
                    if (ChatThemeBottomSheet.this.changeDayNightViewProgress > 0.0f) {
                        canvas.drawCircle(measuredWidth, measuredHeight, max * ChatThemeBottomSheet.this.changeDayNightViewProgress, paint);
                    }
                    canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
                } else {
                    canvas2.drawCircle(measuredWidth, measuredHeight, max * (1.0f - ChatThemeBottomSheet.this.changeDayNightViewProgress), paint2);
                }
                canvas2.save();
                canvas2.translate(f, f2);
                ChatThemeBottomSheet.this.darkThemeView.draw(canvas2);
                canvas2.restore();
            }
        };
        this.changeDayNightViewProgress = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.changeDayNightViewAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            boolean changedNavigationBarColor = false;

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ChatThemeBottomSheet.this.changeDayNightViewProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ChatThemeBottomSheet.this.changeDayNightView.invalidate();
                if (this.changedNavigationBarColor || ChatThemeBottomSheet.this.changeDayNightViewProgress <= 0.5f) {
                    return;
                }
                this.changedNavigationBarColor = true;
                AndroidUtilities.setLightNavigationBar(ChatThemeBottomSheet.this.getWindow(), true ^ z);
                AndroidUtilities.setNavigationBarColor(ChatThemeBottomSheet.this.getWindow(), ChatThemeBottomSheet.this.getThemedColor("windowBackgroundGray"));
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
        frameLayout.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.this.lambda$setupLightDarkTheme$9(z);
            }
        });
    }

    public void lambda$setupLightDarkTheme$9(boolean z) {
        Adapter adapter = this.adapter;
        if (adapter == null || adapter.items == null) {
            return;
        }
        setForceDark(z, true);
        ChatThemeItem chatThemeItem = this.selectedItem;
        if (chatThemeItem != null) {
            this.isLightDarkChangeAnimation = true;
            EmojiThemes emojiThemes = chatThemeItem.chatTheme;
            if (emojiThemes.showAsDefaultStub) {
                this.themeDelegate.setCurrentTheme(null, this.currentWallpaper, false, Boolean.valueOf(z));
            } else {
                this.themeDelegate.setCurrentTheme(emojiThemes, this.currentWallpaper, false, Boolean.valueOf(z));
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

    @Override
    protected boolean onContainerTouchEvent(MotionEvent motionEvent) {
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

    public void onDataLoaded(List<EmojiThemes> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.dataLoaded = true;
        ChatThemeItem chatThemeItem = new ChatThemeItem(list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        this.currentTheme = this.themeDelegate.getCurrentTheme();
        arrayList.add(0, chatThemeItem);
        this.selectedItem = chatThemeItem;
        for (int i = 1; i < list.size(); i++) {
            EmojiThemes emojiThemes = list.get(i);
            ChatThemeItem chatThemeItem2 = new ChatThemeItem(emojiThemes);
            emojiThemes.loadPreviewColors(this.currentAccount);
            chatThemeItem2.themeIndex = this.forceDark ? 1 : 0;
            arrayList.add(chatThemeItem2);
        }
        this.adapter.setItems(arrayList);
        this.darkThemeView.setVisibility(0);
        resetToPrimaryState(false);
        this.recyclerView.animate().alpha(1.0f).setDuration(150L).start();
        updateState(true);
    }

    private void resetToPrimaryState(boolean z) {
        List<ChatThemeItem> list = this.adapter.items;
        if (this.currentTheme == null) {
            this.selectedItem = list.get(0);
            this.adapter.setSelectedItem(0);
            if (z) {
                this.recyclerView.smoothScrollToPosition(0);
                return;
            } else {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
                return;
            }
        }
        int i = 0;
        while (true) {
            if (i == list.size()) {
                i = -1;
                break;
            } else if (list.get(i).chatTheme.getEmoticon().equals(this.currentTheme.getEmoticon())) {
                this.selectedItem = list.get(i);
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.prevSelectedPosition = i;
            this.adapter.setSelectedItem(i);
            if (i > 0 && i < list.size() / 2) {
                i--;
            }
            int min = Math.min(i, this.adapter.items.size() - 1);
            if (z) {
                this.recyclerView.smoothScrollToPosition(min);
            } else {
                this.layoutManager.scrollToPositionWithOffset(min, 0);
            }
        }
    }

    public void onAnimationStart() {
        List<ChatThemeItem> list;
        Adapter adapter = this.adapter;
        if (adapter != null && (list = adapter.items) != null) {
            for (ChatThemeItem chatThemeItem : list) {
                chatThemeItem.themeIndex = this.forceDark ? 1 : 0;
            }
        }
        if (this.isLightDarkChangeAnimation) {
            return;
        }
        setItemsAnimationProgress(1.0f);
    }

    public void onAnimationEnd() {
        this.isLightDarkChangeAnimation = false;
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

    private void applySelectedTheme() {
        boolean z;
        ChatThemeItem chatThemeItem = this.selectedItem;
        EmojiThemes emojiThemes = chatThemeItem.chatTheme;
        Bulletin bulletin = null;
        if (chatThemeItem != null && emojiThemes != this.currentTheme) {
            String emoticon = !emojiThemes.showAsDefaultStub ? emojiThemes.getEmoticon() : null;
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(this.chatActivity.getDialogId(), emoticon, true);
            if (emojiThemes.showAsDefaultStub && emojiThemes.wallpaper == null) {
                ChatThemeController.getInstance(this.currentAccount).clearWallpaper(this.chatActivity.getDialogId());
            }
            if (!emojiThemes.showAsDefaultStub) {
                this.themeDelegate.setCurrentTheme(emojiThemes, this.currentWallpaper, true, Boolean.valueOf(this.originalIsDark));
            } else {
                this.themeDelegate.setCurrentTheme(null, this.currentWallpaper, true, Boolean.valueOf(this.originalIsDark));
            }
            this.isApplyClicked = true;
            TLRPC$User currentUser = this.chatActivity.getCurrentUser();
            if (currentUser != null && !currentUser.self) {
                if (TextUtils.isEmpty(emoticon)) {
                    emoticon = "❌";
                    z = true;
                } else {
                    z = false;
                }
                StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(getContext(), null, -1, emoticon != null ? MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(emoticon) : null, this.chatActivity.getResourceProvider());
                stickerSetBulletinLayout.subtitleTextView.setVisibility(8);
                if (z) {
                    stickerSetBulletinLayout.titleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, currentUser.first_name)));
                } else {
                    stickerSetBulletinLayout.titleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, currentUser.first_name)));
                }
                stickerSetBulletinLayout.titleTextView.setTypeface(null);
                bulletin = Bulletin.make(this.chatActivity, stickerSetBulletinLayout, 2750);
            }
        }
        dismiss();
        if (bulletin != null) {
            bulletin.show();
        }
    }

    private boolean hasChanges() {
        if (this.selectedItem == null) {
            return false;
        }
        EmojiThemes emojiThemes = this.currentTheme;
        String emoticon = emojiThemes != null ? emojiThemes.getEmoticon() : null;
        if (TextUtils.isEmpty(emoticon)) {
            emoticon = "❌";
        }
        EmojiThemes emojiThemes2 = this.selectedItem.chatTheme;
        String emoticon2 = emojiThemes2 != null ? emojiThemes2.getEmoticon() : null;
        return !Objects.equals(emoticon, TextUtils.isEmpty(emoticon2) ? "❌" : emoticon2);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public static class Adapter extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        private final int currentViewType;
        public List<ChatThemeItem> items;
        private final Theme.ResourcesProvider resourcesProvider;
        private WeakReference<ThemeSmallPreviewView> selectedViewRef;
        private int selectedItemPosition = -1;
        private HashMap<String, Theme.ThemeInfo> loadingThemes = new HashMap<>();
        private HashMap<Theme.ThemeInfo, String> loadingWallpapers = new HashMap<>();

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public Adapter(int i, Theme.ResourcesProvider resourcesProvider, int i2) {
            this.currentViewType = i2;
            this.resourcesProvider = resourcesProvider;
            this.currentAccount = i;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new ThemeSmallPreviewView(viewGroup.getContext(), this.currentAccount, this.resourcesProvider, this.currentViewType));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) viewHolder.itemView;
            Theme.ThemeInfo themeInfo = this.items.get(i).chatTheme.getThemeInfo(this.items.get(i).themeIndex);
            if (themeInfo != null && themeInfo.pathToFile != null && !themeInfo.previewParsed && new File(themeInfo.pathToFile).exists()) {
                parseTheme(themeInfo);
            }
            ChatThemeItem chatThemeItem = this.items.get(i);
            ChatThemeItem chatThemeItem2 = themeSmallPreviewView.chatThemeItem;
            boolean z = chatThemeItem2 != null && chatThemeItem2.chatTheme.getEmoticon().equals(chatThemeItem.chatTheme.getEmoticon()) && !DrawerProfileCell.switchingTheme && themeSmallPreviewView.lastThemeIndex == chatThemeItem.themeIndex;
            themeSmallPreviewView.setFocusable(true);
            themeSmallPreviewView.setEnabled(true);
            themeSmallPreviewView.setBackgroundColor(Theme.getColor("dialogBackgroundGray"));
            themeSmallPreviewView.setItem(chatThemeItem, z);
            themeSmallPreviewView.setSelected(i == this.selectedItemPosition, z);
            if (i == this.selectedItemPosition) {
                this.selectedViewRef = new WeakReference<>(themeSmallPreviewView);
            }
        }

        private boolean parseTheme(final Theme.ThemeInfo themeInfo) {
            FileInputStream fileInputStream;
            Throwable th;
            boolean z;
            int i;
            String[] split;
            int intValue;
            char c;
            if (themeInfo == null || themeInfo.pathToFile == null) {
                return false;
            }
            int i2 = 1;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(themeInfo.pathToFile));
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(ThemesHorizontalListCell.bytes);
                        if (read != -1) {
                            int i4 = i3;
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                if (i5 < read) {
                                    byte[] bArr = ThemesHorizontalListCell.bytes;
                                    if (bArr[i5] == 10) {
                                        int i7 = (i5 - i6) + i2;
                                        String str = new String(bArr, i6, i7 - 1, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            try {
                                                String substring = str.substring(4);
                                                Uri parse = Uri.parse(substring);
                                                themeInfo.slug = parse.getQueryParameter("slug");
                                                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                                themeInfo.pathToWallpaper = new File(filesDirFixed, Utilities.MD5(substring) + ".wp").getAbsolutePath();
                                                String queryParameter = parse.getQueryParameter("mode");
                                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                    int i8 = 0;
                                                    while (true) {
                                                        if (i8 < split.length) {
                                                            if ("blur".equals(split[i8])) {
                                                                themeInfo.isBlured = true;
                                                            } else {
                                                                i8++;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                    try {
                                                        String queryParameter2 = parse.getQueryParameter("bg_color");
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
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        themeInfo.patternIntensity = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                    }
                                                    if (themeInfo.patternIntensity == 0) {
                                                        themeInfo.patternIntensity = 50;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileInputStream = fileInputStream2;
                                                fileInputStream.close();
                                                throw th;
                                            }
                                        } else if (str.startsWith("WPS")) {
                                            themeInfo.previewWallpaperOffset = i7 + i4;
                                            fileInputStream = fileInputStream2;
                                            z2 = true;
                                        } else {
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1) {
                                                String substring2 = str.substring(0, indexOf);
                                                z = z2;
                                                i = read;
                                                fileInputStream = fileInputStream2;
                                                if (substring2.equals("chat_inBubble") || substring2.equals("chat_outBubble") || substring2.equals("chat_wallpaper") || substring2.equals("chat_wallpaper_gradient_to") || substring2.equals("key_chat_wallpaper_gradient_to2") || substring2.equals("key_chat_wallpaper_gradient_to3")) {
                                                    String substring3 = str.substring(indexOf + 1);
                                                    if (substring3.length() > 0 && substring3.charAt(0) == '#') {
                                                        try {
                                                            intValue = Color.parseColor(substring3);
                                                        } catch (Exception unused3) {
                                                            intValue = Utilities.parseInt((CharSequence) substring3).intValue();
                                                        }
                                                    } else {
                                                        intValue = Utilities.parseInt((CharSequence) substring3).intValue();
                                                    }
                                                    switch (substring2.hashCode()) {
                                                        case -1625862693:
                                                            if (substring2.equals("chat_wallpaper")) {
                                                                c = 2;
                                                                break;
                                                            }
                                                            c = 65535;
                                                            break;
                                                        case -633951866:
                                                            if (substring2.equals("chat_wallpaper_gradient_to")) {
                                                                c = 3;
                                                                break;
                                                            }
                                                            c = 65535;
                                                            break;
                                                        case 1269980952:
                                                            if (substring2.equals("chat_inBubble")) {
                                                                c = 0;
                                                                break;
                                                            }
                                                            c = 65535;
                                                            break;
                                                        case 1381936524:
                                                            if (substring2.equals("key_chat_wallpaper_gradient_to2")) {
                                                                c = 4;
                                                                break;
                                                            }
                                                            c = 65535;
                                                            break;
                                                        case 1381936525:
                                                            if (substring2.equals("key_chat_wallpaper_gradient_to3")) {
                                                                c = 5;
                                                                break;
                                                            }
                                                            c = 65535;
                                                            break;
                                                        case 2052611411:
                                                            if (substring2.equals("chat_outBubble")) {
                                                                c = 1;
                                                                break;
                                                            }
                                                            c = 65535;
                                                            break;
                                                        default:
                                                            c = 65535;
                                                            break;
                                                    }
                                                    if (c == 0) {
                                                        themeInfo.setPreviewInColor(intValue);
                                                    } else if (c == 1) {
                                                        themeInfo.setPreviewOutColor(intValue);
                                                    } else if (c == 2) {
                                                        themeInfo.setPreviewBackgroundColor(intValue);
                                                    } else if (c == 3) {
                                                        themeInfo.previewBackgroundGradientColor1 = intValue;
                                                    } else if (c == 4) {
                                                        themeInfo.previewBackgroundGradientColor2 = intValue;
                                                    } else if (c == 5) {
                                                        themeInfo.previewBackgroundGradientColor3 = intValue;
                                                    }
                                                }
                                                i6 += i7;
                                                i4 += i7;
                                                continue;
                                            }
                                        }
                                        fileInputStream = fileInputStream2;
                                        z = z2;
                                        i = read;
                                        i6 += i7;
                                        i4 += i7;
                                        continue;
                                    } else {
                                        fileInputStream = fileInputStream2;
                                        z = z2;
                                        i = read;
                                        continue;
                                    }
                                    i5++;
                                    z2 = z;
                                    read = i;
                                    fileInputStream2 = fileInputStream;
                                    i2 = 1;
                                } else {
                                    fileInputStream = fileInputStream2;
                                }
                            }
                            if (!z2 && i3 != i4) {
                                try {
                                    fileInputStream.getChannel().position(i4);
                                    i3 = i4;
                                    fileInputStream2 = fileInputStream;
                                    i2 = 1;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                    fileInputStream.close();
                                    throw th;
                                }
                            }
                        } else {
                            fileInputStream = fileInputStream2;
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
            if (themeInfo.pathToWallpaper != null && !themeInfo.badWallpaper && !new File(themeInfo.pathToWallpaper).exists()) {
                if (this.loadingWallpapers.containsKey(themeInfo)) {
                    return false;
                }
                this.loadingWallpapers.put(themeInfo, themeInfo.slug);
                TLRPC$TL_account_getWallPaper tLRPC$TL_account_getWallPaper = new TLRPC$TL_account_getWallPaper();
                TLRPC$TL_inputWallPaperSlug tLRPC$TL_inputWallPaperSlug = new TLRPC$TL_inputWallPaperSlug();
                tLRPC$TL_inputWallPaperSlug.slug = themeInfo.slug;
                tLRPC$TL_account_getWallPaper.wallpaper = tLRPC$TL_inputWallPaperSlug;
                ConnectionsManager.getInstance(themeInfo.account).sendRequest(tLRPC$TL_account_getWallPaper, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ChatThemeBottomSheet.Adapter.this.lambda$parseTheme$1(themeInfo, tLObject, tLRPC$TL_error);
                    }
                });
                return false;
            }
            themeInfo.previewParsed = true;
            return true;
        }

        public void lambda$parseTheme$1(final Theme.ThemeInfo themeInfo, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatThemeBottomSheet.Adapter.this.lambda$parseTheme$0(tLObject, themeInfo);
                }
            });
        }

        public void lambda$parseTheme$0(TLObject tLObject, Theme.ThemeInfo themeInfo) {
            if (tLObject instanceof TLRPC$TL_wallPaper) {
                TLRPC$WallPaper tLRPC$WallPaper = (TLRPC$WallPaper) tLObject;
                String attachFileName = FileLoader.getAttachFileName(tLRPC$WallPaper.document);
                if (this.loadingThemes.containsKey(attachFileName)) {
                    return;
                }
                this.loadingThemes.put(attachFileName, themeInfo);
                FileLoader.getInstance(themeInfo.account).loadFile(tLRPC$WallPaper.document, tLRPC$WallPaper, 1, 1);
                return;
            }
            themeInfo.badWallpaper = true;
        }

        @Override
        public int getItemCount() {
            List<ChatThemeItem> list = this.items;
            if (list == null) {
                return 0;
            }
            return list.size();
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
                notifyItemChanged(i2);
                WeakReference<ThemeSmallPreviewView> weakReference = this.selectedViewRef;
                ThemeSmallPreviewView themeSmallPreviewView = weakReference == null ? null : weakReference.get();
                if (themeSmallPreviewView != null) {
                    themeSmallPreviewView.setSelected(false);
                }
            }
            this.selectedItemPosition = i;
            notifyItemChanged(i);
        }
    }

    public void openGalleryForBackground() {
        Activity parentActivity = this.chatActivity.getParentActivity();
        ChatActivity chatActivity = this.chatActivity;
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(parentActivity, chatActivity, false, false, false, chatActivity.getResourceProvider());
        this.chatAttachAlert = chatAttachAlert;
        chatAttachAlert.setupPhotoPicker(LocaleController.getString("ChooseBackground", R.string.ChooseBackground));
        this.chatAttachAlert.setDelegate(new AnonymousClass10());
        this.chatAttachAlert.setMaxSelectedPhotos(1, false);
        this.chatAttachAlert.init();
        this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        this.chatAttachAlert.show();
        this.chatAttachButton = new FrameLayout(getContext()) {
            Paint paint = new Paint();

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.paint.setColor(ChatThemeBottomSheet.this.getThemedColor("divider"));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.paint);
            }
        };
        AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), true, true, true);
        this.chatAttachButtonText = animatedTextView;
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        this.chatAttachButtonText.setText(LocaleController.getString("SetColorAsBackground", R.string.SetColorAsBackground));
        this.chatAttachButtonText.setGravity(17);
        this.chatAttachButtonText.setTextColor(getThemedColor("featuredStickers_addButton"));
        this.chatAttachButton.addView(this.chatAttachButtonText, LayoutHelper.createFrame(-1, -2, 17));
        this.chatAttachButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(0.0f), getThemedColor("windowBackgroundWhite"), ColorUtils.setAlphaComponent(getThemedColor("featuredStickers_addButton"), 76)));
        this.chatAttachButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatThemeBottomSheet.this.lambda$openGalleryForBackground$10(view);
            }
        });
        this.chatAttachAlert.sizeNotifierFrameLayout.addView(this.chatAttachButton, LayoutHelper.createFrame(-1, -2, 80));
    }

    public class AnonymousClass10 implements ChatAttachAlert.ChatAttachViewDelegate {
        @Override
        public void didSelectBot(TLRPC$User tLRPC$User) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, tLRPC$User);
        }

        @Override
        public void doOnIdle(Runnable runnable) {
            runnable.run();
        }

        @Override
        public boolean needEnterComment() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
        }

        @Override
        public void onCameraOpened() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
        }

        @Override
        public void openAvatarsSearch() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
        }

        AnonymousClass10() {
        }

        @Override
        public void didPressedButton(int i, boolean z, boolean z2, int i2, boolean z3) {
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
                    File directory = FileLoader.getDirectory(4);
                    File file = new File(directory, Utilities.random.nextInt() + ".jpg");
                    android.graphics.Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(str, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                    loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(new WallpapersListActivity.FileWallpaper("", file, file), loadBitmap);
                    themePreviewActivity.setDialogId(ChatThemeBottomSheet.this.chatActivity.getDialogId());
                    themePreviewActivity.setDelegate(new ThemePreviewActivity.WallpaperActivityDelegate() {
                        @Override
                        public final void didSetNewBackground() {
                            ChatThemeBottomSheet.AnonymousClass10.this.lambda$didPressedButton$0();
                        }
                    });
                    ChatThemeBottomSheet.this.showAsSheet(themePreviewActivity);
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        public void lambda$didPressedButton$0() {
            ChatThemeBottomSheet.this.chatAttachAlert.dismissInternal();
            ChatThemeBottomSheet.this.dismiss();
        }

        @Override
        public void onWallpaperSelected(Object obj) {
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(obj, null, true, false);
            themePreviewActivity.setDialogId(ChatThemeBottomSheet.this.chatActivity.getDialogId());
            themePreviewActivity.setDelegate(new ThemePreviewActivity.WallpaperActivityDelegate() {
                @Override
                public final void didSetNewBackground() {
                    ChatThemeBottomSheet.AnonymousClass10.this.lambda$onWallpaperSelected$1();
                }
            });
            ChatThemeBottomSheet.this.showAsSheet(themePreviewActivity);
        }

        public void lambda$onWallpaperSelected$1() {
            ChatThemeBottomSheet.this.chatAttachAlert.dismissInternal();
            ChatThemeBottomSheet.this.dismiss();
        }
    }

    public void lambda$openGalleryForBackground$10(View view) {
        if (this.chatAttachAlert.getCurrentAttachLayout() == this.chatAttachAlert.getPhotoLayout()) {
            this.chatAttachButtonText.setText(LocaleController.getString("ChooseBackgroundFromGallery", R.string.ChooseBackgroundFromGallery));
            this.chatAttachAlert.openColorsLayout();
            return;
        }
        this.chatAttachButtonText.setText(LocaleController.getString("SetColorAsBackground", R.string.SetColorAsBackground));
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        chatAttachAlert.showLayout(chatAttachAlert.getPhotoLayout());
    }

    public void showAsSheet(ThemePreviewActivity themePreviewActivity) {
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        themePreviewActivity.setResourceProvider(this.chatActivity.getResourceProvider());
        themePreviewActivity.setOnSwitchDayNightDelegate(new AnonymousClass12());
        bottomSheetParams.onOpenAnimationFinished = ChatThemeBottomSheet$$ExternalSyntheticLambda11.INSTANCE;
        bottomSheetParams.onDismiss = new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.this.lambda$showAsSheet$12();
            }
        };
        this.overlayFragment = themePreviewActivity;
        this.chatActivity.showAsSheet(themePreviewActivity, bottomSheetParams);
    }

    public class AnonymousClass12 implements ThemePreviewActivity.DayNightSwitchDelegate {
        private Runnable fixRedraw;

        AnonymousClass12() {
        }

        @Override
        public boolean isDark() {
            return ChatThemeBottomSheet.this.forceDark;
        }

        @Override
        public void switchDayNight() {
            ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
            chatThemeBottomSheet.forceDark = !chatThemeBottomSheet.forceDark;
            if (ChatThemeBottomSheet.this.selectedItem != null) {
                ChatThemeBottomSheet.this.isLightDarkChangeAnimation = true;
                ChatThemeBottomSheet.this.chatActivity.forceDisallowRedrawThemeDescriptions = true;
                if (ChatThemeBottomSheet.this.selectedItem.chatTheme.showAsDefaultStub) {
                    ChatThemeBottomSheet.this.themeDelegate.setCurrentTheme(null, ChatThemeBottomSheet.this.currentWallpaper, true, Boolean.valueOf(ChatThemeBottomSheet.this.forceDark));
                } else {
                    ChatThemeBottomSheet.this.themeDelegate.setCurrentTheme(ChatThemeBottomSheet.this.selectedItem.chatTheme, ChatThemeBottomSheet.this.currentWallpaper, true, Boolean.valueOf(ChatThemeBottomSheet.this.forceDark));
                }
                ChatThemeBottomSheet.this.chatActivity.forceDisallowRedrawThemeDescriptions = false;
                AndroidUtilities.cancelRunOnUIThread(this.fixRedraw);
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        ChatThemeBottomSheet.AnonymousClass12.this.lambda$switchDayNight$0();
                    }
                };
                this.fixRedraw = runnable;
                AndroidUtilities.runOnUIThread(runnable, 800L);
            }
        }

        public void lambda$switchDayNight$0() {
            if (ChatThemeBottomSheet.this.selectedItem.chatTheme.showAsDefaultStub) {
                ChatThemeBottomSheet.this.themeDelegate.setCurrentTheme(null, ChatThemeBottomSheet.this.currentWallpaper, false, Boolean.valueOf(ChatThemeBottomSheet.this.forceDark), true);
            } else {
                ChatThemeBottomSheet.this.themeDelegate.setCurrentTheme(ChatThemeBottomSheet.this.selectedItem.chatTheme, ChatThemeBottomSheet.this.currentWallpaper, false, Boolean.valueOf(ChatThemeBottomSheet.this.forceDark), true);
            }
            ChatAttachAlert chatAttachAlert = ChatThemeBottomSheet.this.chatAttachAlert;
            if (chatAttachAlert != null) {
                chatAttachAlert.checkColors();
            }
            if (ChatThemeBottomSheet.this.adapter == null || ChatThemeBottomSheet.this.adapter.items == null) {
                return;
            }
            for (int i = 0; i < ChatThemeBottomSheet.this.adapter.items.size(); i++) {
                ChatThemeBottomSheet.this.adapter.items.get(i).themeIndex = ChatThemeBottomSheet.this.forceDark ? 1 : 0;
            }
            ChatThemeBottomSheet.this.adapter.notifyDataSetChanged();
        }
    }

    public static void lambda$showAsSheet$11() {
        PhotoViewer.getInstance().closePhoto(false, false);
    }

    public void lambda$showAsSheet$12() {
        this.overlayFragment = null;
    }

    public static class ChatThemeItem {
        public float animationProgress;
        public final EmojiThemes chatTheme;
        public Bitmap icon;
        public boolean isSelected;
        public Drawable previewDrawable;
        public int themeIndex;

        public ChatThemeItem(EmojiThemes emojiThemes) {
            this.chatTheme = emojiThemes;
        }
    }
}
