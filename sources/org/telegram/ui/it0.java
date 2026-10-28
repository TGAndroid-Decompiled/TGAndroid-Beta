package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class it0 extends AnimatorListenerAdapter {
    public final int f40268a;
    public final boolean f40269b;
    public final PhotoViewer f40270c;

    public it0(PhotoViewer photoViewer, boolean z10, int i10) {
        this.f40268a = i10;
        this.f40270c = photoViewer;
        this.f40269b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40268a) {
            case 1:
                PhotoViewer photoViewer = this.f40270c;
                if (animator.equals(photoViewer.f35829w)) {
                    photoViewer.f35829w = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f40270c;
                if (animator.equals(photoViewer2.L)) {
                    photoViewer2.L = null;
                    return;
                }
                return;
            case 3:
                this.f40270c.U7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11 = this.f40268a;
        boolean z10 = this.f40269b;
        PhotoViewer photoViewer = this.f40270c;
        switch (i11) {
            case 0:
                if (!z10) {
                    photoViewer.f35708i3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f35829w)) {
                    if (!z10) {
                        photoViewer.X0.setVisibility(4);
                    }
                    photoViewer.f35829w = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.L)) {
                    if (!z10) {
                        photoViewer.F.setVisibility(4);
                        if (photoViewer.f35705i0.getTag() != null) {
                            photoViewer.f35705i0.setVisibility(4);
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
                        uu0 uu0Var = photoViewer.O7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(uu0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.P7, property, 0.0f));
                    } else {
                        if (photoViewer.S4) {
                            photoViewer.f35714j0.setVisibility(8);
                            photoViewer.f35714j0.setAlpha(0.0f);
                            View view = photoViewer.f35714j0;
                            if (photoViewer.f35654c2 == 11) {
                                i10 = -16777216;
                            } else {
                                i10 = 2130706432;
                            }
                            view.setBackgroundColor(i10);
                        }
                        photoViewer.O7.setVisibility(4);
                        photoViewer.P7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.U7;
                        bi.j5 j5Var = photoViewer.P0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(j5Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.P0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.S0, property2, 0.0f));
                    }
                    photoViewer.U7.addListener(new k50(this, 17));
                    photoViewer.U7.setDuration(200L);
                    photoViewer.U7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.U7.start();
                    return;
                }
                return;
        }
    }
}
