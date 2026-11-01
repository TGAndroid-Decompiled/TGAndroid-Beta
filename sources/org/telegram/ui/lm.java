package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class lm extends org.telegram.ui.Cells.l9 {
    public un f39308w0;

    @Override
    public final void I(int i10, int i11, org.telegram.messenger.kj kjVar) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.messenger.fj P8;
        un unVar = this.f39308w0;
        if (unVar != null) {
            int min = Math.min(i11, unVar.getMessagesController().f19214p4 + i10);
            if (kjVar.d1() != 0 && (P8 = this.f39308w0.P8(kjVar.d1())) != null && !P8.f15740i) {
                kjVar = P8.h;
            }
            if (kjVar != null) {
                kn b10 = kn.b(i10, min, kjVar);
                if (b10.f38936i != null) {
                    mk mkVar = this.f39308w0.Z;
                    boolean z10 = false;
                    if (mkVar != null && mkVar.getVisibility() == 0) {
                        lVar = ((org.telegram.ui.ActionBar.k2) this.f39308w0).actionBar;
                        if (lVar != null) {
                            lVar2 = ((org.telegram.ui.ActionBar.k2) this.f39308w0).actionBar;
                            if (lVar2.u()) {
                                this.f39308w0.L7(false);
                            }
                        }
                        this.f39308w0.ac(kjVar, b10);
                        mk mkVar2 = this.f39308w0.Z;
                        if (mkVar2 != null) {
                            mkVar2.F0();
                            return;
                        }
                        return;
                    }
                    un unVar2 = this.f39308w0;
                    unVar2.B5 = b10;
                    unVar2.D5 = kjVar;
                    if (unVar2.h != null) {
                        z10 = true;
                    }
                    unVar2.f42257v5 = new org.telegram.messenger.oj(z10, unVar2.P9(), org.telegram.messenger.w3.p0(this.f39308w0.e));
                    un unVar3 = this.f39308w0;
                    unVar3.f42257v5.f(unVar3.D5, unVar3.P8(kjVar.d1()), this.f39308w0.a(), this.f39308w0.B5);
                    Bundle j10 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
                    j10.putBoolean("quote", true);
                    j10.putInt("messagesCount", 1);
                    j10.putBoolean("canSelectTopics", true);
                    zx zxVar = new zx(j10);
                    un unVar4 = this.f39308w0;
                    zxVar.C2 = unVar4;
                    unVar4.presentFragment(zxVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        un unVar;
        un unVar2 = this.f39308w0;
        if ((unVar2 == null || unVar2.a() != 489000) && (unVar = this.f39308w0) != null) {
            if (org.telegram.messenger.o5.C(unVar.a()) || !this.f39308w0.P9()) {
                org.telegram.ui.Cells.r9 r9Var = this.W;
                if (r9Var != null && ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f16690k != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f16690k.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(un unVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f22260p0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f39308w0 = unVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.r9 r9Var;
        boolean z10;
        un unVar;
        org.telegram.ui.Cells.r9 r9Var2;
        TLRPC.Chat chat;
        un unVar2 = this.f39308w0;
        if (unVar2 == null || unVar2.a() != 489000) {
            un unVar3 = this.f39308w0;
            if ((unVar3 != null && unVar3.P9()) || ((r9Var = this.W) != null && ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f16690k != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().f16690k.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f22263s0 && (unVar = this.f39308w0) != null && unVar.h == null && (((r9Var2 = this.W) == null || (((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().T4() && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().z3() && ((((org.telegram.ui.Cells.q1) this.W).getMessageObject().f16738w2 == null || org.telegram.messenger.aw.c(((org.telegram.ui.Cells.q1) this.W).getMessageObject())) && !this.f39308w0.f42197q9.f22261q0))) && !this.f39308w0.getMessagesController().f19253t7.B(this.f39308w0.f42108j6) && !org.telegram.messenger.i20.A(this.f39308w0.f42108j6) && (!z10 || (chat = this.f39308w0.e) == null || org.telegram.messenger.w3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        un unVar = this.f39308w0;
        if (unVar == null) {
            return 0;
        }
        return unVar.Ua;
    }

    @Override
    public final int p() {
        un unVar = this.f39308w0;
        if (unVar == null) {
            return 0;
        }
        return (int) unVar.L9;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 q() {
        un unVar = this.f39308w0;
        if (unVar != null) {
            return unVar.f42288xa;
        }
        return null;
    }

    @Override
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.f39308w0.f42288xa);
    }
}
