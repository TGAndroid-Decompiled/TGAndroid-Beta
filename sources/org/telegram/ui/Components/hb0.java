package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
public final class hb0 implements Runnable {
    public final int f34268a = 0;
    public int f34269b;
    public int f34270c;
    public final Object d;

    public hb0(org.telegram.ui.kx kxVar, int i7, int i10) {
        this.d = kxVar;
        this.f34269b = i7;
        this.f34270c = i10;
    }

    public void a() {
        this.f34270c = 0;
        this.f34269b = 0;
        ib0 ib0Var = (ib0) this.d;
        ib0Var.removeCallbacks(this);
        if (ib0Var.f34682o0) {
            ib0Var.f34682o0 = false;
            ib0Var.invalidate(0, ib0Var.f34681n0, ib0Var.getRight(), ib0Var.getBottom());
        }
        ib0Var.f34683p0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.cn cnVar;
        switch (this.f34268a) {
            case 0:
                ib0 ib0Var = (ib0) this.d;
                int i7 = this.f34270c;
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i10 = this.f34269b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                if (!ib0Var.f34683p0) {
                                    ib0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                ib0Var.f34683p0 = (byte) (!ib0Var.f34683p0 ? 1 : 0);
                                ib0Var.invalidate(0, 0, ib0Var.getRight(), ib0Var.m0);
                                return;
                            }
                            return;
                        }
                        if (!ib0Var.f34682o0) {
                            ib0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ib0Var.f34682o0 = (byte) (!ib0Var.f34682o0 ? 1 : 0);
                        ib0Var.invalidate(0, ib0Var.f34681n0, ib0Var.getRight(), ib0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i11 = this.f34269b;
                if (i11 != 1) {
                    if (i11 == 2) {
                        ib0Var.f34683p0 = true;
                        ib0Var.invalidate(0, 0, ib0Var.getRight(), ib0Var.m0);
                        return;
                    }
                    return;
                }
                ib0Var.f34682o0 = true;
                ib0Var.invalidate(0, ib0Var.f34681n0, ib0Var.getRight(), ib0Var.getBottom());
                return;
            default:
                org.telegram.ui.kx kxVar = (org.telegram.ui.kx) this.d;
                int i12 = this.f34269b;
                int i13 = this.f34270c;
                qj0 qj0Var = kxVar.H;
                if (kxVar.f47391n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < qj0Var.getChildCount()) {
                            View childAt = qj0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String V1 = q1Var.getMessageObject().V1();
                                if (V1 == null) {
                                    V1 = q1Var.getMessageObject().f23262k.message;
                                }
                                if (q1Var.getPhotoImage().L() && V1 != null && q1Var.getMessageObject().e1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (cnVar = kxVar.f47386a) != null) {
                        cnVar.pb(q1Var);
                        String V12 = q1Var.getMessageObject().V1();
                        if (!org.telegram.messenger.j6.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        kxVar.n(q1Var, i13, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public hb0(ib0 ib0Var) {
        this.d = ib0Var;
    }
}
