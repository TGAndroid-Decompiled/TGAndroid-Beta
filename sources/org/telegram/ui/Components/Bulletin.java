package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.SparseLongArray;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
public class Bulletin {
    private static final HashMap<FrameLayout, Delegate> delegates = new HashMap<>();
    private static final HashMap<BaseFragment, Delegate> fragmentDelegates = new HashMap<>();
    @SuppressLint({"StaticFieldLeak"})
    private static Bulletin visibleBulletin;
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
    public int lastBottomOffset;
    private final Layout layout;
    private Layout.Transition layoutTransition;
    private boolean loaded;
    private Runnable onHideListener;
    private final ParentLayout parentLayout;
    private boolean showing;
    public int tag;

    public interface Delegate {

        public final class CC {
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

        boolean allowLayoutChanges();

        boolean bottomOffsetAnimated();

        boolean clipWithGradient(int i);

        int getBottomOffset(int i);

        int getTopOffset(int i);

        void onBottomOffsetChange(float f);

        void onHide(Bulletin bulletin);

        void onShow(Bulletin bulletin);
    }

    public interface LoadingLayout {
        void onTextLoaded(CharSequence charSequence);
    }

    static boolean access$800() {
        return isTransitionsEnabled();
    }

    public static Bulletin make(FrameLayout frameLayout, Layout layout, int i) {
        return new Bulletin(null, frameLayout, layout, i);
    }

    public Bulletin setOnClickListener(View.OnClickListener onClickListener) {
        Layout layout = this.layout;
        if (layout != null) {
            layout.setOnClickListener(onClickListener);
        }
        return this;
    }

    @SuppressLint({"RtlHardcoded"})
    public static Bulletin make(BaseFragment baseFragment, Layout layout, int i) {
        if (!(baseFragment instanceof ChatActivity)) {
            if (baseFragment instanceof DialogsActivity) {
                layout.setWideScreenParams(-1, 0);
            }
        } else {
            layout.setWideScreenParams(-2, 1);
        }
        return new Bulletin(baseFragment, baseFragment.getLayoutContainer(), layout, i);
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

    public static void hide(FrameLayout frameLayout) {
        hide(frameLayout, true);
    }

    public static void hide(FrameLayout frameLayout, boolean z) {
        Bulletin find = find(frameLayout);
        if (find != null) {
            find.hide(z && isTransitionsEnabled(), 0L);
        }
    }

    private Bulletin() {
        this.hideRunnable = new Runnable() {
            @Override
            public final void run() {
                Bulletin.this.hide();
            }
        };
        this.loaded = true;
        this.hideAfterBottomSheet = true;
        this.layout = null;
        this.parentLayout = null;
        this.containerFragment = null;
        this.containerLayout = null;
    }

    private Bulletin(BaseFragment baseFragment, final FrameLayout frameLayout, Layout layout, int i) {
        this.hideRunnable = new Runnable() {
            @Override
            public final void run() {
                Bulletin.this.hide();
            }
        };
        this.loaded = true;
        this.hideAfterBottomSheet = true;
        this.layout = layout;
        this.loaded = true ^ (layout instanceof LoadingLayout);
        this.parentLayout = new ParentLayout(layout) {
            {
                Bulletin.this = this;
            }

            @Override
            protected void onPressedStateChanged(boolean z) {
                Bulletin.this.setCanHide(!z);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(z);
                }
            }

            @Override
            protected void onHide() {
                Bulletin.this.hide();
            }
        };
        this.containerFragment = baseFragment;
        this.containerLayout = frameLayout;
        this.duration = i;
    }

    public static Bulletin getVisibleBulletin() {
        return visibleBulletin;
    }

    public static void hideVisible() {
        Bulletin bulletin = visibleBulletin;
        if (bulletin != null) {
            bulletin.hide();
        }
    }

    public static void hideVisible(ViewGroup viewGroup) {
        Bulletin bulletin = visibleBulletin;
        if (bulletin == null || bulletin.containerLayout != viewGroup) {
            return;
        }
        bulletin.hide();
    }

    public Bulletin setDuration(int i) {
        this.duration = i;
        return this;
    }

    public Bulletin hideAfterBottomSheet(boolean z) {
        this.hideAfterBottomSheet = z;
        return this;
    }

    public Bulletin setTag(int i) {
        this.tag = i;
        return this;
    }

    public Bulletin show() {
        return show(false);
    }

