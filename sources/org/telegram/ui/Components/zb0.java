package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
public final class zb0 implements Runnable {
    public final int f33000a = 0;
    public int f33001b;
    public int f33002c;
    public final Object d;

    public zb0(org.telegram.ui.ly lyVar, int i10, int i11) {
        this.d = lyVar;
        this.f33001b = i10;
        this.f33002c = i11;
    }

    public void a() {
        this.f33002c = 0;
        this.f33001b = 0;
        ac0 ac0Var = (ac0) this.d;
        ac0Var.removeCallbacks(this);
        if (ac0Var.f24386o0) {
            ac0Var.f24386o0 = false;
            ac0Var.invalidate(0, ac0Var.f24385n0, ac0Var.getRight(), ac0Var.getBottom());
        }
        ac0Var.f24387p0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.un unVar;
        switch (this.f33000a) {
            case 0:
                ac0 ac0Var = (ac0) this.d;
                int i10 = this.f33002c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f33001b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!ac0Var.f24387p0) {
                                    ac0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                ac0Var.f24387p0 = (byte) (!ac0Var.f24387p0 ? 1 : 0);
                                ac0Var.invalidate(0, 0, ac0Var.getRight(), ac0Var.m0);
                                return;
                            }
                            return;
                        }
                        if (!ac0Var.f24386o0) {
                            ac0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ac0Var.f24386o0 = (byte) (!ac0Var.f24386o0 ? 1 : 0);
                        ac0Var.invalidate(0, ac0Var.f24385n0, ac0Var.getRight(), ac0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f33001b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        ac0Var.f24387p0 = true;
                        ac0Var.invalidate(0, 0, ac0Var.getRight(), ac0Var.m0);
                        return;
                    }
                    return;
                }
                ac0Var.f24386o0 = true;
                ac0Var.invalidate(0, ac0Var.f24385n0, ac0Var.getRight(), ac0Var.getBottom());
                return;
            default:
                org.telegram.ui.ly lyVar = (org.telegram.ui.ly) this.d;
                int i13 = this.f33001b;
                int i14 = this.f33002c;
                tk0 tk0Var = lyVar.H;
                if (lyVar.f39430n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < tk0Var.getChildCount()) {
                            View childAt = tk0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String W1 = q1Var.getMessageObject().W1();
                                if (W1 == null) {
                                    W1 = q1Var.getMessageObject().f16337k.message;
                                }
                                if (q1Var.getPhotoImage().L() && W1 != null && q1Var.getMessageObject().f1() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (unVar = lyVar.f39426a) != null) {
                        unVar.cb(q1Var);
                        String W12 = q1Var.getMessageObject().W1();
                        if (!org.telegram.messenger.l6.a(W12) && !"🍑".equals(W12) && !"⚰".equals(W12) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        lyVar.n(q1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public zb0(ac0 ac0Var) {
        this.d = ac0Var;
    }
}
