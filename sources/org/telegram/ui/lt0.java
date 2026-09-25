package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lt0 extends AnimatorListenerAdapter {
    public final int f35411a;
    public final boolean f35412b;
    public final PhotoViewer f35413c;

    public lt0(PhotoViewer photoViewer, boolean z10, int i10) {
        this.f35411a = i10;
        this.f35413c = photoViewer;
        this.f35412b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35411a) {
            case 1:
                PhotoViewer photoViewer = this.f35413c;
                if (animator.equals(photoViewer.f31382w)) {
                    photoViewer.f31382w = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f35413c;
                if (animator.equals(photoViewer2.L)) {
                    photoViewer2.L = null;
                    return;
                }
                return;
            case 3:
                this.f35413c.U7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11 = this.f35411a;
        boolean z10 = this.f35412b;
        PhotoViewer photoViewer = this.f35413c;
        switch (i11) {
            case 0:
                if (!z10) {
                    photoViewer.f31262i3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f31382w)) {
                    if (!z10) {
                        photoViewer.X0.setVisibility(4);
                    }
                    photoViewer.f31382w = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.L)) {
                    if (!z10) {
                        photoViewer.F.setVisibility(4);
                        if (photoViewer.f31259i0.getTag() != null) {
                            photoViewer.f31259i0.setVisibility(4);
                        }
                        if (photoViewer.Q1.getTag() != null) {
                            photoViewer.Q1.setVisibility(4);
                        }
                    }
                    photoViewer.L = null;
                    return;
                }
                return;
            default:
                if (animator.equals(photoViewer.U7)) {
                    photoViewer.U7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.O7.setVisibility(0);
                        photoViewer.P7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.U7;
                        xu0 xu0Var = photoViewer.O7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(xu0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.P7, property, 0.0f));
                    } else {
                        if (photoViewer.S4) {
                            photoViewer.f31268j0.setVisibility(8);
                            photoViewer.f31268j0.setAlpha(0.0f);
                            View view = photoViewer.f31268j0;
                            if (photoViewer.f31208c2 == 11) {
                                i10 = -16777216;
                            } else {
                                i10 = 2130706432;
                            }
                            view.setBackgroundColor(i10);
                        }
                        photoViewer.O7.setVisibility(4);
                        photoViewer.P7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.U7;
                        t5 t5Var = photoViewer.P0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(t5Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.P0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.S0, property2, 0.0f));
                    }
                    photoViewer.U7.addListener(new xo0(this, 9));
                    photoViewer.U7.setDuration(200L);
                    photoViewer.U7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.U7.start();
                    return;
                }
                return;
        }
    }
}
