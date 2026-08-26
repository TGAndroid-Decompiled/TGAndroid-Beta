package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.ArrayMap;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.BottomSheetTabDialog;
import org.telegram.ui.ActionBar.EdgeToEdgeSupportMode;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.Adapters.PaddedListAdapter;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda10;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.SettingsSearchCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.ChatAttachRestrictedLayout;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.CreateGroupCallBottomSheet;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Components.PhotoCropView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTabStrip;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SlideView;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.Components.StickerTabView;
import org.telegram.ui.Components.StorageUsageView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.Components.TrendingStickersAlert;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;
import org.telegram.ui.Stars.SuperRipple;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.recorder.CaptionStory;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.GallerySheet;
import org.telegram.ui.Stories.recorder.GallerySheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.iv.RichEditor;

public class QrActivity extends BaseFragment {
    public static List cachedThemes;
    public static boolean firstOpen;
    public static final ArrayMap qrColorsMap;
    public BackupImageView avatarImageView;
    public AnonymousClass2 backgroundView;
    public long chatId;
    public ImageView closeImageView;
    public MotionBackgroundDrawable currMotionDrawable;
    public EmojiThemes currentTheme;
    public final ArrayMap emojiThemeDarkIcons;
    public Bitmap emojiThemeIcon;
    public final EmojiThemes homeTheme;
    public Insets insets;
    public boolean isCurrentThemeDark;
    public boolean isFragmentViewPortrait;
    public RLottieImageView logoImageView;
    public Bitmap logoOptimal;
    public final Rect logoRect;
    public ValueAnimator patternAlphaAnimator;
    public ValueAnimator patternIntensityAnimator;
    public MotionBackgroundDrawable prevMotionDrawable;
    public int[] prevQrColors;
    public int prevSystemUiVisibility;
    public QrView qrView;
    public final PhotoViewer.AnonymousClass14 resourcesProvider;
    public int selectedPosition;
    public MotionBackgroundDrawable tempMotionDrawable;
    public IntroActivity.AnonymousClass1 themeLayout;
    public ThemeListViewController themesViewController;
    public long userId;

    public final class AnonymousClass1 extends FrameLayout {
        public final int $r8$classId;
        public boolean ignoreLayout;
        public final BaseFragment this$0;

