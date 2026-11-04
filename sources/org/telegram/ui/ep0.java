package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
public final class ep0 extends AnimatorListenerAdapter {
    public final int f45019a;
    public final boolean f45020b;
    public final PhotoViewer f45021c;

    public ep0(PhotoViewer photoViewer, boolean z10, int i3) {
        this.f45019a = i3;
        this.f45021c = photoViewer;
        this.f45020b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45019a) {
            case 1:
                PhotoViewer photoViewer = this.f45021c;
                if (animator.equals(photoViewer.f41577x)) {
                    photoViewer.f41577x = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f45021c;
                if (animator.equals(photoViewer2.M)) {
                    photoViewer2.M = null;
                    return;
                }
                return;
            case 3:
                this.f45021c.V7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        int i10 = this.f45019a;
        boolean z10 = this.f45020b;
        PhotoViewer photoViewer = this.f45021c;
        switch (i10) {
            case 0:
                if (!z10) {
                    photoViewer.f41456j3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f41577x)) {
                    if (!z10) {
                        photoViewer.Y0.setVisibility(4);
                    }
                    photoViewer.f41577x = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.M)) {
                    if (!z10) {
                        photoViewer.G.setVisibility(4);
                        if (photoViewer.f41453j0.getTag() != null) {
                            photoViewer.f41453j0.setVisibility(4);
                        }
                        if (photoViewer.R1.getTag() != null) {
                            photoViewer.R1.setVisibility(4);
                        }
                    }
                    photoViewer.M = null;
                    return;
                }
                return;
            default:
                if (animator.equals(photoViewer.V7)) {
                    photoViewer.V7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.P7.setVisibility(0);
                        photoViewer.Q7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.V7;
                        nq0 nq0Var = photoViewer.P7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(nq0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.Q7, property, 0.0f));
                    } else {
                        if (photoViewer.T4) {
                            photoViewer.f41462k0.setVisibility(8);
                            photoViewer.f41462k0.setAlpha(0.0f);
                            View view = photoViewer.f41462k0;
                            if (photoViewer.f41402d2 == 11) {
                                i3 = -16777216;
                            } else {
                                i3 = 2130706432;
                            }
                            view.setBackgroundColor(i3);
                        }
                        photoViewer.P7.setVisibility(4);
                        photoViewer.Q7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.V7;
                        ci.t4 t4Var = photoViewer.Q0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(t4Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.Q0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.T0, property2, 0.0f));
                    }
                    photoViewer.V7.addListener(new y20(this, 17));
                    photoViewer.V7.setDuration(200L);
                    photoViewer.V7.setInterpolator(org.telegram.messenger.g0.F);
                    photoViewer.V7.start();
                    return;
                }
                return;
        }
    }
}
