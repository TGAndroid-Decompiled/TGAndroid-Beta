package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class ll extends org.telegram.ui.Cells.i9 {
    public wm f47352w0;

    @Override
    public final void I(int i3, int i10, org.telegram.messenger.zi ziVar) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.messenger.ui S8;
        wm wmVar = this.f47352w0;
        if (wmVar != null) {
            int min = Math.min(i10, wmVar.getMessagesController().f23081o4 + i3);
            if (ziVar.d1() != 0 && (S8 = this.f47352w0.S8(ziVar.d1())) != null && !S8.f25705i) {
                ziVar = S8.h;
            }
            if (ziVar != null) {
                mm b10 = mm.b(i3, min, ziVar);
                if (b10.f47706i != null) {
                    mj mjVar = this.f47352w0.f51237a0;
                    boolean z10 = false;
                    if (mjVar != null && mjVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.d2) this.f47352w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.d2) this.f47352w0).actionBar;
                            if (kVar2.v()) {
                                this.f47352w0.N7(false);
                            }
                        }
                        this.f47352w0.fc(ziVar, b10);
                        mj mjVar2 = this.f47352w0.f51237a0;
                        if (mjVar2 != null) {
                            mjVar2.G0();
                            return;
                        }
                        return;
                    }
                    wm wmVar2 = this.f47352w0;
                    wmVar2.C5 = b10;
                    wmVar2.E5 = ziVar;
                    if (wmVar2.h != null) {
                        z10 = true;
                    }
                    wmVar2.f51526w5 = new org.telegram.messenger.dj(z10, wmVar2.U9(), org.telegram.messenger.t3.p0(this.f47352w0.f51292e));
                    wm wmVar3 = this.f47352w0;
                    wmVar3.f51526w5.f(wmVar3.E5, wmVar3.S8(ziVar.d1()), this.f47352w0.a(), this.f47352w0.C5);
                    Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
                    l10.putBoolean("quote", true);
                    l10.putInt("messagesCount", 1);
                    l10.putBoolean("canSelectTopics", true);
                    uw uwVar = new uw(l10);
                    wm wmVar4 = this.f47352w0;
                    uwVar.D2 = wmVar4;
                    wmVar4.presentFragment(uwVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        wm wmVar;
        wm wmVar2 = this.f47352w0;
        if ((wmVar2 == null || wmVar2.a() != 489000) && (wmVar = this.f47352w0) != null) {
            if (org.telegram.messenger.m5.C(wmVar.a()) || !this.f47352w0.U9()) {
                org.telegram.ui.Cells.p9 p9Var = this.W;
                if (p9Var != null && ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f26868k != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f26868k.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(wm wmVar) {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f29388p0;
            if (i3 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i3))).cancel();
                i3++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f47352w0 = wmVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.p9 p9Var;
        boolean z10;
        wm wmVar;
        org.telegram.ui.Cells.p9 p9Var2;
        TLRPC.Chat chat;
        wm wmVar2 = this.f47352w0;
        if (wmVar2 == null || wmVar2.a() != 489000) {
            wm wmVar3 = this.f47352w0;
            if ((wmVar3 != null && wmVar3.U9()) || ((p9Var = this.W) != null && ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f26868k != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f26868k.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f29391s0 && (wmVar = this.f47352w0) != null && wmVar.h == null && (((p9Var2 = this.W) == null || (((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().U4() && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().A3() && ((((org.telegram.ui.Cells.q1) this.W).getMessageObject().f26915w2 == null || org.telegram.messenger.gv.c(((org.telegram.ui.Cells.q1) this.W).getMessageObject())) && !this.f47352w0.r9.f29389q0))) && !this.f47352w0.getMessagesController().f23120s7.B(this.f47352w0.f51376k6) && !org.telegram.messenger.l10.A(this.f47352w0.f51376k6) && (!z10 || (chat = this.f47352w0.f51292e) == null || org.telegram.messenger.t3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        wm wmVar = this.f47352w0;
        if (wmVar == null) {
            return 0;
        }
        return wmVar.Va;
    }

    @Override
    public final int p() {
        wm wmVar = this.f47352w0;
        if (wmVar == null) {
            return 0;
        }
        return (int) wmVar.M9;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 q() {
        wm wmVar = this.f47352w0;
        if (wmVar != null) {
            return wmVar.f51557ya;
        }
        return null;
    }

    @Override
    public final int t(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.f47352w0.f51557ya);
    }
}
