package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class ql extends org.telegram.ui.Cells.k9 {
    public bn f51295w0;

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.fj fjVar) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.messenger.aj U8;
        bn bnVar = this.f51295w0;
        if (bnVar != null) {
            int min = Math.min(i10, bnVar.getMessagesController().f25777r4 + i7);
            if (fjVar.c1() != 0 && (U8 = this.f51295w0.U8(fjVar.c1())) != null && !U8.f22929i) {
                fjVar = U8.h;
            }
            if (fjVar != null) {
                rm b10 = rm.b(i7, min, fjVar);
                if (b10.f51621i != null) {
                    rj rjVar = this.f51295w0.f45946a0;
                    boolean z10 = false;
                    if (rjVar != null && rjVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.g2) this.f51295w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.g2) this.f51295w0).actionBar;
                            if (kVar2.x()) {
                                this.f51295w0.O7(false);
                            }
                        }
                        this.f51295w0.jc(fjVar, b10);
                        rj rjVar2 = this.f51295w0.f45946a0;
                        if (rjVar2 != null) {
                            rjVar2.i1();
                            return;
                        }
                        return;
                    }
                    bn bnVar2 = this.f51295w0;
                    bnVar2.D5 = b10;
                    bnVar2.F5 = fjVar;
                    if (bnVar2.h != null) {
                        z10 = true;
                    }
                    bnVar2.f46251x5 = new org.telegram.messenger.jj(z10, bnVar2.W9(), org.telegram.messenger.v3.p0(this.f51295w0.f46001e));
                    bn bnVar3 = this.f51295w0;
                    bnVar3.f46251x5.f(bnVar3.F5, bnVar3.U8(fjVar.c1()), this.f51295w0.a(), this.f51295w0.D5);
                    Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
                    l10.putBoolean("quote", true);
                    l10.putInt("messagesCount", 1);
                    l10.putBoolean("canSelectTopics", true);
                    cx cxVar = new cx(l10);
                    bn bnVar4 = this.f51295w0;
                    cxVar.E2 = bnVar4;
                    bnVar4.presentFragment(cxVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        bn bnVar;
        bn bnVar2 = this.f51295w0;
        if ((bnVar2 == null || bnVar2.a() != 489000) && (bnVar = this.f51295w0) != null) {
            if (org.telegram.messenger.n5.C(bnVar.a()) || !this.f51295w0.W9()) {
                org.telegram.ui.Cells.r9 r9Var = this.W;
                if (r9Var != null && ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().f23993k != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().f23993k.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(bn bnVar) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f30965p0;
            if (i7 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
                i7++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f51295w0 = bnVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.r9 r9Var;
        boolean z10;
        bn bnVar;
        org.telegram.ui.Cells.r9 r9Var2;
        TLRPC.Chat chat;
        bn bnVar2 = this.f51295w0;
        if (bnVar2 == null || bnVar2.a() != 489000) {
            bn bnVar3 = this.f51295w0;
            if ((bnVar3 != null && bnVar3.W9()) || ((r9Var = this.W) != null && ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().f23993k != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().f23993k.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f30968s0 && (bnVar = this.f51295w0) != null && bnVar.h == null && (((r9Var2 = this.W) == null || (((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.r1) this.W).getMessageObject().T4() && !((org.telegram.ui.Cells.r1) this.W).getMessageObject().z3() && ((((org.telegram.ui.Cells.r1) this.W).getMessageObject().f24050y2 == null || org.telegram.messenger.iv.c(((org.telegram.ui.Cells.r1) this.W).getMessageObject())) && !this.f51295w0.f46215u9.f30966q0))) && !this.f51295w0.getMessagesController().f25815v7.B(this.f51295w0.f46099l6) && !org.telegram.messenger.o10.B(this.f51295w0.f46099l6) && (!z10 || (chat = this.f51295w0.f46001e) == null || org.telegram.messenger.v3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        bn bnVar = this.f51295w0;
        if (bnVar == null) {
            return 0;
        }
        return bnVar.Ya;
    }

    @Override
    public final int p() {
        bn bnVar = this.f51295w0;
        if (bnVar == null) {
            return 0;
        }
        return (int) bnVar.P9;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 q() {
        bn bnVar = this.f51295w0;
        if (bnVar != null) {
            return bnVar.Ba;
        }
        return null;
    }

    @Override
    public final int t(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.f51295w0.Ba);
    }
}
