package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
public final class gb0 implements Runnable {
    public final int f33913a = 0;
    public int f33914b;
    public int f33915c;
    public final Object d;

    public gb0(org.telegram.ui.ix ixVar, int i7, int i10) {
        this.d = ixVar;
        this.f33914b = i7;
        this.f33915c = i10;
    }

    public void a() {
        this.f33915c = 0;
        this.f33914b = 0;
        hb0 hb0Var = (hb0) this.d;
        hb0Var.removeCallbacks(this);
        if (hb0Var.f34198o0) {
            hb0Var.f34198o0 = false;
            hb0Var.invalidate(0, hb0Var.f34197n0, hb0Var.getRight(), hb0Var.getBottom());
        }
        hb0Var.f34199p0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.an anVar;
        switch (this.f33913a) {
            case 0:
                hb0 hb0Var = (hb0) this.d;
                int i7 = this.f33915c;
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i10 = this.f33914b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                if (!hb0Var.f34199p0) {
                                    hb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                hb0Var.f34199p0 = (byte) (!hb0Var.f34199p0 ? 1 : 0);
                                hb0Var.invalidate(0, 0, hb0Var.getRight(), hb0Var.m0);
                                return;
                            }
                            return;
                        }
                        if (!hb0Var.f34198o0) {
                            hb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        hb0Var.f34198o0 = (byte) (!hb0Var.f34198o0 ? 1 : 0);
                        hb0Var.invalidate(0, hb0Var.f34197n0, hb0Var.getRight(), hb0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i11 = this.f33914b;
                if (i11 != 1) {
                    if (i11 == 2) {
                        hb0Var.f34199p0 = true;
                        hb0Var.invalidate(0, 0, hb0Var.getRight(), hb0Var.m0);
                        return;
                    }
                    return;
                }
                hb0Var.f34198o0 = true;
                hb0Var.invalidate(0, hb0Var.f34197n0, hb0Var.getRight(), hb0Var.getBottom());
                return;
            default:
                org.telegram.ui.ix ixVar = (org.telegram.ui.ix) this.d;
                int i12 = this.f33914b;
                int i13 = this.f33915c;
                pj0 pj0Var = ixVar.H;
                if (ixVar.f46767n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < pj0Var.getChildCount()) {
                            View childAt = pj0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String W1 = q1Var.getMessageObject().W1();
                                if (W1 == null) {
                                    W1 = q1Var.getMessageObject().f23262k.message;
                                }
                                if (q1Var.getPhotoImage().L() && W1 != null && q1Var.getMessageObject().f1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (anVar = ixVar.f46762a) != null) {
                        anVar.mb(q1Var);
                        String W12 = q1Var.getMessageObject().W1();
                        if (!org.telegram.messenger.j6.a(W12) && !"🍑".equals(W12) && !"⚰".equals(W12) && !q1Var.getMessageObject().X3() && !q1Var.getMessageObject().G2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        ixVar.n(q1Var, i13, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public gb0(hb0 hb0Var) {
        this.d = hb0Var;
    }
}