    public Bulletin show(final boolean z) {
        if (!this.showing && this.containerLayout != null) {
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
                    Bulletin.this.lambda$show$2(z, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            };
            this.containerLayoutListener = onLayoutChangeListener;
            frameLayout.addOnLayoutChangeListener(onLayoutChangeListener);
            this.layout.addOnLayoutChangeListener(new AnonymousClass2(z));
            this.layout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view) {
                }

                {
                    Bulletin.this = this;
                }

                @Override
                public void onViewDetachedFromWindow(View view) {
                    Bulletin.this.layout.removeOnAttachStateChangeListener(this);
                    Bulletin.this.hide(false, 0L);
                }
            });
            this.containerLayout.addView(this.parentLayout);
        }
        return this;
    }

    public void lambda$show$2(boolean z, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Delegate delegate = this.currentDelegate;
        if ((delegate == null || delegate.allowLayoutChanges()) && !z) {
            Delegate delegate2 = this.currentDelegate;
            int bottomOffset = delegate2 != null ? delegate2.getBottomOffset(this.tag) : 0;
            if (this.lastBottomOffset != bottomOffset) {
                SpringAnimation springAnimation = this.bottomOffsetSpring;
                if (springAnimation == null || !springAnimation.isRunning()) {
                    SpringAnimation spring = new SpringAnimation(new FloatValueHolder(this.lastBottomOffset)).setSpring(new SpringForce().setFinalPosition(bottomOffset).setStiffness(900.0f).setDampingRatio(1.0f));
                    this.bottomOffsetSpring = spring;
                    spring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                            Bulletin.this.lambda$show$0(dynamicAnimation, f, f2);
                        }
                    });
                    this.bottomOffsetSpring.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                            Bulletin.this.lambda$show$1(dynamicAnimation, z2, f, f2);
                        }
                    });
                } else {
                    this.bottomOffsetSpring.getSpring().setFinalPosition(bottomOffset);
                }
                this.bottomOffsetSpring.start();
            }
        }
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

    public class AnonymousClass2 implements View.OnLayoutChangeListener {
        final boolean val$top;

        AnonymousClass2(boolean z) {
            Bulletin.this = r1;
            this.val$top = z;
        }

        @Override
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Bulletin.this.layout.removeOnLayoutChangeListener(this);
            if (Bulletin.this.showing) {
                Bulletin.this.layout.onShow();
                Bulletin bulletin = Bulletin.this;
                bulletin.currentDelegate = Bulletin.findDelegate(bulletin.containerFragment, Bulletin.this.containerLayout);
                if (Bulletin.this.bottomOffsetSpring == null || !Bulletin.this.bottomOffsetSpring.isRunning()) {
                    Bulletin bulletin2 = Bulletin.this;
                    bulletin2.lastBottomOffset = bulletin2.currentDelegate != null ? Bulletin.this.currentDelegate.getBottomOffset(Bulletin.this.tag) : 0;
                }
                if (Bulletin.this.currentDelegate != null) {
                    Bulletin.this.currentDelegate.onShow(Bulletin.this);
                }
                if (Bulletin.access$800()) {
                    Bulletin.this.ensureLayoutTransitionCreated();
                    Bulletin.this.layout.transitionRunningEnter = true;
                    Bulletin.this.layout.delegate = Bulletin.this.currentDelegate;
                    Bulletin.this.layout.invalidate();
                    Layout.Transition transition = Bulletin.this.layoutTransition;
                    Layout layout = Bulletin.this.layout;
                    final Layout layout2 = Bulletin.this.layout;
                    Objects.requireNonNull(layout2);
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            Bulletin.Layout.this.onEnterTransitionStart();
                        }
                    };
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            Bulletin.AnonymousClass2.this.lambda$onLayoutChange$0();
                        }
                    };
                    final boolean z = this.val$top;
                    transition.animateEnter(layout, runnable, runnable2, new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            Bulletin.AnonymousClass2.this.lambda$onLayoutChange$1(z, (Float) obj);
                        }
                    }, Bulletin.this.currentBottomOffset);
                    return;
                }
                if (Bulletin.this.currentDelegate != null && !this.val$top) {
                    Bulletin.this.currentDelegate.onBottomOffsetChange(Bulletin.this.layout.getHeight() - Bulletin.this.currentBottomOffset);
                }
                Bulletin.this.updatePosition();
                Bulletin.this.layout.onEnterTransitionStart();
                Bulletin.this.layout.onEnterTransitionEnd();
                Bulletin.this.setCanHide(true);
            }
        }

        public void lambda$onLayoutChange$0() {
            Bulletin.this.layout.transitionRunningEnter = false;
            Bulletin.this.layout.onEnterTransitionEnd();
            Bulletin.this.setCanHide(true);
        }

        public void lambda$onLayoutChange$1(boolean z, Float f) {
            if (Bulletin.this.currentDelegate == null || z) {
                return;
            }
            Bulletin.this.currentDelegate.onBottomOffsetChange(Bulletin.this.layout.getHeight() - f.floatValue());
        }
    }

    public void setCanHide(boolean z) {
        Layout layout;
        boolean z2 = z && this.loaded;
        if (this.canHide == z2 || (layout = this.layout) == null) {
            return;
        }
        this.canHide = z2;
        if (z2) {
            layout.postDelayed(this.hideRunnable, this.duration);
        } else {
            layout.removeCallbacks(this.hideRunnable);
        }
    }

    public Bulletin setOnHideListener(Runnable runnable) {
        this.onHideListener = runnable;
        return this;
    }

    public void ensureLayoutTransitionCreated() {
        Layout layout = this.layout;
        if (layout == null || this.layoutTransition != null) {
            return;
        }
        this.layoutTransition = layout.createTransition();
    }

    public void hide() {
        hide(isTransitionsEnabled(), 0L);
    }

    public void hide(long j) {
        hide(isTransitionsEnabled(), j);
    }

    public void hide(boolean z, long j) {
        Layout layout = this.layout;
        if (layout != null && this.showing) {
            this.showing = false;
            if (visibleBulletin == this) {
                visibleBulletin = null;
            }
            int i = this.currentBottomOffset;
            this.currentBottomOffset = 0;
            if (ViewCompat.isLaidOut(layout)) {
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
                    final Layout layout3 = this.layout;
                    Objects.requireNonNull(layout3);
                    transition.animateExit(layout3, new Runnable() {
                        @Override
                        public final void run() {
                            Bulletin.Layout.this.onExitTransitionStart();
                        }
                    }, new Runnable() {
                        @Override
                        public final void run() {
                            Bulletin.this.lambda$hide$3();
                        }
                    }, new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            Bulletin.this.lambda$hide$4((Float) obj);
                        }
                    }, i);
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bulletin.this.lambda$hide$5();
                    }
                });
            }
            this.layout.onDetach();
            Runnable runnable = this.onHideListener;
            if (runnable != null) {
                runnable.run();
            }
        }
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

    public boolean isShowing() {
        return this.showing;
    }

    public Layout getLayout() {
        return this.layout;
    }

    private static boolean isTransitionsEnabled() {
        return MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && Build.VERSION.SDK_INT >= 18;
    }

    public void updatePosition() {
        Layout layout = this.layout;
        if (layout != null) {
            layout.updatePosition();
        }
    }

    public static abstract class ParentLayout extends FrameLayout {
        private final GestureDetector gestureDetector;
        private boolean hideAnimationRunning;
        private final Layout layout;
        private boolean needLeftAlphaAnimation;
        private boolean needRightAlphaAnimation;
        private boolean pressed;
        private final android.graphics.Rect rect;
        private float translationX;

        protected abstract void onHide();

        protected abstract void onPressedStateChanged(boolean z);

        static float access$1524(ParentLayout parentLayout, float f) {
            float f2 = parentLayout.translationX - f;
            parentLayout.translationX = f2;
            return f2;
        }

        public ParentLayout(Layout layout) {
            super(layout.getContext());
            this.rect = new android.graphics.Rect();
            this.layout = layout;
            GestureDetector gestureDetector = new GestureDetector(layout.getContext(), new AnonymousClass1(layout));
            this.gestureDetector = gestureDetector;
            gestureDetector.setIsLongpressEnabled(false);
            addView(layout);
        }

        public class AnonymousClass1 extends GestureDetector.SimpleOnGestureListener {
            final Layout val$layout;

            AnonymousClass1(Layout layout) {
                ParentLayout.this = r1;
                this.val$layout = layout;
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
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                this.val$layout.setTranslationX(ParentLayout.access$1524(ParentLayout.this, f));
                if (ParentLayout.this.translationX == 0.0f || ((ParentLayout.this.translationX < 0.0f && ParentLayout.this.needLeftAlphaAnimation) || (ParentLayout.this.translationX > 0.0f && ParentLayout.this.needRightAlphaAnimation))) {
                    this.val$layout.setAlpha(1.0f - (Math.abs(ParentLayout.this.translationX) / this.val$layout.getWidth()));
                    return true;
                }
                return true;
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z = false;
                if (Math.abs(f) > 2000.0f) {
                    if ((f < 0.0f && ParentLayout.this.needLeftAlphaAnimation) || (f > 0.0f && ParentLayout.this.needRightAlphaAnimation)) {
                        z = true;
                    }
                    SpringAnimation springAnimation = new SpringAnimation(this.val$layout, DynamicAnimation.TRANSLATION_X, Math.signum(f) * this.val$layout.getWidth() * 2.0f);
                    if (!z) {
                        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                            @Override
                            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4) {
                                Bulletin.ParentLayout.AnonymousClass1.this.lambda$onFling$0(dynamicAnimation, z2, f3, f4);
                            }
                        });
                        final Layout layout = this.val$layout;
                        springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f3, float f4) {
                                Bulletin.ParentLayout.AnonymousClass1.lambda$onFling$1(Bulletin.Layout.this, dynamicAnimation, f3, f4);
                            }
                        });
                    }
                    springAnimation.getSpring().setDampingRatio(1.0f);
                    springAnimation.getSpring().setStiffness(100.0f);
                    springAnimation.setStartVelocity(f);
                    springAnimation.start();
                    if (z) {
                        SpringAnimation springAnimation2 = new SpringAnimation(this.val$layout, DynamicAnimation.ALPHA, 0.0f);
                        springAnimation2.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                            @Override
                            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4) {
                                Bulletin.ParentLayout.AnonymousClass1.this.lambda$onFling$2(dynamicAnimation, z2, f3, f4);
                            }
                        });
                        springAnimation2.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f3, float f4) {
                                Bulletin.ParentLayout.AnonymousClass1.lambda$onFling$3(dynamicAnimation, f3, f4);
                            }
                        });
                        springAnimation.getSpring().setDampingRatio(1.0f);
                        springAnimation.getSpring().setStiffness(10.0f);
                        springAnimation.setStartVelocity(f);
                        springAnimation2.start();
                    }
                    ParentLayout.this.hideAnimationRunning = true;
                    return true;
                }
                return false;
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
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.pressed || inLayoutHitRect(motionEvent.getX(), motionEvent.getY())) {
                this.gestureDetector.onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    if (!this.pressed && !this.hideAnimationRunning) {
                        this.layout.animate().cancel();
                        this.translationX = this.layout.getTranslationX();
                        this.pressed = true;
                        onPressedStateChanged(true);
                    }
                } else if ((actionMasked == 1 || actionMasked == 3) && this.pressed) {
                    if (!this.hideAnimationRunning) {
                        if (Math.abs(this.translationX) > this.layout.getWidth() / 3.0f) {
                            final float signum = Math.signum(this.translationX) * this.layout.getWidth();
                            float f = this.translationX;
                            this.layout.animate().translationX(signum).alpha(((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) < 0 && this.needLeftAlphaAnimation) || ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) > 0 && this.needRightAlphaAnimation) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new Runnable() {
                                @Override
                                public final void run() {
                                    Bulletin.ParentLayout.this.lambda$onTouchEvent$0(signum);
                                }
                            }).start();
                        } else {
                            this.layout.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                        }
                    }
                    this.pressed = false;
                    onPressedStateChanged(false);
                }
                return true;
            }
            return false;
        }

        public void lambda$onTouchEvent$0(float f) {
            if (this.layout.getTranslationX() == f) {
                onHide();
            }
        }

        private boolean inLayoutHitRect(float f, float f2) {
            this.layout.getHitRect(this.rect);
            return this.rect.contains((int) f, (int) f2);
        }
    }

    public static void addDelegate(BaseFragment baseFragment, Delegate delegate) {
        fragmentDelegates.put(baseFragment, delegate);
    }

    public static void addDelegate(FrameLayout frameLayout, Delegate delegate) {
        delegates.put(frameLayout, delegate);
    }

    public static Delegate findDelegate(BaseFragment baseFragment, FrameLayout frameLayout) {
        Delegate delegate = fragmentDelegates.get(baseFragment);
        if (delegate != null) {
            return delegate;
        }
        Delegate delegate2 = delegates.get(frameLayout);
        if (delegate2 != null) {
            return delegate2;
        }
        return null;
    }

    public static void removeDelegate(BaseFragment baseFragment) {
        fragmentDelegates.remove(baseFragment);
    }

    public static void removeDelegate(FrameLayout frameLayout) {
        delegates.remove(frameLayout);
    }

    public static abstract class Layout extends FrameLayout {
        public static final FloatPropertyCompat<Layout> IN_OUT_OFFSET_Y = new FloatPropertyCompat<Layout>("offsetY") {
            @Override
            public float getValue(Layout layout) {
                return layout.inOutOffset;
            }

            @Override
            public void setValue(Layout layout, float f) {
                layout.setInOutOffset(f);
            }
        };
        public static final Property<Layout, Float> IN_OUT_OFFSET_Y2 = new AnimationProperties.FloatProperty<Layout>("offsetY") {
            @Override
            public Float get(Layout layout) {
                return Float.valueOf(layout.inOutOffset);
            }

            @Override
            public void setValue(Layout layout, float f) {
                layout.setInOutOffset(f);
            }
        };
        Drawable background;
        protected Bulletin bulletin;
        private final List<Callback> callbacks;
        private LinearGradient clipGradient;
        private Matrix clipMatrix;
        private Paint clipPaint;
        Delegate delegate;
        public float inOutOffset;
        private final Theme.ResourcesProvider resourcesProvider;
        public boolean top;
        public boolean transitionRunningEnter;
        public boolean transitionRunningExit;
        private int wideScreenGravity;
        private int wideScreenWidth;

        public interface Callback {

            public final class CC {
                public static void $default$onAttach(Callback callback, Layout layout, Bulletin bulletin) {
                }

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
            }

            void onAttach(Layout layout, Bulletin bulletin);

            void onDetach(Layout layout);

            void onEnterTransitionEnd(Layout layout);

            void onEnterTransitionStart(Layout layout);

            void onExitTransitionEnd(Layout layout);

            void onExitTransitionStart(Layout layout);

            void onHide(Layout layout);

            void onShow(Layout layout);
        }

        public interface Transition {
            void animateEnter(Layout layout, Runnable runnable, Runnable runnable2, Consumer<Float> consumer, int i);

            void animateExit(Layout layout, Runnable runnable, Runnable runnable2, Consumer<Float> consumer, int i);
        }

        protected CharSequence getAccessibilityText() {
            return null;
        }

        public boolean isTransitionRunning() {
            return this.transitionRunningEnter || this.transitionRunningExit;
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
            setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            setWillNotDraw(false);
            ScaleStateListAnimator.apply(this, 0.02f, 1.5f);
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return this.background == drawable || super.verifyDrawable(drawable);
        }

        protected void setBackground(int i) {
            setBackground(i, 10);
        }

        public void setBackground(int i, int i2) {
            this.background = Theme.createRoundRectDrawable(AndroidUtilities.dp(i2), i);
        }

        @Override
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            updateSize();
        }

        public void setTop(boolean z) {
            this.top = z;
            updateSize();
        }

        private void updateSize() {
            boolean isWideScreen = isWideScreen();
            int i = isWideScreen ? this.wideScreenWidth : -1;
            if (isWideScreen) {
                r3 = (this.top ? 48 : 80) | this.wideScreenGravity;
            } else if (!this.top) {
                r3 = 80;
            }
            setLayoutParams(LayoutHelper.createFrame(i, -2, r3));
        }

        private boolean isWideScreen() {
            if (!AndroidUtilities.isTablet()) {
                android.graphics.Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    return false;
                }
            }
            return true;
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

        @SuppressLint({"RtlHardcoded"})
        public boolean isNeedSwipeAlphaAnimation(boolean z) {
            if (!isWideScreen() || this.wideScreenWidth == -1) {
                return false;
            }
            int i = this.wideScreenGravity;
            if (i == 1) {
                return true;
            }
            return z ? i == 5 : i != 5;
        }

        public Bulletin getBulletin() {
            return this.bulletin;
        }

        protected void onAttach(Bulletin bulletin) {
            this.bulletin = bulletin;
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onAttach(this, bulletin);
            }
        }

        protected void onDetach() {
            this.bulletin = null;
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onDetach(this);
            }
        }

        protected void onShow() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onShow(this);
            }
        }

        protected void onHide() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onHide(this);
            }
        }

        public void onEnterTransitionStart() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onEnterTransitionStart(this);
            }
        }

        public void onEnterTransitionEnd() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onEnterTransitionEnd(this);
            }
        }

        public void onExitTransitionStart() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onExitTransitionStart(this);
            }
        }

        public void onExitTransitionEnd() {
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).onExitTransitionEnd(this);
            }
        }

        public void addCallback(Callback callback) {
            this.callbacks.add(callback);
        }

        public void removeCallback(Callback callback) {
            this.callbacks.remove(callback);
        }

        public void updatePosition() {
            Delegate delegate = this.delegate;
            float f = 0.0f;
            if (delegate != null) {
                if (this.top) {
                    Bulletin bulletin = this.bulletin;
                    f = 0.0f - delegate.getTopOffset(bulletin != null ? bulletin.tag : 0);
                } else {
                    f = 0.0f + getBottomOffset();
                }
            }
            setTranslationY((-f) + (this.inOutOffset * (this.top ? -1 : 1)));
        }

        public float getBottomOffset() {
            int bottomOffset;
            Delegate delegate;
            if (this.bulletin != null && (((delegate = this.delegate) == null || delegate.bottomOffsetAnimated()) && this.bulletin.bottomOffsetSpring != null && this.bulletin.bottomOffsetSpring.isRunning())) {
                bottomOffset = this.bulletin.lastBottomOffset;
            } else {
                Delegate delegate2 = this.delegate;
                Bulletin bulletin = this.bulletin;
                bottomOffset = delegate2.getBottomOffset(bulletin != null ? bulletin.tag : 0);
            }
            return bottomOffset;
        }

        public Transition createTransition() {
            return new SpringTransition();
        }

        public static class DefaultTransition implements Transition {
            long duration = 255;

            @Override
            public void animateEnter(final Layout layout, final Runnable runnable, final Runnable runnable2, final Consumer<Float> consumer, int i) {
                layout.setInOutOffset(layout.getMeasuredHeight());
                if (consumer != null) {
                    consumer.accept(Float.valueOf(layout.getTranslationY()));
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(layout, Layout.IN_OUT_OFFSET_Y2, 0.0f);
                ofFloat.setDuration(this.duration);
                ofFloat.setInterpolator(Easings.easeOutQuad);
                if (runnable != null || runnable2 != null) {
                    ofFloat.addListener(new AnimatorListenerAdapter(this) {
                        @Override
                        public void onAnimationStart(Animator animator) {
                            Runnable runnable3 = runnable;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            Runnable runnable3 = runnable2;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                if (consumer != null) {
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Bulletin.Layout.DefaultTransition.lambda$animateEnter$0(Consumer.this, layout, valueAnimator);
                        }
                    });
                }
                ofFloat.start();
            }

            public static void lambda$animateEnter$0(Consumer consumer, Layout layout, ValueAnimator valueAnimator) {
                consumer.accept(Float.valueOf(layout.getTranslationY()));
            }

            @Override
            public void animateExit(final Layout layout, final Runnable runnable, final Runnable runnable2, final Consumer<Float> consumer, int i) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(layout, Layout.IN_OUT_OFFSET_Y2, layout.getHeight());
                ofFloat.setDuration(175L);
                ofFloat.setInterpolator(Easings.easeInQuad);
                if (runnable != null || runnable2 != null) {
                    ofFloat.addListener(new AnimatorListenerAdapter(this) {
                        @Override
                        public void onAnimationStart(Animator animator) {
                            Runnable runnable3 = runnable;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            Runnable runnable3 = runnable2;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                if (consumer != null) {
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Bulletin.Layout.DefaultTransition.lambda$animateExit$1(Consumer.this, layout, valueAnimator);
                        }
                    });
                }
                ofFloat.start();
            }

            public static void lambda$animateExit$1(Consumer consumer, Layout layout, ValueAnimator valueAnimator) {
                consumer.accept(Float.valueOf(layout.getTranslationY()));
            }
        }

        public static class SpringTransition implements Transition {
            @Override
            public void animateEnter(final Layout layout, Runnable runnable, final Runnable runnable2, final Consumer<Float> consumer, int i) {
                layout.setInOutOffset(layout.getMeasuredHeight());
                if (consumer != null) {
                    consumer.accept(Float.valueOf(layout.getTranslationY()));
                }
                SpringAnimation springAnimation = new SpringAnimation(layout, Layout.IN_OUT_OFFSET_Y, 0.0f);
                springAnimation.getSpring().setDampingRatio(0.8f);
                springAnimation.getSpring().setStiffness(400.0f);
                if (runnable2 != null) {
                    springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                            Bulletin.Layout.SpringTransition.lambda$animateEnter$0(Bulletin.Layout.this, runnable2, dynamicAnimation, z, f, f2);
                        }
                    });
                }
                if (consumer != null) {
                    springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                            Bulletin.Layout.SpringTransition.lambda$animateEnter$1(Consumer.this, layout, dynamicAnimation, f, f2);
                        }
                    });
                }
                springAnimation.start();
                if (runnable != null) {
                    runnable.run();
                }
            }

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

            @Override
            public void animateExit(final Layout layout, Runnable runnable, final Runnable runnable2, final Consumer<Float> consumer, int i) {
                SpringAnimation springAnimation = new SpringAnimation(layout, Layout.IN_OUT_OFFSET_Y, layout.getHeight());
                springAnimation.getSpring().setDampingRatio(0.8f);
                springAnimation.getSpring().setStiffness(400.0f);
                if (runnable2 != null) {
                    springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                            Bulletin.Layout.SpringTransition.lambda$animateExit$2(runnable2, dynamicAnimation, z, f, f2);
                        }
                    });
                }
                if (consumer != null) {
                    springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                            Bulletin.Layout.SpringTransition.lambda$animateExit$3(Consumer.this, layout, dynamicAnimation, f, f2);
                        }
                    });
                }
                springAnimation.start();
                if (runnable != null) {
                    runnable.run();
                }
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
        }

        public void setInOutOffset(float f) {
            this.inOutOffset = f;
            updatePosition();
        }

        protected int getMeasuredBackgroundHeight() {
            return getMeasuredHeight();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            Delegate delegate;
            if (this.bulletin == null) {
                return;
            }
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (isTransitionRunning() && (delegate = this.delegate) != null) {
                float topOffset = delegate.getTopOffset(this.bulletin.tag) - getY();
                float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
                boolean clipWithGradient = this.delegate.clipWithGradient(this.bulletin.tag);
                canvas.save();
                canvas.clipRect(0.0f, topOffset, getMeasuredWidth(), measuredHeight);
                if (clipWithGradient) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                }
                this.background.draw(canvas);
                super.dispatchDraw(canvas);
                if (clipWithGradient) {
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
                    canvas.save();
                    this.clipMatrix.reset();
                    this.clipMatrix.postTranslate(0.0f, this.top ? topOffset : measuredHeight - AndroidUtilities.dp(8.0f));
                    this.clipGradient.setLocalMatrix(this.clipMatrix);
                    if (this.top) {
                        canvas.drawRect(0.0f, topOffset, getWidth(), topOffset + AndroidUtilities.dp(8.0f), this.clipPaint);
                    } else {
                        canvas.drawRect(0.0f, measuredHeight - AndroidUtilities.dp(8.0f), getWidth(), measuredHeight, this.clipPaint);
                    }
                    canvas.restore();
                    canvas.restore();
                }
                canvas.restore();
                invalidate();
                return;
            }
            this.background.draw(canvas);
            super.dispatchDraw(canvas);
        }

        public int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }
    }

    @SuppressLint({"ViewConstructor"})
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

        public void setWrapWidth() {
            this.wrapWidth = true;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            this.childrenMeasuredWidth = 0;
            if (this.wrapWidth) {
                i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.button == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
                return;
            }
            setMeasuredDimension(this.childrenMeasuredWidth + this.button.getMeasuredWidth(), getMeasuredHeight());
        }

        @Override
        protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
            Button button = this.button;
            if (button != null && view != button) {
                i2 += button.getMeasuredWidth() - AndroidUtilities.dp(12.0f);
            }
            super.measureChildWithMargins(view, i, i2, i3, i4);
            if (view != this.button) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                this.childrenMeasuredWidth = Math.max(this.childrenMeasuredWidth, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + view.getMeasuredWidth());
            }
        }

        public Button getButton() {
            return this.button;
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
            addView(this.timerView, LayoutHelper.createFrameRelatively(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
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

    @SuppressLint({"ViewConstructor"})
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

    @SuppressLint({"ViewConstructor"})
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
            linksTextView.setSingleLine();
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
        protected void onShow() {
            super.onShow();
            this.imageView.playAnimation();
        }

        public void setAnimation(int i, String... strArr) {
            setAnimation(i, 32, 32, strArr);
        }

        public void setAnimation(int i, int i2, int i3, String... strArr) {
            this.imageView.setAnimation(i, i2, i3);
            for (String str : strArr) {
                this.imageView.setLayerColor(str + ".**", this.textColor);
            }
        }

        @Override
        public CharSequence getAccessibilityText() {
            return ((Object) this.titleTextView.getText()) + ".\n" + ((Object) this.subtitleTextView.getText());
        }
    }

    public static class LottieLayoutWithReactions extends LottieLayout implements NotificationCenter.NotificationCenterDelegate {
        private Bulletin bulletin;
        private final BaseFragment fragment;
        private final int messagesCount;
        private SparseLongArray newMessagesByIds;
        private ReactionsContainerLayout reactionsContainerLayout;

        public LottieLayoutWithReactions(BaseFragment baseFragment, int i) {
            super(baseFragment.getContext(), baseFragment.getResourceProvider());
            this.fragment = baseFragment;
            this.messagesCount = i;
            init();
        }

        public void setBulletin(Bulletin bulletin) {
            this.bulletin = bulletin;
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

        public class AnonymousClass1 extends ReactionsContainerLayout {
            AnonymousClass1(int i, BaseFragment baseFragment, Context context, int i2, Theme.ResourcesProvider resourcesProvider) {
                super(i, baseFragment, context, i2, resourcesProvider);
                LottieLayoutWithReactions.this = r7;
            }

            @Override
            protected void onShownCustomEmojiReactionDialog() {
                Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
                if (visibleBulletin != null) {
                    visibleBulletin.setCanHide(false);
                }
                LottieLayoutWithReactions.this.reactionsContainerLayout.getReactionsWindow().windowView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        Bulletin.LottieLayoutWithReactions.AnonymousClass1.this.lambda$onShownCustomEmojiReactionDialog$0(view);
                    }
                });
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
        }

        public class AnonymousClass2 implements ReactionsContainerLayout.ReactionsContainerDelegate {
            @Override
            public boolean drawBackground() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
            }

            @Override
            public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
                ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawRoundRect(this, canvas, rectF, f, f2, f3, i, z);
            }

            @Override
            public boolean needEnterText() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
            }

            @Override
            public void onEmojiWindowDismissed() {
                ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
            }

            AnonymousClass2() {
                LottieLayoutWithReactions.this = r1;
            }

            @Override
            public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
                if (LottieLayoutWithReactions.this.newMessagesByIds == null) {
                    return;
                }
                boolean z3 = (LottieLayoutWithReactions.this.fragment instanceof ChatActivity) && ((ChatActivity) LottieLayoutWithReactions.this.fragment).getDialogId() == UserConfig.getInstance(LottieLayoutWithReactions.this.fragment.getCurrentAccount()).getClientUserId();
                int i = 0;
                for (int i2 = 0; i2 < LottieLayoutWithReactions.this.newMessagesByIds.size(); i2++) {
                    int keyAt = LottieLayoutWithReactions.this.newMessagesByIds.keyAt(i2);
                    TLRPC$Message tLRPC$Message = new TLRPC$Message();
                    tLRPC$Message.dialog_id = LottieLayoutWithReactions.this.fragment.getUserConfig().getClientUserId();
                    tLRPC$Message.id = keyAt;
                    MessageObject messageObject = new MessageObject(LottieLayoutWithReactions.this.fragment.getCurrentAccount(), tLRPC$Message, false, false);
                    ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList = new ArrayList<>();
                    arrayList.add(visibleReaction);
                    LottieLayoutWithReactions.this.fragment.getSendMessagesHelper().sendReaction(messageObject, arrayList, visibleReaction, false, false, LottieLayoutWithReactions.this.fragment, null);
                    i = tLRPC$Message.id;
                }
                LottieLayoutWithReactions.this.hideReactionsDialog();
                Bulletin.hideVisible();
                showTaggedReactionToast(visibleReaction, LottieLayoutWithReactions.this.fragment.getCurrentAccount(), i, !z3);
            }

            private void showTaggedReactionToast(final ReactionsLayoutInBubble.VisibleReaction visibleReaction, final int i, final int i2, final boolean z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bulletin.LottieLayoutWithReactions.AnonymousClass2.this.lambda$showTaggedReactionToast$1(visibleReaction, z, i, i2);
                    }
                }, 300L);
            }

            public void lambda$showTaggedReactionToast$1(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, final int i, final int i2) {
                TLRPC$Document findDocument;
                final BaseFragment lastFragment = LaunchActivity.getLastFragment();
                long j = visibleReaction.documentId;
                if (j == 0) {
                    TLRPC$TL_availableReaction tLRPC$TL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(visibleReaction.emojicon);
                    if (tLRPC$TL_availableReaction == null) {
                        return;
                    }
                    findDocument = tLRPC$TL_availableReaction.activate_animation;
                } else {
                    findDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j);
                }
                if (findDocument == null || lastFragment == null) {
                    return;
                }
                BulletinFactory.of(lastFragment).createMessagesTaggedBulletin(LottieLayoutWithReactions.this.messagesCount, findDocument, z ? new Runnable() {
                    @Override
                    public final void run() {
                        Bulletin.LottieLayoutWithReactions.AnonymousClass2.lambda$showTaggedReactionToast$0(i, i2, lastFragment);
                    }
                } : null).show(true);
            }

            public static void lambda$showTaggedReactionToast$0(int i, int i2, BaseFragment baseFragment) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                bundle.putInt("message_id", i2);
                baseFragment.presentFragment(new ChatActivity(bundle));
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.savedMessagesForwarded);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.savedMessagesForwarded);
        }

        public void hideReactionsDialog() {
            if (this.reactionsContainerLayout.getReactionsWindow() != null) {
                this.reactionsContainerLayout.dismissWindow();
                if (this.reactionsContainerLayout.getReactionsWindow().containerView != null) {
                    this.reactionsContainerLayout.getReactionsWindow().containerView.animate().alpha(0.0f).setDuration(180L).start();
                }
            }
        }

        @Override
        protected int getMeasuredBackgroundHeight() {
            return this.textView.getMeasuredHeight() + AndroidUtilities.dp(30.0f);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.savedMessagesForwarded) {
                this.newMessagesByIds = (SparseLongArray) objArr[0];
            }
        }
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
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(this, context) {
                {
                    setDisablePaddingsOffset(true);
                }

                @Override
                public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                    super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), AndroidUtilities.dp(13.0f), false), bufferType);
                }
            };
            this.textView = linksTextView;
            NotificationCenter.listenEmojiLoading(linksTextView);
            this.textView.setSingleLine();
            this.textView.setTypeface(Typeface.SANS_SERIF);
            this.textView.setTextSize(1, 15.0f);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            addView(this.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
            this.textView.setLinkTextColor(getThemedColor(Theme.key_undo_cancelColor));
            setTextColor(getThemedColor(Theme.key_undo_infoColor));
            setBackground(getThemedColor(Theme.key_undo_background));
        }

        public LottieLayout(Context context, Theme.ResourcesProvider resourcesProvider, int i, int i2) {
            this(context, resourcesProvider);
            setBackground(i);
            setTextColor(i2);
        }

        public void setTextColor(int i) {
            this.textColor = i;
            this.textView.setTextColor(i);
        }

        @Override
        protected void onShow() {
            super.onShow();
            this.imageView.playAnimation();
        }

        public void setAnimation(int i, String... strArr) {
            setAnimation(i, 32, 32, strArr);
        }

        public void setAnimation(int i, int i2, int i3, String... strArr) {
            this.imageView.setAnimation(i, i2, i3);
            for (String str : strArr) {
                this.imageView.setLayerColor(str + ".**", this.textColor);
            }
        }

        public void setAnimation(TLRPC$Document tLRPC$Document, int i, int i2, String... strArr) {
            this.imageView.setAutoRepeat(true);
            this.imageView.setAnimation(tLRPC$Document, i, i2);
            for (String str : strArr) {
                this.imageView.setLayerColor(str + ".**", this.textColor);
            }
        }

        public void setIconPaddingBottom(int i) {
            this.imageView.setLayoutParams(LayoutHelper.createFrameRelatively(56.0f, 48 - i, 8388627, 0.0f, 0.0f, 0.0f, i));
        }

        @Override
        public CharSequence getAccessibilityText() {
            return this.textView.getText();
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
        public void setTextColor(int i) {
            super.setTextColor(i);
            LinkSpanDrawable.LinksTextView linksTextView = this.textLoadingView;
            if (linksTextView != null) {
                linksTextView.setTextColor(i);
            }
        }

        @Override
        public void onTextLoaded(CharSequence charSequence) {
            this.textView.setText(charSequence);
            AndroidUtilities.updateViewShow(this.textLoadingView, false, false, true);
            AndroidUtilities.updateViewShow(this.textView, true, false, true);
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
            if (!z) {
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(this, context) {
                    @Override
                    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), AndroidUtilities.dp(13.0f), false), bufferType);
                    }
                };
                this.textView = linksTextView;
                NotificationCenter.listenEmojiLoading(linksTextView);
                this.textView.setTypeface(Typeface.SANS_SERIF);
                this.textView.setTextSize(1, 15.0f);
                this.textView.setEllipsize(TextUtils.TruncateAt.END);
                this.textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
                addView(this.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
            } else {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.linearLayout = linearLayout;
                linearLayout.setOrientation(1);
                addView(this.linearLayout, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 76.0f, 0.0f, 12.0f, 0.0f));
                LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(this, context) {
                    @Override
                    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), AndroidUtilities.dp(13.0f), false), bufferType);
                    }
                };
                this.textView = linksTextView2;
                NotificationCenter.listenEmojiLoading(linksTextView2);
                this.textView.setTypeface(Typeface.SANS_SERIF);
                this.textView.setTextSize(1, 14.0f);
                this.textView.setEllipsize(TextUtils.TruncateAt.END);
                this.textView.setMaxLines(1);
                this.linearLayout.addView(this.textView);
                LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context);
                this.subtitleView = linksTextView3;
                linksTextView3.setTypeface(Typeface.SANS_SERIF);
                this.subtitleView.setTextSize(1, 13.0f);
                this.subtitleView.setEllipsize(TextUtils.TruncateAt.END);
                this.subtitleView.setMaxLines(1);
                this.subtitleView.setLinkTextColor(getThemedColor(Theme.key_undo_cancelColor));
                this.linearLayout.addView(this.subtitleView, LayoutHelper.createLinear(-2, -2, 0, 0, 0, 0, 0));
            }
            this.textView.setLinkTextColor(getThemedColor(Theme.key_undo_cancelColor));
            setTextColor(getThemedColor(Theme.key_undo_infoColor));
            setBackground(getThemedColor(Theme.key_undo_background));
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
            TextView textView = this.subtitleView;
            if (textView != null) {
                textView.setTextColor(i);
            }
        }

        @Override
        protected void onShow() {
            super.onShow();
        }

        @Override
        public CharSequence getAccessibilityText() {
            return this.textView.getText();
        }
    }

    @SuppressLint({"ViewConstructor"})
    public static abstract class Button extends FrameLayout implements Layout.Callback {
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

        public Button(Context context) {
            super(context);
        }
    }

    @SuppressLint({"ViewConstructor"})
    public static final class UndoButton extends Button {
        private Bulletin bulletin;
        private Runnable delayedAction;
        private boolean isUndone;
        private final Theme.ResourcesProvider resourcesProvider;
        private Runnable undoAction;
        private TextView undoTextView;

        public UndoButton(Context context, boolean z) {
            this(context, z, null);
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
                textView.setBackground(Theme.createSelectorDrawable((themedColor & 16777215) | 419430400, 7));
                this.undoTextView.setTextSize(1, 14.0f);
                this.undoTextView.setTypeface(AndroidUtilities.bold());
                this.undoTextView.setTextColor(themedColor);
                this.undoTextView.setText(LocaleController.getString("Undo", R.string.Undo));
                this.undoTextView.setGravity(16);
                ViewHelper.setPaddingRelative(this.undoTextView, z2 ? 34.0f : 12.0f, 8.0f, 12.0f, 8.0f);
                addView(this.undoTextView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
            }
            if (z2) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(R.drawable.chats_undo);
                imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                if (!z) {
                    imageView.setBackground(Theme.createSelectorDrawable((themedColor & 16777215) | 419430400));
                }
                ViewHelper.setPaddingRelative(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
                addView(imageView, LayoutHelper.createFrameRelatively(56.0f, 48.0f, 16));
            }
            setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    Bulletin.UndoButton.this.lambda$new$0(view);
                }
            });
        }

        public void lambda$new$0(View view) {
            undo();
        }

        public UndoButton setText(CharSequence charSequence) {
            TextView textView = this.undoTextView;
            if (textView != null) {
                textView.setText(charSequence);
            }
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

        public UndoButton setUndoAction(Runnable runnable) {
            this.undoAction = runnable;
            return this;
        }

        public UndoButton setDelayedAction(Runnable runnable) {
            this.delayedAction = runnable;
            return this;
        }

        protected int getThemedColor(int i) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (resourcesProvider != null) {
                return resourcesProvider.getColor(i);
            }
            return Theme.getColor(i);
        }
    }

    public void onLoaded(CharSequence charSequence) {
        this.loaded = true;
        Layout layout = this.layout;
        if (layout instanceof LoadingLayout) {
            ((LoadingLayout) layout).onTextLoaded(charSequence);
        }
        setCanHide(true);
    }

    public static class EmptyBulletin extends Bulletin {
        @Override
        public Bulletin show() {
            return this;
        }

        public EmptyBulletin() {
            super();
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
        private long timeLeft;
        private String timeLeftString;
        float timeReplaceProgress;

        public TimerView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.timeReplaceProgress = 1.0f;
            this.rect = new RectF();
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = this.textPaint;
            int i = Theme.key_undo_infoColor;
            textPaint2.setColor(Theme.getColor(i, resourcesProvider));
            Paint paint = new Paint(1);
            this.progressPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(Theme.getColor(i, resourcesProvider));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            long j;
            String valueOf;
            super.onDraw(canvas);
            int ceil = this.timeLeft > 0 ? (int) Math.ceil(((float) j) / 1000.0f) : 0;
            this.rect.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
            if (this.prevSeconds != ceil) {
                this.prevSeconds = ceil;
                this.timeLeftString = String.valueOf(Math.max(0, ceil));
                StaticLayout staticLayout = this.timeLayout;
                if (staticLayout != null) {
                    this.timeLayoutOut = staticLayout;
                    this.timeReplaceProgress = 0.0f;
                    this.textWidthOut = this.textWidth;
                }
                this.textWidth = (int) Math.ceil(this.textPaint.measureText(valueOf));
                this.timeLayout = new StaticLayout(this.timeLeftString, this.textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                    this.textPaint.setAlpha((int) (alpha * (1.0f - f3)));
                    canvas.save();
                    canvas.translate(this.rect.centerX() - (this.textWidthOut / 2.0f), (this.rect.centerY() - (this.timeLayoutOut.getHeight() / 2.0f)) + (AndroidUtilities.dp(10.0f) * this.timeReplaceProgress));
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
                canvas.translate(this.rect.centerX() - (this.textWidth / 2.0f), (this.rect.centerY() - (this.timeLayout.getHeight() / 2.0f)) - (AndroidUtilities.dp(10.0f) * (1.0f - this.timeReplaceProgress)));
                this.timeLayout.draw(canvas);
                if (this.timeReplaceProgress != 1.0f) {
                    this.textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(this.rect, -90.0f, (((float) Math.max(0L, this.timeLeft)) / 5000.0f) * (-360.0f), false, this.progressPaint);
            if (this.lastUpdateTime != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.timeLeft -= currentTimeMillis - this.lastUpdateTime;
                this.lastUpdateTime = currentTimeMillis;
            } else {
                this.lastUpdateTime = System.currentTimeMillis();
            }
            invalidate();
        }
    }

    public static class BulletinWindow extends Dialog {
        private final BulletinWindowLayout container;
        private WindowManager.LayoutParams params;

        public static BulletinWindowLayout make(Context context, Delegate delegate) {
            return new BulletinWindow(context, delegate).container;
        }

        public static BulletinWindowLayout make(Context context) {
            return new BulletinWindow(context, null).container;
        }

        private BulletinWindow(Context context, final Delegate delegate) {
            super(context);
            BulletinWindowLayout bulletinWindowLayout = new BulletinWindowLayout(context);
            this.container = bulletinWindowLayout;
            setContentView(bulletinWindowLayout, new ViewGroup.LayoutParams(-1, -1));
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i >= 21) {
                bulletinWindowLayout.setFitsSystemWindows(true);
                bulletinWindowLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    @Override
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        WindowInsets lambda$new$0;
                        lambda$new$0 = Bulletin.BulletinWindow.this.lambda$new$0(view, windowInsets);
                        return lambda$new$0;
                    }
                });
                if (i >= 30) {
                    bulletinWindowLayout.setSystemUiVisibility(1792);
                } else {
                    bulletinWindowLayout.setSystemUiVisibility(1280);
                }
            }
            Bulletin.addDelegate(bulletinWindowLayout, new Delegate(this) {
                @Override
                public boolean allowLayoutChanges() {
                    return Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public boolean bottomOffsetAnimated() {
                    return Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public void onBottomOffsetChange(float f) {
                    Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public void onHide(Bulletin bulletin) {
                    Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public void onShow(Bulletin bulletin) {
                    Delegate.CC.$default$onShow(this, bulletin);
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
                public int getTopOffset(int i2) {
                    Delegate delegate2 = delegate;
                    return delegate2 == null ? AndroidUtilities.statusBarHeight : delegate2.getTopOffset(i2);
                }

                @Override
                public boolean clipWithGradient(int i2) {
                    Delegate delegate2 = delegate;
                    return delegate2 != null && delegate2.clipWithGradient(i2);
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
                int i2 = attributes.flags & (-3);
                attributes.flags = i2;
                int i3 = i2 | 8;
                attributes.flags = i3;
                if (i >= 19) {
                    attributes.flags = i3 | 201326592;
                }
                int i4 = attributes.flags | 16;
                attributes.flags = i4;
                if (i >= 21) {
                    attributes.flags = i4 | (-2147417856);
                }
                attributes.flags &= -1025;
                if (i >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
                if (AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundGray)) <= 0.721f) {
                    z = false;
                }
                AndroidUtilities.setLightNavigationBar(window, z);
            } catch (Exception unused) {
            }
        }

        public WindowInsets lambda$new$0(View view, WindowInsets windowInsets) {
            applyInsets(windowInsets);
            view.requestLayout();
            if (Build.VERSION.SDK_INT >= 30) {
                return WindowInsets.CONSUMED;
            }
            return windowInsets.consumeSystemWindowInsets();
        }

        @Override
        public void show() {
            if (AndroidUtilities.isSafeToShow(getContext())) {
                super.show();
            }
        }

        private void applyInsets(WindowInsets windowInsets) {
            BulletinWindowLayout bulletinWindowLayout = this.container;
            if (bulletinWindowLayout != null) {
                bulletinWindowLayout.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
        }

        public class BulletinWindowLayout extends FrameLayout {
            public BulletinWindowLayout(Context context) {
                super(context);
                BulletinWindow.this = r1;
            }

            @Override
            public void addView(View view) {
                super.addView(view);
                BulletinWindow.this.show();
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
                if (!z) {
                    BulletinWindow.this.params.flags |= 16;
                } else {
                    BulletinWindow.this.params.flags &= -17;
                }
                BulletinWindow.this.getWindow().setAttributes(BulletinWindow.this.params);
            }

            public WindowManager.LayoutParams getLayout() {
                return BulletinWindow.this.params;
            }

            public void updateLayout() {
                BulletinWindow.this.getWindow().setAttributes(BulletinWindow.this.params);
            }
        }
    }
}
