package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
public final class zb0 implements Runnable {
    public final int f33096a = 0;
    public int f33097b;
    public int f33098c;
    public final Object d;

    public zb0(org.telegram.ui.ky kyVar, int i10, int i11) {
        this.d = kyVar;
        this.f33097b = i10;
        this.f33098c = i11;
    }

    public void a() {
        this.f33098c = 0;
        this.f33097b = 0;
        ac0 ac0Var = (ac0) this.d;
        ac0Var.removeCallbacks(this);
        if (ac0Var.f24370o0) {
            ac0Var.f24370o0 = false;
            ac0Var.invalidate(0, ac0Var.f24369n0, ac0Var.getRight(), ac0Var.getBottom());
        }
        ac0Var.f24371p0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.un unVar;
        switch (this.f33096a) {
            case 0:
                ac0 ac0Var = (ac0) this.d;
                int i10 = this.f33098c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f33097b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!ac0Var.f24371p0) {
                                    ac0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                ac0Var.f24371p0 = (byte) (!ac0Var.f24371p0 ? 1 : 0);
                                ac0Var.invalidate(0, 0, ac0Var.getRight(), ac0Var.m0);
                                return;
                            }
                            return;
                        }
                        if (!ac0Var.f24370o0) {
                            ac0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ac0Var.f24370o0 = (byte) (!ac0Var.f24370o0 ? 1 : 0);
                        ac0Var.invalidate(0, ac0Var.f24369n0, ac0Var.getRight(), ac0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f33097b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        ac0Var.f24371p0 = true;
                        ac0Var.invalidate(0, 0, ac0Var.getRight(), ac0Var.m0);
                        return;
                    }
                    return;
                }
                ac0Var.f24370o0 = true;
                ac0Var.invalidate(0, ac0Var.f24369n0, ac0Var.getRight(), ac0Var.getBottom());
                return;
            default:
                org.telegram.ui.ky kyVar = (org.telegram.ui.ky) this.d;
                int i13 = this.f33097b;
                int i14 = this.f33098c;
                uk0 uk0Var = kyVar.H;
                if (kyVar.f39020n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < uk0Var.getChildCount()) {
                            View childAt = uk0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                q1Var = (org.telegram.ui.Cells.q1) childAt;
                                String W1 = q1Var.getMessageObject().W1();
                                if (W1 == null) {
                                    W1 = q1Var.getMessageObject().f16690k.message;
                                }
                                if (q1Var.getPhotoImage().L() && W1 != null && q1Var.getMessageObject().f1() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            q1Var = null;
                        }
                    }
                    if (q1Var != null && (unVar = kyVar.f39016a) != null) {
                        unVar.hb(q1Var);
                        String W12 = q1Var.getMessageObject().W1();
                        if (!org.telegram.messenger.l6.a(W12) && !"🍑".equals(W12) && !"⚰".equals(W12) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                            try {
                                q1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        kyVar.n(q1Var, i14, false, true);
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
