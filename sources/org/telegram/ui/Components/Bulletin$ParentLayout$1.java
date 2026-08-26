package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12;

public final class Bulletin$ParentLayout$1 extends GestureDetector.SimpleOnGestureListener {
    public final Bulletin.AnonymousClass1 this$0;
    public final Bulletin.Layout val$layout;

    public Bulletin$ParentLayout$1(Bulletin.AnonymousClass1 anonymousClass1, Bulletin.Layout layout) {
        this.this$0 = anonymousClass1;
        this.val$layout = layout;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        Bulletin.AnonymousClass1 anonymousClass1 = this.this$0;
        if (anonymousClass1.hideAnimationRunning) {
            return false;
        }
        Bulletin.Layout layout = this.val$layout;
        anonymousClass1.needLeftAlphaAnimation = Bulletin.Layout.access$1400(layout, true);
        anonymousClass1.needRightAlphaAnimation = Bulletin.Layout.access$1400(layout, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (Math.abs(f) <= 2000.0f) {
            return false;
        }
        Bulletin.AnonymousClass1 anonymousClass1 = this.this$0;
        if ((f < 0.0f && anonymousClass1.needLeftAlphaAnimation) || (f > 0.0f && anonymousClass1.needRightAlphaAnimation)) {
            z = true;
        }
        DynamicAnimation.AnonymousClass1 anonymousClass2 = DynamicAnimation.TRANSLATION_X;
        float fSignum = Math.signum(f);
        Bulletin.Layout layout = this.val$layout;
        SpringAnimation springAnimation = new SpringAnimation(layout, anonymousClass2, fSignum * layout.getWidth() * 2.0f);
        if (!z) {
            final int i = 0;
            springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener(this) {
                public final Bulletin$ParentLayout$1 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4) {
                    switch (i) {
                        case 0:
                            Bulletin.this.hide();
                            break;
                        default:
                            Bulletin.this.hide();
                            break;
                    }
                }
            });
            springAnimation.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(layout, 4));
        }
        springAnimation.mSpring.setDampingRatio(1.0f);
        springAnimation.mSpring.setStiffness(100.0f);
        springAnimation.mVelocity = f;
        springAnimation.start();
        if (z) {
            SpringAnimation springAnimation2 = new SpringAnimation(layout, DynamicAnimation.ALPHA, 0.0f);
            final int i2 = 1;
            springAnimation2.addEndListener(new DynamicAnimation.OnAnimationEndListener(this) {
                public final Bulletin$ParentLayout$1 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4) {
                    switch (i2) {
                        case 0:
                            Bulletin.this.hide();
                            break;
                        default:
                            Bulletin.this.hide();
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
        anonymousClass1.hideAnimationRunning = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Bulletin.AnonymousClass1 anonymousClass1 = this.this$0;
        float f3 = anonymousClass1.tx + f;
        anonymousClass1.tx = f3;
        float f4 = anonymousClass1.ty + f2;
        anonymousClass1.ty = f4;
        if (Utilities.dist(0.0f, 0.0f, f3, f4) > AndroidUtilities.touchSlop) {
            anonymousClass1.scrolling = true;
        }
        if (!anonymousClass1.wasCanHide) {
            return false;
        }
        float f5 = anonymousClass1.translationX - f;
        anonymousClass1.translationX = f5;
        Bulletin.Layout layout = this.val$layout;
        layout.setTranslationX(f5);
        float f6 = anonymousClass1.translationX;
        if (f6 == 0.0f || ((f6 < 0.0f && anonymousClass1.needLeftAlphaAnimation) || (f6 > 0.0f && anonymousClass1.needRightAlphaAnimation))) {
            layout.setAlpha(1.0f - (Math.abs(f6) / layout.getWidth()));
        }
        return true;
    }
}
