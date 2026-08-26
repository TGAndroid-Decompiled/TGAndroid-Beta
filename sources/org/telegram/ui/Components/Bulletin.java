package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
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
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.stripe.android.time.Clock;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.audioinfo.mp3.MP3Info;
import org.telegram.messenger.support.SparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.CameraScanActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda211;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda241;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda420;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.quickforward.BlurVisibilityDrawable;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12;
import org.telegram.ui.MainTabsLayout;
import org.telegram.ui.PhotoViewer$6$$ExternalSyntheticLambda0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ViewPagerActivity;

public class Bulletin {
    public static Bulletin visibleBulletin;
    public boolean allowBlurAnimation;
    public SpringAnimation bottomOffsetSpring;
    public boolean canHide;
    public final BaseFragment containerFragment;
    public final FrameLayout containerLayout;
    public Bulletin$$ExternalSyntheticLambda1 containerLayoutListener;
    public Delegate currentDelegate;
    public int duration;
    public int hash;
    public boolean hideAfterBottomSheet;
    public final Runnable hideRunnable;
    public boolean ignoreDetach;
    public int lastBottomOffset;
    public final Layout layout;
    public Layout.Transition layoutTransition;
    public boolean loaded;
    public Runnable onHideListener;
    public final AnonymousClass1 parentLayout;
    public boolean setCanHideOnShow;
    public boolean showing;
    public boolean skipShowAnimation;
    public int tag;

    public final class AnonymousClass1 extends FrameLayout {
        public final GestureDetector gestureDetector;
        public boolean hideAnimationRunning;
        public final Layout layout;
        public boolean needLeftAlphaAnimation;
        public boolean needRightAlphaAnimation;
        public boolean pressed;
        public final Rect rect;
        public boolean scrolling;
        public float translationX;
        public float tx;
        public float ty;
        public final FrameLayout val$containerLayout;
        public boolean wasCanHide;

