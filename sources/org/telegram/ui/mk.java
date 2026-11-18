package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class mk extends org.telegram.ui.Components.ua0 {
    public final bn I;

    public mk(bn bnVar, Context context, bn bnVar2, dh.c cVar, org.telegram.messenger.jj jjVar, TLRPC.User user, TLRPC.Chat chat, int i7, org.telegram.ui.Components.qa0 qa0Var, int i10, boolean z10) {
        super(context, bnVar2, cVar, jjVar, user, chat, i7, qa0Var, i10, z10);
        this.I = bnVar;
    }

    @Override
    public final void b() {
        org.telegram.messenger.fj fjVar;
        rm rmVar;
        bn bnVar = this.I;
        rm rmVar2 = bnVar.D5;
        if (rmVar2 != null && (fjVar = rmVar2.f51651a) != null && ((rmVar = bnVar.f46237x5.d) == null || rmVar.f51651a == null || fjVar.e1() == bnVar.f46237x5.d.f51651a.e1())) {
            return;
        }
        bnVar.D5 = bnVar.f46237x5.d;
    }

    @Override
    public final void c(boolean z10) {
        int i7;
        boolean z11;
        boolean z12;
        org.telegram.messenger.hj hjVar;
        int i10 = 0;
        a(false);
        bn bnVar = this.I;
        org.telegram.messenger.jj jjVar = bnVar.f46237x5;
        if (jjVar != null) {
            if (!z10) {
                bnVar.E5 = true;
            }
            org.telegram.messenger.hj hjVar2 = jjVar.f24868b;
            if (hjVar2 != null) {
                int size = hjVar2.f24458e.size();
                i7 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) bnVar.f46237x5.f24868b.f24458e.get(i11);
                    if (fjVar.D4()) {
                        i7 = 3;
                    } else if (fjVar.T3()) {
                        if (i7 != 2) {
                            if (fjVar.Z3()) {
                                i7 = 2;
                            } else {
                                i7 = 1;
                            }
                        }
                    } else if (fjVar.z3()) {
                        z11 = true;
                    }
                    bnVar.f46121o6[0].put(fjVar.e1(), fjVar);
                }
            } else {
                i7 = 0;
                z11 = false;
            }
            Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
            l10.putBoolean("quote", !z10);
            if (!z10 && (hjVar = bnVar.f46237x5.f24867a) != null && !hjVar.f24458e.isEmpty() && bnVar.f46237x5.d == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            l10.putBoolean("reply_to", z12);
            if (z12) {
                bnVar.gb(l10, (org.telegram.messenger.fj) bnVar.f46237x5.f24867a.f24458e.get(0));
            }
            l10.putInt("hasPoll", i7);
            l10.putBoolean("hasInvoice", z11);
            org.telegram.messenger.hj hjVar3 = bnVar.f46237x5.f24868b;
            if (hjVar3 != null) {
                i10 = hjVar3.f24458e.size();
            }
            l10.putInt("messagesCount", i10);
            l10.putBoolean("canSelectTopics", true);
            cx cxVar = new cx(l10);
            cxVar.E2 = bnVar;
            bnVar.presentFragment(cxVar);
        }
    }
}
