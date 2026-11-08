package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class lk extends org.telegram.ui.Components.ia0 {
    public final an H;

    public lk(an anVar, Context context, an anVar2, dh.c cVar, org.telegram.messenger.mj mjVar, TLRPC.User user, TLRPC.Chat chat, int i7, org.telegram.ui.Components.ea0 ea0Var, int i10, boolean z9) {
        super(context, anVar2, cVar, mjVar, user, chat, i7, ea0Var, i10, z9);
        this.H = anVar;
    }

    @Override
    public final void b() {
        org.telegram.messenger.ij ijVar;
        qm qmVar;
        an anVar = this.H;
        qm qmVar2 = anVar.B5;
        if (qmVar2 != null && (ijVar = qmVar2.f49265a) != null && ((qmVar = anVar.f43996v5.d) == null || qmVar.f49265a == null || ijVar.f1() == anVar.f43996v5.d.f49265a.f1())) {
            return;
        }
        anVar.B5 = anVar.f43996v5.d;
    }

    @Override
    public final void c(boolean z9) {
        int i7;
        boolean z10;
        boolean z11;
        long o4;
        int i10;
        org.telegram.messenger.kj kjVar;
        int i11 = 0;
        a(false);
        an anVar = this.H;
        org.telegram.messenger.mj mjVar = anVar.f43996v5;
        if (mjVar != null) {
            if (!z9) {
                anVar.C5 = true;
            }
            org.telegram.messenger.kj kjVar2 = mjVar.f24031b;
            if (kjVar2 != null) {
                int size = kjVar2.f23700e.size();
                i7 = 0;
                z10 = false;
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) anVar.f43996v5.f24031b.f23700e.get(i12);
                    if (ijVar.E4()) {
                        i7 = 3;
                    } else if (ijVar.U3()) {
                        if (i7 != 2) {
                            if (ijVar.a4()) {
                                i7 = 2;
                            } else {
                                i7 = 1;
                            }
                        }
                    } else if (ijVar.A3()) {
                        z10 = true;
                    }
                    anVar.f43884m6[0].put(ijVar.f1(), ijVar);
                }
            } else {
                i7 = 0;
                z10 = false;
            }
            Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
            h.putBoolean("quote", !z9);
            if (!z9 && (kjVar = anVar.f43996v5.f24030a) != null && !kjVar.f23700e.isEmpty() && anVar.f43996v5.d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            h.putBoolean("reply_to", z11);
            if (z11 && (org.telegram.messenger.m5.o(((org.telegram.messenger.ij) anVar.f43996v5.f24030a.f23700e.get(0)).b1())) != 0 && o4 != anVar.a() && o4 != anVar.getUserConfig().e() && i10 > 0) {
                h.putLong("reply_to_author", o4);
            }
            h.putInt("hasPoll", i7);
            h.putBoolean("hasInvoice", z10);
            org.telegram.messenger.kj kjVar3 = anVar.f43996v5.f24031b;
            if (kjVar3 != null) {
                i11 = kjVar3.f23700e.size();
            }
            h.putInt("messagesCount", i11);
            h.putBoolean("canSelectTopics", true);
            ww wwVar = new ww(h);
            wwVar.C2 = anVar;
            anVar.presentFragment(wwVar);
        }
    }
}
