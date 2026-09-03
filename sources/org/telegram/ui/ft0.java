package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ft0 extends AnimatorListenerAdapter {
    public final int f36910a;
    public final boolean f36911b;
    public final PhotoViewer f36912c;

    public ft0(PhotoViewer photoViewer, boolean z4, int i10) {
        this.f36910a = i10;
        this.f36912c = photoViewer;
        this.f36911b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36910a) {
            case 1:
                PhotoViewer photoViewer = this.f36912c;
                if (animator.equals(photoViewer.f34419w)) {
                    photoViewer.f34419w = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f36912c;
                if (animator.equals(photoViewer2.I)) {
                    photoViewer2.I = null;
                    return;
                }
                return;
            case 3:
                this.f36912c.Q7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11 = this.f36910a;
        boolean z4 = this.f36911b;
        PhotoViewer photoViewer = this.f36912c;
        switch (i11) {
            case 0:
                if (!z4) {
                    photoViewer.f34270f3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f34419w)) {
                    if (!z4) {
                        photoViewer.U0.setVisibility(4);
                    }
                    photoViewer.f34419w = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.I)) {
                    if (!z4) {
                        photoViewer.C.setVisibility(4);
                        if (photoViewer.f34267f0.getTag() != null) {
                            photoViewer.f34267f0.setVisibility(4);
                        }
                        if (photoViewer.N1.getTag() != null) {
                            photoViewer.N1.setVisibility(4);
                        }
                    }
                    photoViewer.I = null;
                    return;
                }
                return;
            default:
                if (animator.equals(photoViewer.Q7)) {
                    photoViewer.Q7 = new AnimatorSet();
                    if (z4) {
                        photoViewer.K7.setVisibility(0);
                        photoViewer.L7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.Q7;
                        su0 su0Var = photoViewer.K7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(su0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.L7, property, 0.0f));
                    } else {
                        if (photoViewer.P4) {
                            photoViewer.f34276g0.setVisibility(8);
                            photoViewer.f34276g0.setAlpha(0.0f);
                            View view = photoViewer.f34276g0;
                            if (photoViewer.Z1 == 11) {
                                i10 = -16777216;
                            } else {
                                i10 = 2130706432;
                            }
                            view.setBackgroundColor(i10);
                        }
                        photoViewer.K7.setVisibility(4);
                        photoViewer.L7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.Q7;
                        eg.q1 q1Var = photoViewer.M0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(q1Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.M0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.P0, property2, 0.0f));
                    }
                    photoViewer.Q7.addListener(new ss0(this, 7));
                    photoViewer.Q7.setDuration(200L);
                    photoViewer.Q7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.Q7.start();
                    return;
                }
                return;
        }
    }
}
