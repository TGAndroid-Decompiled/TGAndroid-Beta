package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
public final class rb0 implements Runnable {
    public final int f39087a = 0;
    public int f39088b;
    public int f39089c;
    public final Object d;

    public rb0(org.telegram.ui.nx nxVar, int i7, int i10) {
        this.d = nxVar;
        this.f39088b = i7;
        this.f39089c = i10;
    }

    public void a() {
        this.f39089c = 0;
        this.f39088b = 0;
        sb0 sb0Var = (sb0) this.d;
        sb0Var.removeCallbacks(this);
        if (sb0Var.f39578p0) {
            sb0Var.f39578p0 = false;
            sb0Var.invalidate(0, sb0Var.f39577o0, sb0Var.getRight(), sb0Var.getBottom());
        }
        sb0Var.f39579q0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.bn bnVar;
        switch (this.f39087a) {
            case 0:
                sb0 sb0Var = (sb0) this.d;
                int i7 = this.f39089c;
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i10 = this.f39088b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                if (!sb0Var.f39579q0) {
                                    sb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                sb0Var.f39579q0 = (byte) (!sb0Var.f39579q0 ? 1 : 0);
                                sb0Var.invalidate(0, 0, sb0Var.getRight(), sb0Var.f39576n0);
                                return;
                            }
                            return;
                        }
                        if (!sb0Var.f39578p0) {
                            sb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        sb0Var.f39578p0 = (byte) (!sb0Var.f39578p0 ? 1 : 0);
                        sb0Var.invalidate(0, sb0Var.f39577o0, sb0Var.getRight(), sb0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i11 = this.f39088b;
                if (i11 != 1) {
                    if (i11 == 2) {
                        sb0Var.f39579q0 = true;
                        sb0Var.invalidate(0, 0, sb0Var.getRight(), sb0Var.f39576n0);
                        return;
                    }
                    return;
                }
                sb0Var.f39578p0 = true;
                sb0Var.invalidate(0, sb0Var.f39577o0, sb0Var.getRight(), sb0Var.getBottom());
                return;
            default:
                org.telegram.ui.nx nxVar = (org.telegram.ui.nx) this.d;
                int i12 = this.f39088b;
                int i13 = this.f39089c;
                ck0 ck0Var = nxVar.I;
                if (nxVar.f50346n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < ck0Var.getChildCount()) {
                            View childAt = ck0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String V1 = q1Var.getMessageObject().V1();
                                if (V1 == null) {
                                    V1 = q1Var.getMessageObject().f23968k.message;
                                }
                                if (q1Var.getPhotoImage().L() && V1 != null && q1Var.getMessageObject().e1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (bnVar = nxVar.f50341a) != null) {
                        bnVar.qb(q1Var);
                        String V12 = q1Var.getMessageObject().V1();
                        if (!org.telegram.messenger.k6.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        nxVar.n(q1Var, i13, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public rb0(sb0 sb0Var) {
        this.d = sb0Var;
    }
}
