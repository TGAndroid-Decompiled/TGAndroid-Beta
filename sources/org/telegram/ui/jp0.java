package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class jp0 extends AnimatorListenerAdapter {
    public final int f47056a;
    public final PhotoViewer f47057b;

    public jp0(PhotoViewer photoViewer, int i7) {
        this.f47056a = i7;
        this.f47057b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        boolean z10;
        org.telegram.ui.Components.ci ciVar;
        int i7 = this.f47056a;
        PhotoViewer photoViewer = this.f47057b;
        switch (i7) {
            case 0:
                photoViewer.f41473o6 = null;
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
                if (fd0Var != null) {
                    if (fd0Var.f33527b.j()) {
                        org.telegram.ui.ActionBar.t6.s(photoViewer.f41345a1, org.telegram.ui.ActionBar.m6.f28081ng, photoViewer.f41532v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f41345a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f41398f6 = 0.0f;
                    photoViewer.f41382e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f41508s3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.d3();
                return;
            case 3:
                photoViewer.L1.m0(false);
                xp0 xp0Var = photoViewer.L1;
                xp0Var.f55680d1.setTypeface(sg.l0.e(xp0Var.f55714y1).f55143j);
                xp0Var.I0.setVisibility(0);
                xp0Var.F0.setVisibility(0);
                xp0Var.G0.setVisibility(0);
                org.telegram.ui.Components.sb0 sb0Var = photoViewer.f41554x4;
                int childCount = sb0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    sb0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f41473o6 = null;
                photoViewer.f41517t4 = 3;
                fi.q3 q3Var = photoViewer.a1().L;
                if (photoViewer.f41517t4 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q3Var.b(z9);
                fi.q3 q3Var2 = photoViewer.K1;
                if (q3Var2 != null) {
                    if (photoViewer.f41517t4 != 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q3Var2.b(z10);
                }
                photoViewer.f41465n6 = -1;
                float o22 = photoViewer.o2(false);
                photoViewer.Z5 = o22;
                photoViewer.f41378d6 = o22;
                photoViewer.f41360b6 = 0.0f;
                photoViewer.f41370c6 = 0.0f;
                photoViewer.t3(o22);
                photoViewer.f41515t2 = true;
                photoViewer.f41382e0.invalidate();
                xq0 xq0Var = photoViewer.d;
                if (xq0Var == null || !xq0Var.P()) {
                    photoViewer.Q1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f41469o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new hf0(this, 24));
                return;
            case 6:
                photoViewer.f41448l6 = 1.0f;
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    cn cnVar = photoViewer.f41438k4;
                    if (cnVar == null && (ciVar = photoViewer.f41346a2) != null) {
                        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                        if (f2Var instanceof cn) {
                            cnVar = (cn) f2Var;
                        }
                    }
                    if (cnVar != null) {
                        cnVar.x8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.o4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f41473o6 = null;
                photoViewer.f41382e0.invalidate();
                return;
            case 8:
                photoViewer.f41553x3[0].setTag(null);
                return;
            default:
                photoViewer.f41553x3[0].setTag(null);
                return;
        }
    }
}
