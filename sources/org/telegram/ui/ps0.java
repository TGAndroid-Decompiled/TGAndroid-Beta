package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ps0 extends AnimatorListenerAdapter {
    public final int f41456a;
    public final boolean f41457b;
    public final PhotoViewer f41458c;

    public ps0(PhotoViewer photoViewer, boolean z10, int i10) {
        this.f41456a = i10;
        this.f41458c = photoViewer;
        this.f41457b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41456a) {
            case 1:
                PhotoViewer photoViewer = this.f41458c;
                if (animator.equals(photoViewer.f35845w)) {
                    photoViewer.f35845w = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f41458c;
                if (animator.equals(photoViewer2.H)) {
                    photoViewer2.H = null;
                    return;
                }
                return;
            case 3:
                this.f41458c.P7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11 = this.f41456a;
        boolean z10 = this.f41457b;
        PhotoViewer photoViewer = this.f41458c;
        switch (i11) {
            case 0:
                if (!z10) {
                    photoViewer.f35686e3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f35845w)) {
                    if (!z10) {
                        photoViewer.T0.setVisibility(4);
                    }
                    photoViewer.f35845w = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.H)) {
                    if (!z10) {
                        photoViewer.B.setVisibility(4);
                        if (photoViewer.f35683e0.getTag() != null) {
                            photoViewer.f35683e0.setVisibility(4);
                        }
                        if (photoViewer.M1.getTag() != null) {
                            photoViewer.M1.setVisibility(4);
                        }
                    }
                    photoViewer.H = null;
                    return;
                }
                return;
            default:
                if (animator.equals(photoViewer.P7)) {
                    photoViewer.P7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.J7.setVisibility(0);
                        photoViewer.K7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.P7;
                        bu0 bu0Var = photoViewer.J7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(bu0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.K7, property, 0.0f));
                    } else {
                        if (photoViewer.O4) {
                            photoViewer.f35693f0.setVisibility(8);
                            photoViewer.f35693f0.setAlpha(0.0f);
                            View view = photoViewer.f35693f0;
                            if (photoViewer.Y1 == 11) {
                                i10 = -16777216;
                            } else {
                                i10 = 2130706432;
                            }
                            view.setBackgroundColor(i10);
                        }
                        photoViewer.J7.setVisibility(4);
                        photoViewer.K7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.P7;
                        bg.u1 u1Var = photoViewer.L0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(u1Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.L0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.O0, property2, 0.0f));
                    }
                    photoViewer.P7.addListener(new e50(this, 16));
                    photoViewer.P7.setDuration(200L);
                    photoViewer.P7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.P7.start();
                    return;
                }
                return;
        }
    }
}
