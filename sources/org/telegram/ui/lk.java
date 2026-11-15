package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class lk extends org.telegram.ui.Components.ja0 {
    public final an I;

    public lk(an anVar, Context context, an anVar2, dh.c cVar, org.telegram.messenger.kj kjVar, TLRPC.User user, TLRPC.Chat chat, int i7, org.telegram.ui.Components.fa0 fa0Var, int i10, boolean z10) {
        super(context, anVar2, cVar, kjVar, user, chat, i7, fa0Var, i10, z10);
        this.I = anVar;
    }

    @Override
    public final void b() {
        org.telegram.messenger.gj gjVar;
        qm qmVar;
        an anVar = this.I;
        qm qmVar2 = anVar.C5;
        if (qmVar2 != null && (gjVar = qmVar2.f50643a) != null && ((qmVar = anVar.f45409w5.d) == null || qmVar.f50643a == null || gjVar.e1() == anVar.f45409w5.d.f50643a.e1())) {
            return;
        }
        anVar.C5 = anVar.f45409w5.d;
    }

    @Override
    public final void c(boolean z10) {
        int i7;
        boolean z11;
        boolean z12;
        org.telegram.messenger.ij ijVar;
        int i10 = 0;
        a(false);
        an anVar = this.I;
        org.telegram.messenger.kj kjVar = anVar.f45409w5;
        if (kjVar != null) {
            if (!z10) {
                anVar.D5 = true;
            }
            org.telegram.messenger.ij ijVar2 = kjVar.f24704b;
            if (ijVar2 != null) {
                int size = ijVar2.f24403e.size();
                i7 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) anVar.f45409w5.f24704b.f24403e.get(i11);
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
                    anVar.f45294n6[0].put(gjVar.e1(), gjVar);
                }
            } else {
                i7 = 0;
                z11 = false;
            }
            Bundle j3 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
            j3.putBoolean("quote", !z10);
            if (!z10 && (ijVar = anVar.f45409w5.f24703a) != null && !ijVar.f24403e.isEmpty() && anVar.f45409w5.d == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            j3.putBoolean("reply_to", z12);
            if (z12) {
                anVar.gb(j3, (org.telegram.messenger.gj) anVar.f45409w5.f24703a.f24403e.get(0));
            }
            j3.putInt("hasPoll", i7);
            j3.putBoolean("hasInvoice", z11);
            org.telegram.messenger.ij ijVar3 = anVar.f45409w5.f24704b;
            if (ijVar3 != null) {
                i10 = ijVar3.f24403e.size();
            }
            j3.putInt("messagesCount", i10);
            j3.putBoolean("canSelectTopics", true);
            yw ywVar = new yw(j3);
            ywVar.E2 = anVar;
            anVar.presentFragment(ywVar);
        }
    }
}
