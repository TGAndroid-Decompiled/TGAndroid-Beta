package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
public final class op0 extends AnimatorListenerAdapter {
    public final int f50638a;
    public final boolean f50639b;
    public final PhotoViewer f50640c;

    public op0(PhotoViewer photoViewer, boolean z10, int i7) {
        this.f50638a = i7;
        this.f50640c = photoViewer;
        this.f50639b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50638a) {
            case 1:
                PhotoViewer photoViewer = this.f50640c;
                if (animator.equals(photoViewer.f43406x)) {
                    photoViewer.f43406x = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f50640c;
                if (animator.equals(photoViewer2.M)) {
                    photoViewer2.M = null;
                    return;
                }
                return;
            case 3:
                this.f50640c.U7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10 = this.f50638a;
        boolean z10 = this.f50639b;
        PhotoViewer photoViewer = this.f50640c;
        switch (i10) {
            case 0:
                if (!z10) {
                    photoViewer.f43278i3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f43406x)) {
                    if (!z10) {
                        photoViewer.Y0.setVisibility(4);
                    }
                    photoViewer.f43406x = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.M)) {
                    if (!z10) {
                        photoViewer.G.setVisibility(4);
                        if (photoViewer.f43283j0.getTag() != null) {
                            photoViewer.f43283j0.setVisibility(4);
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
                if (animator.equals(photoViewer.U7)) {
                    photoViewer.U7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.O7.setVisibility(0);
                        photoViewer.P7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.U7;
                        xq0 xq0Var = photoViewer.O7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(xq0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.P7, property, 0.0f));
                    } else {
                        if (photoViewer.S4) {
                            photoViewer.f43291k0.setVisibility(8);
                            photoViewer.f43291k0.setAlpha(0.0f);
                            View view = photoViewer.f43291k0;
                            if (photoViewer.d2 == 11) {
                                i7 = -16777216;
                            } else {
                                i7 = 2130706432;
                            }
                            view.setBackgroundColor(i7);
                        }
                        photoViewer.O7.setVisibility(4);
                        photoViewer.P7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.U7;
                        di.n4 n4Var = photoViewer.Q0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(n4Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.Q0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.T0, property2, 0.0f));
                    }
                    photoViewer.U7.addListener(new ay(this, 18));
                    photoViewer.U7.setDuration(200L);
                    photoViewer.U7.setInterpolator(org.telegram.messenger.g0.F);
                    photoViewer.U7.start();
                    return;
                }
                return;
        }
    }
}
