package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class pl extends org.telegram.ui.Cells.j9 {
    public an f48846w0;

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.messenger.dj S8;
        an anVar = this.f48846w0;
        if (anVar != null) {
            int min = Math.min(i10, anVar.getMessagesController().o4 + i7);
            if (ijVar.d1() != 0 && (S8 = this.f48846w0.S8(ijVar.d1())) != null && !S8.f22015i) {
                ijVar = S8.h;
            }
            if (ijVar != null) {
                qm b10 = qm.b(i7, min, ijVar);
                if (b10.f49268i != null) {
                    qj qjVar = this.f48846w0.Z;
                    boolean z9 = false;
                    if (qjVar != null && qjVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.f2) this.f48846w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.f2) this.f48846w0).actionBar;
                            if (kVar2.v()) {
                                this.f48846w0.N7(false);
                            }
                        }
                        this.f48846w0.fc(ijVar, b10);
                        qj qjVar2 = this.f48846w0.Z;
                        if (qjVar2 != null) {
                            qjVar2.H0();
                            return;
                        }
                        return;
                    }
                    an anVar2 = this.f48846w0;
                    anVar2.B5 = b10;
                    anVar2.D5 = ijVar;
                    if (anVar2.h != null) {
                        z9 = true;
                    }
                    anVar2.f43990v5 = new org.telegram.messenger.mj(z9, anVar2.U9(), org.telegram.messenger.t3.p0(this.f48846w0.f43771e));
                    an anVar3 = this.f48846w0;
                    anVar3.f43990v5.f(anVar3.D5, anVar3.S8(ijVar.d1()), this.f48846w0.a(), this.f48846w0.B5);
                    Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
                    h.putBoolean("quote", true);
                    h.putInt("messagesCount", 1);
                    h.putBoolean("canSelectTopics", true);
                    ww wwVar = new ww(h);
                    an anVar4 = this.f48846w0;
                    wwVar.C2 = anVar4;
                    anVar4.presentFragment(wwVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        an anVar;
        an anVar2 = this.f48846w0;
        if ((anVar2 == null || anVar2.a() != 489000) && (anVar = this.f48846w0) != null) {
            if (org.telegram.messenger.m5.C(anVar.a()) || !this.f48846w0.U9()) {
                org.telegram.ui.Cells.q9 q9Var = this.W;
                if (q9Var != null && ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23244k != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23244k.noforwards) {
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
            SparseArray sparseArray = this.f29374p0;
            if (i7 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
                i7++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f48846w0 = anVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.q9 q9Var;
        boolean z9;
        an anVar;
        org.telegram.ui.Cells.q9 q9Var2;
        TLRPC.Chat chat;
        an anVar2 = this.f48846w0;
        if (anVar2 == null || anVar2.a() != 489000) {
            an anVar3 = this.f48846w0;
            if ((anVar3 != null && anVar3.U9()) || ((q9Var = this.W) != null && ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23244k != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23244k.noforwards)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!this.f29377s0 && (anVar = this.f48846w0) != null && anVar.h == null && (((q9Var2 = this.W) == null || (((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().U4() && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().A3() && ((((org.telegram.ui.Cells.q1) this.W).getMessageObject().f23291w2 == null || org.telegram.messenger.ov.c(((org.telegram.ui.Cells.q1) this.W).getMessageObject())) && !this.f48846w0.f43930q9.f29375q0))) && !this.f48846w0.getMessagesController().f24889s7.B(this.f48846w0.f43842j6) && !org.telegram.messenger.t10.A(this.f48846w0.f43842j6) && (!z9 || (chat = this.f48846w0.f43771e) == null || org.telegram.messenger.t3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        an anVar = this.f48846w0;
        if (anVar == null) {
            return 0;
        }
        return anVar.Ua;
    }

    @Override
    public final int p() {
        an anVar = this.f48846w0;
        if (anVar == null) {
            return 0;
        }
        return (int) anVar.L9;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 q() {
        an anVar = this.f48846w0;
        if (anVar != null) {
            return anVar.f44022xa;
        }
        return null;
    }

    @Override
    public final int t(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.f48846w0.f44022xa);
    }
}