        public AnonymousClass1(Layout layout, FrameLayout frameLayout) {
            super(layout.getContext());
            this.val$containerLayout = frameLayout;
            this.rect = new Rect();
            this.layout = layout;
            GestureDetector gestureDetector = new GestureDetector(layout.getContext(), new Bulletin$ParentLayout$1(this, layout));
            this.gestureDetector = gestureDetector;
            gestureDetector.setIsLongpressEnabled(false);
            addView(layout);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            View.OnClickListener onClickListener;
            boolean z = this.pressed;
            Layout layout = this.layout;
            if (!z) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = this.rect;
                layout.getHitRect(rect);
                if (!rect.contains((int) x, (int) y)) {
                    return false;
                }
            }
            this.gestureDetector.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            Bulletin bulletin = Bulletin.this;
            FrameLayout frameLayout = this.val$containerLayout;
            if (actionMasked == 0) {
                if (!this.pressed && !this.hideAnimationRunning) {
                    layout.animate().cancel();
                    this.ty = 0.0f;
                    this.tx = 0.0f;
                    this.scrolling = false;
                    this.translationX = layout.getTranslationX();
                    System.currentTimeMillis();
                    Bulletin bulletin2 = layout.bulletin;
                    this.wasCanHide = bulletin2 == null || bulletin2.canHide;
                    this.pressed = true;
                    bulletin.setCanHide(false);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    if (layout.onClickListener != null) {
                        layout.setPressed(true);
                        return true;
                    }
                }
            } else if ((actionMasked == 1 || actionMasked == 3) && this.pressed) {
                if (this.hideAnimationRunning) {
                    if (actionMasked == 1 && layout.isPressed() && (onClickListener = layout.onClickListener) != null && !this.scrolling) {
                        onClickListener.onClick(layout);
                    }
                } else if (Math.abs(this.translationX) > layout.getWidth() / 3.0f) {
                    float fSignum = Math.signum(this.translationX) * layout.getWidth();
                    float f = this.translationX;
                    layout.animate().translationX(fSignum).alpha(((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) < 0 && this.needLeftAlphaAnimation) || ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) > 0 && this.needRightAlphaAnimation) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new PhotoViewer$6$$ExternalSyntheticLambda0(this, fSignum, 2)).start();
                } else {
                    layout.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                    if (actionMasked == 1) {
                        onClickListener.onClick(layout);
                    }
                }
                this.pressed = false;
                bulletin.setCanHide(true);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (layout.onClickListener != null) {
                    layout.setPressed(false);
                }
            }
            return true;
        }
    }

    public final class AnonymousClass2 implements View.OnLayoutChangeListener {
        public final boolean val$top;

        public AnonymousClass2(boolean z) {
            this.val$top = z;
        }

        @Override
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Delegate bulletinDelegate;
            Bulletin bulletin = Bulletin.this;
            bulletin.layout.removeOnLayoutChangeListener(this);
            if (bulletin.showing) {
                Layout layout = bulletin.layout;
                layout.onShow();
                BaseFragment currentVisibleFragment = bulletin.containerFragment;
                boolean z = this.val$top;
                if (z && (currentVisibleFragment instanceof ViewPagerActivity)) {
                    currentVisibleFragment = ((ViewPagerActivity) currentVisibleFragment).getCurrentVisibleFragment();
                }
                if (currentVisibleFragment == null || (bulletinDelegate = currentVisibleFragment.getBulletinDelegate()) == null) {
                    FrameLayout frameLayout = bulletin.containerLayout;
                    if (frameLayout != null) {
                        Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                        if (tag instanceof Delegate) {
                            bulletinDelegate = (Delegate) tag;
                        } else {
                            bulletinDelegate = null;
                        }
                    } else {
                        bulletinDelegate = null;
                    }
                }
                bulletin.currentDelegate = bulletinDelegate;
                if (bulletinDelegate == null && currentVisibleFragment != null) {
                    bulletin.currentDelegate = new ChatActivity.AnonymousClass103(currentVisibleFragment, 4);
                }
                SpringAnimation springAnimation = bulletin.bottomOffsetSpring;
                if (springAnimation == null || !springAnimation.mRunning) {
                    Delegate delegate = bulletin.currentDelegate;
                    bulletin.lastBottomOffset = delegate != null ? delegate.getBottomOffset(bulletin.tag) : 0;
                }
                Delegate delegate2 = bulletin.currentDelegate;
                if (delegate2 != null) {
                    delegate2.onShow(bulletin);
                }
                if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !bulletin.skipShowAnimation) {
                    if (layout != null && bulletin.layoutTransition == null) {
                        bulletin.layoutTransition = layout.createTransition();
                    }
                    layout.transitionRunningEnter = true;
                    layout.delegate = bulletin.currentDelegate;
                    layout.invalidate();
                    Layout.Transition transition = bulletin.layoutTransition;
                    Objects.requireNonNull(layout);
                    transition.animateEnter(layout, new ChatActivity$$ExternalSyntheticLambda420(layout, 2), new Bulletin$2$$ExternalSyntheticLambda1(this, 0), new Bulletin$2$$ExternalSyntheticLambda2(0, this, z));
                    return;
                }
                Delegate delegate3 = bulletin.currentDelegate;
                layout.delegate = delegate3;
                if (delegate3 != null && !z) {
                    delegate3.onBottomOffsetChange(layout.getHeight());
                }
                if (layout != null) {
                    layout.updatePosition();
                }
                layout.onEnterTransitionStart();
                layout.onEnterTransitionEnd();
                if (bulletin.setCanHideOnShow) {
                    bulletin.setCanHide(true);
                }
            }
        }
    }

    public final class BulletinWindow extends Dialog {
        public final BulletinWindowLayout container;
        public final WindowManager.LayoutParams params;

        public final class BulletinWindowLayout extends FrameLayout {
            public BulletinWindowLayout(Context context) {
                super(context);
            }

            @Override
            public final void addView(View view) {
                super.addView(view);
                BulletinWindow.this.show();
            }

            public WindowManager.LayoutParams getLayout() {
                return BulletinWindow.this.params;
            }

            @Override
            public final void removeView(View view) {
                BulletinWindow bulletinWindow = BulletinWindow.this;
                super.removeView(view);
                try {
                    bulletinWindow.dismiss();
                } catch (Exception unused) {
                }
                Bulletin.removeDelegate(bulletinWindow.container);
            }

            public void setTouchable(boolean z) {
                BulletinWindow bulletinWindow = BulletinWindow.this;
                WindowManager.LayoutParams layoutParams = bulletinWindow.params;
                if (layoutParams == null) {
                    return;
                }
                if (z) {
                    layoutParams.flags &= -17;
                } else {
                    layoutParams.flags |= 16;
                }
                bulletinWindow.getWindow().setAttributes(bulletinWindow.params);
            }
        }

        public BulletinWindow(Context context, LaunchActivity.AnonymousClass7 anonymousClass7) {
            super(context);
            AndroidUtilities.enableEdgeToEdge(getWindow());
            BulletinWindowLayout bulletinWindowLayout = new BulletinWindowLayout(context);
            this.container = bulletinWindowLayout;
            setContentView(bulletinWindowLayout, new ViewGroup.LayoutParams(-1, -1));
            ColorPicker$$ExternalSyntheticLambda6 colorPicker$$ExternalSyntheticLambda6 = new ColorPicker$$ExternalSyntheticLambda6(this, 9);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(bulletinWindowLayout, colorPicker$$ExternalSyntheticLambda6);
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                bulletinWindowLayout.setSystemUiVisibility(1792);
            } else {
                bulletinWindowLayout.setSystemUiVisibility(1280);
            }
            bulletinWindowLayout.setTag(R.id.bulletin_delegate_tag, new ChatActivity.AnonymousClass103(anonymousClass7, 5));
            try {
                Window window = getWindow();
                window.setWindowAnimations(R.style.DialogNoAnimation);
                window.setBackgroundDrawable(null);
                WindowManager.LayoutParams attributes = window.getAttributes();
                this.params = attributes;
                attributes.width = -1;
                attributes.height = -1;
                attributes.gravity = 51;
                attributes.dimAmount = 0.0f;
                attributes.format = -3;
                attributes.flags = (((-3) & attributes.flags) | (-1946091240)) & (-1025);
                if (i >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
                AndroidUtilities.setLightNavigationBar(this, AndroidUtilities.computePerceivedBrightness(Theme.getColor(null, Theme.key_windowBackgroundGray, false)) > 0.721f);
            } catch (Exception unused) {
            }
        }

        @Override
        public final void show() {
            if (AndroidUtilities.isSafeToShow(getContext())) {
                super.show();
            }
        }
    }

    public abstract class Button extends FrameLayout implements Layout.Callback {
        @Override
        public final void onHide() {
        }

        @Override
        public final void onShow() {
        }
    }

    public abstract class ButtonLayout extends Layout {
        private Button button;
        private int childrenMeasuredWidth;
        Theme.ResourcesProvider resourcesProvider;
        public TimerView timerView;
        private boolean wrapWidth;

        public ButtonLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.resourcesProvider = resourcesProvider;
        }

        public Button getButton() {
            return this.button;
        }

        @Override
        public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
            Button button = this.button;
            if (button != null && view != button) {
                i2 = zzlb.m(button.getMeasuredWidth(), 12.0f, i2);
            }
            super.measureChildWithMargins(view, i, i2, i3, i4);
            if (view != this.button) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                this.childrenMeasuredWidth = Math.max(this.childrenMeasuredWidth, view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            this.childrenMeasuredWidth = 0;
            if (this.wrapWidth) {
                i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.button == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
                return;
            }
            setMeasuredDimension(this.button.getMeasuredWidth() + this.childrenMeasuredWidth, getMeasuredHeight());
        }

        public void setButton(Button button) {
            Button button2 = this.button;
            if (button2 != null) {
                removeCallback(button2);
                removeView(this.button);
            }
            this.button = button;
            if (button != null) {
                addCallback(button);
                addView(button, 0, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388629));
            }
        }

        public void setTimer() {
            TimerView timerView = new TimerView(getContext(), this.resourcesProvider);
            this.timerView = timerView;
            timerView.timeLeft = 5000L;
            addView(timerView, LayoutHelper.createFrameRelatively(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
        }

        public void setWrapWidth() {
            this.wrapWidth = true;
        }
    }

    public interface Delegate {
        boolean allowLayoutChanges();

        boolean bottomOffsetAnimated();

        boolean clipWithGradient(int i);

        int getBottomOffset(int i);

        int getTopOffset();

        void onBottomOffsetChange(float f);

        void onHide(Bulletin bulletin);

        void onShow(Bulletin bulletin);
    }

    public final class EmptyBulletin extends Bulletin {
        @Override
        public final Bulletin show() {
            return this;
        }
    }

    public abstract class Layout extends FrameLayout {
        public static final FloatPropertyCompat IN_OUT_OFFSET_Y = new MainTabsLayout.AnonymousClass1(1);
        public static final Property<Layout, Float> IN_OUT_OFFSET_Y2 = new ChatActivity.AnonymousClass5("offsetY", 11);
        Drawable background;
        private BlurVisibilityDrawable blurVisibilityDrawable;
        protected Bulletin bulletin;
        private final List<Callback> callbacks;
        private LinearGradient clipGradient;
        private Matrix clipMatrix;
        private Paint clipPaint;
        Delegate delegate;
        private boolean hasCustomBackground;
        public float inOutOffset;
        public View.OnClickListener onClickListener;
        private final Theme.ResourcesProvider resourcesProvider;
        public boolean top;
        public boolean transitionRunningEnter;
        public boolean transitionRunningExit;
        private int wideScreenGravity;
        private int wideScreenWidth;

        public interface Callback {
            void onAttach(Bulletin bulletin);

            void onDetach();

            void onHide();

            void onShow();
        }

        public interface Transition {
            void animateEnter(Layout layout, ChatActivity$$ExternalSyntheticLambda420 chatActivity$$ExternalSyntheticLambda420, Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1, Bulletin$2$$ExternalSyntheticLambda2 bulletin$2$$ExternalSyntheticLambda2);

            void animateExit(Layout layout, ChatActivity$$ExternalSyntheticLambda420 chatActivity$$ExternalSyntheticLambda420, Bulletin$$ExternalSyntheticLambda0 bulletin$$ExternalSyntheticLambda0, ChatActivity$$ExternalSyntheticLambda211 chatActivity$$ExternalSyntheticLambda211);
        }

        public Layout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.callbacks = new ArrayList();
            this.wideScreenWidth = -2;
            this.wideScreenGravity = 1;
            this.resourcesProvider = resourcesProvider;
            setMinimumHeight(AndroidUtilities.dp(48.0f));
            setBackground(getThemedColor(Theme.key_undo_background));
            updateSize();
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            setWillNotDraw(false);
            ScaleStateListAnimator.apply(this, 0.02f, 1.5f);
        }

        public static void access$000(Layout layout, int i, int i2) {
            boolean z;
            boolean z2 = true;
            if (layout.wideScreenWidth != i) {
                layout.wideScreenWidth = i;
                z = true;
            } else {
                z = false;
            }
            if (layout.wideScreenGravity != i2) {
                layout.wideScreenGravity = i2;
            } else {
                z2 = z;
            }
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    return;
                }
            }
            if (z2) {
                layout.updateSize();
            }
        }

        public static boolean access$1400(Layout layout, boolean z) {
            int i;
            layout.getClass();
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x >= point.y) {
                    if (layout.wideScreenWidth != -1) {
                        i = layout.wideScreenGravity;
                        if (i == 1) {
                            return true;
                        }
                        if (z) {
                            if (i == 5) {
                                return true;
                            }
                            return false;
                        }
                        if (i != 5) {
                            return true;
                        }
                        return false;
                    }
                }
            } else if (layout.wideScreenWidth != -1) {
                i = layout.wideScreenGravity;
                if (i == 1) {
                    return true;
                }
                if (z) {
                    if (i == 5) {
                        return true;
                    }
                    return false;
                }
                if (i != 5) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public void setInOutOffset(float f) {
            this.inOutOffset = f;
            updatePosition();
            Bulletin bulletin = this.bulletin;
            if (bulletin == null || !bulletin.allowBlurAnimation) {
                return;
            }
            invalidate();
        }

        public void addCallback(Callback callback) {
            this.callbacks.add(callback);
        }

        public Transition createTransition() {
            return new Clock(24);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            Bulletin bulletin = this.bulletin;
            if (bulletin == null || !bulletin.allowBlurAnimation) {
                dispatchDrawImpl(canvas, false, 255);
                return;
            }
            if (this.blurVisibilityDrawable == null) {
                this.blurVisibilityDrawable = new BlurVisibilityDrawable(new ColorPicker$$ExternalSyntheticLambda6(this, 10));
            }
            BlurVisibilityDrawable blurVisibilityDrawable = this.blurVisibilityDrawable;
            if (blurVisibilityDrawable.bitmap == null) {
                blurVisibilityDrawable.render(getMeasuredWidth(), getMeasuredHeight(), 6.0f, AndroidUtilities.dp(10.0f));
            }
            this.blurVisibilityDrawable.alpha = MathUtils.clamp((int) OKLCH.m$1(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
            this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurVisibilityDrawable.draw(canvas);
        }

        public void dispatchDrawImpl(Canvas canvas, boolean z, int i) {
            Delegate delegate;
            Canvas canvas2 = canvas;
            if (this.bulletin == null || i == 0) {
                return;
            }
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (!isTransitionRunning() || (delegate = this.delegate) == null) {
                this.background.draw(canvas2);
                super.dispatchDraw(canvas);
                return;
            }
            int i2 = this.bulletin.tag;
            float topOffset = delegate.getTopOffset() - getY();
            float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
            boolean z2 = !z && this.delegate.clipWithGradient(this.bulletin.tag);
            canvas2.save();
            if (!z) {
                canvas2.clipRect(0.0f, topOffset, getMeasuredWidth(), measuredHeight);
            }
            boolean z3 = z2 || i != 255;
            if (z3) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i, 31);
            }
            this.background.draw(canvas2);
            super.dispatchDraw(canvas);
            if (z2) {
                if (this.clipPaint == null) {
                    Paint paint = new Paint(1);
                    this.clipPaint = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.clipGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), this.top ? new int[]{-16777216, 0} : new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    this.clipMatrix = matrix;
                    this.clipGradient.setLocalMatrix(matrix);
                    this.clipPaint.setShader(this.clipGradient);
                }
                canvas2.save();
                this.clipMatrix.reset();
                this.clipMatrix.postTranslate(0.0f, this.top ? topOffset : measuredHeight - AndroidUtilities.dp(8.0f));
                this.clipGradient.setLocalMatrix(this.clipMatrix);
                if (this.top) {
                    canvas2.drawRect(0.0f, topOffset, getWidth(), topOffset + AndroidUtilities.dp(8.0f), this.clipPaint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, measuredHeight - AndroidUtilities.dp(8.0f), getWidth(), measuredHeight, this.clipPaint);
                }
                canvas2.restore();
            }
            if (z3) {
                canvas2.restore();
            }
            canvas2.restore();
            invalidate();
        }

        public void dispatchDrawImplBlur(Canvas canvas, int i) {
            dispatchDrawImpl(canvas, true, i);
        }

        public CharSequence getAccessibilityText() {
            return null;
        }

        public float getBottomOffset() {
            int bottomOffset;
            Delegate delegate;
            Bulletin bulletin;
            SpringAnimation springAnimation;
            if (this.bulletin == null || !(((delegate = this.delegate) == null || delegate.bottomOffsetAnimated()) && (springAnimation = (bulletin = this.bulletin).bottomOffsetSpring) != null && springAnimation.mRunning)) {
                Delegate delegate2 = this.delegate;
                if (delegate2 == null) {
                    return 0.0f;
                }
                Bulletin bulletin2 = this.bulletin;
                bottomOffset = delegate2.getBottomOffset(bulletin2 != null ? bulletin2.tag : 0);
            } else {
                bottomOffset = bulletin.lastBottomOffset;
            }
            return bottomOffset;
        }

        public Bulletin getBulletin() {
            return this.bulletin;
        }

        public int getMeasuredBackgroundHeight() {
            return getMeasuredHeight();
        }

        public int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }

        public float getTopOffset() {
            Delegate delegate = this.delegate;
            if (delegate != null) {
                return delegate.getTopOffset();
            }
            return 0.0f;
        }

        public boolean isAttachedToBulletin() {
            return this.bulletin != null;
        }

        public boolean isTransitionRunning() {
            return this.transitionRunningEnter || this.transitionRunningExit;
        }

        public void onAttach(Bulletin bulletin) {
            this.bulletin = bulletin;
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onAttach(bulletin);
            }
        }

        @Override
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            updateSize();
        }

        public void onDetach() {
            Bitmap bitmap;
            this.bulletin = null;
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onDetach();
            }
            BlurVisibilityDrawable blurVisibilityDrawable = this.blurVisibilityDrawable;
            if (blurVisibilityDrawable == null || (bitmap = blurVisibilityDrawable.bitmap) == null) {
                return;
            }
            bitmap.recycle();
            blurVisibilityDrawable.bitmap = null;
        }

        public void onEnterTransitionEnd() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).getClass();
            }
        }

        public void onEnterTransitionStart() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).getClass();
            }
        }

        public void onExitTransitionEnd() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).getClass();
            }
        }

        public void onExitTransitionStart() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).getClass();
            }
        }

        public void onHide() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onHide();
            }
        }

        public void onShow() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onShow();
            }
        }

        public void removeCallback(Callback callback) {
            this.callbacks.remove(callback);
        }

        public void setBackground(int i) {
            setBackground(i, 16);
        }

        public void setCustomBackground(Drawable drawable) {
            this.background = drawable;
            this.hasCustomBackground = true;
        }

        @Override
        public void setOnClickListener(View.OnClickListener onClickListener) {
            this.onClickListener = onClickListener;
        }

        public void setTop(boolean z) {
            if (this.top != z) {
                this.top = z;
                updateSize();
            }
        }

        public void updatePosition() {
            Delegate delegate = this.delegate;
            float topOffset = 0.0f;
            if (delegate != null) {
                topOffset = this.top ? 0.0f - delegate.getTopOffset() : 0.0f + getBottomOffset();
            }
            setTranslationY((this.inOutOffset * (this.top ? -1 : 1)) + (-topOffset));
        }

        public final void updateSize() {
            boolean z;
            if (AndroidUtilities.isTablet()) {
                z = true;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x >= point.y) {
                    z = true;
                } else {
                    z = false;
                }
            }
            int i = z ? this.wideScreenWidth : -1;
            int i2 = 80;
            if (z) {
                i2 = (this.top ? 48 : 80) | this.wideScreenGravity;
            } else if (this.top) {
                i2 = 48;
            }
            setLayoutParams(LayoutHelper.createFrame(i, -2, i2));
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            return this.background == drawable || super.verifyDrawable(drawable);
        }

        public void setBackground(int i, int i2) {
            if (this.hasCustomBackground) {
                return;
            }
            this.background = Theme.createRoundRectDrawable(AndroidUtilities.dp(i2), i);
        }
    }

    public interface LoadingLayout {
    }

    public final class LoadingLottieLayout extends LottieLayout implements LoadingLayout {
        public final LinkSpanDrawable.LinksTextView textLoadingView;

        public LoadingLottieLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.textLoadingView = linksTextView;
            linksTextView.setDisablePaddingsOffset(true);
            linksTextView.setSingleLine();
            linksTextView.setTypeface(Typeface.SANS_SERIF);
            linksTextView.setTextSize(1, 15.0f);
            linksTextView.setEllipsize(TextUtils.TruncateAt.END);
            linksTextView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            this.textView.setVisibility(8);
            addView(linksTextView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
            setTextColor(getThemedColor(Theme.key_undo_infoColor));
        }

        @Override
        public void setTextColor(int i) {
            super.setTextColor(i);
            LinkSpanDrawable.LinksTextView linksTextView = this.textLoadingView;
            if (linksTextView != null) {
                linksTextView.setTextColor(i);
            }
        }
    }

    public final class LottieLayoutWithReactions extends LottieLayout implements NotificationCenter.NotificationCenterDelegate {
        public Bulletin bulletin;
        public final BaseFragment fragment;
        public final int messagesCount;
        public SparseLongArray newMessagesByIds;
        public final ContentPreviewViewer.AnonymousClass2 reactionsContainerLayout;

        public final class AnonymousClass2 implements ReactionsContainerLayout.ReactionsContainerDelegate {
            public AnonymousClass2() {
            }

            @Override
            public final boolean allowLongPress() {
                return true;
            }

            @Override
            public final boolean drawBackground() {
                return false;
            }

            @Override
            public final void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            }

            @Override
            public final boolean needEnterText() {
                return false;
            }

            @Override
            public final void onEmojiWindowDismissed() {
            }

            @Override
            public final void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
                LottieLayoutWithReactions lottieLayoutWithReactions = LottieLayoutWithReactions.this;
                if (lottieLayoutWithReactions.newMessagesByIds == null) {
                    return;
                }
                BaseFragment baseFragment = lottieLayoutWithReactions.fragment;
                boolean z3 = (baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getDialogId() == UserConfig.getInstance(baseFragment.getCurrentAccount()).getClientUserId();
                int i = 0;
                for (int i2 = 0; i2 < lottieLayoutWithReactions.newMessagesByIds.size(); i2++) {
                    int iKeyAt = lottieLayoutWithReactions.newMessagesByIds.keyAt(i2);
                    TLRPC.Message message = new TLRPC.Message();
                    message.dialog_id = baseFragment.getUserConfig().getClientUserId();
                    message.id = iKeyAt;
                    MessageObject messageObject = new MessageObject(baseFragment.getCurrentAccount(), message, false, false);
                    ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList = new ArrayList<>();
                    arrayList.add(visibleReaction);
                    baseFragment.getSendMessagesHelper().sendReaction(messageObject, arrayList, visibleReaction, false, false, lottieLayoutWithReactions.fragment, null);
                    i = message.id;
                }
                lottieLayoutWithReactions.hideReactionsDialog();
                Bulletin bulletin = Bulletin.visibleBulletin;
                if (bulletin != null) {
                    bulletin.hide();
                }
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda241(this, visibleReaction, !z3, baseFragment.getCurrentAccount(), i), 300L);
            }
        }

        public LottieLayoutWithReactions(int i, BaseFragment baseFragment) {
            super(baseFragment.getContext(), baseFragment.getResourceProvider());
            this.fragment = baseFragment;
            this.messagesCount = i;
            this.textView.setLayoutParams(LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
            this.imageView.setLayoutParams(LayoutHelper.createFrameRelatively(56.0f, 48.0f, 8388659));
            ContentPreviewViewer.AnonymousClass2 anonymousClass2 = new ContentPreviewViewer.AnonymousClass2(this, baseFragment, getContext(), baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
            this.reactionsContainerLayout = anonymousClass2;
            anonymousClass2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            anonymousClass2.setDelegate(new AnonymousClass2());
            anonymousClass2.setTop(true);
            anonymousClass2.setClipChildren(false);
            anonymousClass2.setClipToPadding(false);
            anonymousClass2.setVisibility(0);
            anonymousClass2.setBubbleOffset(-AndroidUtilities.dp(80.0f));
            anonymousClass2.setHint(LocaleController.getString(R.string.SavedTagReactionsHint));
            addView(anonymousClass2, LayoutHelper.createFrame(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
            anonymousClass2.setMessage(null, null, true);
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.savedMessagesForwarded) {
                this.newMessagesByIds = (SparseLongArray) objArr[0];
            }
        }

        @Override
        public int getMeasuredBackgroundHeight() {
            return AndroidUtilities.dp(30.0f) + this.textView.getMeasuredHeight();
        }

        public final void hideReactionsDialog() {
            ContentPreviewViewer.AnonymousClass2 anonymousClass2 = this.reactionsContainerLayout;
            if (anonymousClass2.getReactionsWindow() != null) {
                CustomEmojiReactionsWindow customEmojiReactionsWindow = anonymousClass2.reactionsWindow;
                if (customEmojiReactionsWindow != null) {
                    customEmojiReactionsWindow.dismiss();
                }
                if (anonymousClass2.getReactionsWindow().containerView != null) {
                    anonymousClass2.getReactionsWindow().containerView.animate().alpha(0.0f).setDuration(180L).start();
                }
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.savedMessagesForwarded);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.savedMessagesForwarded);
        }

        public void setBulletin(Bulletin bulletin) {
            this.bulletin = bulletin;
        }
    }

    public class MultiLineLayout extends ButtonLayout {
        public final BackupImageView imageView;
        public final TextView textView;

        public MultiLineLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.imageView = backupImageView;
            TextView textView = new TextView(getContext());
            this.textView = textView;
            addView(backupImageView, LayoutHelper.createFrameRelatively(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
            textView.setGravity(8388611);
            textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            textView.setTextColor(getThemedColor(Theme.key_undo_infoColor));
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(Typeface.SANS_SERIF);
            addView(textView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return this.textView.getText();
        }
    }

    public final class ProgressLayout extends ButtonLayout {
        public final BackupImageView imageView;
        public boolean inprogress;
        public float progress;
        public final AnonymousClass1 progressView;
        public final AnimatedTextView textView;

        public ProgressLayout(Activity activity, Theme.ResourcesProvider resourcesProvider) {
            super(activity, resourcesProvider);
            ?? r11 = new FrameLayout(activity) {
                public final AnimatedFloat animatedDone;
                public final AnimatedFloat animatedProgress;
                public final RectF rect;
                public final long start;
                public final Paint strokePaint;

                {
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    this.animatedProgress = new AnimatedFloat(320L, this, cubicBezierInterpolator);
                    this.animatedDone = new AnimatedFloat(320L, this, cubicBezierInterpolator);
                    Paint paint = new Paint(1);
                    this.strokePaint = paint;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(268435455);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    this.rect = new RectF();
                    this.start = System.currentTimeMillis();
                }

                @Override
                public final void onDraw(Canvas canvas) {
                    ProgressLayout progressLayout = ProgressLayout.this;
                    float f = this.animatedProgress.set(progressLayout.progress, false);
                    float f2 = this.animatedDone.set(progressLayout.progress >= 1.0f);
                    float width = getWidth() / 2.0f;
                    float height = getHeight() / 2.0f;
                    RectF rectF = this.rect;
                    rectF.set(width - AndroidUtilities.dpf2(13.0f), height - AndroidUtilities.dpf2(13.0f), AndroidUtilities.dpf2(13.0f) + width, AndroidUtilities.dpf2(13.0f) + height);
                    float fCurrentTimeMillis = ((System.currentTimeMillis() - this.start) * 0.45f) % 5400.0f;
                    float fMax = Math.max(0.0f, ((1520.0f * fCurrentTimeMillis) / 5400.0f) - 20.0f);
                    for (int i = 0; i < 4; i++) {
                        FastOutSlowInInterpolator fastOutSlowInInterpolator = CircularProgressDrawable.interpolator;
                        int i2 = i * 1350;
                        fastOutSlowInInterpolator.getInterpolation((fCurrentTimeMillis - i2) / 667.0f);
                        fMax += fastOutSlowInInterpolator.getInterpolation((fCurrentTimeMillis - (i2 + 667)) / 667.0f) * 250.0f;
                    }
                    Paint paint = this.strokePaint;
                    paint.setColor(Theme.multAlpha((1.0f - f2) * 1.0f, -1));
                    canvas.drawArc(rectF, (-90.0f) - fMax, Math.max(0.02f, f) * (-360.0f), false, paint);
                    if (f < 1.0f && f2 < 1.0f) {
                        invalidate();
                    }
                    super.onDraw(canvas);
                }
            };
            this.progressView = r11;
            r11.setWillNotDraw(false);
            addView((View) r11, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
            BackupImageView backupImageView = new BackupImageView(activity);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
            r11.addView(backupImageView, LayoutHelper.createFrame(28, 28, 17));
            AnimatedTextView animatedTextView = new AnimatedTextView(activity, false, false, false);
            this.textView = animatedTextView;
            animatedTextView.setTypeface(Typeface.SANS_SERIF);
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            addView(animatedTextView, LayoutHelper.createFrameRelatively(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
            setTextColor(getThemedColor(Theme.key_undo_infoColor));
            setBackground(getThemedColor(Theme.key_undo_background));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return this.textView.getText();
        }

        public void setProgress(float f) {
            if (this.inprogress != (f < 1.0f)) {
                this.inprogress = f < 1.0f;
                this.imageView.animate().scaleX(this.inprogress ? 0.78f : 1.0f).scaleY(this.inprogress ? 0.78f : 1.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            this.progress = f;
            invalidate();
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }
    }

    public class SimpleLayout extends ButtonLayout {
        public final ImageView imageView;
        public final LinkSpanDrawable.LinksTextView textView;

        public SimpleLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            int themedColor = getThemedColor(Theme.key_undo_infoColor);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.textView = linksTextView;
            linksTextView.setDisablePaddingsOffsetY(true);
            linksTextView.setSingleLine();
            linksTextView.setTextColor(themedColor);
            linksTextView.setTypeface(Typeface.SANS_SERIF);
            linksTextView.setTextSize(1, 15.0f);
            addView(linksTextView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return this.textView.getText();
        }
    }

    public final class TimerView extends View {
        public long lastUpdateTime;
        public int prevSeconds;
        public final Paint progressPaint;
        public final RectF rect;
        public final TextPaint textPaint;
        public int textWidth;
        public int textWidthOut;
        public StaticLayout timeLayout;
        public StaticLayout timeLayoutOut;
        public long timeLeft;
        public String timeLeftString;
        public float timeReplaceProgress;

        public TimerView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.timeReplaceProgress = 1.0f;
            this.rect = new RectF();
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            Paint paint = new Paint(1);
            this.progressPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            setColor(Theme.getColor(Theme.key_undo_infoColor, resourcesProvider));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            long j = this.timeLeft;
            int iCeil = j > 0 ? (int) Math.ceil(j / 1000.0f) : 0;
            RectF rectF = this.rect;
            rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
            int i = this.prevSeconds;
            TextPaint textPaint = this.textPaint;
            if (i != iCeil) {
                this.prevSeconds = iCeil;
                String strValueOf = String.valueOf(Math.max(0, iCeil));
                this.timeLeftString = strValueOf;
                StaticLayout staticLayout = this.timeLayout;
                if (staticLayout != null) {
                    this.timeLayoutOut = staticLayout;
                    this.timeReplaceProgress = 0.0f;
                    this.textWidthOut = this.textWidth;
                }
                this.textWidth = (int) Math.ceil(textPaint.measureText(strValueOf));
                this.timeLayout = new StaticLayout(this.timeLeftString, textPaint, Integer.MAX_VALUE, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f = this.timeReplaceProgress;
            if (f < 1.0f) {
                float f2 = f + 0.10666667f;
                this.timeReplaceProgress = f2;
                if (f2 > 1.0f) {
                    this.timeReplaceProgress = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            if (this.timeLayoutOut != null) {
                float f3 = this.timeReplaceProgress;
                if (f3 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f3) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.textWidthOut / 2.0f), ((AndroidUtilities.dp(10.0f) * this.timeReplaceProgress) + (rectF.centerY() - (this.timeLayoutOut.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                    this.timeLayoutOut.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.timeLayout != null) {
                float f4 = this.timeReplaceProgress;
                if (f4 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f4));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.textWidth / 2.0f), BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.timeReplaceProgress, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.timeLayout.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
                this.timeLayout.draw(canvas);
                if (this.timeReplaceProgress != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (-360.0f) * (Math.max(0L, this.timeLeft) / 5000.0f), false, this.progressPaint);
            if (this.lastUpdateTime != 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.timeLeft -= jCurrentTimeMillis - this.lastUpdateTime;
                this.lastUpdateTime = jCurrentTimeMillis;
            } else {
                this.lastUpdateTime = System.currentTimeMillis();
            }
            invalidate();
        }

        public void setColor(int i) {
            this.textPaint.setColor(i);
            this.progressPaint.setColor(i);
        }
    }

    public final class TwoLineAnimatedLottieLayout extends ButtonLayout {
        public final RLottieImageView imageView;
        public final AnimatedTextView subtitleTextView;
        public final int textColor;
        public final AnimatedTextView titleTextView;

        public TwoLineAnimatedLottieLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            int i = Theme.key_undo_infoColor;
            this.textColor = getThemedColor(i);
            setBackground(getThemedColor(Theme.key_undo_background));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(rLottieImageView, LayoutHelper.createFrameRelatively(56.0f, 48.0f, 8388627));
            int themedColor = getThemedColor(i);
            getThemedColor(Theme.key_undo_cancelColor);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
            this.titleTextView = animatedTextView;
            animatedTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            animatedTextView.setTextColor(themedColor);
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setEllipsizeByGradient(true);
            linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-1, 20));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context, true, true, true);
            this.subtitleTextView = animatedTextView2;
            animatedTextView2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            animatedTextView2.setTextColor(themedColor);
            animatedTextView2.setTypeface(Typeface.SANS_SERIF);
            animatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
            animatedTextView2.setEllipsizeByGradient(true);
            linearLayout.addView(animatedTextView2, LayoutHelper.createLinear(-1, 18));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        @Override
        public final void onShow() {
            super.onShow();
            this.imageView.playAnimation();
        }

        public final void setAnimation(int i, String... strArr) {
            RLottieImageView rLottieImageView = this.imageView;
            rLottieImageView.setAnimation(i, 32, 32, null);
            for (String str : strArr) {
                rLottieImageView.setLayerColor(this.textColor, str);
            }
        }
    }

    public final class TwoLineBackupLayout extends ButtonLayout {
        public final BackupImageView imageView;
        public final LinkSpanDrawable.LinksTextView subtitleTextView;
        public final LinkSpanDrawable.LinksTextView titleTextView;

        public TwoLineBackupLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            int i = Theme.key_undo_infoColor;
            getThemedColor(i);
            setBackground(getThemedColor(Theme.key_undo_background));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
            int themedColor = getThemedColor(i);
            int themedColor2 = getThemedColor(Theme.key_undo_cancelColor);
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            addView(linearLayoutM, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.titleTextView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            linksTextView.setTextColor(themedColor);
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTypeface(AndroidUtilities.bold());
            linearLayoutM.addView(linksTextView);
            LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, null);
            this.subtitleTextView = linksTextView2;
            linksTextView2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            linksTextView2.setTextColor(themedColor);
            linksTextView2.setLinkTextColor(themedColor2);
            linksTextView2.setTypeface(Typeface.SANS_SERIF);
            linksTextView2.setTextSize(1, 13.0f);
            linearLayoutM.addView(linksTextView2);
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }
    }

    public class TwoLineLayout extends ButtonLayout {
        public final BackupImageView imageView;
        public final TextView subtitleTextView;
        public final TextView titleTextView;

        public TwoLineLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            int themedColor = getThemedColor(Theme.key_undo_infoColor);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrameRelatively(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setSingleLine();
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView);
            TextView textView2 = new TextView(context);
            this.subtitleTextView = textView2;
            textView2.setMaxLines(2);
            textView2.setTextColor(themedColor);
            textView2.setLinkTextColor(getThemedColor(Theme.key_undo_cancelColor));
            textView2.setMovementMethod(new LinkMovementMethod());
            textView2.setTypeface(Typeface.SANS_SERIF);
            textView2.setTextSize(1, 13.0f);
            linearLayout.addView(textView2);
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }
    }

    public final class TwoLineLottieLayout extends ButtonLayout {
        public final RLottieImageView imageView;
        public final LinearLayout linearLayout;
        public final LinkSpanDrawable.LinksTextView subtitleTextView;
        public final int textColor;
        public final LinkSpanDrawable.LinksTextView titleTextView;

        public TwoLineLottieLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            int i = Theme.key_undo_infoColor;
            this.textColor = getThemedColor(i);
            setBackground(getThemedColor(Theme.key_undo_background));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(rLottieImageView, LayoutHelper.createFrameRelatively(56.0f, 48.0f, 8388627));
            int themedColor = getThemedColor(i);
            int themedColor2 = getThemedColor(Theme.key_undo_cancelColor);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.titleTextView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            linksTextView.setTextColor(themedColor);
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(linksTextView);
            LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, null);
            this.subtitleTextView = linksTextView2;
            linksTextView2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            linksTextView2.setTextColor(themedColor);
            linksTextView2.setLinkTextColor(themedColor2);
            linksTextView2.setTypeface(Typeface.SANS_SERIF);
            linksTextView2.setTextSize(1, 13.0f);
            linearLayout.addView(linksTextView2);
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public final void hideImage() {
            this.imageView.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.linearLayout.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        }

        @Override
        public final void onShow() {
            super.onShow();
            this.imageView.playAnimation();
        }

        public final void setAnimation(int i, int i2, int i3, String... strArr) {
            RLottieImageView rLottieImageView = this.imageView;
            rLottieImageView.setAnimation(i, i2, i3, null);
            for (String str : strArr) {
                rLottieImageView.setLayerColor(this.textColor, str);
            }
        }
    }

    public final class UndoButton extends Button {
        public Bulletin bulletin;
        public Runnable delayedAction;
        public boolean isUndone;
        public Runnable undoAction;
        public final TextView undoTextView;

        public UndoButton(Context context) {
            this(context, null, false, true);
        }

        @Override
        public final void onAttach(Bulletin bulletin) {
            this.bulletin = bulletin;
        }

        @Override
        public final void onDetach() {
            this.bulletin = null;
            Runnable runnable = this.delayedAction;
            if (runnable == null || this.isUndone) {
                return;
            }
            runnable.run();
        }

        public final void undo() {
            if (this.bulletin != null) {
                this.isUndone = true;
                Runnable runnable = this.undoAction;
                if (runnable != null) {
                    runnable.run();
                }
                Bulletin bulletin = this.bulletin;
                if (bulletin != null) {
                    bulletin.hide();
                }
            }
        }

        public UndoButton(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
            super(context);
            int i = Theme.key_undo_cancelColor;
            int color = resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
            if (z) {
                TextView textView = new TextView(context);
                this.undoTextView = textView;
                textView.setBackground(Theme.createSelectorDrawable((color & 16777215) | 419430400, 7, -1));
                textView.setTextSize(1, 14.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(color);
                zzkg.m(R.string.UndoNoCaps, textView, 16);
                float f = z2 ? 34.0f : 12.0f;
                boolean z3 = LocaleController.isRTL;
                ViewHelper.setPadding(textView, z3 ? 12.0f : f, 8.0f, z3 ? f : 12.0f, 8.0f);
                addView(textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
            }
            if (z2) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(R.drawable.chats_undo);
                imageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
                if (!z) {
                    imageView.setBackground(Theme.createSelectorDrawable((color & 16777215) | 419430400, 1, -1));
                }
                boolean z4 = LocaleController.isRTL;
                ViewHelper.setPadding(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
                addView(imageView, LayoutHelper.createFrameRelatively(56.0f, 48.0f, 16));
            }
            setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 9));
        }
    }

    public final class UsersLayout extends ButtonLayout {
        public final AvatarsImageView avatarsImageView;
        public final LinearLayout linearLayout;
        public final LinkSpanDrawable.LinksTextView subtitleView;
        public final LinkSpanDrawable.LinksTextView textView;

        public UsersLayout(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context, resourcesProvider);
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            this.avatarsImageView = avatarsImageView;
            avatarsImageView.setStyle(11);
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            addView(avatarsImageView, LayoutHelper.createFrameRelatively(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
            Theme.ResourcesProvider resourcesProvider2 = null;
            if (z) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.linearLayout = linearLayout;
                linearLayout.setOrientation(1);
                addView(linearLayout, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
                ProfileActivity.AnonymousClass54 anonymousClass54 = new ProfileActivity.AnonymousClass54(context, 3, resourcesProvider2);
                this.textView = anonymousClass54;
                NotificationCenter.listenEmojiLoading(anonymousClass54);
                Typeface typeface = Typeface.SANS_SERIF;
                anonymousClass54.setTypeface(typeface);
                anonymousClass54.setTextSize(1, 14.0f);
                anonymousClass54.setTypeface(AndroidUtilities.bold());
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                anonymousClass54.setEllipsize(truncateAt);
                anonymousClass54.setMaxLines(1);
                linearLayout.addView(anonymousClass54);
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
                this.subtitleView = linksTextView;
                linksTextView.setTypeface(typeface);
                linksTextView.setTextSize(1, 12.0f);
                linksTextView.setEllipsize(truncateAt);
                linksTextView.setSingleLine(false);
                linksTextView.setMaxLines(3);
                linksTextView.setLinkTextColor(getThemedColor(Theme.key_undo_cancelColor));
                linearLayout.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 0, 0, 0, 0, 0));
            } else {
                ProfileActivity.AnonymousClass54 anonymousClass55 = new ProfileActivity.AnonymousClass54(context, 2, resourcesProvider2);
                this.textView = anonymousClass55;
                NotificationCenter.listenEmojiLoading(anonymousClass55);
                anonymousClass55.setTypeface(Typeface.SANS_SERIF);
                anonymousClass55.setTextSize(1, 15.0f);
                anonymousClass55.setEllipsize(TextUtils.TruncateAt.END);
                anonymousClass55.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                anonymousClass55.setGravity(LocaleController.isRTL ? 5 : 3);
                addView(anonymousClass55, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
            }
            this.textView.setLinkTextColor(getThemedColor(Theme.key_undo_cancelColor));
            setTextColor(getThemedColor(Theme.key_undo_infoColor));
            setBackground(getThemedColor(Theme.key_undo_background));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return this.textView.getText();
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
            LinkSpanDrawable.LinksTextView linksTextView = this.subtitleView;
            if (linksTextView != null) {
                linksTextView.setTextColor(i);
            }
        }
    }

    public Bulletin() {
        this.hideRunnable = new Bulletin$$ExternalSyntheticLambda0(this, 0);
        this.loaded = true;
        this.hideAfterBottomSheet = true;
        this.setCanHideOnShow = true;
        this.layout = null;
        this.parentLayout = null;
        this.containerFragment = null;
        this.containerLayout = null;
    }

    public static void addDelegate(FrameLayout frameLayout, Delegate delegate) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, delegate);
        }
    }

    public static void hide(FrameLayout frameLayout) {
        Bulletin bulletin;
        int childCount = frameLayout.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                bulletin = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i);
            if (childAt instanceof Layout) {
                bulletin = ((Layout) childAt).bulletin;
                break;
            }
            i++;
        }
        if (bulletin != null) {
            bulletin.hide(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static Bulletin make(FrameLayout frameLayout, Layout layout, int i) {
        return frameLayout == null ? new EmptyBulletin() : new Bulletin(null, frameLayout, layout, i);
    }

    public static void removeDelegate(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void setCanHide(boolean z) {
        Layout layout;
        boolean z2 = z && this.loaded;
        if (this.canHide == z2 || (layout = this.layout) == null) {
            return;
        }
        this.canHide = z2;
        Runnable runnable = this.hideRunnable;
        if (!z2) {
            layout.removeCallbacks(runnable);
            return;
        }
        int i = this.duration;
        if (i >= 0) {
            layout.postDelayed(runnable, i);
        }
    }

    public Bulletin show() {
        show(false);
        return this;
    }

    public final void show(final boolean z) {
        FrameLayout frameLayout;
        if (this.showing || (frameLayout = this.containerLayout) == 0) {
            return;
        }
        this.showing = true;
        Layout layout = this.layout;
        layout.setTop(z);
        CharSequence accessibilityText = layout.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = layout.getParent();
        AnonymousClass1 anonymousClass1 = this.parentLayout;
        if (parent != anonymousClass1) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        Bulletin bulletin = visibleBulletin;
        if (bulletin != null) {
            bulletin.hide();
        }
        visibleBulletin = this;
        layout.onAttach(this);
        ?? r2 = new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Bulletin bulletin2 = this.f$0;
                Bulletin.Delegate delegate = bulletin2.currentDelegate;
                if ((delegate == null || delegate.allowLayoutChanges()) && !z) {
                    Bulletin.Delegate delegate2 = bulletin2.currentDelegate;
                    int bottomOffset = delegate2 != null ? delegate2.getBottomOffset(bulletin2.tag) : 0;
                    int i9 = bulletin2.lastBottomOffset;
                    if (i9 != bottomOffset) {
                        SpringAnimation springAnimation = bulletin2.bottomOffsetSpring;
                        if (springAnimation == null || !springAnimation.mRunning) {
                            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(i9));
                            SpringForce springForce = new SpringForce();
                            springForce.mFinalPosition = bottomOffset;
                            springForce.setStiffness(900.0f);
                            springForce.setDampingRatio(1.0f);
                            springAnimation2.mSpring = springForce;
                            bulletin2.bottomOffsetSpring = springAnimation2;
                            springAnimation2.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(bulletin2, 3));
                            bulletin2.bottomOffsetSpring.addEndListener(new CameraScanActivity$$ExternalSyntheticLambda14(bulletin2, 2));
                        } else {
                            springAnimation.mSpring.mFinalPosition = bottomOffset;
                        }
                        bulletin2.bottomOffsetSpring.start();
                    }
                }
            }
        };
        this.containerLayoutListener = r2;
        frameLayout.addOnLayoutChangeListener(r2);
        layout.addOnLayoutChangeListener(new AnonymousClass2(z));
        if (!this.ignoreDetach) {
            layout.addOnAttachStateChangeListener(new AvatarSpan.AnonymousClass1(this, 6));
        }
        frameLayout.addView(anonymousClass1);
    }

    public class LottieLayout extends ButtonLayout {
        public final RLottieImageView imageView;
        public int textColor;
        public TextView textView;

        public LottieLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(rLottieImageView, LayoutHelper.createFrameRelatively(56.0f, 48.0f, 8388627));
            ProfileActivity.AnonymousClass54 anonymousClass54 = new ProfileActivity.AnonymousClass54(context, 1, null);
            anonymousClass54.setDisablePaddingsOffset(true);
            this.textView = anonymousClass54;
            NotificationCenter.listenEmojiLoading(anonymousClass54);
            this.textView.setSingleLine();
            this.textView.setTypeface(Typeface.SANS_SERIF);
            this.textView.setTextSize(1, 15.0f);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            addView(this.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
            this.textView.setLinkTextColor(getThemedColor(Theme.key_undo_cancelColor));
            setTextColor(getThemedColor(Theme.key_undo_infoColor));
            setBackground(getThemedColor(Theme.key_undo_background));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return this.textView.getText();
        }

        @Override
        public final void onShow() {
            super.onShow();
            this.imageView.playAnimation();
        }

        public final void setAnimation(int i, int i2, int i3, String... strArr) {
            RLottieImageView rLottieImageView = this.imageView;
            rLottieImageView.setAnimation(i, i2, i3, null);
            for (String str : strArr) {
                rLottieImageView.setLayerColor(this.textColor, str);
            }
        }

        public void setIconPaddingBottom(int i) {
            this.imageView.setLayoutParams(LayoutHelper.createFrameRelatively(56.0f, 48 - i, 8388627, 0.0f, 0.0f, 0.0f, i));
        }

        public void setTextColor(int i) {
            this.textColor = i;
            this.textView.setTextColor(i);
        }

        public final void setAnimation(TLRPC.Document document, String... strArr) {
            RLottieImageView rLottieImageView = this.imageView;
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(36, 36, document);
            for (String str : strArr) {
                rLottieImageView.setLayerColor(this.textColor, str);
            }
        }
    }

    public static Bulletin make(BaseFragment baseFragment, ButtonLayout buttonLayout, int i) {
        if (baseFragment == null) {
            return new EmptyBulletin();
        }
        if (baseFragment instanceof ChatActivity) {
            Layout.access$000(buttonLayout, -2, 1);
        } else if (baseFragment instanceof DialogsActivity) {
            Layout.access$000(buttonLayout, -1, 0);
        }
        return new Bulletin(baseFragment, baseFragment.getBulletinLayoutContainer(), buttonLayout, i);
    }

    public final void hide(long j, boolean z) {
        int i = 1;
        Layout layout = this.layout;
        if (layout != null && this.showing) {
            this.showing = false;
            if (visibleBulletin == this) {
                visibleBulletin = null;
            }
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            if (layout.isLaidOut() || this.ignoreDetach) {
                layout.removeCallbacks(this.hideRunnable);
                if (z) {
                    layout.transitionRunningExit = true;
                    layout.delegate = this.currentDelegate;
                    layout.invalidate();
                    if (j >= 0) {
                        MP3Info.AnonymousClass1 anonymousClass1 = new MP3Info.AnonymousClass1();
                        anonymousClass1.stopPosition = j;
                        this.layoutTransition = anonymousClass1;
                    } else if (this.layoutTransition == null) {
                        this.layoutTransition = layout.createTransition();
                    }
                    this.layoutTransition.animateExit(layout, new ChatActivity$$ExternalSyntheticLambda420(layout, 1), new Bulletin$$ExternalSyntheticLambda0(this, i), new ChatActivity$$ExternalSyntheticLambda211(this, 4));
                    return;
                }
            }
            Delegate delegate = this.currentDelegate;
            if (delegate != null && !layout.top) {
                delegate.onBottomOffsetChange(0.0f);
                this.currentDelegate.onHide(this);
            }
            layout.onExitTransitionStart();
            layout.onExitTransitionEnd();
            layout.onHide();
            if (this.containerLayout != null) {
                AndroidUtilities.runOnUIThread(new Bulletin$$ExternalSyntheticLambda0(this, 2));
            }
            layout.onDetach();
            Runnable runnable = this.onHideListener;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public Bulletin(BaseFragment baseFragment, FrameLayout frameLayout, Layout layout, int i) {
        this.hideRunnable = new Bulletin$$ExternalSyntheticLambda0(this, 0);
        this.loaded = true;
        this.hideAfterBottomSheet = true;
        this.setCanHideOnShow = true;
        this.layout = layout;
        this.loaded = true ^ (layout instanceof LoadingLayout);
        this.parentLayout = new AnonymousClass1(layout, frameLayout);
        this.containerFragment = baseFragment;
        this.containerLayout = frameLayout;
        this.duration = i;
    }

    public final void hide() {
        hide(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
    }
}
