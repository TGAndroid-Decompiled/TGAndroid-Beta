package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
public final class sb0 implements Runnable {
    public final int f39546a = 0;
    public int f39547b;
    public int f39548c;
    public final Object d;

    public sb0(org.telegram.ui.nx nxVar, int i7, int i10) {
        this.d = nxVar;
        this.f39547b = i7;
        this.f39548c = i10;
    }

    public void a() {
        this.f39548c = 0;
        this.f39547b = 0;
        tb0 tb0Var = (tb0) this.d;
        tb0Var.removeCallbacks(this);
        if (tb0Var.f39835p0) {
            tb0Var.f39835p0 = false;
            tb0Var.invalidate(0, tb0Var.f39834o0, tb0Var.getRight(), tb0Var.getBottom());
        }
        tb0Var.f39836q0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.bn bnVar;
        switch (this.f39546a) {
            case 0:
                tb0 tb0Var = (tb0) this.d;
                int i7 = this.f39548c;
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i10 = this.f39547b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                if (!tb0Var.f39836q0) {
                                    tb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                tb0Var.f39836q0 = (byte) (!tb0Var.f39836q0 ? 1 : 0);
                                tb0Var.invalidate(0, 0, tb0Var.getRight(), tb0Var.f39833n0);
                                return;
                            }
                            return;
                        }
                        if (!tb0Var.f39835p0) {
                            tb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        tb0Var.f39835p0 = (byte) (!tb0Var.f39835p0 ? 1 : 0);
                        tb0Var.invalidate(0, tb0Var.f39834o0, tb0Var.getRight(), tb0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i11 = this.f39547b;
                if (i11 != 1) {
                    if (i11 == 2) {
                        tb0Var.f39836q0 = true;
                        tb0Var.invalidate(0, 0, tb0Var.getRight(), tb0Var.f39833n0);
                        return;
                    }
                    return;
                }
                tb0Var.f39835p0 = true;
                tb0Var.invalidate(0, tb0Var.f39834o0, tb0Var.getRight(), tb0Var.getBottom());
                return;
            default:
                org.telegram.ui.nx nxVar = (org.telegram.ui.nx) this.d;
                int i12 = this.f39547b;
                int i13 = this.f39548c;
                ek0 ek0Var = nxVar.I;
                if (nxVar.f50341n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < ek0Var.getChildCount()) {
                            View childAt = ek0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.r1) {
                                r1Var = (org.telegram.ui.Cells.r1) childAt;
                                String V1 = r1Var.getMessageObject().V1();
                                if (V1 == null) {
                                    V1 = r1Var.getMessageObject().f24213k.message;
                                }
                                if (r1Var.getPhotoImage().L() && V1 != null && r1Var.getMessageObject().e1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            r1Var = null;
                        }
                    }
                    if (r1Var != null && (bnVar = nxVar.f50336a) != null) {
                        bnVar.qb(r1Var);
                        String V12 = r1Var.getMessageObject().V1();
                        if (!org.telegram.messenger.k6.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !r1Var.getMessageObject().W3() && !r1Var.getMessageObject().F2()) {
                            try {
                                r1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        nxVar.n(r1Var, i13, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public sb0(tb0 tb0Var) {
        this.d = tb0Var;
    }
}
