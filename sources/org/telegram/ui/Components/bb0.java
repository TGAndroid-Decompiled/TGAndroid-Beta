package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
public final class bb0 implements Runnable {
    public final int f32153a = 0;
    public int f32154b;
    public int f32155c;
    public final Object d;

    public bb0(org.telegram.ui.fx fxVar, int i3, int i10) {
        this.d = fxVar;
        this.f32154b = i3;
        this.f32155c = i10;
    }

    public void a() {
        this.f32155c = 0;
        this.f32154b = 0;
        cb0 cb0Var = (cb0) this.d;
        cb0Var.removeCallbacks(this);
        if (cb0Var.f32667p0) {
            cb0Var.f32667p0 = false;
            cb0Var.invalidate(0, cb0Var.f32666o0, cb0Var.getRight(), cb0Var.getBottom());
        }
        cb0Var.f32668q0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.wm wmVar;
        switch (this.f32153a) {
            case 0:
                cb0 cb0Var = (cb0) this.d;
                int i3 = this.f32155c;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i10 = this.f32154b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                if (!cb0Var.f32668q0) {
                                    cb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                cb0Var.f32668q0 = (byte) (!cb0Var.f32668q0 ? 1 : 0);
                                cb0Var.invalidate(0, 0, cb0Var.getRight(), cb0Var.f32665n0);
                                return;
                            }
                            return;
                        }
                        if (!cb0Var.f32667p0) {
                            cb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        cb0Var.f32667p0 = (byte) (!cb0Var.f32667p0 ? 1 : 0);
                        cb0Var.invalidate(0, cb0Var.f32666o0, cb0Var.getRight(), cb0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i11 = this.f32154b;
                if (i11 != 1) {
                    if (i11 == 2) {
                        cb0Var.f32668q0 = true;
                        cb0Var.invalidate(0, 0, cb0Var.getRight(), cb0Var.f32665n0);
                        return;
                    }
                    return;
                }
                cb0Var.f32667p0 = true;
                cb0Var.invalidate(0, cb0Var.f32666o0, cb0Var.getRight(), cb0Var.getBottom());
                return;
            default:
                org.telegram.ui.fx fxVar = (org.telegram.ui.fx) this.d;
                int i12 = this.f32154b;
                int i13 = this.f32155c;
                tj0 tj0Var = fxVar.I;
                if (fxVar.f45390n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < tj0Var.getChildCount()) {
                            View childAt = tj0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String W1 = q1Var.getMessageObject().W1();
                                if (W1 == null) {
                                    W1 = q1Var.getMessageObject().f26868k.message;
                                }
                                if (q1Var.getPhotoImage().L() && W1 != null && q1Var.getMessageObject().f1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (wmVar = fxVar.f45385a) != null) {
                        wmVar.mb(q1Var);
                        String W12 = q1Var.getMessageObject().W1();
                        if (!org.telegram.messenger.j6.a(W12) && !"🍑".equals(W12) && !"⚰".equals(W12) && !q1Var.getMessageObject().X3() && !q1Var.getMessageObject().G2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        fxVar.n(q1Var, i13, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bb0(cb0 cb0Var) {
        this.d = cb0Var;
    }
}
