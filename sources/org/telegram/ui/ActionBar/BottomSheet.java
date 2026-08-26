package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.NestedScrollingParentHelper;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.messenger.utils.WindowVisibilityManager.ControllerImpl;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda50;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.ArchiveHelp;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LaunchActivity;

public class BottomSheet extends Dialog implements BaseFragment.AttachedSheet {
    private static final boolean AVOID_SYSTEM_CUTOUT_FULLSCREEN = false;
    private boolean allowCustomAnimation;
    protected boolean allowNestedScroll;
    private boolean applyBottomPadding;
    private boolean applyTopPadding;
    public BaseFragment attachedFragment;
    protected SheetBackDrawable backDrawable;
    protected int backgroundPaddingLeft;
    protected int backgroundPaddingTop;
    protected int behindKeyboardColor;
    protected int behindKeyboardColorKey;
    private boolean bigTitle;
    private int bottomInset;
    protected boolean calcMandatoryInsets;
    private boolean canDismissWithSwipe;
    private boolean canDismissWithTouchOutside;
    private int cellType;
    public ContainerView container;
    protected ViewGroup containerView;
    protected int currentAccount;
    private float currentPanTranslationY;
    protected AnimatorSet currentSheetAnimation;
    protected int currentSheetAnimationType;
    private View customView;
    protected int customViewGravity;
    protected BottomSheetDelegateInterface delegate;
    protected boolean dimBehind;
    protected int dimBehindAlpha;
    private boolean disableScroll;
    private Runnable dismissRunnable;
    private boolean dismissed;
    public boolean doNotOverlayNavigationBar;
    public boolean drawDoubleNavigationBar;
    public boolean drawNavigationBar;
    private boolean focusable;
    private int focusableSoftInputMode;
    private boolean forceKeyboardOnDismiss;
    private boolean fullHeight;
    protected boolean fullWidth;
    private float hideSystemVerticalInsetsProgress;
    private int internalBackgroundColor;
    protected boolean isFullscreen;
    protected boolean isPortrait;
    private int[] itemIcons;
    private ArrayList<BottomSheetCell> itemViews;
    private CharSequence[] items;
    public ValueAnimator keyboardContentAnimator;
    protected int keyboardHeight;
    protected boolean keyboardVisible;
    private WindowInsets lastInsets;
    private int lastKeyboardHeight;
    private int layoutCount;
    private int leftInset;
    private boolean multipleLinesTitle;
    protected int navBarColor;
    protected int navBarColorKey;
    protected float navigationBarAlpha;
    protected ValueAnimator navigationBarAnimation;
    protected int navigationBarHeight;
    protected View nestedScrollChild;
    private AnimationNotificationsLocker notificationsLocker;
    public boolean occupyNavigationBar;
    public boolean occupyNavigationBarWithoutKeyboard;
    private DialogInterface.OnClickListener onClickListener;
    private DialogInterface.OnDismissListener onHideListener;
    public int openDuration;
    public Interpolator openInterpolator;
    private boolean openNoDelay;
    protected int openedLayerNum;
    private int overlayDrawNavBarColor;
    public boolean pauseAllHeavyOperations;
    protected int playingImagesLayerNum;
    protected Theme.ResourcesProvider resourcesProvider;
    private int rightInset;
    public boolean scrollNavBar;
    private Integer selectedPos;
    protected Drawable shadowDrawable;
    private boolean showWithoutAnimation;
    boolean showing;
    private boolean skipDismissAnimation;
    private long smoothContainerViewLayoutUntil;
    public boolean smoothKeyboardAnimationEnabled;
    public boolean smoothKeyboardByBottom;
    protected Runnable startAnimationRunnable;
    private int statusBarHeight;
    private int tag;
    private CharSequence title;
    private TextView titleView;
    public FrameLayout topBulletinContainer;
    private int touchSlop;
    private boolean transitionFromRight;
    public boolean useBackgroundTopPadding;
    private boolean useFastDismiss;
    protected boolean useHardwareLayer;
    protected boolean useLightNavBar;
    protected boolean useLightStatusBar;
    protected boolean useSmoothKeyboard;
    protected boolean waitingKeyboard;
    private WindowVisibilityManager windowVisibilityManager;

