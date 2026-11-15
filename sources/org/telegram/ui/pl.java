package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class pl extends org.telegram.ui.Cells.i9 {
    public an f50309w0;

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.messenger.bj U8;
        an anVar = this.f50309w0;
        if (anVar != null) {
            int min = Math.min(i10, anVar.getMessagesController().f25361p4 + i7);
            if (gjVar.c1() != 0 && (U8 = this.f50309w0.U8(gjVar.c1())) != null && !U8.f22713i) {
                gjVar = U8.h;
            }
            if (gjVar != null) {
                qm b10 = qm.b(i7, min, gjVar);
                if (b10.f50649i != null) {
                    qj qjVar = this.f50309w0.f45118a0;
                    boolean z10 = false;
                    if (qjVar != null && qjVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.e2) this.f50309w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.e2) this.f50309w0).actionBar;
                            if (kVar2.x()) {
                                this.f50309w0.O7(false);
                            }
                        }
                        this.f50309w0.jc(gjVar, b10);
                        qj qjVar2 = this.f50309w0.f45118a0;
                        if (qjVar2 != null) {
                            qjVar2.W0();
                            return;
                        }
                        return;
                    }
                    an anVar2 = this.f50309w0;
                    anVar2.C5 = b10;
                    anVar2.E5 = gjVar;
                    if (anVar2.h != null) {
                        z10 = true;
                    }
                    anVar2.f45409w5 = new org.telegram.messenger.kj(z10, anVar2.W9(), org.telegram.messenger.t3.p0(this.f50309w0.f45173e));
                    an anVar3 = this.f50309w0;
                    anVar3.f45409w5.f(anVar3.E5, anVar3.U8(gjVar.c1()), this.f50309w0.a(), this.f50309w0.C5);
                    Bundle j3 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
                    j3.putBoolean("quote", true);
                    j3.putInt("messagesCount", 1);
                    j3.putBoolean("canSelectTopics", true);
                    yw ywVar = new yw(j3);
                    an anVar4 = this.f50309w0;
                    ywVar.E2 = anVar4;
                    anVar4.presentFragment(ywVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        an anVar;
        an anVar2 = this.f50309w0;
        if ((anVar2 == null || anVar2.a() != 489000) && (anVar = this.f50309w0) != null) {
            if (org.telegram.messenger.m5.C(anVar.a()) || !this.f50309w0.W9()) {
                org.telegram.ui.Cells.p9 p9Var = this.W;
                if (p9Var != null && ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23817k != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23817k.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(an anVar) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f30449p0;
            if (i7 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
                i7++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f50309w0 = anVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.p9 p9Var;
        boolean z10;
        an anVar;
        org.telegram.ui.Cells.p9 p9Var2;
        TLRPC.Chat chat;
        an anVar2 = this.f50309w0;
        if (anVar2 == null || anVar2.a() != 489000) {
            an anVar3 = this.f50309w0;
            if ((anVar3 != null && anVar3.W9()) || ((p9Var = this.W) != null && ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23817k != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23817k.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f30452s0 && (anVar = this.f50309w0) != null && anVar.h == null && (((p9Var2 = this.W) == null || (((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().T4() && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().z3() && ((((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23874y2 == null || org.telegram.messenger.mv.c(((org.telegram.ui.Cells.q1) this.W).getMessageObject())) && !this.f50309w0.f45373t9.f30450q0))) && !this.f50309w0.getMessagesController().f25400t7.B(this.f50309w0.f45259k6) && !org.telegram.messenger.q10.A(this.f50309w0.f45259k6) && (!z10 || (chat = this.f50309w0.f45173e) == null || org.telegram.messenger.t3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        an anVar = this.f50309w0;
        if (anVar == null) {
            return 0;
        }
        return anVar.Xa;
    }

    @Override
    public final int p() {
        an anVar = this.f50309w0;
        if (anVar == null) {
            return 0;
        }
        return (int) anVar.O9;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 q() {
        an anVar = this.f50309w0;
        if (anVar != null) {
            return anVar.Aa;
        }
        return null;
    }

    @Override
    public final int t(int i7) {
        return org.telegram.ui.ActionBar.j6.w0(i7, this.f50309w0.Aa);
    }
}
