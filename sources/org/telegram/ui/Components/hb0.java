package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
public final class hb0 implements Runnable {
    public final int f35218a = 0;
    public int f35219b;
    public int f35220c;
    public final Object d;

    public hb0(org.telegram.ui.jx jxVar, int i7, int i10) {
        this.d = jxVar;
        this.f35219b = i7;
        this.f35220c = i10;
    }

    public void a() {
        this.f35220c = 0;
        this.f35219b = 0;
        ib0 ib0Var = (ib0) this.d;
        ib0Var.removeCallbacks(this);
        if (ib0Var.f35566p0) {
            ib0Var.f35566p0 = false;
            ib0Var.invalidate(0, ib0Var.f35565o0, ib0Var.getRight(), ib0Var.getBottom());
        }
        ib0Var.f35567q0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.an anVar;
        switch (this.f35218a) {
            case 0:
                ib0 ib0Var = (ib0) this.d;
                int i7 = this.f35220c;
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i10 = this.f35219b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                if (!ib0Var.f35567q0) {
                                    ib0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                ib0Var.f35567q0 = (byte) (!ib0Var.f35567q0 ? 1 : 0);
                                ib0Var.invalidate(0, 0, ib0Var.getRight(), ib0Var.f35564n0);
                                return;
                            }
                            return;
                        }
                        if (!ib0Var.f35566p0) {
                            ib0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ib0Var.f35566p0 = (byte) (!ib0Var.f35566p0 ? 1 : 0);
                        ib0Var.invalidate(0, ib0Var.f35565o0, ib0Var.getRight(), ib0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i11 = this.f35219b;
                if (i11 != 1) {
                    if (i11 == 2) {
                        ib0Var.f35567q0 = true;
                        ib0Var.invalidate(0, 0, ib0Var.getRight(), ib0Var.f35564n0);
                        return;
                    }
                    return;
                }
                ib0Var.f35566p0 = true;
                ib0Var.invalidate(0, ib0Var.f35565o0, ib0Var.getRight(), ib0Var.getBottom());
                return;
            default:
                org.telegram.ui.jx jxVar = (org.telegram.ui.jx) this.d;
                int i12 = this.f35219b;
                int i13 = this.f35220c;
                uj0 uj0Var = jxVar.I;
                if (jxVar.f48485n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < uj0Var.getChildCount()) {
                            View childAt = uj0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String V1 = q1Var.getMessageObject().V1();
                                if (V1 == null) {
                                    V1 = q1Var.getMessageObject().f23817k.message;
                                }
                                if (q1Var.getPhotoImage().L() && V1 != null && q1Var.getMessageObject().e1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (anVar = jxVar.f48480a) != null) {
                        anVar.qb(q1Var);
                        String V12 = q1Var.getMessageObject().V1();
                        if (!org.telegram.messenger.k6.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        jxVar.n(q1Var, i13, false, true);
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
