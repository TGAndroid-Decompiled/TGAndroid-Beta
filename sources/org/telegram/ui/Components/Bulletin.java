package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
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
import android.os.Bundle;
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
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.SparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.quickforward.BlurVisibilityDrawable;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ViewPagerActivity;

public class Bulletin {
    public static final int DURATION_LONG = 2750;
    public static final int DURATION_PROLONG = 5000;
    public static final int DURATION_SHORT = 1500;
    public static final int TYPE_APP_ICON = 5;
    public static final int TYPE_BIO_CHANGED = 2;
    public static final int TYPE_ERROR = 1;
    public static final int TYPE_ERROR_SUBTITLE = 4;
    public static final int TYPE_NAME_CHANGED = 3;
    public static final int TYPE_STICKER = 0;
    public static final int TYPE_SUCCESS = 6;
    private static Bulletin visibleBulletin;
    private boolean allowBlurAnimation;
    private SpringAnimation bottomOffsetSpring;
    private boolean canHide;
    private final BaseFragment containerFragment;
    private final FrameLayout containerLayout;
    private View.OnLayoutChangeListener containerLayoutListener;
    public int currentBottomOffset;
    private Delegate currentDelegate;
    private int duration;
    public int hash;
    public boolean hideAfterBottomSheet;
    private final Runnable hideRunnable;
    private boolean ignoreDetach;
    public int lastBottomOffset;
    private final Layout layout;
    private Layout.Transition layoutTransition;
    private boolean loaded;
    private Runnable onHideListener;
    private final ParentLayout parentLayout;
    public boolean setCanHideOnShow;
    private boolean showing;
    private boolean skipShowAnimation;
    public int tag;

    public class AnonymousClass2 implements View.OnLayoutChangeListener {
        final boolean val$top;

        public AnonymousClass2(boolean z) {
            this.val$top = z;
        }

        public void lambda$onLayoutChange$0() {
            Bulletin.this.layout.transitionRunningEnter = false;
            Bulletin.this.layout.onEnterTransitionEnd();
            Bulletin bulletin = Bulletin.this;
            if (bulletin.setCanHideOnShow) {
                bulletin.setCanHide(true);
            }
        }

        public void lambda$onLayoutChange$1(boolean z, Float f) {
            if (Bulletin.this.currentDelegate == null || z) {
                return;
            }
            Bulletin.this.currentDelegate.onBottomOffsetChange(Bulletin.this.layout.getHeight() - f.floatValue());
        }

