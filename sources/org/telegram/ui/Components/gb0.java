package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
public final class gb0 implements Runnable {
    public final int f33868a = 0;
    public int f33869b;
    public int f33870c;
    public final Object d;

    public gb0(org.telegram.ui.lx lxVar, int i7, int i10) {
        this.d = lxVar;
        this.f33869b = i7;
        this.f33870c = i10;
    }

    public void a() {
        this.f33870c = 0;
        this.f33869b = 0;
        hb0 hb0Var = (hb0) this.d;
        hb0Var.removeCallbacks(this);
        if (hb0Var.f34282o0) {
            hb0Var.f34282o0 = false;
            hb0Var.invalidate(0, hb0Var.f34281n0, hb0Var.getRight(), hb0Var.getBottom());
        }
        hb0Var.f34283p0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.cn cnVar;
        switch (this.f33868a) {
            case 0:
                hb0 hb0Var = (hb0) this.d;
                int i7 = this.f33870c;
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i10 = this.f33869b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                if (!hb0Var.f34283p0) {
                                    hb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                hb0Var.f34283p0 = (byte) (!hb0Var.f34283p0 ? 1 : 0);
                                hb0Var.invalidate(0, 0, hb0Var.getRight(), hb0Var.m0);
                                return;
                            }
                            return;
                        }
                        if (!hb0Var.f34282o0) {
                            hb0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        hb0Var.f34282o0 = (byte) (!hb0Var.f34282o0 ? 1 : 0);
                        hb0Var.invalidate(0, hb0Var.f34281n0, hb0Var.getRight(), hb0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i11 = this.f33869b;
                if (i11 != 1) {
                    if (i11 == 2) {
                        hb0Var.f34283p0 = true;
                        hb0Var.invalidate(0, 0, hb0Var.getRight(), hb0Var.m0);
                        return;
                    }
                    return;
                }
                hb0Var.f34282o0 = true;
                hb0Var.invalidate(0, hb0Var.f34281n0, hb0Var.getRight(), hb0Var.getBottom());
                return;
            default:
                org.telegram.ui.lx lxVar = (org.telegram.ui.lx) this.d;
                int i12 = this.f33869b;
                int i13 = this.f33870c;
                pj0 pj0Var = lxVar.H;
                if (lxVar.f47715n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < pj0Var.getChildCount()) {
                            View childAt = pj0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String V1 = q1Var.getMessageObject().V1();
                                if (V1 == null) {
                                    V1 = q1Var.getMessageObject().f23266k.message;
                                }
                                if (q1Var.getPhotoImage().L() && V1 != null && q1Var.getMessageObject().e1() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (cnVar = lxVar.f47710a) != null) {
                        cnVar.pb(q1Var);
                        String V12 = q1Var.getMessageObject().V1();
                        if (!org.telegram.messenger.j6.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        lxVar.n(q1Var, i13, false, true);
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
