package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
public final class pb0 implements Runnable {
    public final int f38444a = 0;
    public int f38445b;
    public int f38446c;
    public final Object d;

    public pb0(org.telegram.ui.mx mxVar, int i7, int i10) {
        this.d = mxVar;
        this.f38445b = i7;
        this.f38446c = i10;
    }

    public void a() {
        this.f38446c = 0;
        this.f38445b = 0;
        qb0 qb0Var = (qb0) this.d;
        qb0Var.removeCallbacks(this);
        if (qb0Var.f38777p0) {
            qb0Var.f38777p0 = false;
            qb0Var.invalidate(0, qb0Var.f38776o0, qb0Var.getRight(), qb0Var.getBottom());
        }
        qb0Var.f38778q0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.bn bnVar;
        switch (this.f38444a) {
            case 0:
                qb0 qb0Var = (qb0) this.d;
                int i7 = this.f38446c;
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i10 = this.f38445b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                if (!qb0Var.f38778q0) {
                                    qb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                qb0Var.f38778q0 = (byte) (!qb0Var.f38778q0 ? 1 : 0);
                                qb0Var.invalidate(0, 0, qb0Var.getRight(), qb0Var.f38775n0);
                                return;
                            }
                            return;
                        }
                        if (!qb0Var.f38777p0) {
                            qb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        qb0Var.f38777p0 = (byte) (!qb0Var.f38777p0 ? 1 : 0);
                        qb0Var.invalidate(0, qb0Var.f38776o0, qb0Var.getRight(), qb0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i11 = this.f38445b;
                if (i11 != 1) {
                    if (i11 == 2) {
                        qb0Var.f38778q0 = true;
                        qb0Var.invalidate(0, 0, qb0Var.getRight(), qb0Var.f38775n0);
                        return;
                    }
                    return;
                }
                qb0Var.f38777p0 = true;
                qb0Var.invalidate(0, qb0Var.f38776o0, qb0Var.getRight(), qb0Var.getBottom());
                return;
            default:
                org.telegram.ui.mx mxVar = (org.telegram.ui.mx) this.d;
                int i12 = this.f38445b;
                int i13 = this.f38446c;
                ek0 ek0Var = mxVar.I;
                if (mxVar.f50139n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < ek0Var.getChildCount()) {
                            View childAt = ek0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.r1) {
                                r1Var = (org.telegram.ui.Cells.r1) childAt;
                                String V1 = r1Var.getMessageObject().V1();
                                if (V1 == null) {
                                    V1 = r1Var.getMessageObject().f24073k.message;
                                }
                                if (r1Var.getPhotoImage().M() && V1 != null && r1Var.getMessageObject().e1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            r1Var = null;
                        }
                    }
                    if (r1Var != null && (bnVar = mxVar.f50134a) != null) {
                        bnVar.qb(r1Var);
                        String V12 = r1Var.getMessageObject().V1();
                        if (!org.telegram.messenger.k6.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !r1Var.getMessageObject().W3() && !r1Var.getMessageObject().F2()) {
                            try {
                                r1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        mxVar.n(r1Var, i13, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public pb0(qb0 qb0Var) {
        this.d = qb0Var;
    }
}
