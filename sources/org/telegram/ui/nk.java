package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class nk extends org.telegram.ui.Components.ia0 {
    public final cn H;

    public nk(cn cnVar, Context context, cn cnVar2, dh.c cVar, org.telegram.messenger.mj mjVar, TLRPC.User user, TLRPC.Chat chat, int i7, org.telegram.ui.Components.ea0 ea0Var, int i10, boolean z9) {
        super(context, cnVar2, cVar, mjVar, user, chat, i7, ea0Var, i10, z9);
        this.H = cnVar;
    }

    @Override
    public final void b() {
        org.telegram.messenger.ij ijVar;
        sm smVar;
        cn cnVar = this.H;
        sm smVar2 = cnVar.B5;
        if (smVar2 != null && (ijVar = smVar2.f49879a) != null && ((smVar = cnVar.f44694v5.d) == null || smVar.f49879a == null || ijVar.e1() == cnVar.f44694v5.d.f49879a.e1())) {
            return;
        }
        cnVar.B5 = cnVar.f44694v5.d;
    }

    @Override
    public final void c(boolean z9) {
        int i7;
        boolean z10;
        boolean z11;
        org.telegram.messenger.kj kjVar;
        int i10 = 0;
        a(false);
        cn cnVar = this.H;
        org.telegram.messenger.mj mjVar = cnVar.f44694v5;
        if (mjVar != null) {
            if (!z9) {
                cnVar.C5 = true;
            }
            org.telegram.messenger.kj kjVar2 = mjVar.f24035b;
            if (kjVar2 != null) {
                int size = kjVar2.f23704e.size();
                i7 = 0;
                z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) cnVar.f44694v5.f24035b.f23704e.get(i11);
                    if (ijVar.D4()) {
                        i7 = 3;
                    } else if (ijVar.T3()) {
                        if (i7 != 2) {
                            if (ijVar.Z3()) {
                                i7 = 2;
                            } else {
                                i7 = 1;
                            }
                        }
                    } else if (ijVar.z3()) {
                        z10 = true;
                    }
                    cnVar.f44582m6[0].put(ijVar.e1(), ijVar);
                }
            } else {
                i7 = 0;
                z10 = false;
            }
            Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
            h.putBoolean("quote", !z9);
            if (!z9 && (kjVar = cnVar.f44694v5.f24034a) != null && !kjVar.f23704e.isEmpty() && cnVar.f44694v5.d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            h.putBoolean("reply_to", z11);
            if (z11) {
                cnVar.fb(h, (org.telegram.messenger.ij) cnVar.f44694v5.f24034a.f23704e.get(0));
            }
            h.putInt("hasPoll", i7);
            h.putBoolean("hasInvoice", z10);
            org.telegram.messenger.kj kjVar3 = cnVar.f44694v5.f24035b;
            if (kjVar3 != null) {
                i10 = kjVar3.f23704e.size();
            }
            h.putInt("messagesCount", i10);
            h.putBoolean("canSelectTopics", true);
            zw zwVar = new zw(h);
            zwVar.D2 = cnVar;
            cnVar.presentFragment(zwVar);
        }
    }
}
