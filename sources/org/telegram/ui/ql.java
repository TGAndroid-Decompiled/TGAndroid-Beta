package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class ql extends org.telegram.ui.Cells.k9 {
    public bn f51232w0;

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.messenger.bj U8;
        bn bnVar = this.f51232w0;
        if (bnVar != null) {
            int min = Math.min(i10, bnVar.getMessagesController().f25912r4 + i7);
            if (gjVar.c1() != 0 && (U8 = this.f51232w0.U8(gjVar.c1())) != null && !U8.f23080i) {
                gjVar = U8.h;
            }
            if (gjVar != null) {
                rm b10 = rm.b(i7, min, gjVar);
                if (b10.f51657i != null) {
                    rj rjVar = this.f51232w0.f45903a0;
                    boolean z10 = false;
                    if (rjVar != null && rjVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.g2) this.f51232w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.g2) this.f51232w0).actionBar;
                            if (kVar2.x()) {
                                this.f51232w0.O7(false);
                            }
                        }
                        this.f51232w0.jc(gjVar, b10);
                        rj rjVar2 = this.f51232w0.f45903a0;
                        if (rjVar2 != null) {
                            rjVar2.i1();
                            return;
                        }
                        return;
                    }
                    bn bnVar2 = this.f51232w0;
                    bnVar2.D5 = b10;
                    bnVar2.F5 = gjVar;
                    if (bnVar2.h != null) {
                        z10 = true;
                    }
                    bnVar2.f46208x5 = new org.telegram.messenger.kj(z10, bnVar2.W9(), org.telegram.messenger.v3.p0(this.f51232w0.f45958e));
                    bn bnVar3 = this.f51232w0;
                    bnVar3.f46208x5.f(bnVar3.F5, bnVar3.U8(gjVar.c1()), this.f51232w0.a(), this.f51232w0.D5);
                    Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
                    l10.putBoolean("quote", true);
                    l10.putInt("messagesCount", 1);
                    l10.putBoolean("canSelectTopics", true);
                    cx cxVar = new cx(l10);
                    bn bnVar4 = this.f51232w0;
                    cxVar.E2 = bnVar4;
                    bnVar4.presentFragment(cxVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        bn bnVar;
        bn bnVar2 = this.f51232w0;
        if ((bnVar2 == null || bnVar2.a() != 489000) && (bnVar = this.f51232w0) != null) {
            if (org.telegram.messenger.n5.C(bnVar.a()) || !this.f51232w0.W9()) {
                org.telegram.ui.Cells.r9 r9Var = this.W;
                if (r9Var != null && ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().f24177k != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().f24177k.noforwards) {
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
            SparseArray sparseArray = this.f30934p0;
            if (i7 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
                i7++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f51232w0 = bnVar;
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
        bn bnVar2 = this.f51232w0;
        if (bnVar2 == null || bnVar2.a() != 489000) {
            bn bnVar3 = this.f51232w0;
            if ((bnVar3 != null && bnVar3.W9()) || ((r9Var = this.W) != null && ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().f24177k != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().f24177k.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f30937s0 && (bnVar = this.f51232w0) != null && bnVar.h == null && (((r9Var2 = this.W) == null || (((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.r1) this.W).getMessageObject().T4() && !((org.telegram.ui.Cells.r1) this.W).getMessageObject().z3() && ((((org.telegram.ui.Cells.r1) this.W).getMessageObject().f24234y2 == null || org.telegram.messenger.jv.c(((org.telegram.ui.Cells.r1) this.W).getMessageObject())) && !this.f51232w0.f46172u9.f30935q0))) && !this.f51232w0.getMessagesController().f25950v7.B(this.f51232w0.f46056l6) && !org.telegram.messenger.p10.B(this.f51232w0.f46056l6) && (!z10 || (chat = this.f51232w0.f45958e) == null || org.telegram.messenger.v3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        bn bnVar = this.f51232w0;
        if (bnVar == null) {
            return 0;
        }
        return bnVar.Ya;
    }

    @Override
    public final int p() {
        bn bnVar = this.f51232w0;
        if (bnVar == null) {
            return 0;
        }
        return (int) bnVar.P9;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 q() {
        bn bnVar = this.f51232w0;
        if (bnVar != null) {
            return bnVar.Ba;
        }
        return null;
    }

    @Override
    public final int t(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.f51232w0.Ba);
    }
}