    public final class AnonymousClass4 implements Runnable {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass4(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void run() {
            switch (this.$r8$classId) {
                case 0:
                    BottomSheet bottomSheet = (BottomSheet) this.this$0;
                    if (bottomSheet.startAnimationRunnable == this && !bottomSheet.dismissed) {
                        bottomSheet.startAnimationRunnable = null;
                        bottomSheet.startOpenAnimation$1();
                        break;
                    }
                    break;
                case 1:
                    AdjustPanLayoutHelper adjustPanLayoutHelper = (AdjustPanLayoutHelper) this.this$0;
                    ValueAnimator valueAnimator = adjustPanLayoutHelper.animator;
                    if (valueAnimator != null && !valueAnimator.isRunning()) {
                        adjustPanLayoutHelper.animator.start();
                        break;
                    }
                    break;
                default:
                    ActionBarLayout actionBarLayout = (ActionBarLayout) this.this$0;
                    if (actionBarLayout.waitingForKeyboardCloseRunnable == this) {
                        actionBarLayout.waitingForKeyboardCloseRunnable = null;
                        actionBarLayout.startLayoutAnimation(false, true, false);
                        break;
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass5 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final BottomSheet this$0;

        public AnonymousClass5(BottomSheet bottomSheet, int i) {
            this.$r8$classId = i;
            this.this$0 = bottomSheet;
        }

        @Override
        public final void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    BottomSheet bottomSheet = this.this$0;
                    AnimatorSet animatorSet = bottomSheet.currentSheetAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        bottomSheet.currentSheetAnimation = null;
                        bottomSheet.currentSheetAnimationType = 0;
                        break;
                    }
                    break;
                default:
                    BottomSheet bottomSheet2 = this.this$0;
                    AnimatorSet animatorSet2 = bottomSheet2.currentSheetAnimation;
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        bottomSheet2.currentSheetAnimation = null;
                        bottomSheet2.currentSheetAnimationType = 0;
                        break;
                    }
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            BottomSheet bottomSheet = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    AnimatorSet animatorSet = bottomSheet.currentSheetAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        bottomSheet.currentSheetAnimation = null;
                        bottomSheet.currentSheetAnimationType = 0;
                        bottomSheet.onOpenAnimationEnd();
                        BottomSheetDelegateInterface bottomSheetDelegateInterface = bottomSheet.delegate;
                        if (bottomSheetDelegateInterface != null) {
                            bottomSheetDelegateInterface.onOpenAnimationEnd();
                        }
                        if (bottomSheet.useHardwareLayer) {
                            bottomSheet.container.setLayerType(0, null);
                        }
                        if (bottomSheet.isFullscreen) {
                            WindowManager.LayoutParams attributes = bottomSheet.getWindow().getAttributes();
                            attributes.flags &= -1025;
                            bottomSheet.getWindow().setAttributes(attributes);
                        }
                    }
                    if (bottomSheet.pauseAllHeavyOperations) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                    bottomSheet.notificationsLocker.unlock();
                    break;
                default:
                    AnimatorSet animatorSet2 = bottomSheet.currentSheetAnimation;
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        bottomSheet.currentSheetAnimation = null;
                        bottomSheet.currentSheetAnimationType = 0;
                        AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda8(this, 10));
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    break;
            }
        }
    }

    public final class AnonymousClass6 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Dialog this$0;
        public final int val$item;

        public AnonymousClass6(Dialog dialog, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = dialog;
            this.val$item = i;
        }

        @Override
        public final void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    BottomSheet bottomSheet = (BottomSheet) this.this$0;
                    AnimatorSet animatorSet = bottomSheet.currentSheetAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        bottomSheet.currentSheetAnimation = null;
                        bottomSheet.currentSheetAnimationType = 0;
                        break;
                    }
                    break;
                default:
                    AlertDialog alertDialog = (AlertDialog) this.this$0;
                    AnimatorSet[] animatorSetArr = alertDialog.shadowAnimation;
                    int i = this.val$item;
                    AnimatorSet animatorSet2 = animatorSetArr[i];
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        alertDialog.shadowAnimation[i] = null;
                        break;
                    }
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            int i = this.val$item;
            Dialog dialog = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    BottomSheet bottomSheet = (BottomSheet) dialog;
                    AnimatorSet animatorSet = bottomSheet.currentSheetAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        bottomSheet.currentSheetAnimation = null;
                        bottomSheet.currentSheetAnimationType = 0;
                        if (bottomSheet.onClickListener != null) {
                            bottomSheet.onClickListener.onClick(bottomSheet, i);
                        }
                        AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda8(this, 9));
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    break;
                default:
                    AlertDialog alertDialog = (AlertDialog) dialog;
                    AnimatorSet animatorSet2 = alertDialog.shadowAnimation[i];
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        alertDialog.shadowAnimation[i] = null;
                        break;
                    }
                    break;
            }
        }
    }

    public final class BottomSheetCell extends FrameLayout {
        public boolean checked;
        public final int currentType;
        public final ImageView imageView;
        public final ImageView imageView2;
        public boolean isSelected;
        public final Theme.ResourcesProvider resourcesProvider;
        public final AnimatedEmojiSpan.TextViewEmojis textView;

        public BottomSheetCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.isSelected = false;
            this.resourcesProvider = resourcesProvider;
            this.currentType = i;
            if (i != 4) {
                setBackgroundDrawable(Theme.getSelectorDrawable(resourcesProvider, false));
            }
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(56, 48, (LocaleController.isRTL ? 5 : 3) | 16));
            ImageView imageView2 = new ImageView(context);
            this.imageView2 = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_radioBackgroundChecked, resourcesProvider), PorterDuff.Mode.SRC_IN));
            addView(imageView2, LayoutHelper.createFrame(56, 48, (LocaleController.isRTL ? 3 : 5) | 16));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.textView = textViewEmojis;
            textViewEmojis.setLines(1);
            textViewEmojis.setSingleLine(true);
            textViewEmojis.setGravity(1);
            textViewEmojis.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 0 || i == 4) {
                textViewEmojis.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                textViewEmojis.setTextSize(1, 16.0f);
                addView(textViewEmojis, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
                return;
            }
            if (i == 1) {
                textViewEmojis.setGravity(17);
                textViewEmojis.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                textViewEmojis.setTextSize(1, 14.0f);
                textViewEmojis.setTypeface(AndroidUtilities.bold());
                addView(textViewEmojis, LayoutHelper.createFrame(-1, -1.0f));
                return;
            }
            if (i == 2) {
                textViewEmojis.setGravity(17);
                textViewEmojis.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
                textViewEmojis.setTextSize(1, 14.0f);
                textViewEmojis.setTypeface(AndroidUtilities.bold());
                int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
                textViewEmojis.setBackground(Theme.AdaptiveRipple.createRect(new float[]{6.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
                addView(textViewEmojis, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            }
        }

        public ImageView getImageView() {
            return this.imageView;
        }

        public AnimatedEmojiSpan.TextViewEmojis getTextView() {
            return this.textView;
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.isSelected) {
                accessibilityNodeInfo.setSelected(true);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3 = this.currentType;
            int i4 = i3 == 2 ? 80 : 48;
            if (i3 == 0) {
                i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i4), 1073741824));
        }

        public void setChecked(boolean z) {
            ImageView imageView = this.imageView2;
            this.checked = z;
            imageView.setImageResource(z ? R.drawable.checkbig : 0);
        }

        public void setGravity(int i) {
            this.textView.setGravity(i);
        }

        public void setIconColor(int i) {
            this.imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }

        public final void setTextAndIcon(CharSequence charSequence, int i, Drawable drawable, boolean z) {
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
            textViewEmojis.setText(charSequence);
            ImageView imageView = this.imageView;
            if (i == 0 && drawable == null) {
                imageView.setVisibility(4);
                textViewEmojis.setPadding(AndroidUtilities.dp(z ? 21.0f : 16.0f), 0, AndroidUtilities.dp(z ? 21.0f : 16.0f), 0);
                return;
            }
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setImageResource(i);
            }
            imageView.setVisibility(0);
            if (z) {
                textViewEmojis.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 21.0f : 72.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 21.0f), 0);
                imageView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(5.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(5.0f) : 5, 0);
            } else {
                textViewEmojis.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 72.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 16.0f), 0);
                imageView.setPadding(0, 0, 0, 0);
            }
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }
    }

    public abstract class BottomSheetDelegate implements BottomSheetDelegateInterface {
        @Override
        public boolean canDismiss() {
            return true;
        }

        @Override
        public void onOpenAnimationEnd() {
        }

        public void onOpenAnimationStart() {
        }
    }

    public interface BottomSheetDelegateInterface {
        boolean canDismiss();

        void onOpenAnimationEnd();
    }

    public final class Builder {
        public final BottomSheet bottomSheet;

        public Builder(Context context, Theme.ResourcesProvider resourcesProvider) {
            BottomSheet bottomSheet = new BottomSheet(context, false, false, resourcesProvider);
            this.bottomSheet = bottomSheet;
            bottomSheet.fixNavigationBar();
        }

        public final void setCustomView(ArchiveHelp archiveHelp) {
            BottomSheet bottomSheet = this.bottomSheet;
            bottomSheet.customView = archiveHelp;
            bottomSheet.customViewGravity = 49;
        }

        public final void setDimBehind() {
            this.bottomSheet.dimBehind = false;
        }

        public final void setOnPreDismissListener(ChatActivity$$ExternalSyntheticLambda50 chatActivity$$ExternalSyntheticLambda50) {
            this.bottomSheet.setOnHideListener(chatActivity$$ExternalSyntheticLambda50);
        }
    }

    public abstract class ContainerView extends FrameLayout {
        public boolean allowedSwipeToBack;
        public final Paint backgroundPaint;
        public AnimatorSet currentAnimation;
        public final Paint internalBackgroundPaint;
        public int internalPaddingBottom;
        public boolean keyboardChanged;
        public boolean maybeStartTracking;
        public final NestedScrollingParentHelper nestedScrollingParentHelper;
        public final Rect rect;
        public boolean startedTracking;
        public int startedTrackingPointerId;
        public int startedTrackingX;
        public int startedTrackingY;
        public float swipeBackX;
        public VelocityTracker velocityTracker;
        public float y;

        public final class AnonymousClass2 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final ContainerView this$1;

            public AnonymousClass2(ContainerView containerView, int i) {
                this.$r8$classId = i;
                this.this$1 = containerView;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                ContainerView containerView = this.this$1;
                switch (this.$r8$classId) {
                    case 0:
                        containerView.swipeBackX = 0.0f;
                        BottomSheet.this.containerView.setTranslationX(0.0f);
                        BottomSheet.this.container.invalidate();
                        break;
                    case 1:
                        BottomSheet.this.skipDismissAnimation = true;
                        BottomSheet.this.containerView.setTranslationX(containerView.getMeasuredWidth());
                        BottomSheet.this.lambda$showGiftOfferSheet$15();
                        BottomSheet.this.container.invalidate();
                        break;
                    case 2:
                        BottomSheet.this.containerView.setTranslationY(0.0f);
                        BottomSheet.this.onContainerViewTranslation();
                        BottomSheet bottomSheet = BottomSheet.this;
                        bottomSheet.onSmoothContainerViewLayout(bottomSheet.containerView.getTranslationY());
                        containerView.invalidate();
                        break;
                    default:
                        AnimatorSet animatorSet = containerView.currentAnimation;
                        if (animatorSet != null && animatorSet.equals(animator)) {
                            containerView.currentAnimation = null;
                        }
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                        break;
                }
            }
        }

        public ContainerView(Context context) {
            super(context);
            this.velocityTracker = null;
            this.startedTrackingPointerId = -1;
            this.maybeStartTracking = false;
            this.startedTracking = false;
            this.currentAnimation = null;
            this.rect = new Rect();
            this.backgroundPaint = new Paint();
            this.y = 0.0f;
            this.swipeBackX = 0.0f;
            this.internalBackgroundPaint = new Paint(1);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper();
            setWillNotDraw(false);
        }

        public final void checkDismiss(float f, float f2) {
            BottomSheet bottomSheet = BottomSheet.this;
            float translationY = bottomSheet.containerView.getTranslationY();
            if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f2 >= 3500.0f && Math.abs(f2) >= Math.abs(f))) && (f2 >= 0.0f || Math.abs(f2) < 3500.0f)) {
                boolean z = bottomSheet.allowCustomAnimation;
                bottomSheet.allowCustomAnimation = false;
                bottomSheet.useFastDismiss = true;
                bottomSheet.lambda$showGiftOfferSheet$15();
                bottomSheet.allowCustomAnimation = z;
                return;
            }
            this.maybeStartTracking = false;
            this.currentAnimation = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new BottomSheet$ContainerView$$ExternalSyntheticLambda0(this, 4));
            this.currentAnimation.playTogether(ObjectAnimator.ofFloat(bottomSheet.containerView, "translationY", 0.0f), valueAnimatorOfFloat);
            this.currentAnimation.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
            this.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.currentAnimation.addListener(new AnonymousClass2(this, 3));
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.currentAnimation.start();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            Paint paint;
            BottomSheet bottomSheet = BottomSheet.this;
            if (bottomSheet.containerView != null && this.internalPaddingBottom > 0) {
                Paint paint2 = this.internalBackgroundPaint;
                paint2.setColor(bottomSheet.internalBackgroundColor);
                canvas.drawRect(0.0f, (bottomSheet.containerView.getTranslationY() + (getMeasuredHeight() - this.internalPaddingBottom)) - 1.0f, getMeasuredWidth(), bottomSheet.containerView.getTranslationY() + getMeasuredHeight(), paint2);
            }
            int i = Build.VERSION.SDK_INT;
            Paint paint3 = this.backgroundPaint;
            if (i >= 26) {
                int i2 = bottomSheet.navBarColorKey;
                if (i2 >= 0) {
                    paint3.setColor(bottomSheet.getThemedColor(i2));
                } else {
                    paint3.setColor(bottomSheet.navBarColor);
                }
            } else {
                paint3.setColor(-16777216);
            }
            if (bottomSheet.drawDoubleNavigationBar && !bottomSheet.shouldOverlayCameraViewOverNavBar()) {
                drawNavigationBar(canvas, 1.0f);
            }
            if (paint3.getAlpha() >= 255 || !bottomSheet.drawNavigationBar) {
                super.dispatchDraw(canvas);
            } else {
                float fMax = 0.0f;
                if (bottomSheet.scrollNavBar || (i >= 29 && BottomSheet.access$1400(bottomSheet) > 0)) {
                    fMax = Math.max(0.0f, bottomSheet.getBottomInset() - (bottomSheet.containerView.getMeasuredHeight() - bottomSheet.containerView.getTranslationY()));
                }
                int bottomInset = bottomSheet.drawNavigationBar ? bottomSheet.getBottomInset() : 0;
                canvas.save();
                canvas.clipRect(bottomSheet.containerView.getLeft() + bottomSheet.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + fMax) - bottomSheet.currentPanTranslationY, bottomSheet.containerView.getRight() - bottomSheet.backgroundPaddingLeft, getMeasuredHeight() + fMax, Region.Op.DIFFERENCE);
                super.dispatchDraw(canvas);
                canvas.restore();
            }
            if (bottomSheet.doNotOverlayNavigationBar) {
                if ((getMeasuredHeight() - bottomSheet.containerView.getY()) - bottomSheet.containerView.getMeasuredHeight() > AndroidUtilities.dp(48.0f)) {
                    int i3 = bottomSheet.behindKeyboardColorKey;
                    paint3.setColor(i3 >= 0 ? bottomSheet.getThemedColor(i3) : bottomSheet.behindKeyboardColor);
                    canvas.drawRect(bottomSheet.containerView.getLeft() + bottomSheet.backgroundPaddingLeft, bottomSheet.containerView.getMeasuredHeight() + bottomSheet.containerView.getY(), bottomSheet.containerView.getRight() - bottomSheet.backgroundPaddingLeft, getMeasuredHeight(), paint3);
                    return;
                }
                return;
            }
            if (!bottomSheet.shouldOverlayCameraViewOverNavBar()) {
                drawNavigationBar(canvas, bottomSheet.drawDoubleNavigationBar ? bottomSheet.navigationBarAlpha * 0.7f : 1.0f);
            }
            if (!bottomSheet.drawNavigationBar || bottomSheet.rightInset == 0 || bottomSheet.rightInset <= bottomSheet.leftInset || !bottomSheet.fullWidth) {
                paint = paint3;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    paint = paint3;
                    canvas.drawRect(bottomSheet.containerView.getRight() - bottomSheet.backgroundPaddingLeft, bottomSheet.containerView.getTranslationY(), bottomSheet.rightInset + bottomSheet.containerView.getRight(), getMeasuredHeight(), paint);
                } else {
                    paint = paint3;
                }
            }
            if (bottomSheet.drawNavigationBar && bottomSheet.leftInset != 0 && bottomSheet.leftInset > bottomSheet.rightInset && bottomSheet.fullWidth) {
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    canvas.drawRect(0.0f, bottomSheet.containerView.getTranslationY(), bottomSheet.containerView.getLeft() + bottomSheet.backgroundPaddingLeft, getMeasuredHeight(), paint);
                }
            }
            if (bottomSheet.containerView.getY() + bottomSheet.containerView.getMeasuredHeight() < getMeasuredHeight()) {
                int i4 = bottomSheet.behindKeyboardColorKey;
                paint.setColor(i4 >= 0 ? bottomSheet.getThemedColor(i4) : bottomSheet.behindKeyboardColor);
                canvas.drawRect(bottomSheet.containerView.getLeft() + bottomSheet.backgroundPaddingLeft, bottomSheet.containerView.getMeasuredHeight() + bottomSheet.containerView.getY(), bottomSheet.containerView.getRight() - bottomSheet.backgroundPaddingLeft, getMeasuredHeight(), paint);
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            if (!(view instanceof CameraView)) {
                return super.drawChild(canvas, view, j);
            }
            if (BottomSheet.this.shouldOverlayCameraViewOverNavBar()) {
                drawNavigationBar(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j);
        }

        public final void drawNavigationBar(Canvas canvas, float f) {
            float fMax;
            int i = Build.VERSION.SDK_INT;
            Paint paint = this.backgroundPaint;
            BottomSheet bottomSheet = BottomSheet.this;
            if (i >= 26) {
                int i2 = bottomSheet.navBarColorKey;
                if (i2 >= 0) {
                    paint.setColor(bottomSheet.getThemedColor(i2));
                } else {
                    paint.setColor(bottomSheet.navBarColor);
                }
            } else {
                paint.setColor(-16777216);
            }
            if (!bottomSheet.transitionFromRight || bottomSheet.containerView.getVisibility() == 0) {
                float f2 = 0.0f;
                if ((!bottomSheet.drawNavigationBar || bottomSheet.bottomInset == 0) && bottomSheet.currentPanTranslationY == 0.0f) {
                    return;
                }
                int bottomInset = bottomSheet.drawNavigationBar ? bottomSheet.getBottomInset() : 0;
                if (!bottomSheet.scrollNavBar && (i < 29 || BottomSheet.access$1400(bottomSheet) <= 0)) {
                    fMax = 0.0f;
                } else if (bottomSheet.drawDoubleNavigationBar) {
                    fMax = Math.max(0.0f, Math.min(bottomInset - bottomSheet.currentPanTranslationY, bottomSheet.containerView.getTranslationY()));
                } else {
                    fMax = Math.max(0.0f, bottomSheet.getBottomInset() - (bottomSheet.containerView.getMeasuredHeight() - bottomSheet.containerView.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (bottomSheet.transitionFromRight) {
                    f *= bottomSheet.containerView.getAlpha();
                }
                int x = bottomSheet.transitionFromRight ? (int) bottomSheet.containerView.getX() : bottomSheet.containerView.getLeft();
                if (f < 1.0f) {
                    paint.setAlpha((int) (alpha * f));
                }
                canvas.drawRect(bottomSheet.backgroundPaddingLeft + x, ((getMeasuredHeight() - bottomInset) + fMax) - bottomSheet.currentPanTranslationY, bottomSheet.containerView.getRight() - bottomSheet.backgroundPaddingLeft, getMeasuredHeight() + fMax, paint);
                paint.setAlpha(alpha);
                if (bottomSheet.overlayDrawNavBarColor != 0) {
                    paint.setColor(bottomSheet.overlayDrawNavBarColor);
                    int alpha2 = paint.getAlpha();
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(bottomInset);
                    if (f < 1.0f) {
                        paint.setAlpha((int) (alpha2 * f * navigationBarThirdButtonsFactor));
                    } else {
                        f2 = fMax;
                    }
                    if (paint.getAlpha() > 0) {
                        canvas.drawRect(x + bottomSheet.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f2) - bottomSheet.currentPanTranslationY, bottomSheet.containerView.getRight() - bottomSheet.backgroundPaddingLeft, getMeasuredHeight() + f2, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }

        @Override
        public int getNestedScrollAxes() {
            NestedScrollingParentHelper nestedScrollingParentHelper = this.nestedScrollingParentHelper;
            return nestedScrollingParentHelper.mNestedScrollAxesNonTouch | nestedScrollingParentHelper.mNestedScrollAxesTouch;
        }

        @Override
        public final boolean hasOverlappingRendering() {
            return false;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            boolean z;
            Paint paint = this.backgroundPaint;
            int alpha = paint.getAlpha();
            BottomSheet bottomSheet = BottomSheet.this;
            if (alpha >= 255 || !bottomSheet.drawNavigationBar) {
                canvas2 = canvas;
                z = false;
            } else {
                float fMax = 0.0f;
                if (bottomSheet.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && BottomSheet.access$1400(bottomSheet) > 0)) {
                    fMax = Math.max(0.0f, bottomSheet.getBottomInset() - (bottomSheet.containerView.getMeasuredHeight() - bottomSheet.containerView.getTranslationY()));
                }
                int bottomInset = bottomSheet.drawNavigationBar ? bottomSheet.getBottomInset() : 0;
                canvas.save();
                canvas.clipRect(bottomSheet.containerView.getLeft() + bottomSheet.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + fMax) - bottomSheet.currentPanTranslationY, bottomSheet.containerView.getRight() - bottomSheet.backgroundPaddingLeft, getMeasuredHeight() + fMax, Region.Op.DIFFERENCE);
                canvas2 = canvas;
                z = true;
            }
            super.onDraw(canvas2);
            if (bottomSheet.drawNavigationBar && bottomSheet.lastInsets != null && bottomSheet.keyboardHeight != 0) {
                int i = bottomSheet.behindKeyboardColorKey;
                paint.setColor(i >= 0 ? bottomSheet.getThemedColor(i) : bottomSheet.behindKeyboardColor);
                canvas2.drawRect(bottomSheet.containerView.getLeft() + bottomSheet.backgroundPaddingLeft, (getMeasuredHeight() - bottomSheet.keyboardHeight) - (bottomSheet.drawNavigationBar ? bottomSheet.getBottomInset() : 0), bottomSheet.containerView.getRight() - bottomSheet.backgroundPaddingLeft, getMeasuredHeight() - (bottomSheet.drawNavigationBar ? bottomSheet.getBottomInset() : 0), paint);
            }
            bottomSheet.onContainerDraw(canvas2);
            if (z) {
                canvas2.restore();
            }
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            BottomSheet bottomSheet = BottomSheet.this;
            return (bottomSheet.canDismissWithSwipe() || bottomSheet.canSwipeToBack(motionEvent)) ? processTouchEvent(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            Runnable runnable;
            int i5;
            BottomSheet bottomSheet;
            int i6;
            int i7;
            int leftInset;
            int i8;
            int i9;
            int i10;
            int leftInset2 = i;
            int i11 = i2;
            int rightInset = i3;
            int i12 = 1;
            int i13 = i4 - this.internalPaddingBottom;
            BottomSheet bottomSheet2 = BottomSheet.this;
            bottomSheet2.onContainerLayout(leftInset2, i11, rightInset, i13);
            BottomSheet.access$1510(bottomSheet2);
            ViewGroup viewGroup = bottomSheet2.containerView;
            int i14 = 2;
            int i15 = 0;
            if (viewGroup != null) {
                int measuredHeight = (i13 - i11) - viewGroup.getMeasuredHeight();
                if (bottomSheet2.lastInsets != null) {
                    leftInset2 += bottomSheet2.getLeftInset();
                    rightInset -= bottomSheet2.getRightInset();
                    if (bottomSheet2.useSmoothKeyboard) {
                        measuredHeight = 0;
                    } else if (!bottomSheet2.occupyNavigationBar) {
                        measuredHeight = (int) (measuredHeight - (((1.0f - bottomSheet2.hideSystemVerticalInsetsProgress) * bottomSheet2.lastInsets.getSystemWindowInsetBottom()) - (bottomSheet2.drawNavigationBar ? 0 : bottomSheet2.getBottomInset())));
                        if (Build.VERSION.SDK_INT >= 29) {
                            measuredHeight -= BottomSheet.access$1400(bottomSheet2);
                        }
                    }
                }
                int measuredWidth = ((rightInset - leftInset2) - bottomSheet2.containerView.getMeasuredWidth()) / 2;
                if (bottomSheet2.lastInsets != null) {
                    measuredWidth += bottomSheet2.getLeftInset();
                }
                if ((bottomSheet2.smoothKeyboardAnimationEnabled && bottomSheet2.startAnimationRunnable == null && this.keyboardChanged && !bottomSheet2.dismissed && (!bottomSheet2.smoothKeyboardByBottom ? bottomSheet2.containerView.getTop() != measuredHeight : bottomSheet2.containerView.getBottom() != bottomSheet2.containerView.getMeasuredHeight() + measuredHeight)) || (bottomSheet2.smoothContainerViewLayoutUntil > 0 && System.currentTimeMillis() < bottomSheet2.smoothContainerViewLayoutUntil)) {
                    ViewGroup viewGroup2 = bottomSheet2.containerView;
                    viewGroup2.setTranslationY(bottomSheet2.smoothKeyboardByBottom ? viewGroup2.getBottom() - (bottomSheet2.containerView.getMeasuredHeight() + measuredHeight) : viewGroup2.getTop() - measuredHeight);
                    bottomSheet2.onContainerViewTranslation();
                    bottomSheet2.onSmoothContainerViewLayout(bottomSheet2.containerView.getTranslationY());
                    ValueAnimator valueAnimator = bottomSheet2.keyboardContentAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(bottomSheet2.containerView.getTranslationY(), 0.0f);
                    bottomSheet2.keyboardContentAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new BottomSheet$ContainerView$$ExternalSyntheticLambda0(this, i15));
                    bottomSheet2.keyboardContentAnimator.addListener(new AnonymousClass2(this, i14));
                    bottomSheet2.keyboardContentAnimator.setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                    bottomSheet2.keyboardContentAnimator.start();
                    bottomSheet2.smoothContainerViewLayoutUntil = -1L;
                }
                ViewGroup viewGroup3 = bottomSheet2.containerView;
                viewGroup3.layout(measuredWidth, measuredHeight, viewGroup3.getMeasuredWidth() + measuredWidth, bottomSheet2.containerView.getMeasuredHeight() + measuredHeight);
            }
            int i16 = rightInset;
            int childCount = getChildCount();
            int i17 = 0;
            while (i17 < childCount) {
                View childAt = getChildAt(i17);
                if (childAt.getVisibility() == 8 || childAt == bottomSheet2.containerView) {
                    BottomSheet bottomSheet3 = bottomSheet2;
                    i5 = leftInset2;
                    bottomSheet = bottomSheet3;
                } else {
                    int bottomInset = bottomSheet2.drawNavigationBar ? bottomSheet2.getBottomInset() : 0;
                    BottomSheet bottomSheet4 = bottomSheet2;
                    i5 = leftInset2;
                    bottomSheet = bottomSheet4;
                    if (!bottomSheet.onCustomLayout(childAt, i5, i11, i16, i13 - bottomInset)) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        int i18 = layoutParams.gravity;
                        if (i18 == -1) {
                            i18 = 51;
                        }
                        int i19 = i18 & 112;
                        int i20 = i18 & 7;
                        if (i20 != i12) {
                            if (i20 != 5) {
                                leftInset = layoutParams.leftMargin;
                            } else {
                                i6 = i16 - measuredWidth2;
                                i7 = layoutParams.rightMargin;
                            }
                            if (i19 != 16) {
                                if (i19 != 80) {
                                    i10 = layoutParams.topMargin;
                                } else {
                                    i8 = (i13 - i2) - measuredHeight2;
                                    i9 = layoutParams.bottomMargin;
                                }
                                if (bottomSheet.lastInsets != null) {
                                    leftInset += bottomSheet.getLeftInset();
                                }
                                childAt.layout(leftInset, i10, measuredWidth2 + leftInset, measuredHeight2 + i10);
                            } else {
                                i8 = (((i13 - i2) - measuredHeight2) / 2) + layoutParams.topMargin;
                                i9 = layoutParams.bottomMargin;
                            }
                            i10 = i8 - i9;
                            if (bottomSheet.lastInsets != null) {
                                leftInset += bottomSheet.getLeftInset();
                            }
                            childAt.layout(leftInset, i10, measuredWidth2 + leftInset, measuredHeight2 + i10);
                        } else {
                            i6 = (((i16 - i5) - measuredWidth2) / 2) + layoutParams.leftMargin;
                            i7 = layoutParams.rightMargin;
                        }
                        leftInset = i6 - i7;
                        if (i19 != 16) {
                            if (i19 != 80) {
                                i10 = layoutParams.topMargin;
                            } else {
                                i8 = (i13 - i2) - measuredHeight2;
                                i9 = layoutParams.bottomMargin;
                            }
                            if (bottomSheet.lastInsets != null) {
                                leftInset += bottomSheet.getLeftInset();
                            }
                            childAt.layout(leftInset, i10, measuredWidth2 + leftInset, measuredHeight2 + i10);
                        } else {
                            i8 = (((i13 - i2) - measuredHeight2) / 2) + layoutParams.topMargin;
                            i9 = layoutParams.bottomMargin;
                        }
                        i10 = i8 - i9;
                        if (bottomSheet.lastInsets != null) {
                            leftInset += bottomSheet.getLeftInset();
                        }
                        childAt.layout(leftInset, i10, measuredWidth2 + leftInset, measuredHeight2 + i10);
                    }
                    i17++;
                    int i21 = i5;
                    bottomSheet2 = bottomSheet;
                    leftInset2 = i21;
                    i11 = i2;
                    i12 = 1;
                }
                i17++;
                int i22 = i5;
                bottomSheet2 = bottomSheet;
                leftInset2 = i22;
                i11 = i2;
                i12 = 1;
            }
            BottomSheet bottomSheet5 = bottomSheet2;
            if (bottomSheet5.layoutCount == 0 && (runnable = bottomSheet5.startAnimationRunnable) != null && !bottomSheet5.waitingKeyboard) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                bottomSheet5.startAnimationRunnable.run();
                bottomSheet5.startAnimationRunnable = null;
            }
            if (bottomSheet5.waitingKeyboard && bottomSheet5.keyboardVisible) {
                Runnable runnable2 = bottomSheet5.startAnimationRunnable;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    bottomSheet5.startAnimationRunnable.run();
                }
                bottomSheet5.waitingKeyboard = false;
            }
            this.keyboardChanged = false;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int bottomInset;
            int iMakeMeasureSpec;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            View rootView = getRootView();
            Rect rect = this.rect;
            getWindowVisibleDisplayFrame(rect);
            BottomSheet bottomSheet = BottomSheet.this;
            int i3 = bottomSheet.keyboardHeight;
            if (rect.bottom == 0 || rect.top == 0) {
                bottomSheet.keyboardHeight = 0;
            } else {
                bottomSheet.keyboardHeight = Math.max(0, ((int) ((rootView.getHeight() - (rect.top != 0 ? (1.0f - bottomSheet.hideSystemVerticalInsetsProgress) * AndroidUtilities.statusBarHeight : 0.0f)) - ((1.0f - bottomSheet.hideSystemVerticalInsetsProgress) * AndroidUtilities.getViewInset(rootView)))) - (rect.bottom - rect.top));
                if (bottomSheet.keyboardHeight < AndroidUtilities.dp(20.0f)) {
                    bottomSheet.keyboardHeight = 0;
                } else {
                    bottomSheet.lastKeyboardHeight = bottomSheet.keyboardHeight;
                }
                BottomSheet.access$1020(bottomSheet, bottomSheet.keyboardHeight);
            }
            int i4 = bottomSheet.keyboardHeight;
            if (i3 != i4) {
                this.keyboardChanged = true;
            }
            bottomSheet.keyboardVisible = i4 > AndroidUtilities.dp(20.0f);
            if (bottomSheet.lastInsets != null) {
                bottomSheet.bottomInset = bottomSheet.lastInsets.getSystemWindowInsetBottom();
                bottomSheet.leftInset = bottomSheet.lastInsets.getSystemWindowInsetLeft();
                bottomSheet.rightInset = bottomSheet.lastInsets.getSystemWindowInsetRight();
                if (Build.VERSION.SDK_INT >= 29) {
                    BottomSheet.access$1012(bottomSheet, BottomSheet.access$1400(bottomSheet));
                }
                if (bottomSheet.keyboardVisible && rect.bottom != 0 && rect.top != 0) {
                    BottomSheet.access$1020(bottomSheet, bottomSheet.keyboardHeight);
                }
                if (bottomSheet.drawNavigationBar || bottomSheet.occupyNavigationBar || bottomSheet.occupyNavigationBarWithoutKeyboard) {
                    bottomInset = size2;
                } else {
                    bottomInset = size2 - bottomSheet.getBottomInset();
                }
            } else {
                bottomInset = size2;
            }
            this.internalPaddingBottom = size2 - bottomInset;
            setMeasuredDimension(size, size2);
            bottomSheet.navigationBarHeight = 0;
            if (bottomSheet.lastInsets != null && !bottomSheet.occupyNavigationBar) {
                int systemWindowInsetBottom = (int) ((1.0f - bottomSheet.hideSystemVerticalInsetsProgress) * bottomSheet.lastInsets.getSystemWindowInsetBottom());
                if (Build.VERSION.SDK_INT >= 29) {
                    systemWindowInsetBottom += BottomSheet.access$1400(bottomSheet);
                }
                if (!bottomSheet.occupyNavigationBarWithoutKeyboard) {
                    size2 -= systemWindowInsetBottom;
                } else if (systemWindowInsetBottom > AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight) {
                    size2 -= systemWindowInsetBottom;
                }
                bottomSheet.navigationBarHeight = Math.min(systemWindowInsetBottom, AndroidUtilities.navigationBarHeight);
            }
            int i5 = size2;
            if (bottomSheet.lastInsets != null) {
                size -= bottomSheet.getLeftInset() + bottomSheet.getRightInset();
            }
            int i6 = size;
            bottomSheet.isPortrait = i6 < i5;
            ViewGroup viewGroup = bottomSheet.containerView;
            if (viewGroup != null) {
                if (bottomSheet.fullWidth) {
                    viewGroup.measure(View.MeasureSpec.makeMeasureSpec((bottomSheet.backgroundPaddingLeft * 2) + i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                } else {
                    if (AndroidUtilities.isTablet()) {
                        float fDp = AndroidUtilities.dp(500.0f);
                        Point point = AndroidUtilities.displaySize;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((bottomSheet.backgroundPaddingLeft * 2) + ((int) Math.min(fDp, Math.min(point.x, point.y) * 0.8f)), 1073741824);
                    } else {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((bottomSheet.backgroundPaddingLeft * 2) + bottomSheet.getBottomSheetWidth(bottomSheet.isPortrait, i6, i5), 1073741824);
                    }
                    bottomSheet.containerView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                }
            }
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8 && childAt != bottomSheet.containerView) {
                    if (childAt instanceof ItemOptions.DimView) {
                        measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i6, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), 0);
                    } else if (!bottomSheet.onCustomMeasure(childAt, i6, i5)) {
                        measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i6, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(i5, 1073741824), 0);
                    }
                }
            }
        }

        @Override
        public final boolean onNestedFling(View view, float f, float f2, boolean z) {
            return false;
        }

        @Override
        public final boolean onNestedPreFling(View view, float f, float f2) {
            return false;
        }

        @Override
        public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
            BottomSheet bottomSheet = BottomSheet.this;
            if (bottomSheet.dismissed || !bottomSheet.allowNestedScroll) {
                return;
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.currentAnimation = null;
            }
            bottomSheet.onSwipeStarts();
            float translationY = bottomSheet.containerView.getTranslationY();
            if (translationY <= 0.0f || i2 <= 0) {
                return;
            }
            float f = translationY - i2;
            iArr[1] = i2;
            bottomSheet.containerView.setTranslationY(f >= 0.0f ? f : 0.0f);
            bottomSheet.onContainerViewTranslation();
            bottomSheet.container.invalidate();
        }

        @Override
        public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
            BottomSheet bottomSheet = BottomSheet.this;
            if (bottomSheet.dismissed || !bottomSheet.allowNestedScroll) {
                return;
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.currentAnimation = null;
            }
            bottomSheet.onSwipeStarts();
            if (i4 != 0) {
                float translationY = bottomSheet.containerView.getTranslationY() - i4;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                bottomSheet.containerView.setTranslationY(translationY);
                bottomSheet.onContainerViewTranslation();
                bottomSheet.container.invalidate();
            }
        }

        @Override
        public final void onNestedScrollAccepted(View view, View view2, int i) {
            this.nestedScrollingParentHelper.mNestedScrollAxesTouch = i;
            BottomSheet bottomSheet = BottomSheet.this;
            if (bottomSheet.dismissed || !bottomSheet.allowNestedScroll) {
                return;
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.currentAnimation = null;
            }
            bottomSheet.onSwipeStarts();
        }

        @Override
        public final boolean onStartNestedScroll(View view, View view2, int i) {
            BottomSheet bottomSheet = BottomSheet.this;
            View view3 = bottomSheet.nestedScrollChild;
            return (view3 == null || view == view3) && !bottomSheet.dismissed && bottomSheet.allowNestedScroll && i == 2 && !bottomSheet.canDismissWithSwipe();
        }

        @Override
        public final void onStopNestedScroll(View view) {
            this.nestedScrollingParentHelper.mNestedScrollAxesTouch = 0;
            BottomSheet bottomSheet = BottomSheet.this;
            if (bottomSheet.dismissed || !bottomSheet.allowNestedScroll) {
                return;
            }
            checkDismiss(0.0f, 0.0f);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return processTouchEvent(motionEvent, false);
        }

        public final boolean processTouchEvent(MotionEvent motionEvent, boolean z) {
            int i = 3;
            int i2 = 2;
            int i3 = 1;
            BottomSheet bottomSheet = BottomSheet.this;
            int i4 = 0;
            if (!bottomSheet.dismissed) {
                if (!bottomSheet.onContainerTouchEvent(motionEvent)) {
                    if (bottomSheet.canSwipeToBack(motionEvent) || this.allowedSwipeToBack) {
                        if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.startedTracking && !this.maybeStartTracking && motionEvent.getPointerCount() == 1)) {
                            this.allowedSwipeToBack = true;
                            this.startedTrackingX = (int) motionEvent.getX();
                            this.startedTrackingY = (int) motionEvent.getY();
                            this.startedTrackingPointerId = motionEvent.getPointerId(0);
                            this.maybeStartTracking = true;
                            AnimatorSet animatorSet = this.currentAnimation;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                this.currentAnimation = null;
                            }
                            bottomSheet.onSwipeStarts();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                            float x = motionEvent.getX() - this.startedTrackingX;
                            float y = motionEvent.getY() - this.startedTrackingY;
                            if (this.velocityTracker == null) {
                                this.velocityTracker = VelocityTracker.obtain();
                            }
                            this.velocityTracker.addMovement(motionEvent);
                            if (!bottomSheet.disableScroll && this.maybeStartTracking && !this.startedTracking && x > 0.0f && x / 3.0f > Math.abs(y) && Math.abs(x) >= bottomSheet.touchSlop) {
                                this.startedTrackingX = (int) motionEvent.getX();
                                this.maybeStartTracking = false;
                                this.startedTracking = true;
                            } else if (this.startedTracking) {
                                float f = this.swipeBackX + x;
                                this.swipeBackX = f;
                                bottomSheet.containerView.setTranslationX(Math.max(f, 0.0f));
                                this.startedTrackingX = (int) motionEvent.getX();
                                bottomSheet.container.invalidate();
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            if (this.velocityTracker == null) {
                                this.velocityTracker = VelocityTracker.obtain();
                            }
                            float xVelocity = this.velocityTracker.getXVelocity();
                            float yVelocity = this.velocityTracker.getYVelocity();
                            if (this.swipeBackX >= bottomSheet.containerView.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.swipeBackX, getMeasuredWidth());
                                valueAnimatorOfFloat.addUpdateListener(new BottomSheet$ContainerView$$ExternalSyntheticLambda0(this, i2));
                                valueAnimatorOfFloat.addListener(new AnonymousClass2(this, i3));
                                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                                valueAnimatorOfFloat.setInterpolator(cubicBezierInterpolator);
                                valueAnimatorOfFloat.setDuration(320L);
                                valueAnimatorOfFloat.start();
                                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                                valueAnimatorOfFloat2.addUpdateListener(new BottomSheet$ContainerView$$ExternalSyntheticLambda0(this, i));
                                valueAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator);
                                valueAnimatorOfFloat2.setDuration(320L);
                                valueAnimatorOfFloat2.start();
                            } else {
                                float fMax = Math.max(this.swipeBackX, 0.0f);
                                this.swipeBackX = fMax;
                                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(fMax, 0.0f);
                                valueAnimatorOfFloat3.addUpdateListener(new BottomSheet$ContainerView$$ExternalSyntheticLambda0(this, i3));
                                valueAnimatorOfFloat3.addListener(new AnonymousClass2(this, i4));
                                valueAnimatorOfFloat3.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                valueAnimatorOfFloat3.setDuration(220L);
                                valueAnimatorOfFloat3.start();
                            }
                            this.maybeStartTracking = false;
                            this.startedTracking = false;
                            this.startedTrackingPointerId = -1;
                            this.allowedSwipeToBack = false;
                        }
                    } else if (bottomSheet.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.startedTracking && !this.maybeStartTracking && motionEvent.getPointerCount() == 1)) {
                        this.startedTrackingX = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        this.startedTrackingY = y2;
                        if (bottomSheet.isTouchOutside(this.startedTrackingX, y2)) {
                            bottomSheet.onDismissWithTouchOutside();
                            return true;
                        }
                        bottomSheet.onScrollUpBegin(this.y);
                        this.startedTrackingPointerId = motionEvent.getPointerId(0);
                        this.maybeStartTracking = true;
                        AnimatorSet animatorSet2 = this.currentAnimation;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                            this.currentAnimation = null;
                        }
                        bottomSheet.onSwipeStarts();
                        VelocityTracker velocityTracker = this.velocityTracker;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (bottomSheet.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                        if (this.velocityTracker == null) {
                            this.velocityTracker = VelocityTracker.obtain();
                        }
                        float fAbs = Math.abs((int) (motionEvent.getX() - this.startedTrackingX));
                        float y3 = ((int) motionEvent.getY()) - this.startedTrackingY;
                        boolean zOnScrollUp = bottomSheet.onScrollUp(this.y + y3);
                        this.velocityTracker.addMovement(motionEvent);
                        if (!bottomSheet.disableScroll && this.maybeStartTracking && !this.startedTracking && y3 > 0.0f && y3 / 3.0f > Math.abs(fAbs) && Math.abs(y3) >= bottomSheet.touchSlop) {
                            this.startedTrackingY = (int) motionEvent.getY();
                            this.maybeStartTracking = false;
                            this.startedTracking = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.startedTracking) {
                            float f2 = this.y + y3;
                            this.y = f2;
                            if (!zOnScrollUp) {
                                this.y = Math.max(f2, 0.0f);
                            }
                            bottomSheet.containerView.setTranslationY(Math.max(this.y, 0.0f));
                            bottomSheet.onContainerViewTranslation();
                            this.startedTrackingY = (int) motionEvent.getY();
                            bottomSheet.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.velocityTracker == null) {
                            this.velocityTracker = VelocityTracker.obtain();
                        }
                        this.velocityTracker.computeCurrentVelocity(1000);
                        bottomSheet.onScrollUpEnd(this.y);
                        if (this.startedTracking || this.y > 0.0f) {
                            checkDismiss(this.velocityTracker.getXVelocity(), this.velocityTracker.getYVelocity());
                        } else {
                            this.maybeStartTracking = false;
                        }
                        this.startedTracking = false;
                        VelocityTracker velocityTracker2 = this.velocityTracker;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.velocityTracker = null;
                        }
                        this.startedTrackingPointerId = -1;
                    }
                    if ((z || !this.maybeStartTracking) && !this.startedTracking && (bottomSheet.canDismissWithSwipe() || bottomSheet.canSwipeToBack(motionEvent))) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override
        public final void requestDisallowInterceptTouchEvent(boolean z) {
            if (this.maybeStartTracking && !this.startedTracking) {
                processTouchEvent(null, false);
            }
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final class SheetBackDrawable extends Drawable {
        public final Paint bgPaint;
        public final Rect boundsWithInsets;
        public final Rect insets;

        public SheetBackDrawable() {
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.insets = new Rect();
            this.boundsWithInsets = new Rect();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            paint.setColor(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            Rect rect = this.boundsWithInsets;
            if (rect.isEmpty()) {
                return;
            }
            Paint paint = this.bgPaint;
            if (paint.getAlpha() == 0 || AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            canvas.drawRect(rect, paint);
        }

        @Override
        public final int getAlpha() {
            return this.bgPaint.getAlpha();
        }

        @Override
        public final int getOpacity() {
            return 0;
        }

        @Override
        public final void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            Rect rect2 = this.boundsWithInsets;
            rect2.set(rect);
            int i = rect2.left;
            Rect rect3 = this.insets;
            rect2.left = Math.max(0, rect3.left) + i;
            rect2.top = Math.max(0, rect3.top) + rect2.top;
            rect2.right -= Math.max(0, rect3.right);
            rect2.bottom -= Math.max(0, rect3.bottom);
        }

        @Override
        public final void setAlpha(int i) {
            this.bgPaint.setAlpha(i);
            invalidateSelf();
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            this.bgPaint.setColorFilter(colorFilter);
        }
    }

    public BottomSheet(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, z, false, resourcesProvider);
    }

    public static int access$1012(BottomSheet bottomSheet, int i) {
        int i2 = bottomSheet.bottomInset + i;
        bottomSheet.bottomInset = i2;
        return i2;
    }

    public static int access$1020(BottomSheet bottomSheet, int i) {
        int i2 = bottomSheet.bottomInset - i;
        bottomSheet.bottomInset = i2;
        return i2;
    }

    public static int access$1400(BottomSheet bottomSheet) {
        WindowInsets windowInsets;
        if (!bottomSheet.calcMandatoryInsets || (windowInsets = bottomSheet.lastInsets) == null) {
            return 0;
        }
        Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
        if (bottomSheet.keyboardVisible || !bottomSheet.drawNavigationBar || systemGestureInsets == null) {
            return 0;
        }
        if (systemGestureInsets.left == 0 && systemGestureInsets.right == 0) {
            return 0;
        }
        return systemGestureInsets.bottom;
    }

    public static int access$1510(BottomSheet bottomSheet) {
        int i = bottomSheet.layoutCount;
        bottomSheet.layoutCount = i - 1;
        return i;
    }

    public static boolean lambda$onCreateInternal$3(View view, MotionEvent motionEvent) {
        return true;
    }

    public void appendOpenAnimator(boolean z, ArrayList<Animator> arrayList) {
    }

    @Override
    public boolean attachedToParent() {
        ContainerView containerView = this.container;
        return containerView != null && containerView.isAttachedToWindow();
    }

    public boolean canDismissWithSwipe() {
        return this.canDismissWithSwipe;
    }

    public boolean canDismissWithTouchOutside() {
        return this.canDismissWithTouchOutside;
    }

    public boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    public void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.currentSheetAnimation = null;
        }
        this.currentSheetAnimationType = 0;
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        long j;
        Bulletin visibleBulletin;
        int i = 2;
        int i2 = 1;
        BottomSheetDelegateInterface bottomSheetDelegateInterface = this.delegate;
        if ((bottomSheetDelegateInterface == null || bottomSheetDelegateInterface.canDismiss()) && !this.dismissed) {
            this.dismissed = true;
            DialogInterface.OnDismissListener onDismissListener = this.onHideListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            cancelSheetAnimation();
            onDismissAnimationStart();
            if (!this.skipDismissAnimation) {
                if (!this.allowCustomAnimation || !onCustomCloseAnimation()) {
                    AndroidUtilities.hideKeyboard(this.container);
                    this.currentSheetAnimationType = 2;
                    ValueAnimator valueAnimator = this.navigationBarAnimation;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 0.0f);
                    this.navigationBarAnimation = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda1(this, i2));
                    this.currentSheetAnimation = new AnimatorSet();
                    ArrayList<Animator> arrayList = new ArrayList<>();
                    ViewGroup viewGroup = this.containerView;
                    if (viewGroup != null) {
                        if (this.transitionFromRight) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, AndroidUtilities.dp(48.0f));
                            objectAnimatorOfFloat.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda1(this, i));
                            arrayList.add(objectAnimatorOfFloat);
                            arrayList.add(ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                        } else {
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + (this.forceKeyboardOnDismiss ? this.lastKeyboardHeight : this.keyboardHeight));
                            objectAnimatorOfFloat2.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda1(this, 3));
                            arrayList.add(objectAnimatorOfFloat2);
                        }
                    }
                    arrayList.add(ObjectAnimator.ofInt(this.backDrawable, (Property<SheetBackDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0));
                    arrayList.add(this.navigationBarAnimation);
                    appendOpenAnimator(false, arrayList);
                    this.currentSheetAnimation.playTogether(arrayList);
                    if (this.transitionFromRight) {
                        this.currentSheetAnimation.setDuration(200L);
                        this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        j = 0;
                    } else {
                        j = 250;
                        this.currentSheetAnimation.setDuration(250L);
                        this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    }
                    this.currentSheetAnimation.addListener(new AnonymousClass5(this, i2));
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    this.currentSheetAnimation.start();
                }
                visibleBulletin = Bulletin.getVisibleBulletin();
                if (visibleBulletin != null && visibleBulletin.isShowing() && visibleBulletin.hideAfterBottomSheet) {
                    if (j > 0) {
                        visibleBulletin.hide((long) (j * 0.6f));
                    } else {
                        visibleBulletin.hide();
                    }
                }
                if (this.showing) {
                    this.showing = false;
                    if (this.openedLayerNum > 0) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
                    }
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new BottomSheet$$ExternalSyntheticLambda5(this, i));
            j = 0;
            visibleBulletin = Bulletin.getVisibleBulletin();
            if (visibleBulletin != null) {
                if (j > 0) {
                    visibleBulletin.hide((long) (j * 0.6f));
                } else {
                    visibleBulletin.hide();
                }
            }
            if (this.showing) {
                return;
            }
            this.showing = false;
            if (this.openedLayerNum > 0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
            }
        }
    }

    public void dismissInternal() {
        BaseFragment baseFragment = this.attachedFragment;
        if (baseFragment != null) {
            baseFragment.removeSheet(this);
            AndroidUtilities.removeFromParent(this.container);
        } else {
            try {
                super.dismiss();
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
        }
    }

    public void dismissWithButtonClick(int i) {
        int i2 = 0;
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        cancelSheetAnimation();
        this.currentSheetAnimationType = 2;
        this.currentSheetAnimation = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + this.keyboardHeight);
        objectAnimatorOfFloat.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda1(this, i2));
        this.currentSheetAnimation.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofInt(this.backDrawable, (Property<SheetBackDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0));
        this.currentSheetAnimation.setDuration(this.cellType == 4 ? 330L : 180L);
        this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.currentSheetAnimation.addListener(new AnonymousClass6(this, i, i2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        if (this.cellType != 4 || this.selectedPos == null) {
            return;
        }
        int currentTextColor = getItemViews().get(this.selectedPos.intValue()).getTextView().getCurrentTextColor();
        int currentTextColor2 = getItemViews().get(i).getTextView().getCurrentTextColor();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
        valueAnimatorOfArgb.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda1(this, 5));
        valueAnimatorOfArgb.setDuration(130L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        valueAnimatorOfArgb.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfArgb.start();
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
        valueAnimatorOfArgb2.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda3(this, i, i2));
        valueAnimatorOfArgb2.setDuration(130L);
        valueAnimatorOfArgb2.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfArgb2.start();
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.dismissed) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void fixNavigationBar() {
        fixNavigationBar(getThemedColor(Theme.key_windowBackgroundGray));
    }

    public void forceKeyboardOnDismiss() {
        this.forceKeyboardOnDismiss = true;
    }

    public Drawable getBackDrawable() {
        return this.backDrawable;
    }

    public int getBackgroundPaddingLeft() {
        return this.backgroundPaddingLeft;
    }

    public int getBackgroundPaddingTop() {
        return this.backgroundPaddingTop;
    }

    public int getBottomInset() {
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * this.bottomInset);
    }

    public int getBottomSheetWidth(boolean z, int i, int i2) {
        return z ? i : (int) Math.max(i * 0.8f, Math.min(AndroidUtilities.dp(480.0f), i));
    }

    @Override
    public BulletinFactory getBulletinFactory() {
        return BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider);
    }

    public ContainerView getContainer() {
        return this.container;
    }

    public ViewGroup getContainerView() {
        return this.containerView;
    }

    public int getContainerViewHeight() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public ArrayList<BottomSheetCell> getItemViews() {
        return this.itemViews;
    }

    public int getLeftInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets == null) {
            return 0;
        }
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * windowInsets.getSystemWindowInsetLeft());
    }

    @Override
    public int getNavigationBarColor(int i) {
        float fClamp01;
        ViewGroup viewGroup;
        if (!attachedToParent() || (viewGroup = this.containerView) == null) {
            fClamp01 = 0.0f;
        } else if (this.transitionFromRight) {
            fClamp01 = viewGroup.getAlpha();
        } else {
            fClamp01 = Utilities.clamp01(1.0f - (this.containerView.getTranslationY() / ((AndroidUtilities.dp(10.0f) + (getContainerViewHeight() + this.keyboardHeight)) + (this.scrollNavBar ? Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) : 0))));
        }
        return ColorUtils.blendARGB(fClamp01, i, this.navBarColor);
    }

    public Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    public int getRightInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets == null) {
            return 0;
        }
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * windowInsets.getSystemWindowInsetRight());
    }

    public int getSheetAnimationType() {
        return this.currentSheetAnimationType;
    }

    public ViewGroup getSheetContainer() {
        return this.containerView;
    }

    public int getStatusBarHeight() {
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * this.statusBarHeight);
    }

    public int getSystemBottomInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets != null) {
            return windowInsets.getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int getTag() {
        return this.tag;
    }

    public int getTargetOpenTranslationY() {
        return 0;
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return null;
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public TextView getTitleView() {
        return this.titleView;
    }

    @Override
    public View mo1107getWindowView() {
        return this.container;
    }

    @Override
    public boolean isAttachedLightStatusBar() {
        return this.useLightStatusBar;
    }

    public boolean isDismissed() {
        return this.dismissed;
    }

    public boolean isFocusable() {
        return this.focusable;
    }

    @Override
    public boolean isFullyVisible() {
        return false;
    }

    public boolean isKeyboardVisible() {
        return this.keyboardVisible;
    }

    @Override
    public boolean isShown() {
        return !this.dismissed;
    }

    public boolean isTouchOutside(float f, float f2) {
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f2 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f2 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        return f2 < ((float) this.containerView.getTop()) || f < ((float) this.containerView.getLeft()) || f > ((float) this.containerView.getRight());
    }

    public final void lambda$dismiss$10() {
        try {
            dismissInternal();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void lambda$dismiss$11(ValueAnimator valueAnimator) {
        this.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    public final void lambda$dismiss$12(ValueAnimator valueAnimator) {
        onContainerViewTranslation();
    }

    public final void lambda$dismiss$13(ValueAnimator valueAnimator) {
        onContainerViewTranslation();
    }

    public final void lambda$dismissWithButtonClick$7(ValueAnimator valueAnimator) {
        onContainerViewTranslation();
    }

    public final void lambda$dismissWithButtonClick$8(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setItemColor(this.selectedPos.intValue(), iIntValue, iIntValue);
    }

    public final void lambda$dismissWithButtonClick$9(int i, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setItemColor(i, iIntValue, iIntValue);
    }

    public void lambda$init$0(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$0$15(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$0$18(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$0$20(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$0$4(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public final WindowInsets lambda$new$1(View view, WindowInsets windowInsets) {
        processLegacyContainerInsets(windowInsets);
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public void lambda$new$1$12(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1$14(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1$15(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1$4(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$2$2(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$2$6(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$3$5(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$6$3(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public final void lambda$onCreateInternal$2() {
        AndroidUtilities.removeFromParent(this.container);
        this.attachedFragment.getLayoutContainer().addView(this.container);
    }

    public final void lambda$onCreateInternal$4(View view) {
        dismissWithButtonClick(((Integer) view.getTag()).intValue());
    }

    public void lambda$openAsLearnMore$99(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$set$59(View view) {
        lambda$openCrafting$8();
    }

    public void lambda$set$61(View view) {
        lambda$openCrafting$8();
    }

    public void lambda$set$79(View view) {
        lambda$openCrafting$8();
    }

    public void lambda$set$92(View view) {
        lambda$openCrafting$8();
    }

    public final void lambda$setHideSystemVerticalInsets$0(ValueAnimator valueAnimator) {
        this.hideSystemVerticalInsetsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.container.requestLayout();
        this.containerView.requestLayout();
    }

    public final void lambda$startOpenAnimation$5(ValueAnimator valueAnimator) {
        this.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    public final void lambda$startOpenAnimation$6(ValueAnimator valueAnimator) {
        onContainerViewTranslation();
    }

    public void lambda$toggleWear$25(View view) {
        lambda$openCrafting$8();
    }

    public void lambda$updateButtonText$8(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void mainContainerDispatchDraw(Canvas canvas) {
    }

    public void makeAttached(BaseFragment baseFragment) {
        if (AndroidUtilities.isTablet()) {
            return;
        }
        if (baseFragment == null || !baseFragment.isSupportEdgeToEdge()) {
            this.attachedFragment = baseFragment;
            SheetBackDrawable sheetBackDrawable = this.backDrawable;
            if (sheetBackDrawable != null) {
                sheetBackDrawable.bgPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            }
        }
    }

    public WindowVisibilityManager.Controller obtainWindowVisibilityController() {
        if (this.windowVisibilityManager == null) {
            this.windowVisibilityManager = new WindowVisibilityManager(getWindow());
        }
        WindowVisibilityManager windowVisibilityManager = this.windowVisibilityManager;
        windowVisibilityManager.getClass();
        return windowVisibilityManager.new ControllerImpl();
    }

    @Override
    public boolean onAttachedBackPressed() {
        lambda$openCrafting$8();
        return true;
    }

    @Override
    public void lambda$openCrafting$8() {
        if (this.attachedFragment == null) {
            super.onBackPressed();
        } else {
            lambda$showGiftOfferSheet$15();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onContainerDraw(Canvas canvas) {
    }

    public void onContainerLayout(int i, int i2, int i3, int i4) {
    }

    public boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onContainerTranslationYChanged(float f) {
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    public void onContainerViewTranslation() {
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        onCreateInternal();
    }

    public final void onCreateInternal() {
        Window window;
        int i;
        BaseFragment baseFragment = this.attachedFragment;
        if (baseFragment != null) {
            baseFragment.addSheet(this);
            if (this.attachedFragment.getLayoutContainer() == null) {
                return;
            }
            if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.attachedFragment.getLayoutContainer().getWindowToken(), 2)) {
                AndroidUtilities.runOnUIThread(new BottomSheet$$ExternalSyntheticLambda5(this, 0), 80L);
            } else {
                AndroidUtilities.removeFromParent(this.container);
                this.attachedFragment.getLayoutContainer().addView(this.container);
            }
            window = null;
        } else {
            window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            setContentView(this.container, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.useLightStatusBar && Build.VERSION.SDK_INT >= 23 && Theme.getColor(null, Theme.key_actionBarDefault, true) == -1) {
            this.container.setSystemUiVisibility(this.container.getSystemUiVisibility() | 8192);
        }
        if (this.useLightNavBar && Build.VERSION.SDK_INT >= 26) {
            AndroidUtilities.setLightNavigationBar((Dialog) this, false);
        }
        if (this.containerView == null) {
            FrameLayout frameLayout = new FrameLayout(getContext()) {
                @Override
                public final boolean hasOverlappingRendering() {
                    return false;
                }

                @Override
                public final void setTranslationY(float f) {
                    super.setTranslationY(f);
                    BottomSheet bottomSheet = BottomSheet.this;
                    FrameLayout frameLayout2 = bottomSheet.topBulletinContainer;
                    if (frameLayout2 != null) {
                        frameLayout2.setTranslationY((-(bottomSheet.container.getHeight() - bottomSheet.containerView.getY())) + bottomSheet.backgroundPaddingTop);
                    }
                    bottomSheet.onContainerTranslationYChanged(f);
                }
            };
            this.containerView = frameLayout;
            frameLayout.setBackgroundDrawable(this.shadowDrawable);
            this.containerView.setPadding(this.backgroundPaddingLeft, ((this.applyTopPadding ? AndroidUtilities.dp(8.0f) : 0) + this.backgroundPaddingTop) - 1, this.backgroundPaddingLeft, this.applyBottomPadding ? AndroidUtilities.dp(8.0f) : 0);
        }
        this.containerView.setVisibility(4);
        this.container.addView(this.containerView, 0, LayoutHelper.createFrame(-1, -2, 80));
        if (this.topBulletinContainer == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.topBulletinContainer = frameLayout2;
            ContainerView containerView = this.container;
            containerView.addView(frameLayout2, containerView.indexOfChild(this.containerView) + 1, LayoutHelper.createFrame(-1, -2, 80));
        }
        if (this.title != null) {
            TextView textView = new TextView(getContext()) {
                @Override
                public final void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, i3);
                    BottomSheet bottomSheet = BottomSheet.this;
                    if (bottomSheet.multipleLinesTitle) {
                        int measuredHeight = getMeasuredHeight();
                        if (bottomSheet.customView != null) {
                            ((ViewGroup.MarginLayoutParams) bottomSheet.customView.getLayoutParams()).topMargin = measuredHeight;
                            return;
                        }
                        if (bottomSheet.containerView != null) {
                            for (int i4 = 1; i4 < bottomSheet.containerView.getChildCount(); i4++) {
                                View childAt = bottomSheet.containerView.getChildAt(i4);
                                if (childAt instanceof BottomSheetCell) {
                                    ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                    measuredHeight = AndroidUtilities.dp(48.0f) + measuredHeight;
                                }
                            }
                        }
                    }
                }
            };
            this.titleView = textView;
            textView.setText(this.title);
            if (this.bigTitle) {
                this.titleView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
                this.titleView.setTextSize(1, 20.0f);
                this.titleView.setTypeface(AndroidUtilities.bold());
                this.titleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(this.multipleLinesTitle ? 14.0f : 6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            } else {
                this.titleView.setTextColor(getThemedColor(Theme.key_dialogTextGray2));
                this.titleView.setTextSize(1, 16.0f);
                this.titleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(this.multipleLinesTitle ? 8.0f : 0.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            }
            if (this.multipleLinesTitle) {
                this.titleView.setSingleLine(false);
                this.titleView.setMaxLines(5);
                this.titleView.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.titleView.setLines(1);
                this.titleView.setSingleLine(true);
                this.titleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.titleView.setGravity(16);
            i = 48;
            this.containerView.addView(this.titleView, LayoutHelper.createFrame(-1, this.multipleLinesTitle ? -2.0f : 48));
            this.titleView.setOnTouchListener(new BottomSheet$$ExternalSyntheticLambda6(0));
        } else {
            i = 0;
        }
        View view = this.customView;
        if (view == null) {
            if (this.items != null) {
                int i2 = 0;
                while (true) {
                    CharSequence[] charSequenceArr = this.items;
                    if (i2 >= charSequenceArr.length) {
                        break;
                    }
                    if (charSequenceArr[i2] != null) {
                        BottomSheetCell bottomSheetCell = new BottomSheetCell(getContext(), this.cellType, this.resourcesProvider);
                        CharSequence charSequence = this.items[i2];
                        int[] iArr = this.itemIcons;
                        bottomSheetCell.setTextAndIcon(charSequence, iArr != null ? iArr[i2] : 0, null, this.bigTitle);
                        this.containerView.addView(bottomSheetCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, i, 0.0f, 0.0f));
                        i += 48;
                        bottomSheetCell.setTag(Integer.valueOf(i2));
                        bottomSheetCell.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda7(this, 0));
                        this.itemViews.add(bottomSheetCell);
                    }
                    i2++;
                }
            }
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) this.customView.getParent()).removeView(this.customView);
            }
            if (this.useBackgroundTopPadding) {
                this.containerView.addView(this.customView, LayoutHelper.createFrame(-1, -2.0f, this.customViewGravity, 0.0f, i, 0.0f, 0.0f));
            } else {
                this.containerView.setClipToPadding(false);
                this.containerView.setClipChildren(false);
                this.container.setClipToPadding(false);
                this.container.setClipChildren(false);
                float f = i;
                this.containerView.addView(this.customView, LayoutHelper.createFrame(-1, -2.0f, this.customViewGravity, 0.0f, f, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.customView.getLayoutParams()).topMargin = AndroidUtilities.dp(f) + (-this.backgroundPaddingTop);
            }
        }
        if (this.attachedFragment == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i3 = attributes.flags & (-3);
            attributes.flags = i3;
            if (this.focusable) {
                attributes.softInputMode = this.focusableSoftInputMode;
            } else {
                attributes.flags = i3 | 131072;
            }
            if (this.isFullscreen) {
                attributes.flags |= -2147416832;
                this.container.setSystemUiVisibility(1284);
            }
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        }
    }

    public boolean onCustomCloseAnimation() {
        return false;
    }

    public boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean onCustomMeasure(View view, int i, int i2) {
        return false;
    }

    public boolean onCustomOpenAnimation() {
        return false;
    }

    public void onDismissAnimationStart() {
    }

    public void onDismissWithTouchOutside() {
        lambda$showGiftOfferSheet$15();
    }

    public void onInsetsChanged() {
    }

    public void onOpenAnimationEnd() {
    }

    public boolean onScrollUp(float f) {
        return false;
    }

    public void onScrollUpBegin(float f) {
    }

    public void onScrollUpEnd(float f) {
    }

    public void onSmoothContainerViewLayout(float f) {
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    public void onSwipeStarts() {
    }

    public void processLegacyContainerInsets(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || AndroidUtilities.isInMultiwindow) && this.statusBarHeight != systemWindowInsetTop) {
            this.statusBarHeight = systemWindowInsetTop;
        }
        this.lastInsets = windowInsets;
        this.container.requestLayout();
        onInsetsChanged();
    }

    public void release() {
        dismissInternal();
    }

    public void setAllowNestedScroll(boolean z) {
        this.allowNestedScroll = z;
        if (z) {
            return;
        }
        this.containerView.setTranslationY(0.0f);
        onContainerViewTranslation();
    }

    public void setApplyBottomPadding(boolean z) {
        this.applyBottomPadding = z;
    }

    public void setApplyTopPadding(boolean z) {
        this.applyTopPadding = z;
    }

    public void setBackgroundColor(int i) {
        this.shadowDrawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        if (this.internalBackgroundColor != i) {
            this.internalBackgroundColor = i;
            ContainerView containerView = this.container;
            if (containerView != null) {
                int measuredHeight = containerView.getMeasuredHeight();
                ContainerView containerView2 = this.container;
                containerView.invalidate(0, measuredHeight - containerView2.internalPaddingBottom, containerView2.getMeasuredWidth(), this.container.getMeasuredHeight());
            }
        }
    }

    public void setCalcMandatoryInsets(boolean z) {
        this.calcMandatoryInsets = z;
        this.drawNavigationBar = z;
    }

    public void setCanDismissWithSwipe(boolean z) {
        this.canDismissWithSwipe = z;
    }

    public void setCanDismissWithTouchOutside(boolean z) {
        this.canDismissWithTouchOutside = z;
    }

    public void setCurrentPanTranslationY(float f) {
        this.currentPanTranslationY = f;
        this.container.invalidate();
    }

    public void setCustomView(View view) {
        this.customView = view;
    }

    public void setDelegate(BottomSheetDelegateInterface bottomSheetDelegateInterface) {
        this.delegate = bottomSheetDelegateInterface;
    }

    public BottomSheet setDimBehind(boolean z) {
        this.dimBehind = z;
        return this;
    }

    public void setDimBehindAlpha(int i) {
        this.dimBehindAlpha = i;
    }

    public void setDisableScroll(boolean z) {
        this.disableScroll = z;
    }

    public void setFocusable(boolean z) {
        if (this.focusable == z) {
            return;
        }
        this.focusable = z;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.focusable) {
            attributes.softInputMode = this.focusableSoftInputMode;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public void setHideSystemVerticalInsets(boolean z) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.hideSystemVerticalInsetsProgress, z ? 1.0f : 0.0f).setDuration(180L);
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        duration.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda1(this, 4));
        duration.start();
    }

    public void setImageReceiverNumLevel(int i, int i2) {
        this.playingImagesLayerNum = i;
        this.openedLayerNum = i2;
    }

    public void setItemColor(int i, int i2, int i3) {
        if (i < 0 || i >= this.itemViews.size()) {
            return;
        }
        BottomSheetCell bottomSheetCell = this.itemViews.get(i);
        bottomSheetCell.textView.setTextColor(i2);
        bottomSheetCell.imageView.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
    }

    public void setItemText(int i, CharSequence charSequence) {
        if (i < 0 || i >= this.itemViews.size()) {
            return;
        }
        this.itemViews.get(i).textView.setText(charSequence);
    }

    public void setItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnClickListener onClickListener) {
        this.items = charSequenceArr;
        this.itemIcons = iArr;
        this.onClickListener = onClickListener;
    }

    @Override
    public void setKeyboardHeightFromParent(int i) {
    }

    public void setLastVisible(boolean z) {
    }

    @Override
    public void setOnDismissListener(Runnable runnable) {
        if (runnable != null) {
            setOnHideListener(new BottomSheet$$ExternalSyntheticLambda4(runnable, 0));
        }
    }

    public void setOnHideListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onHideListener = onDismissListener;
    }

    public void setOpenNoDelay(boolean z) {
        this.openNoDelay = z;
    }

    public void setOverlayNavBarColor(int i) {
        this.overlayDrawNavBarColor = i;
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
        if (this.attachedFragment != null) {
            LaunchActivity.instance.checkSystemBarColors(true, true, true);
            AndroidUtilities.setLightNavigationBar(mo1107getWindowView(), AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(getThemedColor(Theme.key_windowBackgroundGray))) >= 0.721f);
        } else {
            AndroidUtilities.setNavigationBarColor(this, this.overlayDrawNavBarColor);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.overlayDrawNavBarColor)) > 0.721d);
        }
    }

    public void setShowWithoutAnimation(boolean z) {
        this.showWithoutAnimation = z;
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, false);
    }

    public void setTitleColor(int i) {
        TextView textView = this.titleView;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public void setUseLightStatusBar(boolean z) {
        this.useLightStatusBar = z;
        if (Build.VERSION.SDK_INT >= 23) {
            int color = Theme.getColor(null, Theme.key_actionBarDefault, true);
            int systemUiVisibility = this.container.getSystemUiVisibility();
            this.container.setSystemUiVisibility((this.useLightStatusBar && color == -1) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
        if (this.attachedFragment != null) {
            LaunchActivity.instance.checkSystemBarColors(true, true, true);
        }
    }

    public boolean shouldOverlayCameraViewOverNavBar() {
        return false;
    }

    @Override
    public void show() {
        int i = 0;
        if (AndroidUtilities.isSafeToShow(getContext())) {
            if (this.attachedFragment != null) {
                onCreateInternal();
            } else {
                super.show();
            }
            if (!this.showing) {
                this.showing = true;
                if (this.openedLayerNum > 0) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
                }
            }
            if (this.focusable) {
                getWindow().setSoftInputMode(this.focusableSoftInputMode);
            }
            this.dismissed = false;
            cancelSheetAnimation();
            this.containerView.measure(View.MeasureSpec.makeMeasureSpec((this.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
            if (this.showWithoutAnimation) {
                SheetBackDrawable sheetBackDrawable = this.backDrawable;
                sheetBackDrawable.bgPaint.setAlpha(this.dimBehind ? this.dimBehindAlpha : 0);
                sheetBackDrawable.invalidateSelf();
                this.containerView.setTranslationY(0.0f);
                onContainerViewTranslation();
                return;
            }
            SheetBackDrawable sheetBackDrawable2 = this.backDrawable;
            sheetBackDrawable2.bgPaint.setAlpha(0);
            sheetBackDrawable2.invalidateSelf();
            this.layoutCount = 2;
            ViewGroup viewGroup = this.containerView;
            viewGroup.setTranslationY(((1.0f - this.hideSystemVerticalInsetsProgress) * AndroidUtilities.statusBarHeight) + viewGroup.getMeasuredHeight() + (this.scrollNavBar ? Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) : 0));
            onContainerViewTranslation();
            long j = this.openNoDelay ? 0L : 150L;
            if (this.waitingKeyboard) {
                j = 500;
            }
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this, i);
            this.startAnimationRunnable = anonymousClass4;
            AndroidUtilities.runOnUIThread(anonymousClass4, j);
        }
    }

    @Override
    public boolean showDialog(Dialog dialog) {
        return false;
    }

    public void skipDismissAnimation() {
        this.skipDismissAnimation = true;
    }

    public void smoothContainerViewLayout() {
        this.smoothContainerViewLayoutUntil = System.currentTimeMillis() + 80;
    }

    public final void startOpenAnimation$1() {
        int i = 0;
        if (this.dismissed) {
            return;
        }
        this.containerView.setVisibility(0);
        if (onCustomOpenAnimation()) {
            return;
        }
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        if (this.transitionFromRight) {
            this.containerView.setTranslationX(AndroidUtilities.dp(48.0f));
            this.containerView.setAlpha(0.0f);
            this.containerView.setTranslationY(0.0f);
        } else {
            this.containerView.setTranslationY(Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + this.keyboardHeight);
        }
        onContainerViewTranslation();
        this.currentSheetAnimationType = 1;
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda1(this, 6));
        this.currentSheetAnimation = new AnimatorSet();
        ArrayList<Animator> arrayList = new ArrayList<>();
        arrayList.add(ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
        objectAnimatorOfFloat.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda1(this, 7));
        arrayList.add(objectAnimatorOfFloat);
        arrayList.add(ObjectAnimator.ofInt(this.backDrawable, (Property<SheetBackDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, this.dimBehind ? this.dimBehindAlpha : 0));
        arrayList.add(this.navigationBarAnimation);
        appendOpenAnimator(true, arrayList);
        this.currentSheetAnimation.playTogether(arrayList);
        if (this.transitionFromRight) {
            this.currentSheetAnimation.setDuration(250L);
            this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        } else {
            this.currentSheetAnimation.setDuration(this.openDuration);
            this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        }
        this.currentSheetAnimation.setStartDelay(this.waitingKeyboard ? 0L : 20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        this.notificationsLocker.lock();
        this.currentSheetAnimation.addListener(new AnonymousClass5(this, i));
        if (this.pauseAllHeavyOperations) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        this.currentSheetAnimation.start();
    }

    public void transitionFromRight(boolean z) {
        this.transitionFromRight = z;
    }

    public BottomSheet(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.useHardwareLayer = true;
        this.backDrawable = new SheetBackDrawable();
        this.useLightStatusBar = true;
        int i = Theme.key_dialogBackground;
        this.behindKeyboardColorKey = i;
        this.canDismissWithSwipe = true;
        this.canDismissWithTouchOutside = true;
        this.allowCustomAnimation = true;
        this.statusBarHeight = AndroidUtilities.statusBarHeight;
        this.openDuration = 400;
        this.openInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.focusableSoftInputMode = 16;
        this.dimBehind = true;
        this.dimBehindAlpha = 51;
        this.allowNestedScroll = true;
        this.applyTopPadding = true;
        this.applyBottomPadding = true;
        this.itemViews = new ArrayList<>();
        this.dismissRunnable = new BottomSheet$$ExternalSyntheticLambda5(this, 1);
        this.navigationBarAlpha = 0.0f;
        this.navBarColorKey = Theme.key_windowBackgroundGray;
        this.pauseAllHeavyOperations = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.useBackgroundTopPadding = true;
        this.customViewGravity = 51;
        this.smoothContainerViewLayoutUntil = -1L;
        this.resourcesProvider = resourcesProvider;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            getWindow().addFlags(-2147483392);
            if (z2) {
                this.focusableSoftInputMode = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        int themedColor = getThemedColor(i);
        this.internalBackgroundColor = themedColor;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        this.backgroundPaddingLeft = rect.left;
        this.backgroundPaddingTop = rect.top;
        ContainerView containerView = new ContainerView(getContext()) {

            public final class C00021 implements Bulletin.Delegate {
                @Override
                public final boolean allowLayoutChanges() {
                    return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public final boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public final boolean clipWithGradient(int i) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
                }

                @Override
                public final int getBottomOffset(int i) {
                    return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
                }

                @Override
                public final int getLeftPadding() {
                    return Bulletin.Delegate.CC.$default$getLeftPadding(this);
                }

                @Override
                public final int getRightPadding() {
                    return Bulletin.Delegate.CC.$default$getRightPadding(this);
                }

                @Override
                public final int getTopOffset(int i) {
                    return AndroidUtilities.statusBarHeight;
                }

                @Override
                public final void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public final void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public final void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                }
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                BottomSheet.this.mainContainerDispatchDraw(canvas);
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                try {
                    return super.drawChild(canvas, view, j);
                } catch (Exception e) {
                    FileLog.e(e);
                    return true;
                }
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                Bulletin.addDelegate(this, new C00021());
            }

            @Override
            public final void onConfigurationChanged(Configuration configuration) {
                BottomSheet bottomSheet = BottomSheet.this;
                bottomSheet.lastInsets = null;
                bottomSheet.container.requestApplyInsets();
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                Bulletin.removeDelegate(this);
            }
        };
        this.container = containerView;
        containerView.setClipChildren(false);
        this.container.setClipToPadding(false);
        this.container.setBackground(this.backDrawable);
        this.focusable = z;
        if (!z2) {
            this.container.setFitsSystemWindows(true);
            this.container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return this.f$0.lambda$new$1(view, windowInsets);
                }
            });
        }
        if (i2 >= 30) {
            this.container.setSystemUiVisibility(1792);
        } else {
            this.container.setSystemUiVisibility(1280);
        }
        SheetBackDrawable sheetBackDrawable = this.backDrawable;
        sheetBackDrawable.bgPaint.setAlpha(0);
        sheetBackDrawable.invalidateSelf();
    }

    public void fixNavigationBar(int i) {
        this.drawNavigationBar = !this.occupyNavigationBar;
        this.drawDoubleNavigationBar = true;
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.navBarColor = i;
        setOverlayNavBarColor(i);
    }

    @Override
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public void setTitle(CharSequence charSequence, boolean z) {
        this.title = charSequence;
        this.bigTitle = z;
    }

    @Override
    public void dismiss(boolean z) {
        lambda$showGiftOfferSheet$15();
    }
}