        @Override
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Bulletin.this.layout.removeOnLayoutChangeListener(this);
            if (Bulletin.this.showing) {
                Bulletin.this.layout.onShow();
                final BaseFragment currentVisibleFragment = Bulletin.this.containerFragment;
                if (this.val$top && (currentVisibleFragment instanceof ViewPagerActivity)) {
                    currentVisibleFragment = ((ViewPagerActivity) currentVisibleFragment).getCurrentVisibleFragment();
                }
                Bulletin bulletin = Bulletin.this;
                bulletin.currentDelegate = Bulletin.findDelegate(currentVisibleFragment, bulletin.containerLayout);
                if (Bulletin.this.currentDelegate == null && currentVisibleFragment != null) {
                    Bulletin.this.currentDelegate = new Delegate() {
                        @Override
                        public final boolean allowLayoutChanges() {
                            return Delegate.CC.$default$allowLayoutChanges(this);
                        }

                        @Override
                        public final boolean bottomOffsetAnimated() {
                            return Delegate.CC.$default$bottomOffsetAnimated(this);
                        }

                        @Override
                        public final boolean clipWithGradient(int i9) {
                            return Delegate.CC.$default$clipWithGradient(this, i9);
                        }

                        @Override
                        public int getBottomOffset(int i9) {
                            return currentVisibleFragment.getBottomInset();
                        }

                        @Override
                        public final int getLeftPadding() {
                            return Delegate.CC.$default$getLeftPadding(this);
                        }

                        @Override
                        public final int getRightPadding() {
                            return Delegate.CC.$default$getRightPadding(this);
                        }

                        @Override
                        public final int getTopOffset(int i9) {
                            return Delegate.CC.$default$getTopOffset(this, i9);
                        }

                        @Override
                        public final void onBottomOffsetChange(float f) {
                            Delegate.CC.$default$onBottomOffsetChange(this, f);
                        }

                        @Override
                        public final void onHide(Bulletin bulletin2) {
                            Delegate.CC.$default$onHide(this, bulletin2);
                        }

                        @Override
                        public final void onShow(Bulletin bulletin2) {
                            Delegate.CC.$default$onShow(this, bulletin2);
                        }
                    };
                }
                if (Bulletin.this.bottomOffsetSpring == null || !Bulletin.this.bottomOffsetSpring.mRunning) {
                    Bulletin bulletin2 = Bulletin.this;
                    bulletin2.lastBottomOffset = bulletin2.currentDelegate != null ? Bulletin.this.currentDelegate.getBottomOffset(Bulletin.this.tag) : 0;
                }
                if (Bulletin.this.currentDelegate != null) {
                    Bulletin.this.currentDelegate.onShow(Bulletin.this);
                }
                if (Bulletin.isTransitionsEnabled() && !Bulletin.this.skipShowAnimation) {
                    Bulletin.this.ensureLayoutTransitionCreated();
                    Bulletin.this.layout.transitionRunningEnter = true;
                    Bulletin.this.layout.delegate = Bulletin.this.currentDelegate;
                    Bulletin.this.layout.invalidate();
                    Layout.Transition transition = Bulletin.this.layoutTransition;
                    Layout layout = Bulletin.this.layout;
                    Layout layout2 = Bulletin.this.layout;
                    Objects.requireNonNull(layout2);
                    transition.animateEnter(layout, new Bulletin$$ExternalSyntheticLambda4(layout2, 1), new Bulletin$2$$ExternalSyntheticLambda1(this, 0), new Bulletin$2$$ExternalSyntheticLambda2(this, this.val$top, 0), Bulletin.this.currentBottomOffset);
                    return;
                }
                Bulletin.this.layout.delegate = Bulletin.this.currentDelegate;
                if (Bulletin.this.currentDelegate != null && !this.val$top) {
                    Bulletin.this.currentDelegate.onBottomOffsetChange(Bulletin.this.layout.getHeight() - Bulletin.this.currentBottomOffset);
                }
                Bulletin.this.updatePosition();
                Bulletin.this.layout.onEnterTransitionStart();
                Bulletin.this.layout.onEnterTransitionEnd();
                Bulletin bulletin3 = Bulletin.this;
                if (bulletin3.setCanHideOnShow) {
                    bulletin3.setCanHide(true);
                }
            }
        }
    }

    public static class BulletinWindow extends Dialog {
        private final BulletinWindowLayout container;
        private WindowManager.LayoutParams params;

        public class BulletinWindowLayout extends FrameLayout {
            public BulletinWindowLayout(Context context) {
                super(context);
            }

            @Override
            public void addView(View view) {
                super.addView(view);
                BulletinWindow.this.show();
            }

            public WindowManager.LayoutParams getLayout() {
                return BulletinWindow.this.params;
            }

            @Override
            public void removeView(View view) {
                super.removeView(view);
                try {
                    BulletinWindow.this.dismiss();
                } catch (Exception unused) {
                }
                Bulletin.removeDelegate(BulletinWindow.this.container);
            }

            public void setTouchable(boolean z) {
                if (BulletinWindow.this.params == null) {
                    return;
                }
                if (z) {
                    BulletinWindow.this.params.flags &= -17;
                } else {
                    BulletinWindow.this.params.flags |= 16;
                }
                BulletinWindow.this.getWindow().setAttributes(BulletinWindow.this.params);
            }

            public void updateLayout() {
                BulletinWindow.this.getWindow().setAttributes(BulletinWindow.this.params);
            }
        }

        private BulletinWindow(Context context, final Delegate delegate) {
            super(context);
            AndroidUtilities.enableEdgeToEdge(getWindow());
            BulletinWindowLayout bulletinWindowLayout = new BulletinWindowLayout(context);
            this.container = bulletinWindowLayout;
            setContentView(bulletinWindowLayout, new ViewGroup.LayoutParams(-1, -1));
            EmojiView$$ExternalSyntheticLambda21 emojiView$$ExternalSyntheticLambda21 = new EmojiView$$ExternalSyntheticLambda21(this, 25);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(bulletinWindowLayout, emojiView$$ExternalSyntheticLambda21);
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                bulletinWindowLayout.setSystemUiVisibility(1792);
            } else {
                bulletinWindowLayout.setSystemUiVisibility(1280);
            }
            Bulletin.addDelegate(bulletinWindowLayout, new Delegate() {
                @Override
                public final boolean allowLayoutChanges() {
                    return Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public final boolean bottomOffsetAnimated() {
                    return Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public boolean clipWithGradient(int i2) {
                    Delegate delegate2 = delegate;
                    return delegate2 != null && delegate2.clipWithGradient(i2);
                }

                @Override
                public int getBottomOffset(int i2) {
                    Delegate delegate2 = delegate;
                    if (delegate2 == null) {
                        return 0;
                    }
                    return delegate2.getBottomOffset(i2);
                }

                @Override
                public final int getLeftPadding() {
                    return Delegate.CC.$default$getLeftPadding(this);
                }

                @Override
                public final int getRightPadding() {
                    return Delegate.CC.$default$getRightPadding(this);
                }

                @Override
                public int getTopOffset(int i2) {
                    Delegate delegate2 = delegate;
                    return delegate2 == null ? AndroidUtilities.statusBarHeight : delegate2.getTopOffset(i2);
                }

                @Override
                public final void onBottomOffsetChange(float f) {
                    Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public final void onHide(Bulletin bulletin) {
                    Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public final void onShow(Bulletin bulletin) {
                    Delegate.CC.$default$onShow(this, bulletin);
                }
            });
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

        private void applyInsets(Insets insets) {
            BulletinWindowLayout bulletinWindowLayout = this.container;
            if (bulletinWindowLayout != null) {
                bulletinWindowLayout.setPadding(insets.left, insets.top, insets.right, insets.bottom);
            }
        }

        public WindowInsetsCompat lambda$new$0(View view, WindowInsetsCompat windowInsetsCompat) {
            applyInsets(AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false));
            view.requestLayout();
            return WindowInsetsCompat.CONSUMED;
        }

        public static BulletinWindowLayout make(Context context, Delegate delegate) {
            return new BulletinWindow(context, delegate).container;
        }

        @Override
        public void show() {
            if (AndroidUtilities.isSafeToShow(getContext())) {
                super.show();
            }
        }

        public static BulletinWindowLayout make(Context context) {
            return new BulletinWindow(context, null).container;
        }
    }

    public static abstract class Button extends FrameLayout implements Layout.Callback {
        public Button(Context context) {
            super(context);
        }

        @Override
        public void onAttach(Layout layout, Bulletin bulletin) {
        }

        @Override
        public void onDetach(Layout layout) {
        }

        @Override
        public void onEnterTransitionEnd(Layout layout) {
        }

        @Override
        public void onEnterTransitionStart(Layout layout) {
        }

        @Override
        public void onExitTransitionEnd(Layout layout) {
        }

        @Override
        public void onExitTransitionStart(Layout layout) {
        }

        @Override
        public void onHide(Layout layout) {
        }

        @Override
        public void onShow(Layout layout) {
        }
    }

    public static class ButtonLayout extends Layout {
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
                i2 = zzkl.m(12.0f, button.getMeasuredWidth(), i2);
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

    public static class EmptyBulletin extends Bulletin {
        public EmptyBulletin() {
            super();
        }

        @Override
        public Bulletin show() {
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityDef {
    }

    public static abstract class Layout extends FrameLayout {
        public static final FloatPropertyCompat IN_OUT_OFFSET_Y;
        public static final Property<Layout, Float> IN_OUT_OFFSET_Y2;
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

        public static class DefaultTransition implements Transition {
            long duration = 255;

            public static void lambda$animateEnter$0(Consumer consumer, Layout layout, ValueAnimator valueAnimator) {
                consumer.accept(Float.valueOf(layout.getTranslationY()));
            }

            public static void lambda$animateExit$1(Consumer consumer, Layout layout, ValueAnimator valueAnimator) {
                consumer.accept(Float.valueOf(layout.getTranslationY()));
            }

            @Override
            public void animateEnter(Layout layout, final Runnable runnable, final Runnable runnable2, Consumer consumer, int i) {
                int i2 = 1;
                layout.setInOutOffset(layout.getMeasuredHeight());
                if (consumer != null) {
                    consumer.accept(Float.valueOf(layout.getTranslationY()));
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(layout, Layout.IN_OUT_OFFSET_Y2, 0.0f);
                objectAnimatorOfFloat.setDuration(this.duration);
                objectAnimatorOfFloat.setInterpolator(Easings.easeOutQuad);
                if (runnable != null || runnable2 != null) {
                    objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            Runnable runnable3 = runnable2;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }

                        @Override
                        public void onAnimationStart(Animator animator) {
                            Runnable runnable3 = runnable;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                if (consumer != null) {
                    objectAnimatorOfFloat.addUpdateListener(new Bulletin$Layout$DefaultTransition$$ExternalSyntheticLambda0(consumer, layout, i2));
                }
                objectAnimatorOfFloat.start();
            }

            @Override
            public void animateExit(Layout layout, final Runnable runnable, final Runnable runnable2, Consumer consumer, int i) {
                int i2 = 0;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(layout, Layout.IN_OUT_OFFSET_Y2, layout.getHeight());
                objectAnimatorOfFloat.setDuration(175L);
                objectAnimatorOfFloat.setInterpolator(Easings.easeInQuad);
                if (runnable != null || runnable2 != null) {
                    objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            Runnable runnable3 = runnable2;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }

                        @Override
                        public void onAnimationStart(Animator animator) {
                            Runnable runnable3 = runnable;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                if (consumer != null) {
                    objectAnimatorOfFloat.addUpdateListener(new Bulletin$Layout$DefaultTransition$$ExternalSyntheticLambda0(consumer, layout, i2));
                }
                objectAnimatorOfFloat.start();
            }
        }

        public static class SpringTransition implements Transition {
            private static final float DAMPING_RATIO = 0.8f;
            private static final float STIFFNESS = 400.0f;

            public static void lambda$animateEnter$0(Layout layout, Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                layout.setInOutOffset(0.0f);
                if (z) {
                    return;
                }
                runnable.run();
            }

            public static void lambda$animateEnter$1(Consumer consumer, Layout layout, DynamicAnimation dynamicAnimation, float f, float f2) {
                consumer.accept(Float.valueOf(layout.getTranslationY()));
            }

            public static void lambda$animateExit$2(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                if (z) {
                    return;
                }
                runnable.run();
            }

            public static void lambda$animateExit$3(Consumer consumer, Layout layout, DynamicAnimation dynamicAnimation, float f, float f2) {
                consumer.accept(Float.valueOf(layout.getTranslationY()));
            }

            @Override
            public void animateEnter(Layout layout, Runnable runnable, Runnable runnable2, Consumer consumer, int i) {
                layout.setInOutOffset(layout.getMeasuredHeight());
                if (consumer != null) {
                    consumer.accept(Float.valueOf(layout.getTranslationY()));
                }
                SpringAnimation springAnimation = new SpringAnimation(layout, Layout.IN_OUT_OFFSET_Y, 0.0f);
                springAnimation.mSpring.setDampingRatio(0.8f);
                springAnimation.mSpring.setStiffness(400.0f);
                if (runnable2 != null) {
                    springAnimation.addEndListener(new PasscodeView$$ExternalSyntheticLambda12(2, layout, runnable2));
                }
                if (consumer != null) {
                    springAnimation.addUpdateListener(new Bulletin$Layout$SpringTransition$$ExternalSyntheticLambda1(consumer, layout, 1));
                }
                springAnimation.start();
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override
            public void animateExit(Layout layout, Runnable runnable, Runnable runnable2, Consumer consumer, int i) {
                SpringAnimation springAnimation = new SpringAnimation(layout, Layout.IN_OUT_OFFSET_Y, layout.getHeight());
                springAnimation.mSpring.setDampingRatio(0.8f);
                springAnimation.mSpring.setStiffness(400.0f);
                if (runnable2 != null) {
                    springAnimation.addEndListener(new Bulletin$$ExternalSyntheticLambda3(runnable2, 2));
                }
                if (consumer != null) {
                    springAnimation.addUpdateListener(new Bulletin$Layout$SpringTransition$$ExternalSyntheticLambda1(consumer, layout, 0));
                }
                springAnimation.start();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        public interface Transition {
            void animateEnter(Layout layout, Runnable runnable, Runnable runnable2, Consumer consumer, int i);

            void animateExit(Layout layout, Runnable runnable, Runnable runnable2, Consumer consumer, int i);
        }

        static {
            String str = "offsetY";
            IN_OUT_OFFSET_Y = new FloatPropertyCompat(str) {
                @Override
                public float getValue(Layout layout) {
                    return layout.inOutOffset;
                }

                @Override
                public void setValue(Layout layout, float f) {
                    layout.setInOutOffset(f);
                }
            };
            IN_OUT_OFFSET_Y2 = new AnimationProperties.FloatProperty<Layout>(str) {
                @Override
                public Float get(Layout layout) {
                    return Float.valueOf(layout.inOutOffset);
                }

                @Override
                public void setValue(Layout layout, float f) {
                    layout.setInOutOffset(f);
                }
            };
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

        public boolean isNeedSwipeAlphaAnimation(boolean z) {
            if (isWideScreen() && this.wideScreenWidth != -1) {
                int i = this.wideScreenGravity;
                if (i == 1) {
                    return true;
                }
                if (z) {
                    return i == 5;
                }
                if (i != 5) {
                    return true;
                }
            }
            return false;
        }

        private boolean isWideScreen() {
            if (AndroidUtilities.isTablet()) {
                return true;
            }
            Point point = AndroidUtilities.displaySize;
            return point.x >= point.y;
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

        public void setWideScreenParams(int i, int i2) {
            boolean z;
            boolean z2 = true;
            if (this.wideScreenWidth != i) {
                this.wideScreenWidth = i;
                z = true;
            } else {
                z = false;
            }
            if (this.wideScreenGravity != i2) {
                this.wideScreenGravity = i2;
            } else {
                z2 = z;
            }
            if (isWideScreen() && z2) {
                updateSize();
            }
        }

        private void updateSize() {
            boolean zIsWideScreen = isWideScreen();
            int i = zIsWideScreen ? this.wideScreenWidth : -1;
            int i2 = 80;
            if (zIsWideScreen) {
                i2 = (this.top ? 48 : 80) | this.wideScreenGravity;
            } else if (this.top) {
                i2 = 48;
            }
            setLayoutParams(LayoutHelper.createFrame(i, -2, i2));
        }

        public void addCallback(Callback callback) {
            this.callbacks.add(callback);
        }

        public Transition createTransition() {
            return new SpringTransition();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            Bulletin bulletin = this.bulletin;
            if (bulletin == null || !bulletin.allowBlurAnimation) {
                dispatchDrawImpl(canvas, false, 255);
                return;
            }
            if (this.blurVisibilityDrawable == null) {
                this.blurVisibilityDrawable = new BlurVisibilityDrawable(new EmojiView$$ExternalSyntheticLambda21(this, 26));
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
            float topOffset = delegate.getTopOffset(this.bulletin.tag) - getY();
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
            if (this.bulletin == null || !(((delegate = this.delegate) == null || delegate.bottomOffsetAnimated()) && this.bulletin.bottomOffsetSpring != null && this.bulletin.bottomOffsetSpring.mRunning)) {
                Delegate delegate2 = this.delegate;
                if (delegate2 == null) {
                    return 0.0f;
                }
                Bulletin bulletin = this.bulletin;
                bottomOffset = delegate2.getBottomOffset(bulletin != null ? bulletin.tag : 0);
            } else {
                bottomOffset = this.bulletin.lastBottomOffset;
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
            if (delegate == null) {
                return 0.0f;
            }
            Bulletin bulletin = this.bulletin;
            return delegate.getTopOffset(bulletin != null ? bulletin.tag : 0);
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
                this.callbacks.get(i).onAttach(this, bulletin);
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
                this.callbacks.get(i).onDetach(this);
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
                this.callbacks.get(i).onEnterTransitionEnd(this);
            }
        }

        public void onEnterTransitionStart() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onEnterTransitionStart(this);
            }
        }

        public void onExitTransitionEnd() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onExitTransitionEnd(this);
            }
        }

        public void onExitTransitionStart() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onExitTransitionStart(this);
            }
        }

        public void onHide() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onHide(this);
            }
        }

        public void onShow() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onShow(this);
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
            float bottomOffset = 0.0f;
            if (delegate != null) {
                if (this.top) {
                    Bulletin bulletin = this.bulletin;
                    bottomOffset = 0.0f - delegate.getTopOffset(bulletin != null ? bulletin.tag : 0);
                } else {
                    bottomOffset = 0.0f + getBottomOffset();
                }
            }
            setTranslationY((this.inOutOffset * (this.top ? -1 : 1)) + (-bottomOffset));
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

        public interface Callback {
            void onAttach(Layout layout, Bulletin bulletin);

            void onDetach(Layout layout);

            void onEnterTransitionEnd(Layout layout);

            void onEnterTransitionStart(Layout layout);

            void onExitTransitionEnd(Layout layout);

            void onExitTransitionStart(Layout layout);

            void onHide(Layout layout);

            void onShow(Layout layout);

            public abstract class CC {
                public static void $default$onDetach(Callback callback, Layout layout) {
                }

                public static void $default$onEnterTransitionEnd(Callback callback, Layout layout) {
                }

                public static void $default$onEnterTransitionStart(Callback callback, Layout layout) {
                }

                public static void $default$onExitTransitionEnd(Callback callback, Layout layout) {
                }

                public static void $default$onExitTransitionStart(Callback callback, Layout layout) {
                }

                public static void $default$onHide(Callback callback, Layout layout) {
                }

                public static void $default$onShow(Callback callback, Layout layout) {
                }

                public static void $default$onAttach(Callback callback, Layout layout, Bulletin bulletin) {
                }
            }
        }
    }

    public interface LoadingLayout {
        void onTextLoaded(CharSequence charSequence);
    }

    public static class LottieLayout extends ButtonLayout {
        public RLottieImageView imageView;
        private int textColor;
        public TextView textView;

        public LottieLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrameRelatively(56.0f, 48.0f, 8388627));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context) {
                {
                    setDisablePaddingsOffset(true);
                }

                @Override
                public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                    super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                }
            };
            this.textView = linksTextView;
            NotificationCenter.listenEmojiLoading(linksTextView);
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
        public void onShow() {
            super.onShow();
            this.imageView.playAnimation();
        }

        public void setAnimation(int i, String... strArr) {
            setAnimation(i, 32, 32, strArr);
        }

        public void setIconPaddingBottom(int i) {
            this.imageView.setLayoutParams(LayoutHelper.createFrameRelatively(56.0f, 48 - i, 8388627, 0.0f, 0.0f, 0.0f, i));
        }

        public void setTextColor(int i) {
            this.textColor = i;
            this.textView.setTextColor(i);
        }

        public void setAnimation(int i, int i2, int i3, String... strArr) {
            this.imageView.setAnimation(i, i2, i3);
            for (String str : strArr) {
                this.imageView.setLayerColor(str, this.textColor);
            }
        }

        public void setAnimation(TLRPC.Document document, int i, int i2, String... strArr) {
            this.imageView.setAutoRepeat(true);
            this.imageView.setAnimation(document, i, i2);
            for (String str : strArr) {
                this.imageView.setLayerColor(str, this.textColor);
            }
        }

        public LottieLayout(Context context, Theme.ResourcesProvider resourcesProvider, int i, int i2) {
            this(context, resourcesProvider);
            setBackground(i);
            setTextColor(i2);
        }
    }

    public static class LottieLayoutWithReactions extends LottieLayout implements NotificationCenter.NotificationCenterDelegate {
        private Bulletin bulletin;
        private final BaseFragment fragment;
        private final int messagesCount;
        private SparseLongArray newMessagesByIds;
        private ReactionsContainerLayout reactionsContainerLayout;

        public class AnonymousClass1 extends ReactionsContainerLayout {
            public AnonymousClass1(int i, BaseFragment baseFragment, Context context, int i2, Theme.ResourcesProvider resourcesProvider) {
                super(i, baseFragment, context, i2, resourcesProvider);
            }

            public void lambda$onShownCustomEmojiReactionDialog$0(View view) {
                LottieLayoutWithReactions.this.hideReactionsDialog();
                Bulletin.hideVisible();
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    if (LottieLayoutWithReactions.this.bulletin != null) {
                        LottieLayoutWithReactions.this.bulletin.setCanHide(false);
                    }
                } else if (motionEvent.getAction() == 1 && LottieLayoutWithReactions.this.bulletin != null) {
                    LottieLayoutWithReactions.this.bulletin.setCanHide(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public void onShownCustomEmojiReactionDialog() {
                Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
                if (visibleBulletin != null) {
                    visibleBulletin.setCanHide(false);
                }
                LottieLayoutWithReactions.this.reactionsContainerLayout.getReactionsWindow().windowView.setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 1));
            }
        }

        public class AnonymousClass2 implements ReactionsContainerLayout.ReactionsContainerDelegate {
            public AnonymousClass2() {
            }

            public static void lambda$showTaggedReactionToast$0(int i, int i2, BaseFragment baseFragment) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                bundle.putInt("message_id", i2);
                baseFragment.presentFragment(new ChatActivity(bundle));
            }

            public void lambda$showTaggedReactionToast$1(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, int i, int i2) {
                TLRPC.Document documentFindDocument;
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                long j = visibleReaction.documentId;
                if (j == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(visibleReaction.emojicon);
                    if (tL_availableReaction == null) {
                        return;
                    } else {
                        documentFindDocument = tL_availableReaction.activate_animation;
                    }
                } else {
                    documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j);
                }
                if (documentFindDocument == null || lastFragment == null) {
                    return;
                }
                BulletinFactory.of(lastFragment).createMessagesTaggedBulletin(LottieLayoutWithReactions.this.messagesCount, documentFindDocument, z ? new MessagePreviewView$Page$6$$ExternalSyntheticLambda0(lastFragment, i, i2, 1) : null).show(true);
            }

            private void showTaggedReactionToast(final ReactionsLayoutInBubble.VisibleReaction visibleReaction, final int i, final int i2, final boolean z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$showTaggedReactionToast$1(visibleReaction, z, i, i2);
                    }
                }, 300L);
            }

            @Override
            public final boolean allowLongPress() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
            }

            @Override
            public final boolean drawBackground() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
            }

            @Override
            public final void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
                ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawRoundRect(this, canvas, rectF, f, f2, f3, i, z);
            }

            @Override
            public final void hideMenu() {
                ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$hideMenu(this);
            }

            @Override
            public final boolean needEnterText() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
            }

            @Override
            public final void onEmojiWindowDismissed() {
                ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
            }

            @Override
            public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
                if (LottieLayoutWithReactions.this.newMessagesByIds == null) {
                    return;
                }
                boolean z3 = (LottieLayoutWithReactions.this.fragment instanceof ChatActivity) && ((ChatActivity) LottieLayoutWithReactions.this.fragment).getDialogId() == UserConfig.getInstance(LottieLayoutWithReactions.this.fragment.getCurrentAccount()).getClientUserId();
                int i = 0;
                for (int i2 = 0; i2 < LottieLayoutWithReactions.this.newMessagesByIds.size(); i2++) {
                    int iKeyAt = LottieLayoutWithReactions.this.newMessagesByIds.keyAt(i2);
                    TLRPC.Message message = new TLRPC.Message();
                    message.dialog_id = LottieLayoutWithReactions.this.fragment.getUserConfig().getClientUserId();
                    message.id = iKeyAt;
                    MessageObject messageObject = new MessageObject(LottieLayoutWithReactions.this.fragment.getCurrentAccount(), message, false, false);
                    ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList = new ArrayList<>();
                    arrayList.add(visibleReaction);
                    LottieLayoutWithReactions.this.fragment.getSendMessagesHelper().sendReaction(messageObject, arrayList, visibleReaction, false, false, LottieLayoutWithReactions.this.fragment, null);
                    i = message.id;
                }
                LottieLayoutWithReactions.this.hideReactionsDialog();
                Bulletin.hideVisible();
                showTaggedReactionToast(visibleReaction, LottieLayoutWithReactions.this.fragment.getCurrentAccount(), i, !z3);
            }
        }

        public LottieLayoutWithReactions(BaseFragment baseFragment, int i) {
            super(baseFragment.getContext(), baseFragment.getResourceProvider());
            this.fragment = baseFragment;
            this.messagesCount = i;
            init();
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.savedMessagesForwarded) {
                this.newMessagesByIds = (SparseLongArray) objArr[0];
            }
        }

        @Override
        public int getMeasuredBackgroundHeight() {
            return AndroidUtilities.dp(30.0f) + this.textView.getMeasuredHeight();
        }

        public void hideReactionsDialog() {
            if (this.reactionsContainerLayout.getReactionsWindow() != null) {
                this.reactionsContainerLayout.dismissWindow();
                if (this.reactionsContainerLayout.getReactionsWindow().containerView != null) {
                    this.reactionsContainerLayout.getReactionsWindow().containerView.animate().alpha(0.0f).setDuration(180L).start();
                }
            }
        }

        public void init() {
            this.textView.setLayoutParams(LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
            this.imageView.setLayoutParams(LayoutHelper.createFrameRelatively(56.0f, 48.0f, 8388659));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, this.fragment, getContext(), this.fragment.getCurrentAccount(), this.fragment.getResourceProvider());
            this.reactionsContainerLayout = anonymousClass1;
            anonymousClass1.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            this.reactionsContainerLayout.setDelegate(new AnonymousClass2());
            this.reactionsContainerLayout.setTop(true);
            this.reactionsContainerLayout.setClipChildren(false);
            this.reactionsContainerLayout.setClipToPadding(false);
            this.reactionsContainerLayout.setVisibility(0);
            this.reactionsContainerLayout.setBubbleOffset(-AndroidUtilities.dp(80.0f));
            this.reactionsContainerLayout.setHint(LocaleController.getString(R.string.SavedTagReactionsHint));
            addView(this.reactionsContainerLayout, LayoutHelper.createFrame(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
            this.reactionsContainerLayout.setMessage(null, null, true);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.savedMessagesForwarded);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.savedMessagesForwarded);
        }

        public void setBulletin(Bulletin bulletin) {
            this.bulletin = bulletin;
        }
    }

    public static class MultiLineLayout extends ButtonLayout {
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

    public static abstract class ParentLayout extends FrameLayout {
        private final GestureDetector gestureDetector;
        private boolean hideAnimationRunning;
        private final Layout layout;
        private boolean needLeftAlphaAnimation;
        private boolean needRightAlphaAnimation;
        private boolean pressed;
        private long pressedTime;
        private final Rect rect;
        private boolean scrolling;
        private float translationX;
        private float tx;
        private float ty;
        private boolean wasCanHide;

        public class AnonymousClass1 extends GestureDetector.SimpleOnGestureListener {
            final Layout val$layout;

            public AnonymousClass1(Layout layout) {
                this.val$layout = layout;
            }

            public void lambda$onFling$0(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                ParentLayout.this.onHide();
            }

            public static void lambda$onFling$1(Layout layout, DynamicAnimation dynamicAnimation, float f, float f2) {
                if (Math.abs(f) > layout.getWidth()) {
                    dynamicAnimation.cancel();
                }
            }

            public void lambda$onFling$2(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                ParentLayout.this.onHide();
            }

            public static void lambda$onFling$3(DynamicAnimation dynamicAnimation, float f, float f2) {
                if (f <= 0.0f) {
                    dynamicAnimation.cancel();
                }
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                if (ParentLayout.this.hideAnimationRunning) {
                    return false;
                }
                ParentLayout.this.needLeftAlphaAnimation = this.val$layout.isNeedSwipeAlphaAnimation(true);
                ParentLayout.this.needRightAlphaAnimation = this.val$layout.isNeedSwipeAlphaAnimation(false);
                return true;
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z = false;
                if (Math.abs(f) <= 2000.0f) {
                    return false;
                }
                if ((f < 0.0f && ParentLayout.this.needLeftAlphaAnimation) || (f > 0.0f && ParentLayout.this.needRightAlphaAnimation)) {
                    z = true;
                }
                SpringAnimation springAnimation = new SpringAnimation(this.val$layout, DynamicAnimation.TRANSLATION_X, Math.signum(f) * this.val$layout.getWidth() * 2.0f);
                if (!z) {
                    final int i = 0;
                    springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener(this) {
                        public final Bulletin.ParentLayout.AnonymousClass1 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4) {
                            switch (i) {
                                case 0:
                                    this.f$0.lambda$onFling$0(dynamicAnimation, z2, f3, f4);
                                    break;
                                default:
                                    this.f$0.lambda$onFling$2(dynamicAnimation, z2, f3, f4);
                                    break;
                            }
                        }
                    });
                    springAnimation.addUpdateListener(new Bulletin$$ExternalSyntheticLambda2(this.val$layout, 1));
                }
                springAnimation.mSpring.setDampingRatio(1.0f);
                springAnimation.mSpring.setStiffness(100.0f);
                springAnimation.mVelocity = f;
                springAnimation.start();
                if (z) {
                    SpringAnimation springAnimation2 = new SpringAnimation(this.val$layout, DynamicAnimation.ALPHA, 0.0f);
                    final int i2 = 1;
                    springAnimation2.addEndListener(new DynamicAnimation.OnAnimationEndListener(this) {
                        public final Bulletin.ParentLayout.AnonymousClass1 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4) {
                            switch (i2) {
                                case 0:
                                    this.f$0.lambda$onFling$0(dynamicAnimation, z2, f3, f4);
                                    break;
                                default:
                                    this.f$0.lambda$onFling$2(dynamicAnimation, z2, f3, f4);
                                    break;
                            }
                        }
                    });
                    springAnimation2.addUpdateListener(new Bulletin$ParentLayout$1$$ExternalSyntheticLambda3());
                    springAnimation.mSpring.setDampingRatio(1.0f);
                    springAnimation.mSpring.setStiffness(10.0f);
                    springAnimation.mVelocity = f;
                    springAnimation2.start();
                }
                ParentLayout.this.hideAnimationRunning = true;
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                ParentLayout.access$1616(ParentLayout.this, f);
                ParentLayout.access$1716(ParentLayout.this, f2);
                if (Utilities.dist(0.0f, 0.0f, ParentLayout.this.tx, ParentLayout.this.ty) > AndroidUtilities.touchSlop) {
                    ParentLayout.this.scrolling = true;
                }
                if (!ParentLayout.this.wasCanHide) {
                    return false;
                }
                this.val$layout.setTranslationX(ParentLayout.access$2024(ParentLayout.this, f));
                if (ParentLayout.this.translationX == 0.0f || ((ParentLayout.this.translationX < 0.0f && ParentLayout.this.needLeftAlphaAnimation) || (ParentLayout.this.translationX > 0.0f && ParentLayout.this.needRightAlphaAnimation))) {
                    this.val$layout.setAlpha(1.0f - (Math.abs(ParentLayout.this.translationX) / this.val$layout.getWidth()));
                }
                return true;
            }
        }

        public ParentLayout(Layout layout) {
            super(layout.getContext());
            this.rect = new Rect();
            this.layout = layout;
            GestureDetector gestureDetector = new GestureDetector(layout.getContext(), new AnonymousClass1(layout));
            this.gestureDetector = gestureDetector;
            gestureDetector.setIsLongpressEnabled(false);
            addView(layout);
        }

        public static float access$1616(ParentLayout parentLayout, float f) {
            float f2 = parentLayout.tx + f;
            parentLayout.tx = f2;
            return f2;
        }

        public static float access$1716(ParentLayout parentLayout, float f) {
            float f2 = parentLayout.ty + f;
            parentLayout.ty = f2;
            return f2;
        }

        public static float access$2024(ParentLayout parentLayout, float f) {
            float f2 = parentLayout.translationX - f;
            parentLayout.translationX = f2;
            return f2;
        }

        private boolean inLayoutHitRect(float f, float f2) {
            this.layout.getHitRect(this.rect);
            return this.rect.contains((int) f, (int) f2);
        }

        public void lambda$onTouchEvent$0(float f) {
            if (this.layout.getTranslationX() == f) {
                onHide();
            }
        }

        public abstract void onHide();

        public abstract void onPressedStateChanged(boolean z);

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            Layout layout;
            View.OnClickListener onClickListener;
            if (!this.pressed && !inLayoutHitRect(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
            this.gestureDetector.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (!this.pressed && !this.hideAnimationRunning) {
                    this.layout.animate().cancel();
                    this.ty = 0.0f;
                    this.tx = 0.0f;
                    this.scrolling = false;
                    this.translationX = this.layout.getTranslationX();
                    this.pressedTime = System.currentTimeMillis();
                    Bulletin bulletin = this.layout.bulletin;
                    this.wasCanHide = bulletin == null || bulletin.canHide;
                    this.pressed = true;
                    onPressedStateChanged(true);
                    Layout layout2 = this.layout;
                    if (layout2.onClickListener != null) {
                        layout2.setPressed(true);
                        return true;
                    }
                }
            } else if ((actionMasked == 1 || actionMasked == 3) && this.pressed) {
                if (this.hideAnimationRunning) {
                    if (actionMasked == 1 && this.layout.isPressed() && (onClickListener = (layout = this.layout).onClickListener) != null && !this.scrolling) {
                        onClickListener.onClick(layout);
                    }
                } else if (Math.abs(this.translationX) > this.layout.getWidth() / 3.0f) {
                    final float fSignum = Math.signum(this.translationX) * this.layout.getWidth();
                    float f = this.translationX;
                    this.layout.animate().translationX(fSignum).alpha(((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) < 0 && this.needLeftAlphaAnimation) || ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) > 0 && this.needRightAlphaAnimation) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onTouchEvent$0(fSignum);
                        }
                    }).start();
                } else {
                    this.layout.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                    if (actionMasked == 1) {
                        onClickListener.onClick(layout);
                    }
                }
                this.pressed = false;
                onPressedStateChanged(false);
                Layout layout3 = this.layout;
                if (layout3.onClickListener != null) {
                    layout3.setPressed(false);
                }
            }
            return true;
        }
    }

    public static class ProgressTwoLineAnimatedTitleLottieLayout extends ButtonLayout {
        public final RLottieImageView imageView;
        private final LinearLayout linearLayout;
        private float progress;
        private final View progressView;
        public final LinkSpanDrawable.LinksTextView subtitleTextView;
        private final int textColor;
        public final AnimatedTextView titleTextView;

        public ProgressTwoLineAnimatedTitleLottieLayout(Context context, final Theme.ResourcesProvider resourcesProvider) {
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
            addView(linearLayout, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 10.0f));
            View view = new View(context) {
                private final AnimatedFloat animatedProgress = new AnimatedFloat(this, 0, 320, CubicBezierInterpolator.EASE_OUT_QUINT);
                private final Paint paint = new Paint(1);
                private final Path clipPath = new Path();

                @Override
                public void onDraw(Canvas canvas) {
                    canvas.save();
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(0.0f, -AndroidUtilities.dp(20.0f), getWidth(), getHeight(), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                    this.paint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
                    canvas.drawRect(0.0f, 0.0f, this.animatedProgress.set(ProgressTwoLineAnimatedTitleLottieLayout.this.progress) * getWidth(), getHeight(), this.paint);
                    canvas.restore();
                }
            };
            this.progressView = view;
            addView(view, LayoutHelper.createFrame(-1, 2, 87));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
            this.titleTextView = animatedTextView;
            animatedTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            animatedTextView.setTextColor(themedColor);
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-1, 20));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleTextView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            linksTextView.setTextColor(themedColor);
            linksTextView.setLinkTextColor(themedColor2);
            linksTextView.setTypeface(Typeface.SANS_SERIF);
            linksTextView.setTextSize(1, 13.0f);
            linearLayout.addView(linksTextView);
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }

        public void hideImage() {
            this.imageView.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.linearLayout.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        }

        @Override
        public void onShow() {
            super.onShow();
            this.imageView.playAnimation();
        }

        public void setAnimation(int i, String... strArr) {
            setAnimation(i, 32, 32, strArr);
        }

        public void setProgress(float f) {
            this.progress = f;
            this.progressView.invalidate();
        }

        public void setAnimation(int i, int i2, int i3, String... strArr) {
            this.imageView.setAnimation(i, i2, i3);
            for (String str : strArr) {
                this.imageView.setLayerColor(str, this.textColor);
            }
        }

        public void setAnimation(TLRPC.Document document, int i, int i2, String... strArr) {
            this.imageView.setAutoRepeat(true);
            this.imageView.setAnimation(document, i, i2);
            for (String str : strArr) {
                this.imageView.setLayerColor(str, this.textColor);
            }
        }
    }

    public static class SimpleLayout extends ButtonLayout {
        public final ImageView imageView;
        public final LinkSpanDrawable.LinksTextView textView;

        public SimpleLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            int themedColor = getThemedColor(Theme.key_undo_infoColor);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
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

    public static class TimerView extends View {
        private long lastUpdateTime;
        private int prevSeconds;
        private final Paint progressPaint;
        RectF rect;
        private TextPaint textPaint;
        private int textWidth;
        int textWidthOut;
        StaticLayout timeLayout;
        StaticLayout timeLayoutOut;
        public long timeLeft;
        private String timeLeftString;
        float timeReplaceProgress;

        public TimerView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.timeReplaceProgress = 1.0f;
            this.rect = new RectF();
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            Paint paint = new Paint(1);
            this.progressPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            setColor(Theme.getColor(Theme.key_undo_infoColor, resourcesProvider));
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            long j = this.timeLeft;
            int iCeil = j > 0 ? (int) Math.ceil(j / 1000.0f) : 0;
            this.rect.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
            if (this.prevSeconds != iCeil) {
                this.prevSeconds = iCeil;
                String strValueOf = String.valueOf(Math.max(0, iCeil));
                this.timeLeftString = strValueOf;
                StaticLayout staticLayout = this.timeLayout;
                if (staticLayout != null) {
                    this.timeLayoutOut = staticLayout;
                    this.timeReplaceProgress = 0.0f;
                    this.textWidthOut = this.textWidth;
                }
                this.textWidth = (int) Math.ceil(this.textPaint.measureText(strValueOf));
                this.timeLayout = new StaticLayout(this.timeLeftString, this.textPaint, Integer.MAX_VALUE, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            int alpha = this.textPaint.getAlpha();
            if (this.timeLayoutOut != null) {
                float f3 = this.timeReplaceProgress;
                if (f3 < 1.0f) {
                    this.textPaint.setAlpha((int) ((1.0f - f3) * alpha));
                    canvas.save();
                    canvas.translate(this.rect.centerX() - (this.textWidthOut / 2.0f), ((AndroidUtilities.dp(10.0f) * this.timeReplaceProgress) + (this.rect.centerY() - (this.timeLayoutOut.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                    this.timeLayoutOut.draw(canvas);
                    this.textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.timeLayout != null) {
                float f4 = this.timeReplaceProgress;
                if (f4 != 1.0f) {
                    this.textPaint.setAlpha((int) (alpha * f4));
                }
                canvas.save();
                canvas.translate(this.rect.centerX() - (this.textWidth / 2.0f), BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.timeReplaceProgress, AndroidUtilities.dp(10.0f), this.rect.centerY() - (this.timeLayout.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
                this.timeLayout.draw(canvas);
                if (this.timeReplaceProgress != 1.0f) {
                    this.textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(this.rect, -90.0f, (Math.max(0L, this.timeLeft) / 5000.0f) * (-360.0f), false, this.progressPaint);
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

    public static class TwoLineAnimatedLottieLayout extends ButtonLayout {
        public final RLottieImageView imageView;
        private final LinearLayout linearLayout;
        public final AnimatedTextView subtitleTextView;
        private final int textColor;
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
            this.linearLayout = linearLayout;
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

        public void hideImage() {
            this.imageView.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.linearLayout.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        }

        @Override
        public void onShow() {
            super.onShow();
            this.imageView.playAnimation();
        }

        public void setAnimation(int i, String... strArr) {
            setAnimation(i, 32, 32, strArr);
        }

        public void setSubtitle(CharSequence charSequence, boolean z) {
            this.subtitleTextView.setText(charSequence, z);
        }

        public void setAnimation(int i, int i2, int i3, String... strArr) {
            this.imageView.setAnimation(i, i2, i3);
            for (String str : strArr) {
                this.imageView.setLayerColor(str, this.textColor);
            }
        }
    }

    public static class TwoLineBackupLayout extends ButtonLayout {
        public final BackupImageView imageView;
        private final LinearLayout linearLayout;
        public final LinkSpanDrawable.LinksTextView subtitleTextView;
        private final int textColor;
        public final LinkSpanDrawable.LinksTextView titleTextView;

        public TwoLineBackupLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            int i = Theme.key_undo_infoColor;
            this.textColor = getThemedColor(i);
            setBackground(getThemedColor(Theme.key_undo_background));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
            int themedColor = getThemedColor(i);
            int themedColor2 = getThemedColor(Theme.key_undo_cancelColor);
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.titleTextView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            linksTextView.setTextColor(themedColor);
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(linksTextView);
            LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context);
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

        public void hideImage() {
            this.imageView.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.linearLayout.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        }
    }

    public static class TwoLineLayout extends ButtonLayout {
        public final BackupImageView imageView;
        private final LinearLayout linearLayout;
        public final TextView subtitleTextView;
        public final TextView titleTextView;

        public TwoLineLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            int themedColor = getThemedColor(Theme.key_undo_infoColor);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrameRelatively(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
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

        public void hideImage() {
            this.imageView.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.linearLayout.getLayoutParams()).setMarginStart(AndroidUtilities.dp(12.0f));
        }
    }

    public static class TwoLineLottieLayout extends ButtonLayout {
        public final RLottieImageView imageView;
        private final LinearLayout linearLayout;
        public final LinkSpanDrawable.LinksTextView subtitleTextView;
        private final int textColor;
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
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.titleTextView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            linksTextView.setTextColor(themedColor);
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(linksTextView);
            LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context);
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

        public void hideImage() {
            this.imageView.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.linearLayout.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        }

        @Override
        public void onShow() {
            super.onShow();
            this.imageView.playAnimation();
        }

        public void setAnimation(int i, String... strArr) {
            setAnimation(i, 32, 32, strArr);
        }

        public void setAnimation(int i, int i2, int i3, String... strArr) {
            this.imageView.setAnimation(i, i2, i3);
            for (String str : strArr) {
                this.imageView.setLayerColor(str, this.textColor);
            }
        }

        public void setAnimation(TLRPC.Document document, int i, int i2, String... strArr) {
            this.imageView.setAutoRepeat(true);
            this.imageView.setAnimation(document, i, i2);
            for (String str : strArr) {
                this.imageView.setLayerColor(str, this.textColor);
            }
        }
    }

    public static final class UndoButton extends Button {
        private Bulletin bulletin;
        private Runnable delayedAction;
        private boolean isUndone;
        private final Theme.ResourcesProvider resourcesProvider;
        private Runnable undoAction;
        public TextView undoTextView;

        public UndoButton(Context context, boolean z) {
            this(context, z, null);
        }

        public void lambda$new$0(View view) {
            undo();
        }

        public int getThemedColor(int i) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
        }

        @Override
        public void onAttach(Layout layout, Bulletin bulletin) {
            this.bulletin = bulletin;
        }

        @Override
        public void onDetach(Layout layout) {
            this.bulletin = null;
            Runnable runnable = this.delayedAction;
            if (runnable == null || this.isUndone) {
                return;
            }
            runnable.run();
        }

        public UndoButton setDelayedAction(Runnable runnable) {
            this.delayedAction = runnable;
            return this;
        }

        public UndoButton setText(CharSequence charSequence) {
            TextView textView = this.undoTextView;
            if (textView != null) {
                textView.setText(charSequence);
            }
            return this;
        }

        public UndoButton setUndoAction(Runnable runnable) {
            this.undoAction = runnable;
            return this;
        }

        public void undo() {
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

        public UndoButton(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            this(context, z, !z, resourcesProvider);
        }

        public UndoButton(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            int themedColor = getThemedColor(Theme.key_undo_cancelColor);
            if (z) {
                TextView textView = new TextView(context);
                this.undoTextView = textView;
                textView.setBackground(Theme.createSelectorDrawable((themedColor & 16777215) | 419430400, 7, -1));
                this.undoTextView.setTextSize(1, 14.0f);
                this.undoTextView.setTypeface(AndroidUtilities.bold());
                this.undoTextView.setTextColor(themedColor);
                this.undoTextView.setText(LocaleController.getString(R.string.UndoNoCaps));
                this.undoTextView.setGravity(16);
                ViewHelper.setPaddingRelative(this.undoTextView, z2 ? 34.0f : 12.0f, 8.0f, 12.0f, 8.0f);
                addView(this.undoTextView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
            }
            if (z2) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(R.drawable.chats_undo);
                imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                if (!z) {
                    imageView.setBackground(Theme.createSelectorDrawable((themedColor & 16777215) | 419430400, 1, -1));
                }
                ViewHelper.setPaddingRelative(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
                addView(imageView, LayoutHelper.createFrameRelatively(56.0f, 48.0f, 16));
            }
            setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 14));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WidthDef {
    }

    public static void addDelegate(BaseFragment baseFragment, Delegate delegate) {
        if (baseFragment != null) {
            baseFragment.setBulletinDelegate(delegate);
        }
    }

    public void ensureLayoutTransitionCreated() {
        Layout layout = this.layout;
        if (layout == null || this.layoutTransition != null) {
            return;
        }
        this.layoutTransition = layout.createTransition();
    }

    public static Bulletin find(FrameLayout frameLayout) {
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = frameLayout.getChildAt(i);
            if (childAt instanceof Layout) {
                return ((Layout) childAt).bulletin;
            }
        }
        return null;
    }

    public static Delegate findDelegate(BaseFragment baseFragment, FrameLayout frameLayout) {
        Delegate bulletinDelegate;
        if (baseFragment != null && (bulletinDelegate = baseFragment.getBulletinDelegate()) != null) {
            return bulletinDelegate;
        }
        if (frameLayout == null) {
            return null;
        }
        Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
        if (tag instanceof Delegate) {
            return (Delegate) tag;
        }
        return null;
    }

    public static Bulletin getVisibleBulletin() {
        return visibleBulletin;
    }

    public static void hide(FrameLayout frameLayout) {
        hide(frameLayout, true);
    }

    public static void hideVisible() {
        Bulletin bulletin = visibleBulletin;
        if (bulletin != null) {
            bulletin.hide();
        }
    }

    public static boolean isTransitionsEnabled() {
        return MessagesController.getGlobalMainSettings().getBoolean("view_animations", true);
    }

    public void lambda$hide$3() {
        Delegate delegate = this.currentDelegate;
        if (delegate != null && !this.layout.top) {
            delegate.onBottomOffsetChange(0.0f);
            this.currentDelegate.onHide(this);
        }
        Layout layout = this.layout;
        layout.transitionRunningExit = false;
        layout.onExitTransitionEnd();
        this.layout.onHide();
        this.containerLayout.removeView(this.parentLayout);
        this.containerLayout.removeOnLayoutChangeListener(this.containerLayoutListener);
        this.layout.onDetach();
        Runnable runnable = this.onHideListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$hide$4(Float f) {
        Delegate delegate = this.currentDelegate;
        if (delegate != null) {
            Layout layout = this.layout;
            if (layout.top) {
                return;
            }
            delegate.onBottomOffsetChange(layout.getHeight() - f.floatValue());
        }
    }

    public void lambda$hide$5() {
        this.containerLayout.removeView(this.parentLayout);
        this.containerLayout.removeOnLayoutChangeListener(this.containerLayoutListener);
    }

    public void lambda$show$0(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.lastBottomOffset = (int) f;
        updatePosition();
    }

    public void lambda$show$1(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        if (this.bottomOffsetSpring == dynamicAnimation) {
            this.bottomOffsetSpring = null;
        }
    }

    public void lambda$show$2(boolean z, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Delegate delegate = this.currentDelegate;
        if ((delegate == null || delegate.allowLayoutChanges()) && !z) {
            Delegate delegate2 = this.currentDelegate;
            int bottomOffset = delegate2 != null ? delegate2.getBottomOffset(this.tag) : 0;
            int i9 = this.lastBottomOffset;
            if (i9 != bottomOffset) {
                SpringAnimation springAnimation = this.bottomOffsetSpring;
                if (springAnimation == null || !springAnimation.mRunning) {
                    SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(i9));
                    SpringForce springForce = new SpringForce();
                    springForce.mFinalPosition = bottomOffset;
                    springForce.setStiffness(900.0f);
                    springForce.setDampingRatio(1.0f);
                    springAnimation2.mSpring = springForce;
                    this.bottomOffsetSpring = springAnimation2;
                    springAnimation2.addUpdateListener(new Bulletin$$ExternalSyntheticLambda2(this, 0));
                    this.bottomOffsetSpring.addEndListener(new Bulletin$$ExternalSyntheticLambda3(this, 0));
                } else {
                    springAnimation.mSpring.mFinalPosition = bottomOffset;
                }
                this.bottomOffsetSpring.start();
            }
        }
    }

    public static Bulletin make(FrameLayout frameLayout, Layout layout, int i) {
        return frameLayout == null ? new EmptyBulletin() : new Bulletin(null, frameLayout, layout, i);
    }

    public static void removeDelegate(BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.setBulletinDelegate(null);
        }
    }

    public static void updateCurrentPosition() {
        Layout layout;
        Bulletin bulletin = visibleBulletin;
        if (bulletin == null || (layout = bulletin.layout) == null) {
            return;
        }
        layout.updatePosition();
    }

    public Bulletin allowBlur() {
        this.allowBlurAnimation = true;
        return this;
    }

    public Layout getLayout() {
        return this.layout;
    }

    public Bulletin hideAfterBottomSheet(boolean z) {
        this.hideAfterBottomSheet = z;
        return this;
    }

    public Bulletin ignoreDetach() {
        this.ignoreDetach = true;
        return this;
    }

    public boolean isShowing() {
        return this.showing;
    }

    public void onLoaded(CharSequence charSequence) {
        this.loaded = true;
        ViewParent viewParent = this.layout;
        if (viewParent instanceof LoadingLayout) {
            ((LoadingLayout) viewParent).onTextLoaded(charSequence);
        }
        setCanHide(true);
    }

    public void setCanHide(boolean z) {
        Layout layout;
        boolean z2 = z && this.loaded;
        if (this.canHide == z2 || (layout = this.layout) == null) {
            return;
        }
        this.canHide = z2;
        if (!z2) {
            layout.removeCallbacks(this.hideRunnable);
            return;
        }
        int i = this.duration;
        if (i >= 0) {
            layout.postDelayed(this.hideRunnable, i);
        }
    }

    public Bulletin setDuration(int i) {
        this.duration = i;
        return this;
    }

    public Bulletin setImageScale(float f) {
        Layout layout = this.layout;
        if (layout instanceof TwoLineLottieLayout) {
            RLottieImageView rLottieImageView = ((TwoLineLottieLayout) layout).imageView;
            rLottieImageView.setScaleX(f);
            rLottieImageView.setScaleY(f);
        }
        return this;
    }

    public Bulletin setOnClickListener(View.OnClickListener onClickListener) {
        Layout layout = this.layout;
        if (layout != null) {
            layout.setOnClickListener(onClickListener);
        }
        return this;
    }

    public Bulletin setOnHideListener(Runnable runnable) {
        this.onHideListener = runnable;
        return this;
    }

    public Bulletin setTag(int i) {
        this.tag = i;
        return this;
    }

    public Bulletin show() {
        return show(false);
    }

    public Bulletin skipShowAnimation() {
        this.skipShowAnimation = true;
        return this;
    }

    public void updatePosition() {
        Layout layout = this.layout;
        if (layout != null) {
            layout.updatePosition();
        }
    }

    public Bulletin wrapContent() {
        if (this.layout.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) this.layout.getLayoutParams()).width = -2;
            ((FrameLayout.LayoutParams) this.layout.getLayoutParams()).gravity |= 1;
        }
        return this;
    }

    private Bulletin() {
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

    public static void hide(FrameLayout frameLayout, boolean z) {
        Bulletin bulletinFind = find(frameLayout);
        if (bulletinFind != null) {
            bulletinFind.hide(z && isTransitionsEnabled(), 0L);
        }
    }

    public static void removeDelegate(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public Bulletin show(final boolean z) {
        if (this.showing || this.containerLayout == null) {
            return this;
        }
        this.showing = true;
        this.layout.setTop(z);
        CharSequence accessibilityText = this.layout.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        if (this.layout.getParent() != this.parentLayout) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        Bulletin bulletin = visibleBulletin;
        if (bulletin != null) {
            bulletin.hide();
        }
        visibleBulletin = this;
        this.layout.onAttach(this);
        FrameLayout frameLayout = this.containerLayout;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f$0.lambda$show$2(z, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.containerLayoutListener = onLayoutChangeListener;
        frameLayout.addOnLayoutChangeListener(onLayoutChangeListener);
        this.layout.addOnLayoutChangeListener(new AnonymousClass2(z));
        if (!this.ignoreDetach) {
            this.layout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view) {
                }

                @Override
                public void onViewDetachedFromWindow(View view) {
                    Bulletin.this.layout.removeOnAttachStateChangeListener(this);
                    Bulletin.this.hide(false, 0L);
                }
            });
        }
        this.containerLayout.addView(this.parentLayout);
        return this;
    }

    public static void hideVisible(ViewGroup viewGroup) {
        Bulletin bulletin = visibleBulletin;
        if (bulletin == null || bulletin.containerLayout != viewGroup) {
            return;
        }
        bulletin.hide();
    }

    public static Bulletin make(BaseFragment baseFragment, Layout layout, int i) {
        if (baseFragment == null) {
            return new EmptyBulletin();
        }
        if (baseFragment instanceof ChatActivity) {
            layout.setWideScreenParams(-2, 1);
        } else if (baseFragment instanceof DialogsActivity) {
            layout.setWideScreenParams(-1, 0);
        }
        return new Bulletin(baseFragment, baseFragment.getBulletinLayoutContainer(), layout, i);
    }

    public void hide() {
        hide(isTransitionsEnabled(), 0L);
    }

    public void hide(long j) {
        hide(isTransitionsEnabled(), j);
    }

    public void hide(boolean z, long j) {
        int i = 1;
        int i2 = 0;
        Layout layout = this.layout;
        if (layout != null && this.showing) {
            this.showing = false;
            if (visibleBulletin == this) {
                visibleBulletin = null;
            }
            int i3 = this.currentBottomOffset;
            this.currentBottomOffset = 0;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            if (layout.isLaidOut() || this.ignoreDetach) {
                this.layout.removeCallbacks(this.hideRunnable);
                if (z) {
                    Layout layout2 = this.layout;
                    layout2.transitionRunningExit = true;
                    layout2.delegate = this.currentDelegate;
                    layout2.invalidate();
                    if (j >= 0) {
                        Layout.DefaultTransition defaultTransition = new Layout.DefaultTransition();
                        defaultTransition.duration = j;
                        this.layoutTransition = defaultTransition;
                    } else {
                        ensureLayoutTransitionCreated();
                    }
                    Layout.Transition transition = this.layoutTransition;
                    Layout layout3 = this.layout;
                    Objects.requireNonNull(layout3);
                    transition.animateExit(layout3, new Bulletin$$ExternalSyntheticLambda4(layout3, i2), new Bulletin$$ExternalSyntheticLambda0(this, i), new Bulletin$$ExternalSyntheticLambda6(this, i2), i3);
                    return;
                }
            }
            Delegate delegate = this.currentDelegate;
            if (delegate != null && !this.layout.top) {
                delegate.onBottomOffsetChange(0.0f);
                this.currentDelegate.onHide(this);
            }
            this.layout.onExitTransitionStart();
            this.layout.onExitTransitionEnd();
            this.layout.onHide();
            if (this.containerLayout != null) {
                AndroidUtilities.runOnUIThread(new Bulletin$$ExternalSyntheticLambda0(this, 2));
            }
            this.layout.onDetach();
            Runnable runnable = this.onHideListener;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static class LoadingLottieLayout extends LottieLayout implements LoadingLayout {
        public LinkSpanDrawable.LinksTextView textLoadingView;

        public LoadingLottieLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.textLoadingView = linksTextView;
            linksTextView.setDisablePaddingsOffset(true);
            this.textLoadingView.setSingleLine();
            this.textLoadingView.setTypeface(Typeface.SANS_SERIF);
            this.textLoadingView.setTextSize(1, 15.0f);
            this.textLoadingView.setEllipsize(TextUtils.TruncateAt.END);
            this.textLoadingView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            this.textView.setVisibility(8);
            addView(this.textLoadingView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
            setTextColor(getThemedColor(Theme.key_undo_infoColor));
        }

        @Override
        public void onTextLoaded(CharSequence charSequence) {
            this.textView.setText(charSequence);
            AndroidUtilities.updateViewShow(this.textLoadingView, false, false, true);
            AndroidUtilities.updateViewShow(this.textView, true, false, true);
        }

        @Override
        public void setTextColor(int i) {
            super.setTextColor(i);
            LinkSpanDrawable.LinksTextView linksTextView = this.textLoadingView;
            if (linksTextView != null) {
                linksTextView.setTextColor(i);
            }
        }

        public LoadingLottieLayout(Context context, Theme.ResourcesProvider resourcesProvider, int i, int i2) {
            this(context, resourcesProvider);
            setBackground(i);
            setTextColor(i2);
        }
    }

    private Bulletin(BaseFragment baseFragment, final FrameLayout frameLayout, Layout layout, int i) {
        this.hideRunnable = new Bulletin$$ExternalSyntheticLambda0(this, 0);
        this.loaded = true;
        this.hideAfterBottomSheet = true;
        this.setCanHideOnShow = true;
        this.layout = layout;
        this.loaded = true ^ (layout instanceof LoadingLayout);
        this.parentLayout = new ParentLayout(layout) {
            @Override
            public void onHide() {
                Bulletin.this.hide();
            }

            @Override
            public void onPressedStateChanged(boolean z) {
                Bulletin.this.setCanHide(!z);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(z);
                }
            }
        };
        this.containerFragment = baseFragment;
        this.containerLayout = frameLayout;
        this.duration = i;
    }

    public static class ProgressLayout extends ButtonLayout {
        public BackupImageView imageView;
        private boolean inprogress;
        public float progress;
        public FrameLayout progressView;
        public AnimatedTextView textView;

        public ProgressLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            FrameLayout frameLayout = new FrameLayout(context) {
                private final AnimatedFloat animatedDone;
                private final AnimatedFloat animatedProgress;
                private final RectF rect;
                private final long start;
                private final Paint strokePaint;

                {
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    this.animatedProgress = new AnimatedFloat(this, 320L, cubicBezierInterpolator);
                    this.animatedDone = new AnimatedFloat(this, 320L, cubicBezierInterpolator);
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
                public void onDraw(Canvas canvas) {
                    float f = this.animatedProgress.set(ProgressLayout.this.progress);
                    float f2 = this.animatedDone.set(ProgressLayout.this.progress >= 1.0f);
                    float width = getWidth() / 2.0f;
                    float height = getHeight() / 2.0f;
                    this.rect.set(width - AndroidUtilities.dpf2(13.0f), height - AndroidUtilities.dpf2(13.0f), AndroidUtilities.dpf2(13.0f) + width, AndroidUtilities.dpf2(13.0f) + height);
                    float fCurrentTimeMillis = ((System.currentTimeMillis() - this.start) * 0.45f) % 5400.0f;
                    float fMax = Math.max(0.0f, ((1520.0f * fCurrentTimeMillis) / 5400.0f) - 20.0f);
                    for (int i = 0; i < 4; i++) {
                        FastOutSlowInInterpolator fastOutSlowInInterpolator = CircularProgressDrawable.interpolator;
                        int i2 = i * 1350;
                        fastOutSlowInInterpolator.getInterpolation((fCurrentTimeMillis - i2) / 667.0f);
                        fMax += fastOutSlowInInterpolator.getInterpolation((fCurrentTimeMillis - (i2 + 667)) / 667.0f) * 250.0f;
                    }
                    this.strokePaint.setColor(Theme.multAlpha((1.0f - f2) * 1.0f, -1));
                    canvas.drawArc(this.rect, (-90.0f) - fMax, Math.max(0.02f, f) * (-360.0f), false, this.strokePaint);
                    if (f < 1.0f && f2 < 1.0f) {
                        invalidate();
                    }
                    super.onDraw(canvas);
                }
            };
            this.progressView = frameLayout;
            frameLayout.setWillNotDraw(false);
            addView(this.progressView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
            this.progressView.addView(this.imageView, LayoutHelper.createFrame(28, 28, 17));
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.textView = animatedTextView;
            animatedTextView.setTypeface(Typeface.SANS_SERIF);
            this.textView.setTextSize(AndroidUtilities.dp(15.0f));
            this.textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            addView(this.textView, LayoutHelper.createFrameRelatively(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
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
            this.progressView.invalidate();
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }

        public ProgressLayout(Context context, Theme.ResourcesProvider resourcesProvider, int i, int i2) {
            this(context, resourcesProvider);
            setBackground(i);
            setTextColor(i2);
        }
    }

    public static class UsersLayout extends ButtonLayout {
        public AvatarsImageView avatarsImageView;
        LinearLayout linearLayout;
        public TextView subtitleView;
        public TextView textView;

        public UsersLayout(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            this.avatarsImageView = avatarsImageView;
            avatarsImageView.setStyle(11);
            this.avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            addView(this.avatarsImageView, LayoutHelper.createFrameRelatively(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
            if (z) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.linearLayout = linearLayout;
                linearLayout.setOrientation(1);
                addView(this.linearLayout, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context) {
                    @Override
                    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                    }
                };
                this.textView = linksTextView;
                NotificationCenter.listenEmojiLoading(linksTextView);
                TextView textView = this.textView;
                Typeface typeface = Typeface.SANS_SERIF;
                textView.setTypeface(typeface);
                this.textView.setTextSize(1, 14.0f);
                this.textView.setTypeface(AndroidUtilities.bold());
                TextView textView2 = this.textView;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView2.setEllipsize(truncateAt);
                this.textView.setMaxLines(1);
                this.linearLayout.addView(this.textView);
                LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context);
                this.subtitleView = linksTextView2;
                linksTextView2.setTypeface(typeface);
                this.subtitleView.setTextSize(1, 12.0f);
                this.subtitleView.setEllipsize(truncateAt);
                this.subtitleView.setSingleLine(false);
                this.subtitleView.setMaxLines(3);
                this.subtitleView.setLinkTextColor(getThemedColor(Theme.key_undo_cancelColor));
                this.linearLayout.addView(this.subtitleView, LayoutHelper.createLinear(-2, -2, 0, 0, 0, 0, 0));
            } else {
                LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context) {
                    @Override
                    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                    }
                };
                this.textView = linksTextView3;
                NotificationCenter.listenEmojiLoading(linksTextView3);
                this.textView.setTypeface(Typeface.SANS_SERIF);
                this.textView.setTextSize(1, 15.0f);
                this.textView.setEllipsize(TextUtils.TruncateAt.END);
                this.textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
                addView(this.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
            }
            this.textView.setLinkTextColor(getThemedColor(Theme.key_undo_cancelColor));
            setTextColor(getThemedColor(Theme.key_undo_infoColor));
            setBackground(getThemedColor(Theme.key_undo_background));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return this.textView.getText();
        }

        @Override
        public void onShow() {
            super.onShow();
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
            TextView textView = this.subtitleView;
            if (textView != null) {
                textView.setTextColor(i);
            }
        }

        public UsersLayout(Context context, Theme.ResourcesProvider resourcesProvider, int i, int i2) {
            this(context, false, resourcesProvider);
            setBackground(i);
            setTextColor(i2);
        }
    }

    public interface Delegate {
        boolean allowLayoutChanges();

        boolean bottomOffsetAnimated();

        boolean clipWithGradient(int i);

        int getBottomOffset(int i);

        int getLeftPadding();

        int getRightPadding();

        int getTopOffset(int i);

        void onBottomOffsetChange(float f);

        void onHide(Bulletin bulletin);

        void onShow(Bulletin bulletin);

        public abstract class CC {
            public static boolean $default$allowLayoutChanges(Delegate delegate) {
                return true;
            }

            public static boolean $default$bottomOffsetAnimated(Delegate delegate) {
                return true;
            }

            public static boolean $default$clipWithGradient(Delegate delegate, int i) {
                return false;
            }

            public static int $default$getBottomOffset(Delegate delegate, int i) {
                return 0;
            }

            public static int $default$getLeftPadding(Delegate delegate) {
                return 0;
            }

            public static int $default$getRightPadding(Delegate delegate) {
                return 0;
            }

            public static int $default$getTopOffset(Delegate delegate, int i) {
                return 0;
            }

            public static void $default$onBottomOffsetChange(Delegate delegate, float f) {
            }

            public static void $default$onHide(Delegate delegate, Bulletin bulletin) {
            }

            public static void $default$onShow(Delegate delegate, Bulletin bulletin) {
            }
        }
    }
}