        public AnonymousClass1(int i, Context context, BaseFragment baseFragment) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = baseFragment;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            int translationY;
            switch (this.$r8$classId) {
                case 2:
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.this$0;
                    if (view == themePreviewActivity.actionBar2 && ((BaseFragment) themePreviewActivity).parentLayout != null) {
                        INavigationLayout iNavigationLayout = ((BaseFragment) themePreviewActivity).parentLayout;
                        if (themePreviewActivity.actionBar2.getVisibility() == 0) {
                            translationY = (int) (themePreviewActivity.actionBar2.getTranslationY() + themePreviewActivity.actionBar2.getMeasuredHeight());
                        } else {
                            translationY = 0;
                        }
                        iNavigationLayout.getClass();
                        ((ActionBarLayout) iNavigationLayout).drawHeaderShadow(canvas, 255, translationY);
                    }
                    return zDrawChild;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredHeight;
            switch (this.$r8$classId) {
                case 0:
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    boolean z2 = measuredWidth < measuredHeight2;
                    QrActivity qrActivity = (QrActivity) this.this$0;
                    if (qrActivity.themeLayout.getVisibility() == 0) {
                        if (z2) {
                            AndroidUtilities.rectTmp2.set(0, 0, measuredWidth, AndroidUtilities.dp(25.0f) + (measuredHeight2 - qrActivity.themeLayout.getMeasuredHeight()));
                        } else {
                            AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth - qrActivity.themeLayout.getWidth()), measuredHeight2);
                        }
                        qrActivity.backgroundView.setClipBounds(AndroidUtilities.rectTmp2);
                    } else {
                        qrActivity.backgroundView.setClipBounds(null);
                    }
                    qrActivity.backgroundView.layout(0, 0, measuredWidth, measuredHeight2);
                    int measuredHeight3 = qrActivity.themeLayout.getVisibility() == 0 ? qrActivity.themeLayout.getMeasuredHeight() : 0;
                    int measuredWidth2 = z2 ? (measuredWidth - qrActivity.qrView.getMeasuredWidth()) / 2 : qrActivity.insets.left + ((((measuredWidth - qrActivity.themeLayout.getMeasuredWidth()) - qrActivity.insets.left) - qrActivity.qrView.getMeasuredWidth()) / 2);
                    if (z2) {
                        int i5 = qrActivity.insets.top;
                        measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - measuredHeight3) - i5) - qrActivity.qrView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i5;
                    } else {
                        measuredHeight = (measuredHeight2 - qrActivity.qrView.getMeasuredHeight()) / 2;
                    }
                    QrView qrView = qrActivity.qrView;
                    qrView.layout(measuredWidth2, measuredHeight, qrView.getMeasuredWidth() + measuredWidth2, qrActivity.qrView.getMeasuredHeight() + measuredHeight);
                    if (z2) {
                        int measuredWidth3 = (measuredWidth - qrActivity.avatarImageView.getMeasuredWidth()) / 2;
                        int iDp = measuredHeight - AndroidUtilities.dp(48.0f);
                        BackupImageView backupImageView = qrActivity.avatarImageView;
                        backupImageView.layout(measuredWidth3, iDp, backupImageView.getMeasuredWidth() + measuredWidth3, qrActivity.avatarImageView.getMeasuredHeight() + iDp);
                    }
                    if (qrActivity.themeLayout.getVisibility() == 0) {
                        if (z2) {
                            int measuredWidth4 = (measuredWidth - qrActivity.themeLayout.getMeasuredWidth()) / 2;
                            qrActivity.themeLayout.layout(measuredWidth4, getMeasuredHeight() - measuredHeight3, qrActivity.themeLayout.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                        } else {
                            int measuredHeight4 = (measuredHeight2 - qrActivity.themeLayout.getMeasuredHeight()) / 2;
                            qrActivity.themeLayout.layout(getMeasuredWidth() - qrActivity.themeLayout.getMeasuredWidth(), measuredHeight4, getMeasuredWidth(), qrActivity.themeLayout.getMeasuredHeight() + measuredHeight4);
                        }
                    }
                    RLottieImageView rLottieImageView = qrActivity.logoImageView;
                    Rect rect = qrActivity.logoRect;
                    rLottieImageView.layout(rect.left + measuredWidth2, rect.top + measuredHeight, measuredWidth2 + rect.right, measuredHeight + rect.bottom);
                    int iDp2 = AndroidUtilities.dp(11.0f) + qrActivity.insets.left;
                    int iDp3 = AndroidUtilities.dp(11.0f) + qrActivity.insets.top;
                    ImageView imageView = qrActivity.closeImageView;
                    imageView.layout(iDp2, iDp3, imageView.getMeasuredWidth() + iDp2, qrActivity.closeImageView.getMeasuredHeight() + iDp3);
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int iDp;
            TextView textView;
            switch (this.$r8$classId) {
                case 0:
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    boolean z = size < size2;
                    QrActivity qrActivity = (QrActivity) this.this$0;
                    qrActivity.isFragmentViewPortrait = z;
                    qrActivity.avatarImageView.setVisibility(z ? 0 : 8);
                    super.onMeasure(i, i2);
                    if (!z) {
                        this.ignoreLayout = true;
                        IntroActivity.AnonymousClass1 anonymousClass1 = qrActivity.themeLayout;
                        Insets insets = qrActivity.insets;
                        anonymousClass1.setPadding(0, (insets.top * 2) / 3, insets.right, insets.bottom);
                        this.ignoreLayout = false;
                        qrActivity.themeLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + qrActivity.insets.right, 1073741824), i2);
                        qrActivity.qrView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                    } else {
                        this.ignoreLayout = true;
                        IntroActivity.AnonymousClass1 anonymousClass2 = qrActivity.themeLayout;
                        int i3 = qrActivity.insets.left;
                        int iDp2 = AndroidUtilities.dp(8.0f);
                        Insets insets2 = qrActivity.insets;
                        anonymousClass2.setPadding(i3, iDp2, insets2.right, insets2.bottom);
                        this.ignoreLayout = false;
                        qrActivity.themeLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 + qrActivity.insets.bottom, Integer.MIN_VALUE));
                        qrActivity.qrView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    }
                    break;
                case 1:
                    int size3 = View.MeasureSpec.getSize(i);
                    ChatActivity chatActivity = (ChatActivity) this.this$0;
                    if (chatActivity.isSideMenued()) {
                        size3 -= AndroidUtilities.dp(71.0f);
                        iDp = AndroidUtilities.dp(32.0f);
                    } else {
                        iDp = 0;
                    }
                    TextView textView2 = chatActivity.addToContactsButton;
                    if (textView2 != null && textView2.getVisibility() == 0 && (textView = chatActivity.reportSpamButton) != null && textView.getVisibility() == 0) {
                        size3 = OKLCH.m$2(31.0f, size3, 2);
                    }
                    this.ignoreLayout = true;
                    TextView textView3 = chatActivity.reportSpamButton;
                    if (textView3 != null && textView3.getVisibility() == 0) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) chatActivity.reportSpamButton.getLayoutParams();
                        layoutParams.width = size3;
                        TextView textView4 = chatActivity.addToContactsButton;
                        if (textView4 == null || textView4.getVisibility() != 0) {
                            chatActivity.reportSpamButton.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                            layoutParams.leftMargin = iDp;
                        } else {
                            chatActivity.reportSpamButton.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                            layoutParams.leftMargin = iDp + size3;
                            layoutParams.width -= AndroidUtilities.dp(15.0f);
                        }
                    }
                    TextView textView5 = chatActivity.addToContactsButton;
                    if (textView5 != null && textView5.getVisibility() == 0) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) chatActivity.addToContactsButton.getLayoutParams();
                        layoutParams2.width = size3;
                        TextView textView6 = chatActivity.reportSpamButton;
                        if (textView6 == null || textView6.getVisibility() != 0) {
                            chatActivity.addToContactsButton.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        } else {
                            chatActivity.addToContactsButton.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        }
                        layoutParams2.leftMargin = iDp;
                    }
                    this.ignoreLayout = false;
                    super.onMeasure(i, i2);
                    break;
                default:
                    int size4 = View.MeasureSpec.getSize(i);
                    int size5 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size4, size5);
                    if (((ThemePreviewActivity) this.this$0).dropDownContainer != null) {
                        this.ignoreLayout = true;
                        if (!AndroidUtilities.isTablet()) {
                            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((ThemePreviewActivity) this.this$0).dropDownContainer.getLayoutParams();
                            layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                            ((ThemePreviewActivity) this.this$0).dropDownContainer.setLayoutParams(layoutParams3);
                        }
                        if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                            ((ThemePreviewActivity) this.this$0).dropDown.setTextSize(1, 20.0f);
                        } else {
                            ((ThemePreviewActivity) this.this$0).dropDown.setTextSize(1, 18.0f);
                        }
                        this.ignoreLayout = false;
                    }
                    measureChildWithMargins(((ThemePreviewActivity) this.this$0).actionBar2, i, 0, i2, 0);
                    int measuredHeight = ((ThemePreviewActivity) this.this$0).actionBar2.getMeasuredHeight();
                    if (((ThemePreviewActivity) this.this$0).actionBar2.getVisibility() == 0) {
                        size5 -= measuredHeight;
                    }
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ThemePreviewActivity) this.this$0).listView2.getLayoutParams();
                    layoutParams4.topMargin = measuredHeight;
                    ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.this$0;
                    if (themePreviewActivity.screenType == 2) {
                        ThemePreviewActivity.AnonymousClass10 anonymousClass10 = themePreviewActivity.listView2;
                        int iDp3 = AndroidUtilities.dp(4.0f);
                        ThemePreviewActivity themePreviewActivity2 = (ThemePreviewActivity) this.this$0;
                        anonymousClass10.setPadding(0, iDp3, 0, (AndroidUtilities.dp(((themePreviewActivity2.self || themePreviewActivity2.dialogId <= 0) ? 0 : 58) + 72) - 12) + (((ThemePreviewActivity) this.this$0).insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0));
                    }
                    ((ThemePreviewActivity) this.this$0).listView2.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, 1073741824));
                    ((FrameLayout.LayoutParams) ((ThemePreviewActivity) this.this$0).backgroundImage.getLayoutParams()).topMargin = measuredHeight;
                    ((ThemePreviewActivity) this.this$0).backgroundImage.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                    ThemePreviewActivity.AnonymousClass14 anonymousClass14 = ((ThemePreviewActivity) this.this$0).dimmingSliderContainer;
                    if (anonymousClass14 != null) {
                        ((FrameLayout.LayoutParams) anonymousClass14.getLayoutParams()).topMargin = measuredHeight;
                        ((ThemePreviewActivity) this.this$0).dimmingSliderContainer.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                    }
                    ThemePreviewActivity.AnonymousClass13 anonymousClass13 = ((ThemePreviewActivity) this.this$0).bottomOverlayChat;
                    if (anonymousClass13 != null) {
                        anonymousClass13.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((ThemePreviewActivity) this.this$0).insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0));
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((ThemePreviewActivity) this.this$0).bottomOverlayChat.getLayoutParams();
                        ThemePreviewActivity themePreviewActivity3 = (ThemePreviewActivity) this.this$0;
                        layoutParams5.height = AndroidUtilities.dp(72 + ((themePreviewActivity3.self || themePreviewActivity3.dialogId <= 0) ? 0 : 58)) + (((ThemePreviewActivity) this.this$0).insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0);
                        measureChildWithMargins(((ThemePreviewActivity) this.this$0).bottomOverlayChat, i, 0, i2, 0);
                    }
                    Drawable drawable = ((ThemePreviewActivity) this.this$0).sheetDrawable;
                    if (drawable != null) {
                        drawable.getPadding(AndroidUtilities.rectTmp2);
                    }
                    int i4 = 0;
                    while (true) {
                        FrameLayout[] frameLayoutArr = ((ThemePreviewActivity) this.this$0).patternLayout;
                        if (i4 < frameLayoutArr.length) {
                            FrameLayout frameLayout = frameLayoutArr[i4];
                            if (frameLayout != null) {
                                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                                layoutParams6.height = AndroidUtilities.dp(i4 == 0 ? ((ThemePreviewActivity) this.this$0).screenType == 2 ? 321 : 273 : 316.0f);
                                if (((ThemePreviewActivity) this.this$0).insideBottomSheet()) {
                                    layoutParams6.height += AndroidUtilities.navigationBarHeight;
                                }
                                if (i4 == 0) {
                                    layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                                }
                                ((ThemePreviewActivity) this.this$0).patternLayout[i4].setPadding(0, i4 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((ThemePreviewActivity) this.this$0).insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0);
                                measureChildWithMargins(((ThemePreviewActivity) this.this$0).patternLayout[i4], i, 0, i2, 0);
                            }
                            i4++;
                        }
                        break;
                    }
                    break;
            }
        }

        @Override
        public final void requestLayout() {
            switch (this.$r8$classId) {
                case 0:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                    }
                    break;
                case 1:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
                default:
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                        break;
                    }
                    break;
            }
        }

        public AnonymousClass1(Context context, ThemePreviewActivity themePreviewActivity) {
            super(context);
            this.$r8$classId = 2;
            this.this$0 = themePreviewActivity;
        }
    }

    public final class AnonymousClass2 extends View {
        public final int $r8$classId;
        public Object this$0;

        public AnonymousClass2(Context context) {
            super(context);
            this.$r8$classId = 9;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((BottomSheetTabDialog) this.this$0).navigationBarPaint);
                    break;
                case 19:
                    BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = ((ChatInputViewsContainer) this.this$0).backgroundWithFadeDrawable;
                    if (blurredBackgroundWithFadeDrawable != null) {
                        blurredBackgroundWithFadeDrawable.draw(canvas);
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 22:
                    super.dispatchDraw(canvas);
                    GroupCallActivity.CallEncryptionCellDrawable callEncryptionCellDrawable = (GroupCallActivity.CallEncryptionCellDrawable) this.this$0;
                    if (callEncryptionCellDrawable != null && callEncryptionCellDrawable.draw(canvas, getMeasuredWidth(), 0.0f)) {
                        invalidate();
                        break;
                    }
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 9:
                    super.draw(canvas);
                    ((Text) this.this$0).draw(canvas, (getMeasuredWidth() - ((Text) this.this$0).getWidth()) / 2.0f, getMeasuredHeight() / 2.0f, 1.0f);
                    break;
                case 14:
                    super.draw(canvas);
                    ShareAlert shareAlert = (ShareAlert) this.this$0;
                    shareAlert.fadeDrawable.setBounds(0, (getMeasuredHeight() - shareAlert.systemInsets.bottom) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                    shareAlert.fadeDrawable.draw(canvas);
                    break;
                default:
                    super.draw(canvas);
                    break;
            }
        }

        @Override
        public void invalidate() {
            switch (this.$r8$classId) {
                case 16:
                    super.invalidate();
                    ((SizeNotifierFrameLayout) this.this$0).onBackgroundViewInvalidate();
                    break;
                default:
                    super.invalidate();
                    break;
            }
        }

        @Override
        public void onAttachedToWindow() {
            switch (this.$r8$classId) {
                case 2:
                    super.onAttachedToWindow();
                    ((PaddedListAdapter) this.this$0).paddingViewAttached = true;
                    break;
                case 22:
                    super.onAttachedToWindow();
                    GroupCallActivity.CallEncryptionCellDrawable callEncryptionCellDrawable = (GroupCallActivity.CallEncryptionCellDrawable) this.this$0;
                    if (callEncryptionCellDrawable != null) {
                        callEncryptionCellDrawable.parentView = this;
                        int i = 0;
                        while (true) {
                            GroupCallActivity.EmojiSlot[] emojiSlotArr = callEncryptionCellDrawable.slots;
                            if (i < emojiSlotArr.length) {
                                GroupCallActivity.EmojiSlot emojiSlot = emojiSlotArr[i];
                                emojiSlot.parents.add(this);
                                boolean zIsEmpty = emojiSlot.parents.isEmpty();
                                boolean z = !zIsEmpty;
                                if (emojiSlot.attached != z) {
                                    emojiSlot.attached = z;
                                    ChatMessageCell$$ExternalSyntheticLambda10 chatMessageCell$$ExternalSyntheticLambda10 = emojiSlot.invalidate;
                                    if (zIsEmpty) {
                                        AnimatedEmojiDrawable animatedEmojiDrawable = emojiSlot.real;
                                        if (animatedEmojiDrawable != null) {
                                            animatedEmojiDrawable.removeView(chatMessageCell$$ExternalSyntheticLambda10);
                                        }
                                    } else {
                                        AnimatedEmojiDrawable animatedEmojiDrawable2 = emojiSlot.real;
                                        if (animatedEmojiDrawable2 != null) {
                                            animatedEmojiDrawable2.addView(chatMessageCell$$ExternalSyntheticLambda10);
                                        }
                                    }
                                }
                                i++;
                            }
                        }
                    }
                    break;
                default:
                    super.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 2:
                    super.onDetachedFromWindow();
                    ((PaddedListAdapter) this.this$0).paddingViewAttached = false;
                    break;
                case 22:
                    super.onDetachedFromWindow();
                    GroupCallActivity.CallEncryptionCellDrawable callEncryptionCellDrawable = (GroupCallActivity.CallEncryptionCellDrawable) this.this$0;
                    if (callEncryptionCellDrawable != null && callEncryptionCellDrawable.parentView != this) {
                        int i = 0;
                        while (true) {
                            GroupCallActivity.EmojiSlot[] emojiSlotArr = callEncryptionCellDrawable.slots;
                            if (i >= emojiSlotArr.length) {
                                callEncryptionCellDrawable.parentView = null;
                            } else {
                                GroupCallActivity.EmojiSlot emojiSlot = emojiSlotArr[i];
                                emojiSlot.parents.remove(this);
                                boolean zIsEmpty = emojiSlot.parents.isEmpty();
                                boolean z = !zIsEmpty;
                                if (emojiSlot.attached != z) {
                                    emojiSlot.attached = z;
                                    ChatMessageCell$$ExternalSyntheticLambda10 chatMessageCell$$ExternalSyntheticLambda10 = emojiSlot.invalidate;
                                    if (zIsEmpty) {
                                        AnimatedEmojiDrawable animatedEmojiDrawable = emojiSlot.real;
                                        if (animatedEmojiDrawable != null) {
                                            animatedEmojiDrawable.removeView(chatMessageCell$$ExternalSyntheticLambda10);
                                        }
                                    } else {
                                        AnimatedEmojiDrawable animatedEmojiDrawable2 = emojiSlot.real;
                                        if (animatedEmojiDrawable2 != null) {
                                            animatedEmojiDrawable2.addView(chatMessageCell$$ExternalSyntheticLambda10);
                                        }
                                    }
                                }
                                i++;
                            }
                            break;
                        }
                    }
                    break;
                default:
                    super.onDetachedFromWindow();
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            float f;
            float f2;
            float f3;
            float f4;
            int i2;
            int i3;
            Object obj;
            Drawable drawable;
            boolean z;
            int i4 = 255;
            Object obj2 = null;
            switch (this.$r8$classId) {
                case 0:
                    QrActivity qrActivity = (QrActivity) this.this$0;
                    canvas.drawColor(qrActivity.isCurrentThemeDark ? -15590870 : -6569073);
                    MotionBackgroundDrawable motionBackgroundDrawable = qrActivity.prevMotionDrawable;
                    if (motionBackgroundDrawable != null) {
                        i = 0;
                        motionBackgroundDrawable.setBounds(0, 0, getWidth(), getHeight());
                    } else {
                        i = 0;
                    }
                    qrActivity.currMotionDrawable.setBounds(i, i, getWidth(), getHeight());
                    MotionBackgroundDrawable motionBackgroundDrawable2 = qrActivity.prevMotionDrawable;
                    if (motionBackgroundDrawable2 != null) {
                        motionBackgroundDrawable2.draw(canvas);
                    }
                    qrActivity.currMotionDrawable.draw(canvas);
                    super.onDraw(canvas);
                    break;
                case 4:
                    DialogCell dialogCell = (DialogCell) this.this$0;
                    dialogCell.emojiStatus.setBounds(0, 0, getWidth(), getHeight());
                    dialogCell.emojiStatus.draw(canvas);
                    break;
                case 8:
                    CreateGroupCallBottomSheet createGroupCallBottomSheet = (CreateGroupCallBottomSheet) this.this$0;
                    if (createGroupCallBottomSheet.needSelector) {
                        canvas.drawRect(((BottomSheet) createGroupCallBottomSheet).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) createGroupCallBottomSheet).backgroundPaddingLeft, 1.0f, Theme.dividerPaint);
                    }
                    break;
                case 12:
                    super.onDraw(canvas);
                    ((PhotoViewer.AnonymousClass79) this.this$0).drawBlackBackground(canvas, getMeasuredWidth(), getMeasuredHeight());
                    break;
                case 13:
                    super.onDraw(canvas);
                    LimitReachedBottomSheet limitReachedBottomSheet = (LimitReachedBottomSheet) this.this$0;
                    if (limitReachedBottomSheet.chatEndRow - limitReachedBottomSheet.chatStartRow > 1) {
                        Paint themePaint = Theme.getThemePaint("paintDivider", ((BottomSheet) limitReachedBottomSheet).resourcesProvider);
                        if (themePaint == null) {
                            themePaint = Theme.dividerPaint;
                        }
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, themePaint);
                    }
                    break;
                case 16:
                    float f5 = 2.0f;
                    SizeNotifierFrameLayout sizeNotifierFrameLayout = (SizeNotifierFrameLayout) this.this$0;
                    if (sizeNotifierFrameLayout.backgroundDrawable != null && !sizeNotifierFrameLayout.skipBackgroundDrawing) {
                        Drawable newDrawable = sizeNotifierFrameLayout.getNewDrawable();
                        boolean newDrawableMotion = sizeNotifierFrameLayout.getNewDrawableMotion();
                        Drawable drawable2 = sizeNotifierFrameLayout.backgroundDrawable;
                        if (newDrawable != drawable2 && newDrawable != null) {
                            if (Theme.animatingColors != null) {
                                sizeNotifierFrameLayout.oldBackgroundDrawable = drawable2;
                                sizeNotifierFrameLayout.oldBackgroundMotion = sizeNotifierFrameLayout.backgroundMotion;
                            }
                            if (newDrawable instanceof MotionBackgroundDrawable) {
                                ((MotionBackgroundDrawable) newDrawable).setParentView(sizeNotifierFrameLayout.backgroundView);
                            }
                            sizeNotifierFrameLayout.backgroundDrawable = newDrawable;
                            if (sizeNotifierFrameLayout.attached && (newDrawable instanceof ChatBackgroundDrawable)) {
                                ((ChatBackgroundDrawable) newDrawable).onAttachedToWindow(this);
                            }
                            if (sizeNotifierFrameLayout.attached) {
                                Drawable drawable3 = sizeNotifierFrameLayout.backgroundDrawable;
                                if (drawable3 instanceof MotionBackgroundDrawable) {
                                    MotionBackgroundDrawable motionBackgroundDrawable3 = (MotionBackgroundDrawable) drawable3;
                                    motionBackgroundDrawable3.isAttached = true;
                                    ImageReceiver imageReceiver = motionBackgroundDrawable3.giftImageReceiver;
                                    if (imageReceiver != null) {
                                        imageReceiver.onAttachedToWindow();
                                    }
                                }
                            }
                            sizeNotifierFrameLayout.backgroundMotion = newDrawableMotion;
                            sizeNotifierFrameLayout.themeAnimationValue = 0.0f;
                            sizeNotifierFrameLayout.onUpdateBackgroundDrawable(sizeNotifierFrameLayout.backgroundDrawable);
                            sizeNotifierFrameLayout.checkMotion();
                        } else if (sizeNotifierFrameLayout.backgroundMotion != newDrawableMotion) {
                            sizeNotifierFrameLayout.backgroundMotion = newDrawableMotion;
                            sizeNotifierFrameLayout.checkMotion();
                        }
                        sizeNotifierFrameLayout.themeAnimationValue = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + sizeNotifierFrameLayout.themeAnimationValue, 1.0f, 0.0f);
                        int i5 = 0;
                        while (i5 < 2) {
                            Drawable drawable4 = i5 == 0 ? sizeNotifierFrameLayout.oldBackgroundDrawable : sizeNotifierFrameLayout.backgroundDrawable;
                            if (drawable4 == null) {
                                obj = obj2;
                            } else {
                                if (i5 != 1 || sizeNotifierFrameLayout.oldBackgroundDrawable == null || sizeNotifierFrameLayout.parentLayout == null) {
                                    drawable4.setAlpha(i4);
                                } else {
                                    drawable4.setAlpha((int) (sizeNotifierFrameLayout.themeAnimationValue * 255.0f));
                                }
                                if (i5 == 0 ? sizeNotifierFrameLayout.oldBackgroundMotion : sizeNotifierFrameLayout.backgroundMotion) {
                                    f = sizeNotifierFrameLayout.parallaxScale;
                                    f2 = sizeNotifierFrameLayout.translationX;
                                    f3 = sizeNotifierFrameLayout.translationY;
                                } else {
                                    f = 1.0f;
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                }
                                if (drawable4 instanceof MotionBackgroundDrawable) {
                                    MotionBackgroundDrawable motionBackgroundDrawable4 = (MotionBackgroundDrawable) drawable4;
                                    if (motionBackgroundDrawable4.patternBitmap != null) {
                                        int currentActionBarHeight = (sizeNotifierFrameLayout.isActionBarVisible() ? ActionBar.getCurrentActionBarHeight() : 0) + ((sizeNotifierFrameLayout.isStatusBarVisible$1() && sizeNotifierFrameLayout.occupyStatusBar) ? AndroidUtilities.statusBarHeight : 0);
                                        int measuredHeight = sizeNotifierFrameLayout.useRootView() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                        f4 = 1.0f;
                                        float fMax = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight / drawable4.getIntrinsicHeight());
                                        int iCeil = (int) Math.ceil(drawable4.getIntrinsicWidth() * fMax * f);
                                        int iCeil2 = (int) Math.ceil(drawable4.getIntrinsicHeight() * fMax * f);
                                        int measuredWidth = ((getMeasuredWidth() - iCeil) / 2) + ((int) f2);
                                        int i6 = ((measuredHeight - iCeil2) / 2) + sizeNotifierFrameLayout.backgroundTranslationY + currentActionBarHeight + ((int) f3);
                                        canvas.save();
                                        canvas.clipRect(0, currentActionBarHeight, iCeil, getMeasuredHeight() - sizeNotifierFrameLayout.bottomClip);
                                        drawable4.setBounds(measuredWidth, i6, iCeil + measuredWidth, iCeil2 + i6);
                                        drawable4.draw(canvas);
                                        SizeNotifierFrameLayout.access$1400(sizeNotifierFrameLayout, canvas);
                                        canvas.restore();
                                    } else {
                                        f4 = 1.0f;
                                        if (sizeNotifierFrameLayout.bottomClip != 0) {
                                            canvas.save();
                                            canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - sizeNotifierFrameLayout.bottomClip);
                                        }
                                        motionBackgroundDrawable4.translationY = sizeNotifierFrameLayout.backgroundTranslationY;
                                        drawable4.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - sizeNotifierFrameLayout.backgroundTranslationY) + f3));
                                        drawable4.draw(canvas);
                                        if (sizeNotifierFrameLayout.bottomClip != 0) {
                                            canvas.restore();
                                        }
                                    }
                                } else {
                                    f4 = 1.0f;
                                    if (drawable4 instanceof ColorDrawable) {
                                        if (sizeNotifierFrameLayout.bottomClip != 0) {
                                            canvas.save();
                                            i3 = 0;
                                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - sizeNotifierFrameLayout.bottomClip);
                                        } else {
                                            i3 = 0;
                                        }
                                        drawable4.setBounds(i3, i3, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                        drawable4.draw(canvas);
                                        SizeNotifierFrameLayout.access$1400(sizeNotifierFrameLayout, canvas);
                                        if (sizeNotifierFrameLayout.bottomClip != 0) {
                                            canvas.restore();
                                        }
                                    } else if (drawable4 instanceof GradientDrawable) {
                                        if (sizeNotifierFrameLayout.bottomClip != 0) {
                                            canvas.save();
                                            i2 = 0;
                                            canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - sizeNotifierFrameLayout.bottomClip);
                                        } else {
                                            i2 = 0;
                                        }
                                        drawable4.setBounds(i2, sizeNotifierFrameLayout.backgroundTranslationY, getMeasuredWidth(), getRootView().getMeasuredHeight() + sizeNotifierFrameLayout.backgroundTranslationY);
                                        drawable4.draw(canvas);
                                        SizeNotifierFrameLayout.access$1400(sizeNotifierFrameLayout, canvas);
                                        if (sizeNotifierFrameLayout.bottomClip != 0) {
                                            canvas.restore();
                                        }
                                    } else {
                                        if (!(drawable4 instanceof BitmapDrawable)) {
                                            if (sizeNotifierFrameLayout.bottomClip != 0) {
                                                canvas.save();
                                                canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - sizeNotifierFrameLayout.bottomClip);
                                            }
                                            if (drawable4 instanceof ChatBackgroundDrawable) {
                                                ChatBackgroundDrawable chatBackgroundDrawable = (ChatBackgroundDrawable) drawable4;
                                                chatBackgroundDrawable.parent = this;
                                                MotionBackgroundDrawable motionBackgroundDrawable5 = chatBackgroundDrawable.motionBackgroundDrawable;
                                                if (motionBackgroundDrawable5 != null) {
                                                    motionBackgroundDrawable5.setParentView(this);
                                                }
                                            }
                                            float f6 = f - 1.0f;
                                            float fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(-getMeasuredWidth(), f6, 2.0f, f2);
                                            float fM2 = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(-getRootView().getMeasuredHeight(), f6, 2.0f, f3);
                                            drawable4.setBounds((int) fM, (int) (sizeNotifierFrameLayout.backgroundTranslationY + fM2), (int) ((getMeasuredWidth() * f) + fM), (int) OKLCH.m(getRootView().getMeasuredHeight(), f, sizeNotifierFrameLayout.backgroundTranslationY, fM2));
                                            drawable4.draw(canvas);
                                            SizeNotifierFrameLayout.access$1400(sizeNotifierFrameLayout, canvas);
                                            if (sizeNotifierFrameLayout.bottomClip != 0) {
                                                canvas.restore();
                                            }
                                        } else if (((BitmapDrawable) drawable4).getTileModeX() == Shader.TileMode.REPEAT) {
                                            canvas.save();
                                            float f7 = f5 / AndroidUtilities.density;
                                            canvas.scale(f7, f7);
                                            drawable4.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getRootView().getMeasuredHeight() / f7));
                                            drawable4.draw(canvas);
                                            SizeNotifierFrameLayout.access$1400(sizeNotifierFrameLayout, canvas);
                                            canvas.restore();
                                        } else {
                                            int currentActionBarHeight2 = (sizeNotifierFrameLayout.isActionBarVisible() ? ActionBar.getCurrentActionBarHeight() : 0) + ((sizeNotifierFrameLayout.isStatusBarVisible$1() && sizeNotifierFrameLayout.occupyStatusBar) ? AndroidUtilities.statusBarHeight : 0);
                                            int measuredHeight2 = sizeNotifierFrameLayout.useRootView() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                            float fMax2 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight2 / drawable4.getIntrinsicHeight());
                                            int iCeil3 = (int) Math.ceil(drawable4.getIntrinsicWidth() * fMax2 * f);
                                            int iCeil4 = (int) Math.ceil(drawable4.getIntrinsicHeight() * fMax2 * f);
                                            int measuredWidth2 = ((getMeasuredWidth() - iCeil3) / 2) + ((int) f2);
                                            int i7 = ((measuredHeight2 - iCeil4) / 2) + sizeNotifierFrameLayout.backgroundTranslationY + currentActionBarHeight2 + ((int) f3);
                                            canvas.save();
                                            canvas.clipRect(0, currentActionBarHeight2, iCeil3, getMeasuredHeight() - sizeNotifierFrameLayout.bottomClip);
                                            drawable4.setBounds(measuredWidth2, i7, iCeil3 + measuredWidth2, iCeil4 + i7);
                                            drawable4.draw(canvas);
                                            SizeNotifierFrameLayout.access$1400(sizeNotifierFrameLayout, canvas);
                                            canvas.restore();
                                        }
                                        if (i5 == 0 || (drawable = sizeNotifierFrameLayout.oldBackgroundDrawable) == null || sizeNotifierFrameLayout.themeAnimationValue < f4) {
                                            obj = null;
                                        } else {
                                            if (sizeNotifierFrameLayout.attached && (drawable instanceof ChatBackgroundDrawable)) {
                                                ((ChatBackgroundDrawable) drawable).onDetachedFromWindow(sizeNotifierFrameLayout.backgroundView);
                                            }
                                            if (sizeNotifierFrameLayout.attached) {
                                                Drawable drawable5 = sizeNotifierFrameLayout.oldBackgroundDrawable;
                                                if (drawable5 instanceof MotionBackgroundDrawable) {
                                                    MotionBackgroundDrawable motionBackgroundDrawable6 = (MotionBackgroundDrawable) drawable5;
                                                    z = false;
                                                    motionBackgroundDrawable6.isAttached = false;
                                                    ImageReceiver imageReceiver2 = motionBackgroundDrawable6.giftImageReceiver;
                                                    if (imageReceiver2 != null) {
                                                        imageReceiver2.onDetachedFromWindow();
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                            } else {
                                                z = false;
                                            }
                                            obj = null;
                                            sizeNotifierFrameLayout.oldBackgroundDrawable = null;
                                            sizeNotifierFrameLayout.oldBackgroundMotion = z;
                                            sizeNotifierFrameLayout.checkMotion();
                                            AnonymousClass2 anonymousClass2 = sizeNotifierFrameLayout.backgroundView;
                                            super.invalidate();
                                            ((SizeNotifierFrameLayout) anonymousClass2.this$0).onBackgroundViewInvalidate();
                                        }
                                    }
                                }
                                if (i5 == 0) {
                                    obj = null;
                                } else {
                                    obj = null;
                                }
                            }
                            i5++;
                            obj2 = obj;
                            i4 = 255;
                            f5 = 2.0f;
                        }
                        if (sizeNotifierFrameLayout.themeAnimationValue != 1.0f) {
                            AnonymousClass2 anonymousClass3 = sizeNotifierFrameLayout.backgroundView;
                            super.invalidate();
                            ((SizeNotifierFrameLayout) anonymousClass3.this$0).onBackgroundViewInvalidate();
                        }
                        break;
                    }
                    break;
                case 18:
                    super.onDraw(canvas);
                    int color = Theme.getColor(null, Theme.key_player_progress, false);
                    StorageUsageView storageUsageView = (StorageUsageView) this.this$0;
                    storageUsageView.paintFill.setColor(color);
                    Paint paint = storageUsageView.paintProgress;
                    paint.setColor(color);
                    Paint paint2 = storageUsageView.paintProgress2;
                    paint2.setColor(color);
                    paint.setAlpha(255);
                    paint2.setAlpha(82);
                    Paint paint3 = storageUsageView.paintFill;
                    paint3.setAlpha(46);
                    Paint paint4 = storageUsageView.bgPaint;
                    paint4.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                    boolean z2 = storageUsageView.calculating;
                    if (z2 || storageUsageView.calculatingProgress != 0.0f) {
                        if (!z2) {
                            float f8 = storageUsageView.calculatingProgress - 0.10666667f;
                            storageUsageView.calculatingProgress = f8;
                            if (f8 < 0.0f) {
                                storageUsageView.calculatingProgress = 0.0f;
                            }
                        } else if (storageUsageView.calculatingProgressIncrement) {
                            float f9 = storageUsageView.calculatingProgress + 0.024615385f;
                            storageUsageView.calculatingProgress = f9;
                            if (f9 > 1.0f) {
                                storageUsageView.calculatingProgress = 1.0f;
                                storageUsageView.calculatingProgressIncrement = false;
                            }
                        } else {
                            float f10 = storageUsageView.calculatingProgress - 0.024615385f;
                            storageUsageView.calculatingProgress = f10;
                            if (f10 < 0.0f) {
                                storageUsageView.calculatingProgress = 0.0f;
                                storageUsageView.calculatingProgressIncrement = true;
                            }
                        }
                        invalidate();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                        int measuredWidth3 = getMeasuredWidth();
                        CellFlickerDrawable cellFlickerDrawable = storageUsageView.cellFlickerDrawable;
                        cellFlickerDrawable.parentWidth = measuredWidth3;
                        cellFlickerDrawable.draw(AndroidUtilities.dp(3.0f), canvas, rectF, null);
                    }
                    int iDp = AndroidUtilities.dp(24.0f);
                    if (!storageUsageView.calculating) {
                        int iM$3 = (int) (OKLCH.m$3(24.0f, 2, getMeasuredWidth()) * storageUsageView.progress2);
                        int iDp2 = AndroidUtilities.dp(24.0f) + iM$3;
                        canvas.drawLine(iDp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + iM$3, AndroidUtilities.dp(20.0f), paint2);
                        canvas.drawRect(iDp2, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + iDp2, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint4);
                    }
                    if (!storageUsageView.calculating) {
                        int iM$4 = (int) (OKLCH.m$3(24.0f, 2, getMeasuredWidth()) * storageUsageView.progress);
                        if (iM$4 < AndroidUtilities.dp(1.0f)) {
                            iM$4 = AndroidUtilities.dp(1.0f);
                        }
                        int iDp3 = AndroidUtilities.dp(24.0f) + iM$4;
                        canvas.drawLine(iDp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + iM$4, AndroidUtilities.dp(20.0f), paint);
                        canvas.drawRect(iDp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + iDp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint4);
                    }
                    break;
                case 20:
                    if (getAlpha() != 0.0f) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        ((RTMPStreamPipOverlay) this.this$0).cellFlickerDrawable.draw(AndroidUtilities.dp(10.0f), canvas, rectF2, null);
                        invalidate();
                        break;
                    }
                    break;
                case 23:
                    canvas.drawColor(((MultiContactsSelectorBottomSheet) this.this$0).getThemedColor(Theme.key_graySection));
                    break;
                case 24:
                    PhotoAlbumPickerActivity photoAlbumPickerActivity = (PhotoAlbumPickerActivity) this.this$0;
                    String str = String.format("%d", Integer.valueOf(Math.max(1, photoAlbumPickerActivity.selectedPhotosOrder.size())));
                    int iCeil5 = (int) Math.ceil(photoAlbumPickerActivity.textPaint.measureText(str));
                    int iMax = Math.max(AndroidUtilities.dp(16.0f) + iCeil5, AndroidUtilities.dp(24.0f));
                    int measuredWidth4 = getMeasuredWidth() / 2;
                    getMeasuredHeight();
                    photoAlbumPickerActivity.textPaint.setColor(Theme.getColor(null, Theme.key_dialogRoundCheckBoxCheck, false));
                    photoAlbumPickerActivity.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                    int i8 = iMax / 2;
                    int i9 = measuredWidth4 - i8;
                    int i10 = i8 + measuredWidth4;
                    photoAlbumPickerActivity.rect.set(i9, 0.0f, i10, getMeasuredHeight());
                    canvas.drawRoundRect(photoAlbumPickerActivity.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), photoAlbumPickerActivity.paint);
                    photoAlbumPickerActivity.paint.setColor(Theme.getColor(null, Theme.key_dialogRoundCheckBox, false));
                    photoAlbumPickerActivity.rect.set(AndroidUtilities.dp(2.0f) + i9, AndroidUtilities.dp(2.0f), i10 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                    canvas.drawRoundRect(photoAlbumPickerActivity.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), photoAlbumPickerActivity.paint);
                    canvas.drawText(str, measuredWidth4 - (iCeil5 / 2), AndroidUtilities.dp(16.2f), photoAlbumPickerActivity.textPaint);
                    break;
                case 25:
                    PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) this.this$0;
                    String str2 = String.format("%d", Integer.valueOf(Math.max(1, photoPickerActivity.selectedPhotosOrder.size())));
                    int iCeil6 = (int) Math.ceil(photoPickerActivity.textPaint.measureText(str2));
                    int iMax2 = Math.max(AndroidUtilities.dp(16.0f) + iCeil6, AndroidUtilities.dp(24.0f));
                    int measuredWidth5 = getMeasuredWidth() / 2;
                    getMeasuredHeight();
                    photoPickerActivity.textPaint.setColor(Theme.getColor(null, Theme.key_dialogRoundCheckBoxCheck, false));
                    photoPickerActivity.paint.setColor(Theme.getColor(null, photoPickerActivity.dialogBackgroundKey, false));
                    int i11 = iMax2 / 2;
                    int i12 = measuredWidth5 - i11;
                    int i13 = i11 + measuredWidth5;
                    photoPickerActivity.rect.set(i12, 0.0f, i13, getMeasuredHeight());
                    canvas.drawRoundRect(photoPickerActivity.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), photoPickerActivity.paint);
                    photoPickerActivity.paint.setColor(Theme.getColor(null, Theme.key_dialogRoundCheckBox, false));
                    photoPickerActivity.rect.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                    canvas.drawRoundRect(photoPickerActivity.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), photoPickerActivity.paint);
                    canvas.drawText(str2, measuredWidth5 - (iCeil6 / 2), AndroidUtilities.dp(16.2f), photoPickerActivity.textPaint);
                    break;
                case 26:
                    ((PhotoViewer) this.this$0).videoPlayerSeekbar.draw(canvas, this);
                    break;
                case 28:
                    ((SecretMediaViewer) this.this$0).seekbar.draw(canvas, this);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 29:
                    super.onLayout(z, i, i2, i3, i4);
                    SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1 anonymousClass1 = (SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1) this.this$0;
                    getLocationOnScreen(anonymousClass1.tempLocation);
                    Rect rect = anonymousClass1.to;
                    int[] iArr = anonymousClass1.tempLocation;
                    int i5 = iArr[0];
                    rect.set(i5, iArr[1], getWidth() + i5, getHeight() + anonymousClass1.tempLocation[1]);
                    AndroidUtilities.lerp(anonymousClass1.from, anonymousClass1.to, anonymousClass1.showT, anonymousClass1.current);
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int iIntValue;
            switch (this.$r8$classId) {
                case 1:
                    setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.navigationBarHeight);
                    setTranslationY(AndroidUtilities.navigationBarHeight);
                    break;
                case 2:
                    ((View) getParent()).getMeasuredHeight();
                    PaddedListAdapter paddedListAdapter = (PaddedListAdapter) this.this$0;
                    Integer num = paddedListAdapter.padding;
                    if (num != null) {
                        iIntValue = num.intValue();
                        paddedListAdapter.lastPadding = iIntValue;
                    } else {
                        iIntValue = 0;
                        paddedListAdapter.lastPadding = 0;
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824));
                    break;
                case 3:
                    LinearLayoutManager linearLayoutManager = BoostsActivity.this.layoutManager;
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, linearLayoutManager instanceof FillLastLinearLayoutManager ? ((FillLastLinearLayoutManager) linearLayoutManager).lastItemHeight : 0), 1073741824));
                    break;
                case 4:
                case 8:
                case 12:
                case 13:
                case 14:
                case 16:
                case 19:
                case 20:
                case 23:
                case 24:
                case 25:
                case 26:
                default:
                    super.onMeasure(i, i2);
                    break;
                case 5:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(ChatAttachAlertPhotoLayout.this.gridExtraSpace, 1073741824));
                    break;
                case 6:
                    setMeasuredDimension(View.MeasureSpec.getSize(i), ChatAttachAlertPollLayout.this.topPadding);
                    break;
                case 7:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(((ChatAttachRestrictedLayout) ((AppIconsSelectorCell.AnonymousClass1) this.this$0).this$0).gridExtraSpace, 1073741824));
                    break;
                case 9:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((Text) this.this$0).getWidth()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((Text) this.this$0).layout.getHeight()), AndroidUtilities.dp(26.0f)), 1073741824));
                    break;
                case 10:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + InviteMembersBottomSheet.this.additionalHeight, 1073741824));
                    break;
                case 11:
                    int iDp = AndroidUtilities.dp(48.0f);
                    InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iDp + inviteMembersBottomSheet.additionalHeight + inviteMembersBottomSheet.searchAdditionalHeight, 1073741824));
                    break;
                case 15:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ShareAlert.this.searchLayoutManager.lastItemHeight, 1073741824));
                    break;
                case 17:
                    int size = View.MeasureSpec.getSize(i);
                    if (size <= 0) {
                        size = ((View) getParent()).getMeasuredWidth();
                    }
                    int size2 = View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(4.0f);
                    StickerCategoriesListView.Adapter adapter = (StickerCategoriesListView.Adapter) this.this$0;
                    StickerCategoriesListView stickerCategoriesListView = StickerCategoriesListView.this;
                    int i3 = stickerCategoriesListView.dontOccupyWidth;
                    int iMax = Math.max(i3 > 0 ? AndroidUtilities.dp(4.0f) + i3 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((adapter.getItemCount() - 1) * size2), StickerCategoriesListView.this.shownButtonsAtStart * size2)));
                    stickerCategoriesListView.paddingWidth = iMax;
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), i2);
                    break;
                case 18:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                    break;
                case 21:
                    GradientHeaderActivity gradientHeaderActivity = (GradientHeaderActivity) this.this$0;
                    if (gradientHeaderActivity.isLandscapeMode) {
                        gradientHeaderActivity.firstViewHeight = (((BaseFragment) gradientHeaderActivity).actionBar.getMeasuredHeight() + gradientHeaderActivity.statusBarHeight) - AndroidUtilities.dp(16.0f);
                    } else {
                        int iDp2 = AndroidUtilities.dp(140.0f) + gradientHeaderActivity.statusBarHeight;
                        if (AndroidUtilities.dp(24.0f) + gradientHeaderActivity.backgroundView.getMeasuredHeight() > iDp2) {
                            iDp2 = Math.max(iDp2, (AndroidUtilities.dp(24.0f) + gradientHeaderActivity.backgroundView.getMeasuredHeight()) - gradientHeaderActivity.minusHeaderHeight);
                        }
                        gradientHeaderActivity.firstViewHeight = iDp2;
                    }
                    int i4 = (int) (gradientHeaderActivity.firstViewHeight - (0 * 2.5f));
                    gradientHeaderActivity.firstViewHeight = i4;
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                    break;
                case 22:
                    setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(38.0f));
                    break;
                case 27:
                    PremiumPreviewFragment.Adapter adapter2 = (PremiumPreviewFragment.Adapter) this.this$0;
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment.isLandscapeMode) {
                        premiumPreviewFragment.firstViewHeight = 0;
                    } else {
                        int iDp3 = AndroidUtilities.dp(64.0f);
                        if (AndroidUtilities.dp(8.0f) + PremiumPreviewFragment.this.backgroundView.getMeasuredHeight() > iDp3) {
                            iDp3 = PremiumPreviewFragment.this.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        }
                        PremiumPreviewFragment.this.firstViewHeight = iDp3;
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(PremiumPreviewFragment.this.firstViewHeight, 1073741824));
                    break;
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 20:
                    super.onSizeChanged(i, i2, i3, i4);
                    ((RTMPStreamPipOverlay) this.this$0).cellFlickerDrawable.parentWidth = i;
                    break;
                default:
                    super.onSizeChanged(i, i2, i3, i4);
                    break;
            }
        }

        public AnonymousClass2(Context context, Object obj, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        public AnonymousClass2(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        public AnonymousClass2(LaunchActivity launchActivity, GroupCallActivity.CallEncryptionCellDrawable callEncryptionCellDrawable) {
            super(launchActivity);
            this.$r8$classId = 22;
            this.this$0 = callEncryptionCellDrawable;
            NotificationCenter.listenEmojiLoading(this);
            setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(17, this, launchActivity));
        }
    }

    public final class AnonymousClass4 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public final Object val$newQrColors;

        public AnonymousClass4(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$newQrColors = obj2;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    super.onAnimationCancel(animator);
                    float fFloatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                    int[] iArr = (int[]) this.val$newQrColors;
                    if (iArr != null) {
                        QrActivity qrActivity = (QrActivity) this.this$0;
                        System.arraycopy(new int[]{ColorUtils.blendARGB(fFloatValue, qrActivity.prevQrColors[0], iArr[0]), ColorUtils.blendARGB(fFloatValue, qrActivity.prevQrColors[1], iArr[1]), ColorUtils.blendARGB(fFloatValue, qrActivity.prevQrColors[2], iArr[2]), ColorUtils.blendARGB(fFloatValue, qrActivity.prevQrColors[3], iArr[3])}, 0, qrActivity.prevQrColors, 0, 4);
                    }
                    break;
                case 10:
                    ((ProfileActivity) this.this$0).headerAnimatorSet = null;
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            int i = 0;
            Object obj = this.val$newQrColors;
            Object obj2 = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    super.onAnimationEnd(animator);
                    QrActivity qrActivity = (QrActivity) obj2;
                    int[] iArr = (int[]) obj;
                    if (iArr != null) {
                        System.arraycopy(iArr, 0, qrActivity.prevQrColors, 0, 4);
                    }
                    qrActivity.prevMotionDrawable = null;
                    qrActivity.patternAlphaAnimator = null;
                    MotionBackgroundDrawable motionBackgroundDrawable = qrActivity.currMotionDrawable;
                    motionBackgroundDrawable.backgroundAlpha = 1.0f;
                    motionBackgroundDrawable.invalidateParent();
                    MotionBackgroundDrawable motionBackgroundDrawable2 = qrActivity.currMotionDrawable;
                    motionBackgroundDrawable2.patternAlpha = 1.0f;
                    motionBackgroundDrawable2.invalidateParent();
                    break;
                case 1:
                    ActivityCompat.AnonymousClass1 anonymousClass1 = (ActivityCompat.AnonymousClass1) obj2;
                    SizeNotifierFrameLayout sizeNotifierFrameLayout = (SizeNotifierFrameLayout) anonymousClass1.val$activity;
                    sizeNotifierFrameLayout.blurCrossfadeProgress = 1.0f;
                    sizeNotifierFrameLayout.unusedBitmaps.add((SizeNotifierFrameLayout.BlurBitmap) obj);
                    ((SizeNotifierFrameLayout) anonymousClass1.val$activity).blurPaintTop2.setShader(null);
                    ((SizeNotifierFrameLayout) anonymousClass1.val$activity).blurPaintBottom2.setShader(null);
                    ((SizeNotifierFrameLayout) anonymousClass1.val$activity).invalidateBlurredViews();
                    super.onAnimationEnd(animator);
                    break;
                case 2:
                    StickerTabView stickerTabView = (StickerTabView) obj2;
                    stickerTabView.dragOffset = 0.0f;
                    stickerTabView.invalidate();
                    ((ScrollSlidingTabStrip) obj).invalidate();
                    break;
                case 3:
                    VoIpSwitchLayout voIpSwitchLayout = (VoIpSwitchLayout) obj2;
                    voIpSwitchLayout.currentTextView.setText((String) obj);
                    voIpSwitchLayout.currentTextView.setTranslationY(0.0f);
                    voIpSwitchLayout.currentTextView.setAlpha(1.0f);
                    break;
                case 4:
                    ((VoIpSwitchLayout) obj2).removeView((VoIpSwitchLayout.VoIpButtonView) obj);
                    break;
                case 5:
                    DatabaseMigrationHint databaseMigrationHint = (DatabaseMigrationHint) obj;
                    if (databaseMigrationHint.getParent() != null) {
                        ((ViewGroup) databaseMigrationHint.getParent()).removeView(databaseMigrationHint);
                    }
                    ((DialogsActivity) obj2).databaseMigrationHint = null;
                    break;
                case 6:
                    InviteContactsActivity.SpansContainer spansContainer = (InviteContactsActivity.SpansContainer) obj2;
                    spansContainer.removeView((GroupCreateSpan) obj);
                    spansContainer.removingSpan = null;
                    spansContainer.currentAnimation = null;
                    spansContainer.animationStarted = false;
                    break;
                case 7:
                    SlideView slideView = (SlideView) obj2;
                    slideView.setVisibility(8);
                    slideView.setX(0.0f);
                    break;
                case 8:
                    PhotoViewer photoViewer = (PhotoViewer) obj2;
                    PhotoCropView photoCropView = photoViewer.photoCropView;
                    photoCropView.getClass();
                    Bitmap bitmap = (Bitmap) obj;
                    photoCropView.thumbImageVisible = bitmap != null;
                    ImageReceiver imageReceiver = photoCropView.thumbImageView;
                    imageReceiver.setImageBitmap(bitmap);
                    imageReceiver.setOrientation(0, false);
                    AnimatorSet animatorSet = photoCropView.thumbAnimation;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = photoCropView.thumbOverrideAnimation;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    photoCropView.thumbImageVisibleOverride = true;
                    photoCropView.thumbImageVisibleProgress = 1.0f;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    photoCropView.thumbAnimation = animatorSet3;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(photoCropView, photoCropView.ANIMATION_VALUE, 0.0f, 1.0f));
                    photoCropView.thumbAnimation.setDuration(250L);
                    photoCropView.thumbAnimation.setInterpolator(new OvershootInterpolator(1.01f));
                    photoCropView.thumbAnimation.addListener(new PhotoCropView.AnonymousClass5(photoCropView, i));
                    photoCropView.thumbAnimation.start();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    photoViewer.flashAnimator = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.flashView, photoViewer.FLASH_VIEW_VALUE, 0.0f));
                    photoViewer.flashAnimator.setDuration(85L);
                    photoViewer.flashAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    photoViewer.flashAnimator.addListener(new PhotoViewer$41$1(this, i));
                    photoViewer.flashAnimator.start();
                    break;
                case 9:
                    ((PremiumPreviewFragment.BackgroundView.AnonymousClass2) obj).setVisibility(8);
                    while (true) {
                        PremiumPreviewFragment.BackgroundView backgroundView = (PremiumPreviewFragment.BackgroundView) obj2;
                        if (i < PremiumPreviewFragment.this.backgroundView.getChildCount()) {
                            View childAt = PremiumPreviewFragment.this.backgroundView.getChildAt(i);
                            if (childAt != backgroundView.tierListView) {
                                childAt.setTranslationY(0.0f);
                            }
                            i++;
                        }
                        break;
                    }
                    break;
                case 10:
                    ProfileActivity profileActivity = (ProfileActivity) obj2;
                    if (profileActivity.headerAnimatorSet != null) {
                        if (profileActivity.mediaHeaderVisible) {
                            if (profileActivity.callItemVisible) {
                                profileActivity.callItem.setVisibility(8);
                            }
                            if (profileActivity.videoCallItemVisible) {
                                profileActivity.videoCallItem.setVisibility(8);
                            }
                            if (profileActivity.editItemVisible) {
                                profileActivity.editItem.setVisibility(8);
                            }
                            profileActivity.otherItem.setVisibility(8);
                        } else {
                            ProfileActivity.AnonymousClass9 anonymousClass9 = profileActivity.sharedMediaLayout;
                            if (anonymousClass9.isSearchItemVisible(anonymousClass9.mediaPages[0].selectedType)) {
                                ((ActionBarMenuItem) obj).setVisibility(0);
                            }
                            profileActivity.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
                            AnimatorSet animatorSet5 = new AnimatorSet();
                            profileActivity.headerShadowAnimatorSet = animatorSet5;
                            animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.HEADER_SHADOW, 1.0f));
                            profileActivity.headerShadowAnimatorSet.setDuration(100L);
                            profileActivity.headerShadowAnimatorSet.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 6));
                            profileActivity.headerShadowAnimatorSet.start();
                        }
                    }
                    profileActivity.updateStoriesViewBounds(false);
                    profileActivity.headerAnimatorSet = null;
                    break;
                case 11:
                    RightSlidingDialogContainer rightSlidingDialogContainer = (RightSlidingDialogContainer) obj2;
                    if (rightSlidingDialogContainer.openAnimator != null) {
                        rightSlidingDialogContainer.openAnimator = null;
                        rightSlidingDialogContainer.notificationsLocker.unlock();
                        ((DialogsActivity.AnonymousClass33) obj).onTransitionAnimationEnd(true, false);
                        rightSlidingDialogContainer.openedProgress = 1.0f;
                        rightSlidingDialogContainer.updateOpenAnimationProgress();
                        rightSlidingDialogContainer.openAnimationFinished(false);
                        break;
                    }
                    break;
                case 12:
                    PhotoViewer.PlaceProviderObject placeProviderObject = (PhotoViewer.PlaceProviderObject) obj;
                    if (placeProviderObject != null) {
                        placeProviderObject.imageReceiver.setVisible(true, true);
                    }
                    ((SecretMediaViewer) obj2).isVisible = false;
                    AndroidUtilities.runOnUIThread(new ProfileActivity$9$$ExternalSyntheticLambda1(this, 10));
                    break;
                case 13:
                    ((SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1) obj).run();
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) obj2;
                    SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1 anonymousClass2 = selectAnimatedEmojiDialog.selectStatusDateDialog;
                    if (anonymousClass2 != null) {
                        anonymousClass2.dismiss();
                        selectAnimatedEmojiDialog.selectStatusDateDialog = null;
                    }
                    break;
                case 14:
                    SuperRipple superRipple = (SuperRipple) obj2;
                    superRipple.effects.remove((SuperRipple.Effect) obj);
                    superRipple.updateProperties();
                    break;
                case 15:
                    super.onAnimationEnd(animator);
                    ((DialogStoriesCell.StoryCell) obj2).this$0.textAnimator = null;
                    AndroidUtilities.removeFromParent((SimpleTextView) obj);
                    break;
                case 16:
                    boolean[] zArr = (boolean[]) obj;
                    ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        int i2 = ProfileStoriesView.$r8$clinit;
                        profileStoriesView.getClass();
                        if (SharedConfig.getDevicePerformanceClass() > 0) {
                            AndroidUtilities.vibrateCursor(profileStoriesView);
                            AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(profileStoriesView, 11), 180L);
                        }
                    }
                    profileStoriesView.newStoryBounceT = 1.0f;
                    profileStoriesView.invalidate();
                    break;
                case 17:
                    EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.setVisibility(4);
                    }
                    GalleryListView.this.searchContainer.setVisibility(8);
                    break;
                case 18:
                    GallerySheet gallerySheet = (GallerySheet) obj2;
                    gallerySheet.galleryOpenCloseAnimator = null;
                    gallerySheet.galleryListViewOpening = null;
                    GallerySheet$$ExternalSyntheticLambda0 gallerySheet$$ExternalSyntheticLambda0 = (GallerySheet$$ExternalSyntheticLambda0) obj;
                    if (gallerySheet$$ExternalSyntheticLambda0 != null) {
                        gallerySheet$$ExternalSyntheticLambda0.run();
                    }
                    break;
                case 19:
                    ((RoundView) obj).setDraw(true);
                    CaptionStory.AnonymousClass1 anonymousClass3 = (CaptionStory.AnonymousClass1) obj2;
                    if (anonymousClass3.getParent() instanceof ViewGroup) {
                        ((ViewGroup) anonymousClass3.getParent()).removeView(anonymousClass3);
                    }
                    break;
                case 20:
                    StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer spansContainer2 = (StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer) obj2;
                    spansContainer2.removeView((GroupCreateSpan) obj);
                    spansContainer2.removingSpans.clear();
                    spansContainer2.currentAnimation = null;
                    spansContainer2.animationStarted = false;
                    StoryPrivacyBottomSheet.SearchUsersCell searchUsersCell = (StoryPrivacyBottomSheet.SearchUsersCell) spansContainer2.this$0;
                    searchUsersCell.editText.setAllowDrawCursor(true);
                    StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 = searchUsersCell.updateHeight;
                    if (storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 != null) {
                        storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1.run();
                    }
                    if (searchUsersCell.scroll) {
                        searchUsersCell.fullScroll(130);
                        searchUsersCell.scroll = false;
                    }
                    break;
                case 21:
                    UsersSelectActivity.SpansContainer spansContainer3 = (UsersSelectActivity.SpansContainer) obj2;
                    spansContainer3.removeView((GroupCreateSpan) obj);
                    spansContainer3.removingSpan = null;
                    spansContainer3.currentAnimation = null;
                    spansContainer3.animationStarted = false;
                    UsersSelectActivity.this.editText.setAllowDrawCursor(true);
                    if (UsersSelectActivity.this.allSpans.isEmpty()) {
                        UsersSelectActivity.this.editText.setHintVisible(true, true);
                    }
                    break;
                case 22:
                    ((Runnable) obj).run();
                    VoIPFragment voIPFragment = (VoIPFragment) obj2;
                    voIPFragment.acceptDeclineView.setScaleX(1.15f);
                    voIPFragment.acceptDeclineView.setScaleY(1.15f);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) voIPFragment.acceptDeclineView.getLayoutParams();
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                    voIPFragment.acceptDeclineView.setVisibility(8);
                    break;
                default:
                    RichEditor richEditor = (RichEditor) obj2;
                    richEditor.animatingOpen = false;
                    richEditor.animateEnterView.setAlpha(1.0f);
                    richEditor.animateEnterView.sendButtonContainer.setVisibility(0);
                    richEditor.animateInputBackground.setRadius(AndroidUtilities.dp(22.0f));
                    richEditor.animateInputBackground.setAlpha(255);
                    ChatInputViewsContainer chatInputViewsContainer = richEditor.animateInputView;
                    chatInputViewsContainer.drawInputBackground = true;
                    chatInputViewsContainer.invalidate();
                    ((Runnable) obj).run();
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 7:
                    ((SlideView) this.val$newQrColors).setVisibility(0);
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }

        public AnonymousClass4(SlideView slideView, SlideView slideView2) {
            this.$r8$classId = 7;
            this.val$newQrColors = slideView;
            this.this$0 = slideView2;
        }
    }

    public final class AnonymousClass5 implements CameraScanActivity.CameraScanActivityDelegate {
        public final int val$currentAccount;
        public final BaseFragment val$fragment;

        public AnonymousClass5(int i, BaseFragment baseFragment) {
            this.val$currentAccount = i;
            this.val$fragment = baseFragment;
        }

        @Override
        public final void didFindMrzInfo(MrzRecognizer.Result result) {
        }

        @Override
        public final void didFindQr(String str) {
            String strExtractUsername = Browser.extractUsername(str);
            if (TextUtils.isEmpty(strExtractUsername)) {
                AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(0));
            } else {
                MessagesController.getInstance(this.val$currentAccount).getUserNameResolver().resolve(strExtractUsername, new QrActivity$5$$ExternalSyntheticLambda0(this.val$fragment, 0));
            }
        }

        @Override
        public final String getSubtitleText() {
            return null;
        }

        @Override
        public final void onDismiss() {
        }

        @Override
        public final boolean processQr(String str, CameraScanActivity$$ExternalSyntheticLambda0 cameraScanActivity$$ExternalSyntheticLambda0) {
            return false;
        }
    }

    public final class QrView extends View {
        public Bitmap backgroundBitmap;
        public final Paint bitmapGradientPaint;
        public QrActivity$$ExternalSyntheticLambda1 centerChangedListener;
        public final QrActivity$QrView$$ExternalSyntheticLambda0 checkTimerToken;
        public Bitmap contentBitmap;
        public final AnimatedFloat contentBitmapAlpha;
        public final Paint crossfadeFromPaint;
        public final Paint crossfadeToPaint;
        public boolean firstPrepare;
        public final MotionBackgroundDrawable gradientDrawable;
        public final BitmapShader gradientShader;
        public final BitmapShader gradientTextShader;
        public Integer hadHeight;
        public String hadLink;
        public String hadUserText;
        public Integer hadWidth;
        public boolean hasTimer;
        public boolean isPhone;
        public String link;
        public int linkExpires;
        public RLottieDrawable loadingMatrix;
        public boolean logoCenterSet;
        public Bitmap oldContentBitmap;
        public final float[] radii;
        public boolean setData;
        public StaticLayout shareUsernameLayout;
        public TextPaint shareUsernameLayoutPaint;
        public final AnonymousClass1 timerTextDrawable;
        public String username;
        public static final float SHADOW_SIZE = AndroidUtilities.dp(2.0f);
        public static final float RADIUS = AndroidUtilities.dp(20.0f);

        public final class AnonymousClass1 extends AnimatedTextView.AnimatedTextDrawable {
            public final int $r8$classId = 1;
            public final Object this$0;

            public AnonymousClass1(Runnable runnable) {
                super(false, true, true, true);
                this.this$0 = runnable;
            }

            @Override
            public final void invalidateSelf() {
                switch (this.$r8$classId) {
                    case 0:
                        ((QrView) this.this$0).invalidate();
                        break;
                    default:
                        ((Runnable) this.this$0).run();
                        break;
                }
            }

            public AnonymousClass1(QrView qrView) {
                super(false, true, false, false);
                this.this$0 = qrView;
            }
        }

        public QrView(Context context) {
            super(context);
            MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
            this.gradientDrawable = motionBackgroundDrawable;
            Paint paint = new Paint(1);
            this.bitmapGradientPaint = paint;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.contentBitmapAlpha = new AnimatedFloat(1.0f, this, 0L, 2000L, cubicBezierInterpolator);
            Paint paint2 = new Paint(1);
            this.crossfadeFromPaint = paint2;
            Paint paint3 = new Paint(1);
            this.crossfadeToPaint = paint3;
            this.radii = new float[8];
            this.checkTimerToken = new QrActivity$QrView$$ExternalSyntheticLambda0(this, 0);
            this.firstPrepare = true;
            motionBackgroundDrawable.isIndeterminateAnimation = true;
            motionBackgroundDrawable.setParentView(this);
            Bitmap bitmap = motionBackgroundDrawable.currentBitmap;
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.gradientShader = bitmapShader;
            BitmapShader bitmapShader2 = new BitmapShader(motionBackgroundDrawable.currentBitmap, tileMode, tileMode);
            this.gradientTextShader = bitmapShader2;
            paint.setShader(bitmapShader);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
            this.timerTextDrawable = anonymousClass1;
            anonymousClass1.moveAmplitude = 0.35f;
            anonymousClass1.animateDuration = 300L;
            anonymousClass1.animateWave = 1.0f;
            anonymousClass1.animateInterpolator = cubicBezierInterpolator;
            anonymousClass1.setCallback(this);
            Typeface typeface = AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            TextPaint textPaint = anonymousClass1.textPaint;
            textPaint.setTypeface(typeface);
            textPaint.setShader(bitmapShader2);
            anonymousClass1.gravity = 17;
            anonymousClass1.setTextSize(AndroidUtilities.dp(35.0f));
            anonymousClass1.setText("", true, true);
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
            paint3.setXfermode(new PorterDuffXfermode(mode));
        }

        public final void drawLoading(Canvas canvas) {
            QrActivity$$ExternalSyntheticLambda1 qrActivity$$ExternalSyntheticLambda1;
            if (this.loadingMatrix != null) {
                int iM$2 = OKLCH.m$2(60.0f, getWidth(), 33);
                int i = iM$2 * 33;
                int i2 = i + 32;
                int width = (getWidth() - i2) / 2;
                int height = (int) (getHeight() * 0.15f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    height = (int) (getHeight() * 0.09f);
                }
                int i3 = height;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, 255, 31);
                int i4 = width + 16;
                int i5 = i3 + 16;
                float width2 = (getWidth() - width) - 16;
                float width3 = (((getWidth() + i3) - width) - width) - 16;
                Paint paint = this.bitmapGradientPaint;
                canvas.drawRect(i4, i5, width2, width3, paint);
                canvas.save();
                this.loadingMatrix.setBounds(i4, i5, (getWidth() - width) - 16, (((getWidth() + i3) - width) - width) - 16);
                this.loadingMatrix.draw(canvas);
                canvas.restore();
                canvas.restore();
                float width4 = getWidth() / 2.0f;
                float f = i3;
                float f2 = width;
                float width5 = ((getWidth() / 2.0f) + f) - f2;
                float f3 = iM$2;
                float fRound = ((Math.round((i / 4.65f) / f3) * iM$2) / 2) * 0.75f;
                canvas.drawCircle(width4, width5, fRound, paint);
                TelegramQRCodeWriter.drawSideQuads(canvas, f2, f, paint, 7.0f, f3, 16, i2, 0.75f, this.radii, true);
                if (this.logoCenterSet || (qrActivity$$ExternalSyntheticLambda1 = this.centerChangedListener) == null) {
                    return;
                }
                QrActivity qrActivity = qrActivity$$ExternalSyntheticLambda1.f$0;
                qrActivity.logoRect.set((int) (width4 - fRound), (int) (width5 - fRound), (int) (width4 + fRound), (int) (width5 + fRound));
                qrActivity.qrView.requestLayout();
                this.logoCenterSet = true;
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.checkTimerToken.run();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            RLottieDrawable rLottieDrawable = this.loadingMatrix;
            if (rLottieDrawable != null) {
                rLottieDrawable.isRunning = false;
                rLottieDrawable.checkChoreographer$1();
                this.loadingMatrix.recycle(false);
                this.loadingMatrix = null;
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int i;
            int i2;
            float f;
            super.onDraw(canvas);
            Bitmap bitmap = this.backgroundBitmap;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            float f2 = this.contentBitmapAlpha.set(1.0f, false);
            boolean z = f2 > 0.0f && f2 < 1.0f;
            Paint paint = this.bitmapGradientPaint;
            if (f2 >= 1.0f) {
                i = 255;
                i2 = 31;
                f = 120.0f;
            } else {
                if (z) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(rectF, 255, 31);
                }
                Bitmap bitmap2 = this.oldContentBitmap;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                } else {
                    drawLoading(canvas);
                }
                if (z) {
                    float fDp = AndroidUtilities.dp(120.0f);
                    canvas.save();
                    canvas.translate(0.0f, DiffUtil.m(1.0f, f2, getHeight() + fDp, -fDp));
                    i = 255;
                    i2 = 31;
                    f = 120.0f;
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight() + fDp, this.crossfadeToPaint);
                    canvas.restore();
                    canvas.restore();
                } else {
                    i = 255;
                    i2 = 31;
                    f = 120.0f;
                }
            }
            if (f2 > 0.0f) {
                if (z) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(rectF2, i, i2);
                }
                Bitmap bitmap3 = this.contentBitmap;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
                    this.gradientDrawable.updateAnimation();
                } else {
                    drawLoading(canvas);
                }
                if (z) {
                    float fDp2 = AndroidUtilities.dp(f);
                    canvas.save();
                    float f3 = -fDp2;
                    canvas.translate(0.0f, DiffUtil.m(1.0f, f2, getHeight() + fDp2, f3));
                    canvas.drawRect(0.0f, f3 - getHeight(), getWidth(), getHeight() + fDp2, this.crossfadeFromPaint);
                    canvas.restore();
                    canvas.restore();
                }
            }
            if (this.hasTimer) {
                float fDp3 = AndroidUtilities.dp(6.0f) + getWidth();
                if (this.shareUsernameLayout != null) {
                    canvas.save();
                    canvas.translate(0.0f, fDp3);
                    if (this.shareUsernameLayout.getWidth() != getWidth()) {
                        setForShare(true);
                    }
                    this.shareUsernameLayout.draw(canvas);
                    canvas.restore();
                    return;
                }
                int i3 = (int) fDp3;
                int width = getWidth();
                int iDp = AndroidUtilities.dp(40.0f) + i3;
                AnonymousClass1 anonymousClass1 = this.timerTextDrawable;
                anonymousClass1.setBounds(0, i3, width, iDp);
                anonymousClass1.draw(canvas);
            }
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (i == i3 && i2 == i4) {
                return;
            }
            Bitmap bitmap = this.backgroundBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.backgroundBitmap = null;
            }
            Paint paint = new Paint(1);
            paint.setColor(-1);
            float fDp = AndroidUtilities.dp(4.0f);
            float f = SHADOW_SIZE;
            paint.setShadowLayer(fDp, 0.0f, f, 251658240);
            this.backgroundBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.backgroundBitmap);
            float f2 = i;
            RectF rectF = new RectF(f, f, f2 - f, getHeight() - f);
            float f3 = RADIUS;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            if (this.setData) {
                Utilities.themeQueue.postRunnable(new QrActivity$QrView$$ExternalSyntheticLambda1(this, i, i2, 1));
            }
            float fMax = Math.max((getWidth() * 1.0f) / this.gradientDrawable.currentBitmap.getWidth(), (getHeight() * 1.0f) / this.gradientDrawable.currentBitmap.getHeight());
            Matrix matrix = new Matrix();
            matrix.setScale(fMax, fMax);
            this.gradientShader.setLocalMatrix(matrix);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(fMax, fMax);
            matrix2.postTranslate(f2 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
            this.gradientTextShader.setLocalMatrix(matrix2);
        }

        public final void prepareContent(int i, int i2) {
            String upperCase;
            float f;
            int i3;
            int imageSize;
            StaticLayout staticLayoutCreateStaticLayout;
            int i4;
            Drawable drawable;
            Integer num;
            if (i == 0 || i2 == 0) {
                return;
            }
            if ((TextUtils.isEmpty(this.username) && !this.hasTimer) || TextUtils.isEmpty(this.link)) {
                AndroidUtilities.runOnUIThread(new QrActivity$QrView$$ExternalSyntheticLambda0(this, 1));
                return;
            }
            if (this.hasTimer) {
                upperCase = null;
            } else {
                upperCase = this.isPhone ? this.username : this.username.toUpperCase();
            }
            if (TextUtils.equals(upperCase, this.hadUserText) && TextUtils.equals(this.link, this.hadLink) && (num = this.hadWidth) != null && this.hadHeight != null && num.intValue() == i && this.hadHeight.intValue() == i2) {
                return;
            }
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            TextPaint textPaint = new TextPaint(65);
            int i5 = -16777216;
            textPaint.setColor(-16777216);
            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            int i6 = 2;
            int iM$3 = OKLCH.m$3(20.0f, 2, bitmapCreateBitmap.getWidth());
            if (this.hasTimer) {
                f = 30.0f;
                i3 = 2;
                imageSize = 0;
                staticLayoutCreateStaticLayout = null;
            } else {
                int i7 = 0;
                while (true) {
                    if (i7 <= i6) {
                        if (i7 == 0) {
                            drawable = getContext().getDrawable(R.drawable.qr_at_large);
                            textPaint.setTextSize(AndroidUtilities.dp(30.0f));
                        } else if (i7 == 1) {
                            drawable = getContext().getDrawable(R.drawable.qr_at_medium);
                            textPaint.setTextSize(AndroidUtilities.dp(25.0f));
                        } else {
                            drawable = getContext().getDrawable(R.drawable.qr_at_small);
                            textPaint.setTextSize(AndroidUtilities.dp(19.0f));
                        }
                        if (drawable != null) {
                            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            drawable.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzil.m(" ", upperCase));
                        if (!this.isPhone) {
                            spannableStringBuilder.setSpan(new SettingsSearchCell.VerticalImageSpan(drawable), 0, 1, 33);
                        }
                        float fMeasureText = textPaint.measureText(spannableStringBuilder, 1, spannableStringBuilder.length()) + drawable.getBounds().width();
                        if (i7 > 1 || fMeasureText <= iM$3) {
                            int i8 = fMeasureText > ((float) iM$3) ? 2 : 1;
                            int iDp = i8 > 1 ? AndroidUtilities.dp(2.0f) + (((int) (drawable.getBounds().width() + fMeasureText)) / 2) : iM$3;
                            if (iDp > iM$3) {
                                iDp = AndroidUtilities.dp(4.0f) + (((int) (fMeasureText + drawable.getBounds().width())) / 3);
                                i8 = 3;
                            }
                            int i9 = iDp;
                            imageSize = 0;
                            f = 30.0f;
                            i3 = 2;
                            staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, textPaint, i9, Layout.Alignment.ALIGN_CENTER, 0.0f, false, null, Math.min(AndroidUtilities.dp(10.0f) + i9, bitmapCreateBitmap.getWidth()), i8, true);
                        } else {
                            i7++;
                            i5 = -16777216;
                            i6 = 2;
                        }
                    } else {
                        f = 30.0f;
                        i3 = 2;
                        imageSize = 0;
                        staticLayoutCreateStaticLayout = null;
                    }
                }
            }
            float lineCount = (staticLayoutCreateStaticLayout == null ? 0 : staticLayoutCreateStaticLayout.getLineCount()) * (textPaint.descent() - textPaint.ascent());
            int iM$4 = OKLCH.m$3(f, i3, i);
            HashMap map = new HashMap();
            map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            map.put(EncodeHintType.MARGIN, Integer.valueOf(imageSize));
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            int i10 = 3;
            Bitmap bitmapEncode = null;
            while (true) {
                if (i10 >= 5) {
                    i4 = -16777216;
                    break;
                }
                try {
                    map.put(EncodeHintType.QR_VERSION, Integer.valueOf(i10));
                    bitmapEncode = telegramQRCodeWriter.encode(this.link, iM$4, iM$4, map, null, 0.75f, 16777215, -16777216);
                    i4 = -16777216;
                    try {
                        imageSize = telegramQRCodeWriter.getImageSize();
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    i4 = -16777216;
                }
                if (bitmapEncode != null) {
                    break;
                } else {
                    i10++;
                }
            }
            final int i11 = imageSize;
            if (bitmapEncode == null) {
                return;
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(16777215);
            float width = (i - bitmapEncode.getWidth()) / 2.0f;
            float f2 = i2;
            float f3 = 0.15f * f2;
            if (staticLayoutCreateStaticLayout != null && staticLayoutCreateStaticLayout.getLineCount() == 3) {
                f3 = 0.13f * f2;
            }
            if (((ViewGroup) getParent()).getMeasuredWidth() >= ((ViewGroup) getParent()).getMeasuredHeight()) {
                f3 = 0.09f * f2;
            }
            canvas.drawBitmap(bitmapEncode, width, f3, new Paint(3));
            Paint paint = new Paint(1);
            paint.setColor(i4);
            final float width2 = (bitmapEncode.getWidth() * 0.5f) + width;
            final float width3 = (bitmapEncode.getWidth() * 0.5f) + f3;
            canvas.drawCircle(width2, width3, i11 * 0.5f, paint);
            if (staticLayoutCreateStaticLayout != null) {
                float width4 = (canvas.getWidth() - staticLayoutCreateStaticLayout.getWidth()) * 0.5f;
                float height = ((((canvas.getHeight() - (f3 + bitmapEncode.getHeight())) - lineCount) * 0.5f) + (bitmapEncode.getHeight() + f3)) - AndroidUtilities.dp(4.0f);
                canvas.save();
                canvas.translate(width4, height);
                staticLayoutCreateStaticLayout.draw(canvas);
                canvas.restore();
                bitmapEncode.recycle();
            }
            this.hadWidth = Integer.valueOf(i);
            this.hadHeight = Integer.valueOf(i2);
            this.hadUserText = upperCase;
            this.hadLink = this.link;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    QrActivity.QrView qrView = this.f$0;
                    Bitmap bitmap = qrView.contentBitmap;
                    qrView.contentBitmap = bitmapCreateBitmap.extractAlpha();
                    if (!qrView.firstPrepare) {
                        qrView.contentBitmapAlpha.set(0.0f, true);
                    }
                    qrView.firstPrepare = false;
                    Bitmap bitmap2 = qrView.oldContentBitmap;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    qrView.oldContentBitmap = bitmap;
                    QrActivity$$ExternalSyntheticLambda1 qrActivity$$ExternalSyntheticLambda1 = qrView.centerChangedListener;
                    if (qrActivity$$ExternalSyntheticLambda1 != null) {
                        float f4 = i11 * 0.5f;
                        float f5 = width2;
                        float f6 = width3;
                        QrActivity qrActivity = qrActivity$$ExternalSyntheticLambda1.f$0;
                        qrActivity.logoRect.set((int) (f5 - f4), (int) (f6 - f4), (int) (f5 + f4), (int) (f6 + f4));
                        qrActivity.qrView.requestLayout();
                        qrView.logoCenterSet = true;
                    }
                    qrView.invalidate();
                }
            });
        }

        public final void setData(String str, String str2, boolean z, boolean z2) {
            this.setData = true;
            this.username = str2;
            this.isPhone = z;
            if (z2) {
                TLRPC.TL_exportedContactToken cachedContactToken = MessagesController.getInstance(UserConfig.selectedAccount).getCachedContactToken();
                if (cachedContactToken != null) {
                    this.link = cachedContactToken.url;
                    this.linkExpires = cachedContactToken.expires;
                } else {
                    this.link = null;
                }
            } else {
                this.link = str;
            }
            this.hasTimer = z2;
            Utilities.themeQueue.postRunnable(new QrActivity$QrView$$ExternalSyntheticLambda1(this, getWidth(), getHeight(), 0));
            invalidate();
            this.checkTimerToken.run();
        }

        public final void setForShare(boolean z) {
            if (this.hasTimer) {
                if (!z) {
                    this.shareUsernameLayout = null;
                    return;
                }
                if (this.shareUsernameLayoutPaint == null) {
                    this.shareUsernameLayoutPaint = new TextPaint(1);
                }
                this.shareUsernameLayoutPaint.setShader(this.gradientTextShader);
                this.shareUsernameLayoutPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                this.shareUsernameLayoutPaint.setTextSize(AndroidUtilities.dp(25.0f));
                String str = this.username;
                if (str == null) {
                    str = "";
                }
                this.shareUsernameLayout = StaticLayoutEx.createStaticLayout(Emoji.replaceEmoji(str, this.shareUsernameLayoutPaint.getFontMetricsInt(), false), this.shareUsernameLayoutPaint, getWidth(), Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1, true);
            }
        }
    }

    public final class ThemeListViewController implements NotificationCenter.NotificationCenterDelegate {
        public final ChatThemeBottomSheet.Adapter adapter;
        public final Drawable backgroundDrawable;
        public final View bottomShadow;
        public StoryRecorder.AnonymousClass31 changeDayNightView;
        public ValueAnimator changeDayNightViewAnimator;
        public float changeDayNightViewProgress;
        public final RLottieDrawable darkThemeDrawable;
        public final AnonymousClass3 darkThemeView;
        public boolean forceDark;
        public final QrActivity fragment;
        public boolean isLightDarkChangeAnimation;
        public QrActivity$$ExternalSyntheticLambda1 itemSelectedListener;
        public LinearLayoutManager layoutManager;
        public boolean prevIsPortrait;
        public final FlickerLoadingView progressView;
        public final RecyclerListView recyclerView;
        public final IntroActivity.AnonymousClass1 rootLayout;
        public final TextView scanButton;
        public final ImageView scanButtonIcon;
        public final LinearLayout scanButtonWrap;
        public final AnonymousClass1 scroller;
        public ChatThemeBottomSheet.ChatThemeItem selectedItem;
        public final TextView shareButton;
        public final TextView titleView;
        public final View topShadow;
        public final Window window;
        public final Paint backgroundPaint = new Paint(1);
        public int prevSelectedPosition = -1;

        public final class AnonymousClass1 extends LinearSmoothScroller {
            @Override
            public final int calculateTimeForScrolling(int i) {
                return super.calculateTimeForScrolling(i) * 6;
            }
        }

        public ThemeListViewController(QrActivity qrActivity, Window window) {
            LinearLayoutManager gridLayoutManager;
            this.fragment = qrActivity;
            this.window = window;
            Activity parentActivity = qrActivity.getParentActivity();
            this.scroller = new AnonymousClass1(parentActivity);
            Drawable drawableMutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            this.backgroundDrawable = drawableMutate;
            int themedColor = qrActivity.getThemedColor(Theme.key_dialogBackground);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, parentActivity, qrActivity);
            this.rootLayout = anonymousClass1;
            TextView textView = new TextView(parentActivity);
            this.titleView = textView;
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setTextColor(qrActivity.getThemedColor(Theme.key_dialogTextBlack));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            anonymousClass1.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
            int i = Theme.key_featuredStickers_addButton;
            int themedColor2 = qrActivity.getThemedColor(i);
            int iDp = AndroidUtilities.dp(28.0f);
            int i2 = R.raw.sun_outline;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), iDp, iDp, false, null);
            this.darkThemeDrawable = rLottieDrawable;
            this.forceDark = !Theme.currentTheme.isDark();
            setForceDark(Theme.currentTheme.isDark(), false);
            rLottieDrawable.playInDirectionOfCustomEndFrame = true;
            rLottieDrawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
            ?? r8 = new RLottieImageView(parentActivity) {
                @Override
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    if (QrActivity.this.isCurrentThemeDark) {
                        accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToDayTheme));
                    } else {
                        accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToNightTheme));
                    }
                }
            };
            this.darkThemeView = r8;
            r8.setAnimation(rLottieDrawable);
            r8.setScaleType(ImageView.ScaleType.CENTER);
            r8.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 26));
            r8.setAlpha(0.0f);
            r8.setVisibility(4);
            anonymousClass1.addView((View) r8, LayoutHelper.createFrame(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(parentActivity, qrActivity.resourcesProvider);
            this.progressView = flickerLoadingView;
            flickerLoadingView.setVisibility(0);
            anonymousClass1.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
            this.prevIsPortrait = true;
            RecyclerListView recyclerListView = new RecyclerListView(parentActivity, null);
            this.recyclerView = recyclerListView;
            ChatThemeBottomSheet.Adapter adapter = new ChatThemeBottomSheet.Adapter(((BaseFragment) QrActivity.this).currentAccount, 0L, QrActivity.this.resourcesProvider, 2);
            this.adapter = adapter;
            recyclerListView.setAdapter(adapter);
            recyclerListView.setClipChildren(false);
            recyclerListView.setClipToPadding(false);
            recyclerListView.setItemAnimator(null);
            recyclerListView.setNestedScrollingEnabled(false);
            if (this.prevIsPortrait) {
                qrActivity.getParentActivity();
                gridLayoutManager = new LinearLayoutManager(0, false);
            } else {
                qrActivity.getParentActivity();
                gridLayoutManager = new GridLayoutManager(3, false);
            }
            this.layoutManager = gridLayoutManager;
            recyclerListView.setLayoutManager(gridLayoutManager);
            recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 2));
            recyclerListView.setOnScrollListener(new TrendingStickersAlert.AnonymousClass1(this));
            anonymousClass1.addView(recyclerListView);
            View view = new View(parentActivity);
            this.topShadow = view;
            view.setAlpha(0.0f);
            int i3 = R.drawable.shadowdown;
            view.setBackground(parentActivity.getDrawable(i3));
            view.setRotation(180.0f);
            anonymousClass1.addView(view);
            View view2 = new View(parentActivity);
            this.bottomShadow = view2;
            view2.setBackground(parentActivity.getDrawable(i3));
            anonymousClass1.addView(view2);
            TextView textView2 = new TextView(parentActivity);
            this.shareButton = textView2;
            int themedColor3 = qrActivity.getThemedColor(i);
            textView2.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, themedColor3, Theme.AdaptiveRipple.calcRippleColor(themedColor3)));
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            textView2.setGravity(17);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setText(LocaleController.getString(R.string.ShareQrCode));
            textView2.setTextColor(qrActivity.getThemedColor(Theme.key_featuredStickers_buttonText));
            textView2.setTextSize(1, 15.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            anonymousClass1.addView(textView2);
            if (UserConfig.getInstance(((BaseFragment) QrActivity.this).currentAccount).getClientUserId() != QrActivity.this.userId) {
                this.scanButtonWrap = null;
                this.scanButtonIcon = null;
                this.scanButton = null;
                return;
            }
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.scanButtonWrap = linearLayout;
            linearLayout.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, 0, ColorUtils.setAlphaComponent(Theme.AdaptiveRipple.calcRippleColor(qrActivity.getThemedColor(i)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.scanButtonIcon = imageView;
            imageView.setLayoutParams(LayoutHelper.createLinear(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(qrActivity.getThemedColor(i), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.scanButton = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(qrActivity.getThemedColor(i));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            anonymousClass1.addView(linearLayout);
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.emojiLoaded) {
                this.adapter.mObservable.notifyChanged();
            }
        }

        public final void setForceDark(boolean z, boolean z2) {
            if (this.forceDark == z) {
                return;
            }
            this.forceDark = z;
            RLottieDrawable rLottieDrawable = this.darkThemeDrawable;
            int i = z ? rLottieDrawable.metaData[0] - 1 : 0;
            AnonymousClass3 anonymousClass3 = this.darkThemeView;
            if (z2) {
                rLottieDrawable.setCustomEndFrame(i);
                if (anonymousClass3 != null) {
                    anonymousClass3.playAnimation();
                    return;
                }
                return;
            }
            rLottieDrawable.setCustomEndFrame(i);
            rLottieDrawable.setCurrentFrame(i, false, true);
            if (anonymousClass3 != null) {
                anonymousClass3.invalidate();
            }
        }
    }

    static {
        ArrayMap arrayMap = new ArrayMap(0);
        qrColorsMap = arrayMap;
        arrayMap.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        arrayMap.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        arrayMap.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        arrayMap.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        arrayMap.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        arrayMap.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        arrayMap.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        arrayMap.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        arrayMap.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        arrayMap.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        arrayMap.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        arrayMap.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        arrayMap.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        arrayMap.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        arrayMap.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        arrayMap.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        arrayMap.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        arrayMap.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
        firstOpen = true;
    }

    public QrActivity(Bundle bundle) {
        super(bundle);
        this.resourcesProvider = new PhotoViewer.AnonymousClass14(this);
        EmojiThemes emojiThemes = new EmojiThemes(this.currentAccount);
        emojiThemes.emoji = "🏠";
        emojiThemes.key = new ThemeKey("🏠", null);
        emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("🏠");
        EmojiThemes.ThemeItem themeItem = new EmojiThemes.ThemeItem();
        HashMap map = Theme.themesDict;
        themeItem.themeInfo = (Theme.ThemeInfo) map.get("Blue");
        themeItem.accentId = 99;
        ArrayList arrayList = emojiThemes.items;
        arrayList.add(themeItem);
        EmojiThemes.ThemeItem themeItem2 = new EmojiThemes.ThemeItem();
        themeItem2.themeInfo = (Theme.ThemeInfo) map.get("Dark Blue");
        themeItem2.accentId = 0;
        arrayList.add(themeItem2);
        this.homeTheme = emojiThemes;
        this.logoRect = new Rect();
        this.emojiThemeDarkIcons = new ArrayMap(0);
        this.prevQrColors = null;
        this.currMotionDrawable = new MotionBackgroundDrawable();
        this.currentTheme = emojiThemes;
        this.selectedPosition = -1;
        this.insets = Insets.NONE;
    }

    public static void openCameraScanActivity(BaseFragment baseFragment) {
        CameraScanActivity.showAsSheet(baseFragment.getParentActivity(), 1, new AnonymousClass5(baseFragment.getCurrentAccount(), baseFragment));
    }

    @Override
    public final View createView(Context context) {
        long j;
        TLRPC.Chat chat;
        String publicUsername;
        String userName;
        ImageLocation forChat;
        AvatarDrawable avatarDrawable;
        ImageLocation imageLocation;
        boolean z;
        boolean z2;
        String strM;
        LinearLayout linearLayout;
        long j2;
        char c;
        final int i = 2;
        final int i2 = 1;
        setHasOwnBackground(true);
        this.isCurrentThemeDark = Theme.currentTheme.isDark();
        final int i3 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.setItemsColor(-1, false);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i3, context, this);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, context, i3);
        this.backgroundView = anonymousClass2;
        anonymousClass1.addView(anonymousClass2);
        long j3 = 0;
        if (this.userId == 0) {
            j = 0;
            if (this.chatId != 0 && (chat = getMessagesController().getChat(Long.valueOf(this.chatId))) != null) {
                publicUsername = ChatObject.getPublicUsername(chat);
                AvatarDrawable avatarDrawable2 = new AvatarDrawable(chat);
                ImageLocation forChat2 = ImageLocation.getForChat(this.currentAccount, chat, 1);
                userName = null;
                forChat = ImageLocation.getForChat(this.currentAccount, chat, 0);
                avatarDrawable = avatarDrawable2;
                imageLocation = forChat2;
            }
            z = false;
            z2 = false;
            QrView qrView = new QrView(context);
            this.qrView = qrView;
            qrView.gradientDrawable.setColors(-9324972, -13856649, -6636738, -9915042, 0, true);
            qrView.invalidate();
            if (publicUsername != null) {
                strM = SurfaceContainer$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
            } else {
                strM = null;
            }
            QrView qrView2 = this.qrView;
            if (userName != null) {
                publicUsername = userName;
            }
            qrView2.setData(strM, publicUsername, z, z2);
            QrView qrView3 = this.qrView;
            qrView3.centerChangedListener = new QrActivity$$ExternalSyntheticLambda1(this);
            anonymousClass1.addView(qrView3);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.logoImageView = rLottieImageView;
            rLottieImageView.setAutoRepeat(true);
            this.logoImageView.setAnimation(R.raw.plane_logo_plain, 60, 60, null);
            this.logoImageView.playAnimation();
            anonymousClass1.addView(this.logoImageView);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(42.0f));
            BackupImageView backupImageView2 = this.avatarImageView;
            int iDp = AndroidUtilities.dp(84.0f);
            int iDp2 = AndroidUtilities.dp(84.0f);
            backupImageView2.width = iDp;
            backupImageView2.height = iDp2;
            backupImageView2.invalidate();
            anonymousClass1.addView(this.avatarImageView, LayoutHelper.createFrame(84, 84, 51));
            this.avatarImageView.setImage(forChat, "84_84", imageLocation, "50_50", avatarDrawable, null, 0, null);
            ImageView imageView = new ImageView(context);
            this.closeImageView = imageView;
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
            this.closeImageView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(34.0f), 671088640, 687865855));
            this.closeImageView.setImageResource(R.drawable.ic_ab_back);
            this.closeImageView.setScaleType(ImageView.ScaleType.CENTER);
            this.closeImageView.setOnClickListener(new View.OnClickListener(this) {
                public final QrActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$createView$1$12(view);
                            break;
                        case 1:
                            QrActivity qrActivity = this.f$0;
                            qrActivity.themesViewController.shareButton.setClickable(false);
                            qrActivity.performShare();
                            break;
                        default:
                            QrActivity qrActivity2 = this.f$0;
                            if (qrActivity2.getParentActivity() != null) {
                                if (Build.VERSION.SDK_INT >= 23 && qrActivity2.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    qrActivity2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                } else {
                                    CameraScanActivity.showAsSheet(qrActivity2.getParentActivity(), 1, new QrActivity.AnonymousClass5(qrActivity2.getCurrentAccount(), qrActivity2));
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            anonymousClass1.addView(this.closeImageView, LayoutHelper.createFrame(34.0f, 34));
            this.emojiThemeIcon = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.emojiThemeIcon);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight());
            Paint paint = new Paint(1);
            paint.setColor(-1);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini);
            canvas.drawBitmap(bitmapDecodeResource, (this.emojiThemeIcon.getWidth() - bitmapDecodeResource.getWidth()) * 0.5f, (this.emojiThemeIcon.getHeight() - bitmapDecodeResource.getHeight()) * 0.5f, paint);
            canvas.setBitmap(null);
            ThemeListViewController themeListViewController = new ThemeListViewController(this, getParentActivity().getWindow());
            this.themesViewController = themeListViewController;
            this.themeLayout = themeListViewController.rootLayout;
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.preloadAllWallpaperThumbs(true);
            chatThemeController.preloadAllWallpaperThumbs(false);
            chatThemeController.preloadAllWallpaperImages(true);
            chatThemeController.preloadAllWallpaperImages(false);
            NotificationCenter.getGlobalInstance().addObserver(themeListViewController, NotificationCenter.emojiLoaded);
            ThemeListViewController themeListViewController2 = this.themesViewController;
            themeListViewController2.itemSelectedListener = new QrActivity$$ExternalSyntheticLambda1(this);
            themeListViewController2.titleView.setText(LocaleController.getString(R.string.QrCode));
            this.themesViewController.progressView.setViewType(17);
            this.themesViewController.shareButton.setOnClickListener(new View.OnClickListener(this) {
                public final QrActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$createView$1$12(view);
                            break;
                        case 1:
                            QrActivity qrActivity = this.f$0;
                            qrActivity.themesViewController.shareButton.setClickable(false);
                            qrActivity.performShare();
                            break;
                        default:
                            QrActivity qrActivity2 = this.f$0;
                            if (qrActivity2.getParentActivity() != null) {
                                if (Build.VERSION.SDK_INT >= 23 && qrActivity2.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    qrActivity2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                } else {
                                    CameraScanActivity.showAsSheet(qrActivity2.getParentActivity(), 1, new QrActivity.AnonymousClass5(qrActivity2.getCurrentAccount(), qrActivity2));
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            linearLayout = this.themesViewController.scanButtonWrap;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final QrActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i) {
                            case 0:
                                this.f$0.lambda$createView$1$12(view);
                                break;
                            case 1:
                                QrActivity qrActivity = this.f$0;
                                qrActivity.themesViewController.shareButton.setClickable(false);
                                qrActivity.performShare();
                                break;
                            default:
                                QrActivity qrActivity2 = this.f$0;
                                if (qrActivity2.getParentActivity() != null) {
                                    if (Build.VERSION.SDK_INT >= 23 && qrActivity2.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                        qrActivity2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                    } else {
                                        CameraScanActivity.showAsSheet(qrActivity2.getParentActivity(), 1, new QrActivity.AnonymousClass5(qrActivity2.getCurrentAccount(), qrActivity2));
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            anonymousClass1.addView(this.themeLayout, LayoutHelper.createFrame(-1, -2, 80));
            this.currMotionDrawable.isIndeterminateAnimation = true;
            this.fragmentView = anonymousClass1;
            Utilities.themeQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda6(this, i3), 25L);
            View view = this.fragmentView;
            QrActivity$$ExternalSyntheticLambda6 qrActivity$$ExternalSyntheticLambda6 = new QrActivity$$ExternalSyntheticLambda6(this, 5);
            if (firstOpen) {
                j2 = 250;
            } else {
                j2 = j;
            }
            view.postDelayed(qrActivity$$ExternalSyntheticLambda6, j2);
            this.prevSystemUiVisibility = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
            if (getParentActivity() != null) {
                getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility | 1028);
            }
            View view2 = this.fragmentView;
            QrActivity$$ExternalSyntheticLambda1 qrActivity$$ExternalSyntheticLambda1 = new QrActivity$$ExternalSyntheticLambda1(this);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view2, qrActivity$$ExternalSyntheticLambda1);
            return this.fragmentView;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.userId));
        if (user != null) {
            publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername == null) {
                userName = UserObject.getUserName(user);
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
                if (privacyRules == null) {
                    j = 0;
                } else {
                    int i4 = 0;
                    while (true) {
                        if (i4 < privacyRules.size()) {
                            TLRPC.PrivacyRule privacyRule = privacyRules.get(i4);
                            j = j3;
                            if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                c = 0;
                                break;
                            }
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                    c = 1;
                                    break;
                                }
                                i4++;
                                j3 = j;
                            }
                        } else {
                            j = j3;
                        }
                        c = 2;
                        break;
                    }
                    if (c != 2) {
                        if (c != 0 || c == 1) {
                            publicUsername = user.phone;
                            if (publicUsername != null && !publicUsername.startsWith("+")) {
                                publicUsername = "+".concat(publicUsername);
                            }
                            z = true;
                        }
                        AvatarDrawable avatarDrawable3 = new AvatarDrawable(user);
                        ImageLocation forUser = ImageLocation.getForUser(this.currentAccount, user, 1);
                        forChat = ImageLocation.getForUser(this.currentAccount, user, 0);
                        avatarDrawable = avatarDrawable3;
                        imageLocation = forUser;
                    } else {
                        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
                        if (privacyRules2 != null && privacyRules2.size() != 0) {
                            int i5 = 0;
                            while (true) {
                                if (i5 < privacyRules2.size()) {
                                    TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i5);
                                    if (!(privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll)) {
                                        if (!(privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll) && !(privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts)) {
                                            i5++;
                                        }
                                    }
                                } else if (c != 0) {
                                }
                            }
                        }
                        publicUsername = user.phone;
                        if (publicUsername != null) {
                            publicUsername = "+".concat(publicUsername);
                        }
                        z = true;
                    }
                }
                z = false;
                z2 = true;
                AvatarDrawable avatarDrawable4 = new AvatarDrawable(user);
                ImageLocation forUser2 = ImageLocation.getForUser(this.currentAccount, user, 1);
                forChat = ImageLocation.getForUser(this.currentAccount, user, 0);
                avatarDrawable = avatarDrawable4;
                imageLocation = forUser2;
            } else {
                j = 0;
                userName = null;
                z = false;
            }
            z2 = false;
            AvatarDrawable avatarDrawable5 = new AvatarDrawable(user);
            ImageLocation forUser3 = ImageLocation.getForUser(this.currentAccount, user, 1);
            forChat = ImageLocation.getForUser(this.currentAccount, user, 0);
            avatarDrawable = avatarDrawable5;
            imageLocation = forUser3;
        } else {
            j = 0;
        }
        QrView qrView4 = new QrView(context);
        this.qrView = qrView4;
        qrView4.gradientDrawable.setColors(-9324972, -13856649, -6636738, -9915042, 0, true);
        qrView4.invalidate();
        if (publicUsername != null) {
            strM = SurfaceContainer$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
        } else {
            strM = null;
        }
        QrView qrView5 = this.qrView;
        if (userName != null) {
            publicUsername = userName;
        }
        qrView5.setData(strM, publicUsername, z, z2);
        QrView qrView6 = this.qrView;
        qrView6.centerChangedListener = new QrActivity$$ExternalSyntheticLambda1(this);
        anonymousClass1.addView(qrView6);
        RLottieImageView rLottieImageView2 = new RLottieImageView(context);
        this.logoImageView = rLottieImageView2;
        rLottieImageView2.setAutoRepeat(true);
        this.logoImageView.setAnimation(R.raw.plane_logo_plain, 60, 60, null);
        this.logoImageView.playAnimation();
        anonymousClass1.addView(this.logoImageView);
        BackupImageView backupImageView3 = new BackupImageView(context);
        this.avatarImageView = backupImageView3;
        backupImageView3.setRoundRadius(AndroidUtilities.dp(42.0f));
        BackupImageView backupImageView4 = this.avatarImageView;
        int iDp3 = AndroidUtilities.dp(84.0f);
        int iDp4 = AndroidUtilities.dp(84.0f);
        backupImageView4.width = iDp3;
        backupImageView4.height = iDp4;
        backupImageView4.invalidate();
        anonymousClass1.addView(this.avatarImageView, LayoutHelper.createFrame(84, 84, 51));
        this.avatarImageView.setImage(forChat, "84_84", imageLocation, "50_50", avatarDrawable, null, 0, null);
        ImageView imageView2 = new ImageView(context);
        this.closeImageView = imageView2;
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.closeImageView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.closeImageView.setImageResource(R.drawable.ic_ab_back);
        this.closeImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.closeImageView.setOnClickListener(new View.OnClickListener(this) {
            public final QrActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$createView$1$12(view3);
                        break;
                    case 1:
                        QrActivity qrActivity = this.f$0;
                        qrActivity.themesViewController.shareButton.setClickable(false);
                        qrActivity.performShare();
                        break;
                    default:
                        QrActivity qrActivity2 = this.f$0;
                        if (qrActivity2.getParentActivity() != null) {
                            if (Build.VERSION.SDK_INT >= 23 && qrActivity2.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                qrActivity2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                            } else {
                                CameraScanActivity.showAsSheet(qrActivity2.getParentActivity(), 1, new QrActivity.AnonymousClass5(qrActivity2.getCurrentAccount(), qrActivity2));
                            }
                            break;
                        }
                        break;
                }
            }
        });
        anonymousClass1.addView(this.closeImageView, LayoutHelper.createFrame(34.0f, 34));
        this.emojiThemeIcon = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.emojiThemeIcon);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight());
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini);
        canvas2.drawBitmap(bitmapDecodeResource2, (this.emojiThemeIcon.getWidth() - bitmapDecodeResource2.getWidth()) * 0.5f, (this.emojiThemeIcon.getHeight() - bitmapDecodeResource2.getHeight()) * 0.5f, paint2);
        canvas2.setBitmap(null);
        ThemeListViewController themeListViewController3 = new ThemeListViewController(this, getParentActivity().getWindow());
        this.themesViewController = themeListViewController3;
        this.themeLayout = themeListViewController3.rootLayout;
        ChatThemeController chatThemeController2 = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController2.preloadAllWallpaperThumbs(true);
        chatThemeController2.preloadAllWallpaperThumbs(false);
        chatThemeController2.preloadAllWallpaperImages(true);
        chatThemeController2.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(themeListViewController3, NotificationCenter.emojiLoaded);
        ThemeListViewController themeListViewController4 = this.themesViewController;
        themeListViewController4.itemSelectedListener = new QrActivity$$ExternalSyntheticLambda1(this);
        themeListViewController4.titleView.setText(LocaleController.getString(R.string.QrCode));
        this.themesViewController.progressView.setViewType(17);
        this.themesViewController.shareButton.setOnClickListener(new View.OnClickListener(this) {
            public final QrActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$createView$1$12(view3);
                        break;
                    case 1:
                        QrActivity qrActivity = this.f$0;
                        qrActivity.themesViewController.shareButton.setClickable(false);
                        qrActivity.performShare();
                        break;
                    default:
                        QrActivity qrActivity2 = this.f$0;
                        if (qrActivity2.getParentActivity() != null) {
                            if (Build.VERSION.SDK_INT >= 23 && qrActivity2.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                qrActivity2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                            } else {
                                CameraScanActivity.showAsSheet(qrActivity2.getParentActivity(), 1, new QrActivity.AnonymousClass5(qrActivity2.getCurrentAccount(), qrActivity2));
                            }
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout = this.themesViewController.scanButtonWrap;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final QrActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$createView$1$12(view3);
                            break;
                        case 1:
                            QrActivity qrActivity = this.f$0;
                            qrActivity.themesViewController.shareButton.setClickable(false);
                            qrActivity.performShare();
                            break;
                        default:
                            QrActivity qrActivity2 = this.f$0;
                            if (qrActivity2.getParentActivity() != null) {
                                if (Build.VERSION.SDK_INT >= 23 && qrActivity2.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    qrActivity2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                } else {
                                    CameraScanActivity.showAsSheet(qrActivity2.getParentActivity(), 1, new QrActivity.AnonymousClass5(qrActivity2.getCurrentAccount(), qrActivity2));
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        anonymousClass1.addView(this.themeLayout, LayoutHelper.createFrame(-1, -2, 80));
        this.currMotionDrawable.isIndeterminateAnimation = true;
        this.fragmentView = anonymousClass1;
        Utilities.themeQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda6(this, i3), 25L);
        View view3 = this.fragmentView;
        QrActivity$$ExternalSyntheticLambda6 qrActivity$$ExternalSyntheticLambda7 = new QrActivity$$ExternalSyntheticLambda6(this, 5);
        if (firstOpen) {
            j2 = 250;
        } else {
            j2 = j;
        }
        view3.postDelayed(qrActivity$$ExternalSyntheticLambda7, j2);
        this.prevSystemUiVisibility = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility | 1028);
        }
        View view4 = this.fragmentView;
        QrActivity$$ExternalSyntheticLambda1 qrActivity$$ExternalSyntheticLambda2 = new QrActivity$$ExternalSyntheticLambda1(this);
        WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view4, qrActivity$$ExternalSyntheticLambda2);
        return this.fragmentView;
        publicUsername = null;
        userName = null;
        forChat = null;
        imageLocation = null;
        avatarDrawable = null;
        z = false;
        z2 = false;
        QrView qrView7 = new QrView(context);
        this.qrView = qrView7;
        qrView7.gradientDrawable.setColors(-9324972, -13856649, -6636738, -9915042, 0, true);
        qrView7.invalidate();
        if (publicUsername != null) {
            strM = SurfaceContainer$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
        } else {
            strM = null;
        }
        QrView qrView8 = this.qrView;
        if (userName != null) {
            publicUsername = userName;
        }
        qrView8.setData(strM, publicUsername, z, z2);
        QrView qrView9 = this.qrView;
        qrView9.centerChangedListener = new QrActivity$$ExternalSyntheticLambda1(this);
        anonymousClass1.addView(qrView9);
        RLottieImageView rLottieImageView3 = new RLottieImageView(context);
        this.logoImageView = rLottieImageView3;
        rLottieImageView3.setAutoRepeat(true);
        this.logoImageView.setAnimation(R.raw.plane_logo_plain, 60, 60, null);
        this.logoImageView.playAnimation();
        anonymousClass1.addView(this.logoImageView);
        BackupImageView backupImageView5 = new BackupImageView(context);
        this.avatarImageView = backupImageView5;
        backupImageView5.setRoundRadius(AndroidUtilities.dp(42.0f));
        BackupImageView backupImageView6 = this.avatarImageView;
        int iDp5 = AndroidUtilities.dp(84.0f);
        int iDp6 = AndroidUtilities.dp(84.0f);
        backupImageView6.width = iDp5;
        backupImageView6.height = iDp6;
        backupImageView6.invalidate();
        anonymousClass1.addView(this.avatarImageView, LayoutHelper.createFrame(84, 84, 51));
        this.avatarImageView.setImage(forChat, "84_84", imageLocation, "50_50", avatarDrawable, null, 0, null);
        ImageView imageView3 = new ImageView(context);
        this.closeImageView = imageView3;
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.closeImageView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.closeImageView.setImageResource(R.drawable.ic_ab_back);
        this.closeImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.closeImageView.setOnClickListener(new View.OnClickListener(this) {
            public final QrActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$createView$1$12(view5);
                        break;
                    case 1:
                        QrActivity qrActivity = this.f$0;
                        qrActivity.themesViewController.shareButton.setClickable(false);
                        qrActivity.performShare();
                        break;
                    default:
                        QrActivity qrActivity2 = this.f$0;
                        if (qrActivity2.getParentActivity() != null) {
                            if (Build.VERSION.SDK_INT >= 23 && qrActivity2.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                qrActivity2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                            } else {
                                CameraScanActivity.showAsSheet(qrActivity2.getParentActivity(), 1, new QrActivity.AnonymousClass5(qrActivity2.getCurrentAccount(), qrActivity2));
                            }
                            break;
                        }
                        break;
                }
            }
        });
        anonymousClass1.addView(this.closeImageView, LayoutHelper.createFrame(34.0f, 34));
        this.emojiThemeIcon = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas3 = new Canvas(this.emojiThemeIcon);
        RectF rectF3 = AndroidUtilities.rectTmp;
        rectF3.set(0.0f, 0.0f, this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight());
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint3);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini);
        canvas3.drawBitmap(bitmapDecodeResource3, (this.emojiThemeIcon.getWidth() - bitmapDecodeResource3.getWidth()) * 0.5f, (this.emojiThemeIcon.getHeight() - bitmapDecodeResource3.getHeight()) * 0.5f, paint3);
        canvas3.setBitmap(null);
        ThemeListViewController themeListViewController5 = new ThemeListViewController(this, getParentActivity().getWindow());
        this.themesViewController = themeListViewController5;
        this.themeLayout = themeListViewController5.rootLayout;
        ChatThemeController chatThemeController3 = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController3.preloadAllWallpaperThumbs(true);
        chatThemeController3.preloadAllWallpaperThumbs(false);
        chatThemeController3.preloadAllWallpaperImages(true);
        chatThemeController3.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(themeListViewController5, NotificationCenter.emojiLoaded);
        ThemeListViewController themeListViewController6 = this.themesViewController;
        themeListViewController6.itemSelectedListener = new QrActivity$$ExternalSyntheticLambda1(this);
        themeListViewController6.titleView.setText(LocaleController.getString(R.string.QrCode));
        this.themesViewController.progressView.setViewType(17);
        this.themesViewController.shareButton.setOnClickListener(new View.OnClickListener(this) {
            public final QrActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$createView$1$12(view5);
                        break;
                    case 1:
                        QrActivity qrActivity = this.f$0;
                        qrActivity.themesViewController.shareButton.setClickable(false);
                        qrActivity.performShare();
                        break;
                    default:
                        QrActivity qrActivity2 = this.f$0;
                        if (qrActivity2.getParentActivity() != null) {
                            if (Build.VERSION.SDK_INT >= 23 && qrActivity2.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                qrActivity2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                            } else {
                                CameraScanActivity.showAsSheet(qrActivity2.getParentActivity(), 1, new QrActivity.AnonymousClass5(qrActivity2.getCurrentAccount(), qrActivity2));
                            }
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout = this.themesViewController.scanButtonWrap;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final QrActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view5) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$createView$1$12(view5);
                            break;
                        case 1:
                            QrActivity qrActivity = this.f$0;
                            qrActivity.themesViewController.shareButton.setClickable(false);
                            qrActivity.performShare();
                            break;
                        default:
                            QrActivity qrActivity2 = this.f$0;
                            if (qrActivity2.getParentActivity() != null) {
                                if (Build.VERSION.SDK_INT >= 23 && qrActivity2.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    qrActivity2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                } else {
                                    CameraScanActivity.showAsSheet(qrActivity2.getParentActivity(), 1, new QrActivity.AnonymousClass5(qrActivity2.getCurrentAccount(), qrActivity2));
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        anonymousClass1.addView(this.themeLayout, LayoutHelper.createFrame(-1, -2, 80));
        this.currMotionDrawable.isIndeterminateAnimation = true;
        this.fragmentView = anonymousClass1;
        Utilities.themeQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda6(this, i3), 25L);
        View view5 = this.fragmentView;
        QrActivity$$ExternalSyntheticLambda6 qrActivity$$ExternalSyntheticLambda8 = new QrActivity$$ExternalSyntheticLambda6(this, 5);
        if (firstOpen) {
            j2 = 250;
        } else {
            j2 = j;
        }
        view5.postDelayed(qrActivity$$ExternalSyntheticLambda8, j2);
        this.prevSystemUiVisibility = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility | 1028);
        }
        View view6 = this.fragmentView;
        QrActivity$$ExternalSyntheticLambda1 qrActivity$$ExternalSyntheticLambda3 = new QrActivity$$ExternalSyntheticLambda1(this);
        WeakHashMap weakHashMap3 = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view6, qrActivity$$ExternalSyntheticLambda3);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final EdgeToEdgeSupportMode getEdgeToEdgeSupportMode() {
        return EdgeToEdgeSupportMode.FULL;
    }

    public final Bitmap getEmojiThemeIcon(EmojiThemes emojiThemes, boolean z) {
        if (!z) {
            return this.emojiThemeIcon;
        }
        String str = emojiThemes.emoji;
        ArrayMap arrayMap = this.emojiThemeDarkIcons;
        Bitmap bitmapCreateBitmap = (Bitmap) arrayMap.get(str);
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            int[] iArr = (int[]) qrColorsMap.get(emojiThemes.emoji + "n");
            if (iArr != null) {
                if (this.tempMotionDrawable == null) {
                    this.tempMotionDrawable = new MotionBackgroundDrawable(0, 0, 0, 0, true, 0, false);
                }
                this.tempMotionDrawable.setColors(iArr[0], iArr[1], iArr[2], iArr[3], 0, true);
                this.tempMotionDrawable.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                this.tempMotionDrawable.draw(canvas);
            }
            canvas.drawBitmap(this.emojiThemeIcon, 0.0f, 0.0f, (Paint) null);
            canvas.setBitmap(null);
            arrayMap.put(emojiThemes.emoji, bitmapCreateBitmap);
        }
        return bitmapCreateBitmap;
    }

    @Override
    public final Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions = super.getThemeDescriptions();
        final ThemeListViewController themeListViewController = this.themesViewController;
        themeListViewController.getClass();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            public boolean isAnimationStarted = false;

            @Override
            public final void didSetColor() {
            }

            @Override
            public final void onAnimationProgress(float f) {
                ArrayList arrayList;
                ThemeListViewController themeListViewController2 = ThemeListViewController.this;
                if (f == 0.0f && !this.isAnimationStarted) {
                    ChatThemeBottomSheet.Adapter adapter = themeListViewController2.adapter;
                    if (adapter != null && (arrayList = adapter.items) != null) {
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((ChatThemeBottomSheet.ChatThemeItem) obj).themeIndex = themeListViewController2.forceDark ? 1 : 0;
                        }
                    }
                    if (!themeListViewController2.isLightDarkChangeAnimation) {
                        int i2 = 0;
                        while (true) {
                            ChatThemeBottomSheet.Adapter adapter2 = themeListViewController2.adapter;
                            if (i2 >= adapter2.getItemCount()) {
                                break;
                            }
                            ((ChatThemeBottomSheet.ChatThemeItem) adapter2.items.get(i2)).getClass();
                            i2++;
                        }
                    }
                    this.isAnimationStarted = true;
                }
                themeListViewController2.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(themeListViewController2.fragment.getThemedColor(Theme.key_featuredStickers_addButton), PorterDuff.Mode.SRC_IN));
                if (themeListViewController2.isLightDarkChangeAnimation) {
                    int i3 = 0;
                    while (true) {
                        ChatThemeBottomSheet.Adapter adapter3 = themeListViewController2.adapter;
                        if (i3 >= adapter3.getItemCount()) {
                            break;
                        }
                        ((ChatThemeBottomSheet.ChatThemeItem) adapter3.items.get(i3)).getClass();
                        i3++;
                    }
                }
                if (f == 1.0f && this.isAnimationStarted) {
                    themeListViewController2.isLightDarkChangeAnimation = false;
                    this.isAnimationStarted = false;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        Paint paint = themeListViewController.backgroundPaint;
        int i = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(null, 1, null, paint, null, null, i));
        int i2 = 0;
        arrayList.add(new ThemeDescription(null, 32, null, null, new Drawable[]{themeListViewController.backgroundDrawable}, themeDescriptionDelegate, i));
        arrayList.add(new ThemeDescription(themeListViewController.titleView, 4, null, null, null, null, Theme.key_dialogTextBlack));
        arrayList.add(new ThemeDescription(themeListViewController.recyclerView, 16, new Class[]{ThemeSmallPreviewView.class}, null, null, null, Theme.key_dialogBackgroundGray));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((ThemeDescription) obj).resourcesProvider = themeListViewController.fragment.resourcesProvider;
        }
        themeDescriptions.addAll(arrayList);
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(i2, this);
        TextView textView = this.themesViewController.shareButton;
        int i4 = Theme.key_featuredStickers_addButton;
        themeDescriptions.add(new ThemeDescription(textView, 32, null, null, null, qrActivity$$ExternalSyntheticLambda9, i4));
        themeDescriptions.add(new ThemeDescription(this.themesViewController.shareButton, 65568, null, null, null, null, Theme.key_featuredStickers_addButtonPressed));
        TextView textView2 = this.themesViewController.scanButton;
        if (textView2 != null) {
            themeDescriptions.add(new ThemeDescription(textView2, 4, null, null, null, qrActivity$$ExternalSyntheticLambda9, i4));
            themeDescriptions.add(new ThemeDescription(this.themesViewController.scanButtonIcon, 8, null, null, null, qrActivity$$ExternalSyntheticLambda9, i4));
        }
        int size2 = themeDescriptions.size();
        while (i2 < size2) {
            ThemeDescription themeDescription = themeDescriptions.get(i2);
            i2++;
            themeDescription.resourcesProvider = this.resourcesProvider;
        }
        return themeDescriptions;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$6$9$1() {
        this.homeTheme.loadPreviewColors(this.currentAccount);
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new QrActivity$$ExternalSyntheticLambda6(this, 2), 17L);
    }

    public final void lambda$createView$7$3$2() {
        firstOpen = false;
        List list = cachedThemes;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(this.currentAccount).requestAllChatThemes(new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    List list2 = (List) obj;
                    QrActivity.this.onDataLoaded$1(list2);
                    QrActivity.cachedThemes = list2;
                }

                @Override
                public final void onError(Throwable th) {
                    ResultCallback.CC.$default$onError(this, th);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    Toast.makeText(QrActivity.this.getParentActivity(), tL_error.text, 0).show();
                }
            }, true);
        } else {
            onDataLoaded$1(cachedThemes);
        }
    }

    public final void lambda$onItemSelected$13() {
        EmojiThemes emojiThemes = this.currentTheme;
        boolean z = this.isCurrentThemeDark;
        PhotoViewer.AnonymousClass14 anonymousClass14 = this.resourcesProvider;
        anonymousClass14.blur = emojiThemes.createColors(((QrActivity) anonymousClass14.this$0).currentAccount, z ? 1 : 0);
    }

    public final void lambda$onItemSelected$14(boolean z, EmojiThemes emojiThemes, INavigationLayout.ThemeAnimationSettings themeAnimationSettings) {
        PhotoViewer.AnonymousClass14 anonymousClass14 = this.resourcesProvider;
        if (z) {
            anonymousClass14.blur = emojiThemes.createColors(((QrActivity) anonymousClass14.this$0).currentAccount, this.isCurrentThemeDark ? 1 : 0);
        } else {
            anonymousClass14.blur = this.currentTheme.createColors(((QrActivity) anonymousClass14.this$0).currentAccount, this.isCurrentThemeDark ? 1 : 0);
        }
        themeAnimationSettings.afterStartDescriptionsAddedRunnable = new QrActivity$$ExternalSyntheticLambda6(this, 4);
        ((ActionBarLayout) this.parentLayout).animateThemedValues(themeAnimationSettings, null);
        LinearLayout linearLayout = this.themesViewController.scanButtonWrap;
        if (linearLayout != null) {
            linearLayout.setBackground(Theme.AdaptiveRipple.createRect(new float[]{6.0f}, 0, ColorUtils.setAlphaComponent(Theme.AdaptiveRipple.calcRippleColor(getThemedColor(Theme.key_featuredStickers_addButton)), 25)));
        }
    }

    public final void onDataLoaded$1(List list) {
        if (list == null || list.isEmpty() || this.themesViewController == null) {
            return;
        }
        list.set(0, this.homeTheme);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            EmojiThemes emojiThemes = (EmojiThemes) list.get(i);
            emojiThemes.loadPreviewColors(this.currentAccount);
            ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(emojiThemes);
            boolean z = this.isCurrentThemeDark;
            chatThemeItem.themeIndex = z ? 1 : 0;
            chatThemeItem.icon = getEmojiThemeIcon(emojiThemes, z);
            arrayList.add(chatThemeItem);
        }
        ChatThemeBottomSheet.Adapter adapter = this.themesViewController.adapter;
        adapter.items = arrayList;
        adapter.mObservable.notifyChanged();
        int i2 = 0;
        while (true) {
            if (i2 == arrayList.size()) {
                i2 = -1;
                break;
            } else {
                if (ThemeKey.equals(((ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i2)).chatTheme.key, this.currentTheme.key)) {
                    this.themesViewController.selectedItem = (ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (i2 != -1) {
            ThemeListViewController themeListViewController = this.themesViewController;
            themeListViewController.prevSelectedPosition = i2;
            ChatThemeBottomSheet.Adapter adapter2 = themeListViewController.adapter;
            adapter2.setSelectedItem(i2);
            if (i2 > 0 && i2 < adapter2.items.size() / 2) {
                i2--;
            }
            int iMin = Math.min(i2, adapter2.items.size() - 1);
            LinearLayoutManager linearLayoutManager = themeListViewController.layoutManager;
            linearLayoutManager.scrollToPositionWithOffset(iMin, 0, linearLayoutManager.mShouldReverseLayout);
        }
        ThemeListViewController themeListViewController2 = this.themesViewController;
        ThemeListViewController.AnonymousClass3 anonymousClass3 = themeListViewController2.darkThemeView;
        anonymousClass3.setAlpha(0.0f);
        anonymousClass3.animate().alpha(1.0f).setDuration(150L).start();
        anonymousClass3.setVisibility(0);
        FlickerLoadingView flickerLoadingView = themeListViewController2.progressView;
        flickerLoadingView.animate().alpha(0.0f).setListener(new ChatActivity.AnonymousClass77(flickerLoadingView)).setDuration(150L).start();
        RecyclerListView recyclerListView = themeListViewController2.recyclerView;
        recyclerListView.setAlpha(0.0f);
        recyclerListView.animate().alpha(1.0f).setDuration(150L).start();
    }

    @Override
    public final boolean onFragmentCreate() {
        this.userId = this.arguments.getLong("user_id");
        this.chatId = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ArrayMap arrayMap;
        ThemeListViewController themeListViewController = this.themesViewController;
        themeListViewController.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(themeListViewController, NotificationCenter.emojiLoaded);
        this.themesViewController = null;
        this.emojiThemeIcon.recycle();
        this.emojiThemeIcon = null;
        int i = 0;
        while (true) {
            arrayMap = this.emojiThemeDarkIcons;
            if (i >= arrayMap.size) {
                break;
            }
            Bitmap bitmap = (Bitmap) arrayMap.valueAt(i);
            if (bitmap != null) {
                bitmap.recycle();
            }
            i++;
        }
        arrayMap.clear();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility);
        }
        super.onFragmentDestroy();
    }

    public final void onItemSelected(int i, EmojiThemes emojiThemes, boolean z) {
        float fMax;
        Theme.ThemeInfo themeInfo;
        int i2 = 3;
        int i3 = 0;
        this.selectedPosition = i;
        EmojiThemes emojiThemes2 = this.currentTheme;
        final boolean z2 = this.isCurrentThemeDark;
        this.currentTheme = emojiThemes;
        EmojiThemes.ThemeItem themeItem = (EmojiThemes.ThemeItem) emojiThemes.items.get(z2 ? 1 : 0);
        ValueAnimator valueAnimator = this.patternAlphaAnimator;
        if (valueAnimator != null) {
            fMax = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.patternAlphaAnimator.cancel();
        } else {
            fMax = 1.0f;
        }
        MotionBackgroundDrawable motionBackgroundDrawable = this.currMotionDrawable;
        this.prevMotionDrawable = motionBackgroundDrawable;
        if (motionBackgroundDrawable.isIndeterminateAnimation) {
            float f = motionBackgroundDrawable.posAnimationProgress;
            motionBackgroundDrawable.posAnimationProgress = 1.0f - ((f - (((int) (f / 0.125f)) * 0.125f)) / 0.125f);
            motionBackgroundDrawable.ignoreInterpolator = true;
        }
        motionBackgroundDrawable.isIndeterminateAnimation = false;
        motionBackgroundDrawable.setAlpha(255);
        MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable();
        this.currMotionDrawable = motionBackgroundDrawable2;
        motionBackgroundDrawable2.setCallback(this.backgroundView);
        this.currMotionDrawable.setColors(themeItem.patternBgColor, themeItem.patternBgGradientColor1, themeItem.patternBgGradientColor2, themeItem.patternBgGradientColor3, 0, true);
        this.currMotionDrawable.setParentView(this.backgroundView);
        MotionBackgroundDrawable motionBackgroundDrawable3 = this.currMotionDrawable;
        motionBackgroundDrawable3.patternAlpha = 1.0f;
        motionBackgroundDrawable3.invalidateParent();
        MotionBackgroundDrawable motionBackgroundDrawable4 = this.currMotionDrawable;
        motionBackgroundDrawable4.isIndeterminateAnimation = true;
        MotionBackgroundDrawable motionBackgroundDrawable5 = this.prevMotionDrawable;
        if (motionBackgroundDrawable5 != null) {
            motionBackgroundDrawable4.posAnimationProgress = motionBackgroundDrawable5.posAnimationProgress;
        }
        this.qrView.gradientDrawable.posAnimationProgress = motionBackgroundDrawable4.posAnimationProgress;
        TLRPC.WallPaper wallpaper = this.currentTheme.getWallpaper(z2 ? 1 : 0);
        if (wallpaper != null) {
            MotionBackgroundDrawable motionBackgroundDrawable6 = this.currMotionDrawable;
            motionBackgroundDrawable6.setPatternBitmap(motionBackgroundDrawable6.patternBitmap, wallpaper.settings.intensity);
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.currentTheme.loadWallpaper(z2 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    Pair pair = (Pair) obj;
                    QrActivity qrActivity = this.f$0;
                    long themeId = ((EmojiThemes.ThemeItem) qrActivity.currentTheme.items.get(z2 ? 1 : 0)).getThemeId();
                    if (pair == null || themeId == 0) {
                        return;
                    }
                    long jLongValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((WallpaperBitmapHolder) pair.second).bitmap;
                    if (jLongValue != themeId || bitmap == null) {
                        return;
                    }
                    qrActivity.onPatternLoaded(qrActivity.currMotionDrawable.intensity, bitmap, SystemClock.elapsedRealtime() - jElapsedRealtime > 150);
                }

                @Override
                public final void onError(Throwable th) {
                    ResultCallback.CC.$default$onError(this, th);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    ResultCallback.CC.$default$onError(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda6(this, i2), 35L);
        }
        MotionBackgroundDrawable motionBackgroundDrawable7 = this.currMotionDrawable;
        motionBackgroundDrawable7.setPatternColorFilter(motionBackgroundDrawable7.getPatternColor());
        ArrayMap arrayMap = qrColorsMap;
        StringBuilder sb = new StringBuilder();
        sb.append(emojiThemes.emoji);
        sb.append(z2 ? "n" : "d");
        int[] iArr = (int[]) arrayMap.get(sb.toString());
        if (z) {
            if (this.prevQrColors == null) {
                int[] iArr2 = new int[4];
                this.prevQrColors = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.currMotionDrawable.setAlpha(255);
            MotionBackgroundDrawable motionBackgroundDrawable8 = this.currMotionDrawable;
            motionBackgroundDrawable8.backgroundAlpha = 0.0f;
            motionBackgroundDrawable8.invalidateParent();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.patternAlphaAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(i3, this, iArr));
            this.patternAlphaAnimator.addListener(new AnonymousClass4(i3, this, iArr));
            this.patternAlphaAnimator.setDuration((int) (fMax * 250.0f));
            this.patternAlphaAnimator.start();
        } else {
            if (iArr != null) {
                QrView qrView = this.qrView;
                qrView.gradientDrawable.setColors(iArr[0], iArr[1], iArr[2], iArr[3], 0, true);
                qrView.invalidate();
                System.arraycopy(iArr, 0, this.prevQrColors, 0, 4);
            }
            this.prevMotionDrawable = null;
            this.backgroundView.invalidate();
        }
        boolean z3 = this.isCurrentThemeDark;
        if (z3) {
            themeInfo = Theme.currentNightTheme;
        } else {
            themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
        }
        INavigationLayout.ThemeAnimationSettings themeAnimationSettings = new INavigationLayout.ThemeAnimationSettings(null, themeInfo.currentAccentId, z3, !z);
        themeAnimationSettings.applyTheme = false;
        themeAnimationSettings.onlyTopFragment = true;
        themeAnimationSettings.resourcesProvider = this.resourcesProvider;
        themeAnimationSettings.duration = (int) (fMax * 250.0f);
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(this, z, emojiThemes2, themeAnimationSettings, 0));
    }

    public final void onPatternLoaded(int i, Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            this.currMotionDrawable.setPatternBitmap(bitmap, i);
            ValueAnimator valueAnimator = this.patternIntensityAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z) {
                MotionBackgroundDrawable motionBackgroundDrawable = this.currMotionDrawable;
                motionBackgroundDrawable.patternAlpha = 1.0f;
                motionBackgroundDrawable.invalidateParent();
            } else {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.patternIntensityAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 0));
                this.patternIntensityAnimator.setDuration(250L);
                this.patternIntensityAnimator.start();
            }
        }
    }

    @Override
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility);
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                CameraScanActivity.showAsSheet(getParentActivity(), 1, new AnonymousClass5(getCurrentAccount(), this));
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            builder.setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new QrActivity$$ExternalSyntheticLambda1(this));
            builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            builder.setTopAnimation(R.raw.permission_request_camera, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
            builder.show();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility | 1028);
        }
    }

    public final void performShare() {
        Point point = AndroidUtilities.displaySize;
        int iMin = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int iMax = Math.max(point2.x, point2.y);
        float f = iMin;
        if ((iMax * 1.0f) / f > 1.92f) {
            iMax = (int) (f * 1.92f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.themeLayout.setVisibility(8);
        this.closeImageView.setVisibility(8);
        this.logoImageView.setVisibility(8);
        this.logoImageView.getAnimatedDrawable();
        QrView qrView = this.qrView;
        if (qrView != null) {
            qrView.setForShare(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
        this.fragmentView.layout(0, 0, iMin, iMax);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.logoImageView.getLeft(), this.logoImageView.getTop(), this.logoImageView.getRight(), this.logoImageView.getBottom());
        if (this.logoOptimal != null) {
            canvas.drawBitmap(this.logoOptimal, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.themeLayout.setVisibility(0);
        this.closeImageView.setVisibility(0);
        this.logoImageView.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        QrView qrView2 = this.qrView;
        if (qrView2 != null) {
            qrView2.setForShare(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(bitmapCreateBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda6(this, 1), 500L);
    }
}
