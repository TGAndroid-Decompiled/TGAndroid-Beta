package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
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
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ChannelBoostsController;
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
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$TL_account_getWallPaper;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputWallPaperSlug;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeColors;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DrawerProfileCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
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
    private TL_stories$TL_premium_boostsStatus boostsStatus;
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
    private TLRPC$WallPaper currentWallpaper;
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
    private final TextView titleView;

    public static boolean lambda$setupLightDarkTheme$11(View view, MotionEvent motionEvent) {
        return true;
    }

    public ChatThemeBottomSheet(final ChatActivity chatActivity, ChatActivity.ThemeDelegate themeDelegate) {
        super(chatActivity.getParentActivity(), true, themeDelegate);
        String str;
        this.prevSelectedPosition = -1;
        this.checkingBoostsLevel = false;
        this.checkedBoostsLevel = false;
        this.subTextTranslation = 0.0f;
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
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i = Theme.key_dialogBackgroundGray;
            this.navBarColor = getThemedColor(i);
            AndroidUtilities.setNavigationBarColor(getWindow(), getThemedColor(i), false);
            AndroidUtilities.setLightNavigationBar(getWindow(), ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
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
        textView.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
        textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
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
        int i2 = Theme.key_featuredStickers_addButton;
        int themedColor = getThemedColor(i2);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i3 = R.raw.sun_outline;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i3, BuildConfig.APP_CENTER_HASH + i3, dp2, dp2, false, null);
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
            public int calculateTimeForScrolling(int i4) {
                return super.calculateTimeForScrolling(i4) * 6;
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
            public final void onItemClick(View view, int i4) {
                ChatThemeBottomSheet.this.lambda$new$2(view, i4);
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
        view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), getThemedColor(i2), getThemedColor(Theme.key_featuredStickers_addButtonPressed)));
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
        AnimatedTextView animatedTextView3 = this.applyTextView;
        int i4 = Theme.key_featuredStickers_buttonText;
        animatedTextView3.setTextColor(getThemedColor(i4));
        this.applyTextView.setTextSize(AndroidUtilities.dp(15.0f));
        this.applyTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.rootLayout.addView(this.applyTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        AnimatedTextView animatedTextView4 = new AnimatedTextView(getContext(), true, true, true);
        this.applySubTextView = animatedTextView4;
        animatedTextView4.getDrawable().setEllipsizeByGradient(true);
        AnimatedTextView animatedTextView5 = this.applySubTextView;
        animatedTextView5.adaptWidth = false;
        animatedTextView5.setGravity(17);
        this.applySubTextView.setTextColor(getThemedColor(i4));
        this.applySubTextView.setTextSize(AndroidUtilities.dp(12.0f));
        this.applySubTextView.setAlpha(0.0f);
        this.applySubTextView.setTranslationY(AndroidUtilities.dp(11.0f));
        this.rootLayout.addView(this.applySubTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
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
            this.rootLayout.addView(this.cancelOrResetTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.themeHintTextView = textView4;
            textView4.setEllipsize(TextUtils.TruncateAt.END);
            this.themeHintTextView.setGravity(17);
            this.themeHintTextView.setLines(1);
            this.themeHintTextView.setSingleLine(true);
            if (chatActivity.getCurrentUser() != null) {
                str = UserObject.getFirstName(chatActivity.getCurrentUser());
            } else {
                str = chatActivity.getCurrentChat() != null ? chatActivity.getCurrentChat().title : BuildConfig.APP_CENTER_HASH;
            }
            this.themeHintTextView.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            this.themeHintTextView.setTextSize(1, 15.0f);
            this.rootLayout.addView(this.themeHintTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
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
            dismiss();
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(chatActivity.getDialogId(), true);
            return;
        }
        dismiss();
    }

    public void updateButtonColors() {
        TextView textView = this.themeHintTextView;
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_dialogTextGray));
            this.themeHintTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), 0, ColorUtils.setAlphaComponent(getThemedColor(Theme.key_featuredStickers_addButton), 76)));
        }
        TextView textView2 = this.cancelOrResetTextView;
        if (textView2 != null) {
            int i = Theme.key_text_RedRegular;
            textView2.setTextColor(getThemedColor(i));
            this.cancelOrResetTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), 0, ColorUtils.setAlphaComponent(getThemedColor(i), 76)));
        }
        ImageView imageView = this.backButtonView;
        int i2 = Theme.key_dialogTextBlack;
        imageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i2), 30), 1));
        this.backButtonDrawable.setColor(getThemedColor(i2));
        this.backButtonDrawable.setRotatedColor(getThemedColor(i2));
        this.backButtonView.invalidate();
        RLottieImageView rLottieImageView = this.darkThemeView;
        int i3 = Theme.key_featuredStickers_addButton;
        rLottieImageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i3), 30), 1));
        this.chooseBackgroundTextView.setTextColor(getThemedColor(Theme.key_dialogTextBlue));
        this.chooseBackgroundTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), 0, ColorUtils.setAlphaComponent(getThemedColor(i3), 76)));
    }

    private void previewSelectedTheme() {
        if (isDismissed() || this.isApplyClicked) {
            return;
        }
        this.isLightDarkChangeAnimation = false;
        this.chatActivity.forceDisallowApplyWallpeper = false;
        TLRPC$WallPaper tLRPC$WallPaper = hasChanges() ? null : this.currentWallpaper;
        EmojiThemes emojiThemes = this.selectedItem.chatTheme;
        if (emojiThemes.showAsDefaultStub) {
            this.themeDelegate.setCurrentTheme(null, tLRPC$WallPaper, true, Boolean.valueOf(this.forceDark));
        } else {
            this.themeDelegate.setCurrentTheme(emojiThemes, tLRPC$WallPaper, true, Boolean.valueOf(this.forceDark));
        }
    }

    private void updateState(boolean z) {
        TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus;
        boolean z2;
        EmojiThemes emojiThemes;
        TLRPC$Chat currentChat = this.chatActivity.getCurrentChat();
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
        if (hasChanges()) {
            this.backButtonDrawable.setRotation(0.0f, z);
            this.applyButton.setEnabled(true);
            ChatThemeItem chatThemeItem = this.selectedItem;
            if (chatThemeItem != null && (emojiThemes = chatThemeItem.chatTheme) != null && emojiThemes.showAsDefaultStub && emojiThemes.wallpaper == null) {
                this.applyTextView.setText(LocaleController.getString("ChatResetTheme", R.string.ChatResetTheme));
            } else {
                this.applyTextView.setText(LocaleController.getString("ChatApplyTheme", R.string.ChatApplyTheme));
                if (currentChat != null && (tL_stories$TL_premium_boostsStatus = this.boostsStatus) != null && tL_stories$TL_premium_boostsStatus.level < this.chatActivity.getMessagesController().channelWallpaperLevelMin) {
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
                    updateApplySubTextTranslation(z2, !z && this.applyTextView.getAlpha() > 0.8f);
                    AndroidUtilities.updateViewVisibilityAnimated(this.chooseBackgroundTextView, false, 0.9f, false, z);
                    AndroidUtilities.updateViewVisibilityAnimated(this.cancelOrResetTextView, false, 0.9f, false, z);
                    AndroidUtilities.updateViewVisibilityAnimated(this.applyButton, true, 1.0f, false, z);
                    AndroidUtilities.updateViewVisibilityAnimated(this.applyTextView, true, 0.9f, false, z);
                    AndroidUtilities.updateViewVisibilityAnimated(this.applySubTextView, z2, 0.9f, false, 0.7f, z);
                    AndroidUtilities.updateViewVisibilityAnimated(this.themeHintTextView, true, 0.9f, false, z);
                    return;
                }
            }
            z2 = false;
            updateApplySubTextTranslation(z2, !z && this.applyTextView.getAlpha() > 0.8f);
            AndroidUtilities.updateViewVisibilityAnimated(this.chooseBackgroundTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cancelOrResetTextView, false, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyButton, true, 1.0f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applyTextView, true, 0.9f, false, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.applySubTextView, z2, 0.9f, false, 0.7f, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.themeHintTextView, true, 0.9f, false, z);
            return;
        }
        this.backButtonDrawable.setRotation(1.0f, z);
        this.applyButton.setEnabled(false);
        AndroidUtilities.updateViewVisibilityAnimated(this.chooseBackgroundTextView, true, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.cancelOrResetTextView, true, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.applyButton, false, 1.0f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.applyTextView, false, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.applySubTextView, false, 0.9f, false, z);
        AndroidUtilities.updateViewVisibilityAnimated(this.themeHintTextView, false, 0.9f, false, z);
    }

    private void checkBoostsLevel() {
        ChatActivity chatActivity = this.chatActivity;
        if (chatActivity == null || this.checkingBoostsLevel || this.checkedBoostsLevel || this.boostsStatus != null) {
            return;
        }
        this.checkingBoostsLevel = true;
        chatActivity.getMessagesController().getBoostsController().getBoostsStats(this.chatActivity.getDialogId(), new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChatThemeBottomSheet.this.lambda$checkBoostsLevel$5((TL_stories$TL_premium_boostsStatus) obj);
            }
        });
    }

    public void lambda$checkBoostsLevel$5(TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        this.boostsStatus = tL_stories$TL_premium_boostsStatus;
        this.checkedBoostsLevel = true;
        updateState(true);
        this.checkingBoostsLevel = false;
    }

    private void updateApplySubTextTranslation(final boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.subTextTranslationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.subTextTranslationAnimator = null;
        }
        if (z2) {
            float[] fArr = new float[2];
            fArr[0] = this.subTextTranslation;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.subTextTranslationAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChatThemeBottomSheet.this.lambda$updateApplySubTextTranslation$6(valueAnimator2);
                }
            });
            this.subTextTranslationAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatThemeBottomSheet.this.subTextTranslation = z ? 1.0f : 0.0f;
                    ChatThemeBottomSheet.this.applyTextView.setTranslationY((-AndroidUtilities.dp(7.0f)) * ChatThemeBottomSheet.this.subTextTranslation);
                }
            });
            this.subTextTranslationAnimator.start();
            return;
        }
        this.subTextTranslation = z ? 1.0f : 0.0f;
        this.applyTextView.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.subTextTranslation);
    }

    public void lambda$updateApplySubTextTranslation$6(ValueAnimator valueAnimator) {
        this.subTextTranslation = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.applyTextView.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.subTextTranslation);
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
        List<EmojiThemes> cachedThemes = this.themeDelegate.getCachedThemes();
        if (cachedThemes == null || cachedThemes.isEmpty()) {
            chatThemeController.requestAllChatThemes(new AnonymousClass6(), true);
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
        if (this.forceDark) {
            this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.this.lambda$onCreate$7();
            }
        }, 1500L);
        this.container.addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    public class AnonymousClass6 implements ResultCallback<List<EmojiThemes>> {
        AnonymousClass6() {
        }

        @Override
        public void onComplete(final List<EmojiThemes> list) {
            if (list != null && !list.isEmpty()) {
                ChatThemeBottomSheet.this.themeDelegate.setCachedThemes(list);
            }
            NotificationCenter.getInstance(((BottomSheet) ChatThemeBottomSheet.this).currentAccount).doOnIdle(new Runnable() {
                @Override
                public final void run() {
                    ChatThemeBottomSheet.AnonymousClass6.this.lambda$onComplete$0(list);
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

    public void lambda$onCreate$7() {
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
        Theme.ThemeInfo theme;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.chatActivity.forceDisallowApplyWallpeper = false;
        if (!this.isApplyClicked) {
            TLRPC$WallPaper currentWallpaper = this.themeDelegate.getCurrentWallpaper();
            if (currentWallpaper == null) {
                currentWallpaper = this.currentWallpaper;
            }
            this.themeDelegate.setCurrentTheme(this.originalTheme, currentWallpaper, true, Boolean.valueOf(this.originalIsDark));
        }
        if (this.forceDark != this.originalIsDark) {
            if (Theme.getActiveTheme().isDark() == this.originalIsDark) {
                theme = Theme.getActiveTheme();
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (Theme.getTheme(string) != null && !Theme.getTheme(string).isDark()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (Theme.getTheme(string2) != null && Theme.getTheme(string2).isDark()) {
                    str2 = string2;
                }
                theme = this.originalIsDark ? Theme.getTheme(str2) : Theme.getTheme(str);
            }
            Theme.applyTheme(theme, false, this.originalIsDark);
        }
    }

    public void close() {
        if (hasChanges()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
            builder.setTitle(LocaleController.getString("ChatThemeSaveDialogTitle", R.string.ChatThemeSaveDialogTitle));
            builder.setSubtitle(LocaleController.getString("ChatThemeSaveDialogText", R.string.ChatThemeSaveDialogText));
            builder.setPositiveButton(LocaleController.getString("ChatThemeSaveDialogApply", R.string.ChatThemeSaveDialogApply), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatThemeBottomSheet.this.lambda$close$8(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("ChatThemeSaveDialogDiscard", R.string.ChatThemeSaveDialogDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatThemeBottomSheet.this.lambda$close$9(dialogInterface, i);
                }
            });
            builder.show();
            return;
        }
        dismiss();
    }

    public void lambda$close$8(DialogInterface dialogInterface, int i) {
        applySelectedTheme();
    }

    public void lambda$close$9(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
                @Override
                public final void run() {
                    ChatThemeBottomSheet.this.lambda$didReceivedNotification$10();
                }
            });
        }
    }

    public void lambda$didReceivedNotification$10() {
        this.adapter.notifyDataSetChanged();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
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
                int i = Theme.key_featuredStickers_addButton;
                rLottieDrawable.setColorFilter(new PorterDuffColorFilter(chatThemeBottomSheet.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
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
                    ChatThemeBottomSheet.this.chatAttachButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(0.0f), ChatThemeBottomSheet.this.getThemedColor(Theme.key_windowBackgroundWhite), ColorUtils.setAlphaComponent(ChatThemeBottomSheet.this.getThemedColor(i), 76)));
                }
                if (ChatThemeBottomSheet.this.chatAttachButtonText != null) {
                    ChatThemeBottomSheet.this.chatAttachButtonText.setTextColor(ChatThemeBottomSheet.this.getThemedColor(i));
                }
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
        arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, new Drawable[]{this.shadowDrawable}, themeDescriptionDelegate, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(this.titleView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_dialogTextBlack));
        arrayList.add(new ThemeDescription(this.recyclerView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ThemeSmallPreviewView.class}, null, null, null, Theme.key_dialogBackgroundGray));
        arrayList.add(new ThemeDescription(this.applyButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.applyButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_featuredStickers_addButtonPressed));
        Iterator<ThemeDescription> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().resourcesProvider = this.themeDelegate;
        }
        return arrayList;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setupLightDarkTheme(final boolean z) {
        if (isDismissed()) {
            return;
        }
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
        View view = new View(getContext()) {
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
        this.changeDayNightView = view;
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean lambda$setupLightDarkTheme$11;
                lambda$setupLightDarkTheme$11 = ChatThemeBottomSheet.lambda$setupLightDarkTheme$11(view2, motionEvent);
                return lambda$setupLightDarkTheme$11;
            }
        });
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
                ChatThemeBottomSheet.this.lambda$setupLightDarkTheme$12(z);
            }
        });
    }

    public void lambda$setupLightDarkTheme$12(boolean z) {
        Adapter adapter = this.adapter;
        if (adapter == null || adapter.items == null || isDismissed()) {
            return;
        }
        setForceDark(z, true);
        if (this.selectedItem != null) {
            this.isLightDarkChangeAnimation = true;
            TLRPC$WallPaper currentWallpaper = hasChanges() ? null : this.themeDelegate.getCurrentWallpaper();
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
        if (this.currentTheme != null) {
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
        if (this.checkingBoostsLevel) {
            return;
        }
        TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = this.boostsStatus;
        if (tL_stories$TL_premium_boostsStatus != null && tL_stories$TL_premium_boostsStatus.level < this.chatActivity.getMessagesController().channelWallpaperLevelMin) {
            this.chatActivity.getMessagesController().getBoostsController().userCanBoostChannel(this.chatActivity.getDialogId(), this.boostsStatus, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ChatThemeBottomSheet.this.lambda$applySelectedTheme$14((ChannelBoostsController.CanApplyBoost) obj);
                }
            });
            return;
        }
        ChatThemeItem chatThemeItem = this.selectedItem;
        EmojiThemes emojiThemes = chatThemeItem.chatTheme;
        Bulletin bulletin = null;
        if (chatThemeItem != null && emojiThemes != this.currentTheme) {
            String emoticon = !emojiThemes.showAsDefaultStub ? emojiThemes.getEmoticon() : null;
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(this.chatActivity.getDialogId(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(this.chatActivity.getDialogId(), emoticon, true);
            TLRPC$WallPaper currentWallpaper = hasChanges() ? null : this.themeDelegate.getCurrentWallpaper();
            if (!emojiThemes.showAsDefaultStub) {
                this.themeDelegate.setCurrentTheme(emojiThemes, currentWallpaper, true, Boolean.valueOf(this.originalIsDark));
            } else {
                this.themeDelegate.setCurrentTheme(null, currentWallpaper, true, Boolean.valueOf(this.originalIsDark));
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

    public void lambda$applySelectedTheme$14(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(this.chatActivity, getContext(), 22, this.currentAccount, this.resourcesProvider);
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(this.boostsStatus, true);
        limitReachedBottomSheet.setDialogId(this.chatActivity.getDialogId());
        limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.this.lambda$applySelectedTheme$13();
            }
        });
        limitReachedBottomSheet.show();
    }

    public void lambda$applySelectedTheme$13() {
        TLRPC$Chat chat = this.chatActivity.getMessagesController().getChat(Long.valueOf(-this.chatActivity.getDialogId()));
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -this.chatActivity.getDialogId());
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", true);
        TLRPC$ChatFull chatFull = this.chatActivity.getMessagesController().getChatFull(-this.chatActivity.getDialogId());
        if (chatFull == null || !chatFull.can_view_stats) {
            bundle.putBoolean("only_boosts", true);
        }
        showAsSheet(new StatisticActivity(bundle));
    }

    public boolean hasChanges() {
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
            themeSmallPreviewView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray));
            themeSmallPreviewView.setItem(chatThemeItem, z);
            themeSmallPreviewView.setSelected(i == this.selectedItemPosition, z);
            if (i == this.selectedItemPosition) {
                this.selectedViewRef = new WeakReference<>(themeSmallPreviewView);
            }
        }

        private boolean parseTheme(final Theme.ThemeInfo themeInfo) {
            int stringKeyToInt;
            int intValue;
            String[] split;
            if (themeInfo == null || themeInfo.pathToFile == null) {
                return false;
            }
            boolean z = true;
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(themeInfo.pathToFile));
                int i = 0;
                boolean z2 = false;
                while (true) {
                    int read = fileInputStream.read(ThemesHorizontalListCell.bytes);
                    if (read == -1) {
                        break;
                    }
                    int i2 = i;
                    int i3 = 0;
                    int i4 = 0;
                    ?? r4 = z;
                    while (true) {
                        if (i3 >= read) {
                            break;
                        }
                        byte[] bArr = ThemesHorizontalListCell.bytes;
                        if (bArr[i3] == 10) {
                            int i5 = (i3 - i4) + r4;
                            String str = new String(bArr, i4, i5 - 1, "UTF-8");
                            if (str.startsWith("WLS=")) {
                                String substring = str.substring(4);
                                Uri parse = Uri.parse(substring);
                                themeInfo.slug = parse.getQueryParameter("slug");
                                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                themeInfo.pathToWallpaper = new File(filesDirFixed, Utilities.MD5(substring) + ".wp").getAbsolutePath();
                                String queryParameter = parse.getQueryParameter("mode");
                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= split.length) {
                                            break;
                                        } else if ("blur".equals(split[i6])) {
                                            themeInfo.isBlured = r4;
                                            break;
                                        } else {
                                            i6++;
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
                            } else if (str.startsWith("WPS")) {
                                themeInfo.previewWallpaperOffset = i5 + i2;
                                z2 = true;
                                break;
                            } else {
                                int indexOf = str.indexOf(61);
                                if (indexOf != -1 && ((stringKeyToInt = ThemeColors.stringKeyToInt(str.substring(0, indexOf))) == Theme.key_chat_inBubble || stringKeyToInt == Theme.key_chat_outBubble || stringKeyToInt == Theme.key_chat_wallpaper || stringKeyToInt == Theme.key_chat_wallpaper_gradient_to1 || stringKeyToInt == Theme.key_chat_wallpaper_gradient_to2 || stringKeyToInt == Theme.key_chat_wallpaper_gradient_to3)) {
                                    String substring2 = str.substring(indexOf + 1);
                                    if (substring2.length() > 0 && substring2.charAt(0) == '#') {
                                        try {
                                            intValue = Color.parseColor(substring2);
                                        } catch (Exception unused3) {
                                            intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                        }
                                    } else {
                                        intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                    }
                                    if (stringKeyToInt == Theme.key_chat_inBubble) {
                                        themeInfo.setPreviewInColor(intValue);
                                    } else if (stringKeyToInt == Theme.key_chat_outBubble) {
                                        themeInfo.setPreviewOutColor(intValue);
                                    } else if (stringKeyToInt == Theme.key_chat_wallpaper) {
                                        themeInfo.setPreviewBackgroundColor(intValue);
                                    } else if (stringKeyToInt == Theme.key_chat_wallpaper_gradient_to1) {
                                        themeInfo.previewBackgroundGradientColor1 = intValue;
                                    } else if (stringKeyToInt == Theme.key_chat_wallpaper_gradient_to2) {
                                        themeInfo.previewBackgroundGradientColor2 = intValue;
                                    } else if (stringKeyToInt == Theme.key_chat_wallpaper_gradient_to3) {
                                        themeInfo.previewBackgroundGradientColor3 = intValue;
                                    }
                                }
                            }
                            i4 += i5;
                            i2 += i5;
                        }
                        i3++;
                        r4 = 1;
                    }
                    if (z2 || i == i2) {
                        break;
                    }
                    fileInputStream.getChannel().position(i2);
                    i = i2;
                    z = true;
                }
                fileInputStream.close();
            } catch (Throwable th) {
                FileLog.e(th);
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

    public static void openGalleryForBackground(Activity activity, BaseFragment baseFragment, long j, final Theme.ResourcesProvider resourcesProvider, Utilities.Callback<TLRPC$WallPaper> callback, ThemePreviewActivity.DayNightSwitchDelegate dayNightSwitchDelegate, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(activity, baseFragment, false, false, false, resourcesProvider);
        chatAttachAlert.drawNavigationBar = true;
        chatAttachAlert.setupPhotoPicker(LocaleController.getString("ChooseBackground", R.string.ChooseBackground));
        chatAttachAlert.setDelegate(new AnonymousClass11(chatAttachAlert, tL_stories$TL_premium_boostsStatus, resourcesProvider, dayNightSwitchDelegate, j, callback, baseFragment));
        chatAttachAlert.setMaxSelectedPhotos(1, false);
        chatAttachAlert.init();
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.show();
        FrameLayout frameLayout = new FrameLayout(activity) {
            Paint paint = new Paint();

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.paint.setColor(Theme.getColor(Theme.key_divider, resourcesProvider));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.paint);
            }
        };
        final AnimatedTextView animatedTextView = new AnimatedTextView(activity, true, true, true);
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView.setText(LocaleController.getString(R.string.SetColorAsBackground));
        animatedTextView.setGravity(17);
        int i = Theme.key_featuredStickers_addButton;
        animatedTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        frameLayout.addView(animatedTextView, LayoutHelper.createFrame(-1, -2, 17));
        frameLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(0.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), ColorUtils.setAlphaComponent(Theme.getColor(i, resourcesProvider), 76)));
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatThemeBottomSheet.lambda$openGalleryForBackground$15(ChatAttachAlert.this, animatedTextView, view);
            }
        });
        chatAttachAlert.sizeNotifierFrameLayout.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 80));
    }

    class AnonymousClass11 implements ChatAttachAlert.ChatAttachViewDelegate {
        final TL_stories$TL_premium_boostsStatus val$cachedBoostsStatus;
        final ChatAttachAlert val$chatAttachAlert;
        final long val$dialogId;
        final BaseFragment val$fragment;
        final Utilities.Callback val$onSet;
        final Theme.ResourcesProvider val$resourcesProvider;
        final ThemePreviewActivity.DayNightSwitchDelegate val$toggleTheme;

        @Override
        public void didSelectBot(TLRPC$User tLRPC$User) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, tLRPC$User);
        }

        @Override
        public void doOnIdle(Runnable runnable) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$doOnIdle(this, runnable);
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

        @Override
        public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i);
        }

        AnonymousClass11(ChatAttachAlert chatAttachAlert, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus, Theme.ResourcesProvider resourcesProvider, ThemePreviewActivity.DayNightSwitchDelegate dayNightSwitchDelegate, long j, Utilities.Callback callback, BaseFragment baseFragment) {
            this.val$chatAttachAlert = chatAttachAlert;
            this.val$cachedBoostsStatus = tL_stories$TL_premium_boostsStatus;
            this.val$resourcesProvider = resourcesProvider;
            this.val$toggleTheme = dayNightSwitchDelegate;
            this.val$dialogId = j;
            this.val$onSet = callback;
            this.val$fragment = baseFragment;
        }

        @Override
        public boolean selectItemOnClicking() {
            System.currentTimeMillis();
            return true;
        }

        @Override
        public void didPressedButton(int i, boolean z, boolean z2, int i2, boolean z3) {
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
                    File directory = FileLoader.getDirectory(4);
                    File file = new File(directory, Utilities.random.nextInt() + ".jpg");
                    android.graphics.Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(str, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                    loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(this, new WallpapersListActivity.FileWallpaper(BuildConfig.APP_CENTER_HASH, file, file), loadBitmap) {
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
                    final ChatAttachAlert chatAttachAlert = this.val$chatAttachAlert;
                    final Utilities.Callback callback = this.val$onSet;
                    themePreviewActivity.setDelegate(new ThemePreviewActivity.WallpaperActivityDelegate() {
                        @Override
                        public final void didSetNewBackground(TLRPC$WallPaper tLRPC$WallPaper) {
                            ChatThemeBottomSheet.AnonymousClass11.lambda$didPressedButton$0(ChatAttachAlert.this, callback, tLRPC$WallPaper);
                        }
                    });
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    bottomSheetParams.allowNestedScroll = false;
                    bottomSheetParams.occupyNavigationBar = true;
                    this.val$fragment.showAsSheet(themePreviewActivity, bottomSheetParams);
                    this.val$chatAttachAlert.dismiss();
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        public static void lambda$didPressedButton$0(ChatAttachAlert chatAttachAlert, Utilities.Callback callback, TLRPC$WallPaper tLRPC$WallPaper) {
            chatAttachAlert.dismissInternal();
            if (callback != null) {
                callback.run(tLRPC$WallPaper);
            }
        }

        @Override
        public void onWallpaperSelected(Object obj) {
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(this, obj, null, true, false) {
                @Override
                public boolean insideBottomSheet() {
                    return true;
                }
            };
            themePreviewActivity.boostsStatus = this.val$cachedBoostsStatus;
            themePreviewActivity.setResourceProvider(this.val$resourcesProvider);
            themePreviewActivity.setOnSwitchDayNightDelegate(this.val$toggleTheme);
            themePreviewActivity.setDialogId(this.val$dialogId);
            final ChatAttachAlert chatAttachAlert = this.val$chatAttachAlert;
            final Utilities.Callback callback = this.val$onSet;
            themePreviewActivity.setDelegate(new ThemePreviewActivity.WallpaperActivityDelegate() {
                @Override
                public final void didSetNewBackground(TLRPC$WallPaper tLRPC$WallPaper) {
                    ChatThemeBottomSheet.AnonymousClass11.lambda$onWallpaperSelected$1(ChatAttachAlert.this, callback, tLRPC$WallPaper);
                }
            });
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            bottomSheetParams.occupyNavigationBar = true;
            this.val$fragment.showAsSheet(themePreviewActivity, bottomSheetParams);
        }

        public static void lambda$onWallpaperSelected$1(ChatAttachAlert chatAttachAlert, Utilities.Callback callback, TLRPC$WallPaper tLRPC$WallPaper) {
            chatAttachAlert.dismissInternal();
            if (callback != null) {
                callback.run(tLRPC$WallPaper);
            }
        }
    }

    public static void lambda$openGalleryForBackground$15(ChatAttachAlert chatAttachAlert, AnimatedTextView animatedTextView, View view) {
        if (chatAttachAlert.getCurrentAttachLayout() == chatAttachAlert.getPhotoLayout()) {
            animatedTextView.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
            chatAttachAlert.openColorsLayout();
            return;
        }
        animatedTextView.setText(LocaleController.getString(R.string.SetColorAsBackground));
        chatAttachAlert.showLayout(chatAttachAlert.getPhotoLayout());
    }

    public void openGalleryForBackground() {
        Activity parentActivity = this.chatActivity.getParentActivity();
        ChatActivity chatActivity = this.chatActivity;
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(parentActivity, chatActivity, false, false, false, chatActivity.getResourceProvider());
        this.chatAttachAlert = chatAttachAlert;
        chatAttachAlert.drawNavigationBar = true;
        chatAttachAlert.setupPhotoPicker(LocaleController.getString("ChooseBackground", R.string.ChooseBackground));
        this.chatAttachAlert.setDelegate(new AnonymousClass13());
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
                this.paint.setColor(ChatThemeBottomSheet.this.getThemedColor(Theme.key_divider));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.paint);
            }
        };
        AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), true, true, true);
        this.chatAttachButtonText = animatedTextView;
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        this.chatAttachButtonText.setText(LocaleController.getString("SetColorAsBackground", R.string.SetColorAsBackground));
        this.chatAttachButtonText.setGravity(17);
        AnimatedTextView animatedTextView2 = this.chatAttachButtonText;
        int i = Theme.key_featuredStickers_addButton;
        animatedTextView2.setTextColor(getThemedColor(i));
        this.chatAttachButton.addView(this.chatAttachButtonText, LayoutHelper.createFrame(-1, -2, 17));
        this.chatAttachButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(0.0f), getThemedColor(Theme.key_windowBackgroundWhite), ColorUtils.setAlphaComponent(getThemedColor(i), 76)));
        this.chatAttachButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatThemeBottomSheet.this.lambda$openGalleryForBackground$16(view);
            }
        });
        this.chatAttachAlert.sizeNotifierFrameLayout.addView(this.chatAttachButton, LayoutHelper.createFrame(-1, -2, 80));
    }

    public class AnonymousClass13 implements ChatAttachAlert.ChatAttachViewDelegate {
        @Override
        public void didSelectBot(TLRPC$User tLRPC$User) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, tLRPC$User);
        }

        @Override
        public void doOnIdle(Runnable runnable) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$doOnIdle(this, runnable);
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

        @Override
        public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i);
        }

        AnonymousClass13() {
        }

        @Override
        public boolean selectItemOnClicking() {
            System.currentTimeMillis();
            return true;
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
                    ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(this, new WallpapersListActivity.FileWallpaper(BuildConfig.APP_CENTER_HASH, file, file), loadBitmap) {
                        @Override
                        public boolean insideBottomSheet() {
                            return true;
                        }
                    };
                    themePreviewActivity.boostsStatus = ChatThemeBottomSheet.this.boostsStatus;
                    themePreviewActivity.setInitialModes(false, false, 0.2f);
                    themePreviewActivity.setDialogId(ChatThemeBottomSheet.this.chatActivity.getDialogId());
                    themePreviewActivity.setDelegate(new ThemePreviewActivity.WallpaperActivityDelegate() {
                        @Override
                        public final void didSetNewBackground(TLRPC$WallPaper tLRPC$WallPaper) {
                            ChatThemeBottomSheet.AnonymousClass13.this.lambda$didPressedButton$0(tLRPC$WallPaper);
                        }
                    });
                    ChatThemeBottomSheet.this.showAsSheet(themePreviewActivity);
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        public void lambda$didPressedButton$0(TLRPC$WallPaper tLRPC$WallPaper) {
            ChatThemeBottomSheet.this.chatAttachAlert.dismissInternal();
            ChatThemeBottomSheet.this.dismiss();
        }

        @Override
        public void onWallpaperSelected(Object obj) {
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(this, obj, null, true, false) {
                @Override
                public boolean insideBottomSheet() {
                    return true;
                }
            };
            themePreviewActivity.boostsStatus = ChatThemeBottomSheet.this.boostsStatus;
            themePreviewActivity.setDialogId(ChatThemeBottomSheet.this.chatActivity.getDialogId());
            themePreviewActivity.setDelegate(new ThemePreviewActivity.WallpaperActivityDelegate() {
                @Override
                public final void didSetNewBackground(TLRPC$WallPaper tLRPC$WallPaper) {
                    ChatThemeBottomSheet.AnonymousClass13.this.lambda$onWallpaperSelected$1(tLRPC$WallPaper);
                }
            });
            ChatThemeBottomSheet.this.showAsSheet(themePreviewActivity);
        }

        public void lambda$onWallpaperSelected$1(TLRPC$WallPaper tLRPC$WallPaper) {
            ChatThemeBottomSheet.this.chatAttachAlert.dismissInternal();
            ChatThemeBottomSheet.this.dismiss();
        }
    }

    public void lambda$openGalleryForBackground$16(View view) {
        if (this.chatAttachAlert.getCurrentAttachLayout() == this.chatAttachAlert.getPhotoLayout()) {
            this.chatAttachButtonText.setText(LocaleController.getString("ChooseBackgroundFromGallery", R.string.ChooseBackgroundFromGallery));
            this.chatAttachAlert.openColorsLayout();
            this.chatAttachAlert.colorsLayout.updateColors(this.forceDark);
            return;
        }
        this.chatAttachButtonText.setText(LocaleController.getString("SetColorAsBackground", R.string.SetColorAsBackground));
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        chatAttachAlert.showLayout(chatAttachAlert.getPhotoLayout());
    }

    public void lambda$showAsSheet$21() {
        if (isDismissed() || this.isApplyClicked) {
            return;
        }
        Theme.disallowChangeServiceMessageColor = false;
        TLRPC$WallPaper currentWallpaper = hasChanges() ? null : this.themeDelegate.getCurrentWallpaper();
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

    private void showAsSheet(BaseFragment baseFragment) {
        if (baseFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        baseFragment.setResourceProvider(this.chatActivity.getResourceProvider());
        bottomSheetParams.onOpenAnimationFinished = new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.lambda$showAsSheet$17();
            }
        };
        bottomSheetParams.onPreFinished = new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.this.lambda$showAsSheet$18();
            }
        };
        bottomSheetParams.onDismiss = new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.this.lambda$showAsSheet$19();
            }
        };
        bottomSheetParams.occupyNavigationBar = true;
        ChatActivity chatActivity = this.chatActivity;
        this.overlayFragment = baseFragment;
        chatActivity.showAsSheet(baseFragment, bottomSheetParams);
    }

    public static void lambda$showAsSheet$17() {
        PhotoViewer.getInstance().closePhoto(false, false);
    }

    public void lambda$showAsSheet$19() {
        this.overlayFragment = null;
    }

    public void showAsSheet(ThemePreviewActivity themePreviewActivity) {
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        themePreviewActivity.setResourceProvider(this.chatActivity.getResourceProvider());
        themePreviewActivity.setOnSwitchDayNightDelegate(new ThemePreviewActivity.DayNightSwitchDelegate() {
            @Override
            public boolean supportsAnimation() {
                return true;
            }

            @Override
            public boolean isDark() {
                return ChatThemeBottomSheet.this.forceDark;
            }

            @Override
            public void switchDayNight(boolean z) {
                ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
                chatThemeBottomSheet.forceDark = !chatThemeBottomSheet.forceDark;
                if (ChatThemeBottomSheet.this.selectedItem != null) {
                    ChatThemeBottomSheet.this.isLightDarkChangeAnimation = true;
                    ChatThemeBottomSheet.this.chatActivity.forceDisallowRedrawThemeDescriptions = true;
                    TLRPC$WallPaper currentWallpaper = ChatThemeBottomSheet.this.hasChanges() ? null : ChatThemeBottomSheet.this.themeDelegate.getCurrentWallpaper();
                    if (ChatThemeBottomSheet.this.selectedItem.chatTheme.showAsDefaultStub) {
                        ChatThemeBottomSheet.this.themeDelegate.setCurrentTheme(null, currentWallpaper, z, Boolean.valueOf(ChatThemeBottomSheet.this.forceDark));
                    } else {
                        ChatThemeBottomSheet.this.themeDelegate.setCurrentTheme(ChatThemeBottomSheet.this.selectedItem.chatTheme, currentWallpaper, z, Boolean.valueOf(ChatThemeBottomSheet.this.forceDark));
                    }
                    ChatThemeBottomSheet.this.chatActivity.forceDisallowRedrawThemeDescriptions = false;
                }
            }
        });
        bottomSheetParams.onOpenAnimationFinished = new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.lambda$showAsSheet$20();
            }
        };
        bottomSheetParams.onPreFinished = new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.this.lambda$showAsSheet$21();
            }
        };
        bottomSheetParams.onDismiss = new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.this.lambda$showAsSheet$22();
            }
        };
        bottomSheetParams.occupyNavigationBar = true;
        this.overlayFragment = themePreviewActivity;
        this.chatActivity.showAsSheet(themePreviewActivity, bottomSheetParams);
    }

    public static void lambda$showAsSheet$20() {
        PhotoViewer.getInstance().closePhoto(false, false);
    }

    public void lambda$showAsSheet$22() {
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

        public String getEmoticon() {
            EmojiThemes emojiThemes = this.chatTheme;
            if (emojiThemes == null || emojiThemes.showAsDefaultStub) {
                return null;
            }
            return emojiThemes.getEmoticon();
        }
    }
}
