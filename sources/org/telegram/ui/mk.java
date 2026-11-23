package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class mk extends org.telegram.ui.Components.wa0 {
    public final bn I;

    public mk(bn bnVar, Context context, bn bnVar2, dh.c cVar, org.telegram.messenger.kj kjVar, TLRPC.User user, TLRPC.Chat chat, int i7, org.telegram.ui.Components.sa0 sa0Var, int i10, boolean z10) {
        super(context, bnVar2, cVar, kjVar, user, chat, i7, sa0Var, i10, z10);
        this.I = bnVar;
    }

    @Override
    public final void b() {
        org.telegram.messenger.gj gjVar;
        rm rmVar;
        bn bnVar = this.I;
        rm rmVar2 = bnVar.D5;
        if (rmVar2 != null && (gjVar = rmVar2.f51651a) != null && ((rmVar = bnVar.f46208x5.d) == null || rmVar.f51651a == null || gjVar.e1() == bnVar.f46208x5.d.f51651a.e1())) {
            return;
        }
        bnVar.D5 = bnVar.f46208x5.d;
    }

    @Override
    public final void c(boolean z10) {
        int i7;
        boolean z11;
        boolean z12;
        org.telegram.messenger.ij ijVar;
        int i10 = 0;
        a(false);
        bn bnVar = this.I;
        org.telegram.messenger.kj kjVar = bnVar.f46208x5;
        if (kjVar != null) {
            if (!z10) {
                bnVar.E5 = true;
            }
            org.telegram.messenger.ij ijVar2 = kjVar.f25044b;
            if (ijVar2 != null) {
                int size = ijVar2.f24700e.size();
                i7 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) bnVar.f46208x5.f25044b.f24700e.get(i11);
                    if (gjVar.D4()) {
                        i7 = 3;
                    } else if (gjVar.T3()) {
                        if (i7 != 2) {
                            if (gjVar.Z3()) {
                                i7 = 2;
                            } else {
                                i7 = 1;
                            }
                        }
                    } else if (gjVar.z3()) {
                        z11 = true;
                    }
                    bnVar.f46092o6[0].put(gjVar.e1(), gjVar);
                }
            } else {
                i7 = 0;
                z11 = false;
            }
            Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
            l10.putBoolean("quote", !z10);
            if (!z10 && (ijVar = bnVar.f46208x5.f25043a) != null && !ijVar.f24700e.isEmpty() && bnVar.f46208x5.d == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            l10.putBoolean("reply_to", z12);
            if (z12) {
                bnVar.gb(l10, (org.telegram.messenger.gj) bnVar.f46208x5.f25043a.f24700e.get(0));
            }
            l10.putInt("hasPoll", i7);
            l10.putBoolean("hasInvoice", z11);
            org.telegram.messenger.ij ijVar3 = bnVar.f46208x5.f25044b;
            if (ijVar3 != null) {
                i10 = ijVar3.f24700e.size();
            }
            l10.putInt("messagesCount", i10);
            l10.putBoolean("canSelectTopics", true);
            cx cxVar = new cx(l10);
            cxVar.E2 = bnVar;
            bnVar.presentFragment(cxVar);
        }
    }
}
