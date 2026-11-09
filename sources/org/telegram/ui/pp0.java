package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
public final class pp0 extends AnimatorListenerAdapter {
    public final int f48775a;
    public final boolean f48776b;
    public final PhotoViewer f48777c;

    public pp0(PhotoViewer photoViewer, boolean z9, int i7) {
        this.f48775a = i7;
        this.f48777c = photoViewer;
        this.f48776b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f48775a) {
            case 1:
                PhotoViewer photoViewer = this.f48777c;
                if (animator.equals(photoViewer.f41558x)) {
                    photoViewer.f41558x = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f48777c;
                if (animator.equals(photoViewer2.L)) {
                    photoViewer2.L = null;
                    return;
                }
                return;
            case 3:
                this.f48777c.T7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10 = this.f48775a;
        boolean z9 = this.f48776b;
        PhotoViewer photoViewer = this.f48777c;
        switch (i10) {
            case 0:
                if (!z9) {
                    photoViewer.f41422h3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f41558x)) {
                    if (!z9) {
                        photoViewer.X0.setVisibility(4);
                    }
                    photoViewer.f41558x = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.L)) {
                    if (!z9) {
                        photoViewer.F.setVisibility(4);
                        if (photoViewer.f41427i0.getTag() != null) {
                            photoViewer.f41427i0.setVisibility(4);
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
                if (animator.equals(photoViewer.T7)) {
                    photoViewer.T7 = new AnimatorSet();
                    if (z9) {
                        photoViewer.N7.setVisibility(0);
                        photoViewer.O7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.T7;
                        zq0 zq0Var = photoViewer.N7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(zq0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.O7, property, 0.0f));
                    } else {
                        if (photoViewer.R4) {
                            photoViewer.f41435j0.setVisibility(8);
                            photoViewer.f41435j0.setAlpha(0.0f);
                            View view = photoViewer.f41435j0;
                            if (photoViewer.f41375c2 == 11) {
                                i7 = -16777216;
                            } else {
                                i7 = 2130706432;
                            }
                            view.setBackgroundColor(i7);
                        }
                        photoViewer.N7.setVisibility(4);
                        photoViewer.O7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.T7;
                        bi.m5 m5Var = photoViewer.P0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(m5Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.P0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.S0, property2, 0.0f));
                    }
                    photoViewer.T7.addListener(new f30(this, 17));
                    photoViewer.T7.setDuration(200L);
                    photoViewer.T7.setInterpolator(org.telegram.messenger.g0.F);
                    photoViewer.T7.start();
                    return;
                }
                return;
        }
    }
}
