package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class hl extends org.telegram.ui.Components.ab0 {
    public final un H;

    public hl(un unVar, Context context, un unVar2, tg.b bVar, org.telegram.messenger.oj ojVar, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.wa0 wa0Var, int i11, boolean z10) {
        super(context, unVar2, bVar, ojVar, user, chat, i10, wa0Var, i11, z10);
        this.H = unVar;
    }

    @Override
    public final void b() {
        org.telegram.messenger.kj kjVar;
        kn knVar;
        un unVar = this.H;
        kn knVar2 = unVar.B5;
        if (knVar2 != null && (kjVar = knVar2.f38931a) != null && ((knVar = unVar.f42257v5.d) == null || knVar.f38931a == null || kjVar.f1() == unVar.f42257v5.d.f38931a.f1())) {
            return;
        }
        unVar.B5 = unVar.f42257v5.d;
    }

    @Override
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        long o10;
        int i11;
        org.telegram.messenger.mj mjVar;
        int i12 = 0;
        a(false);
        un unVar = this.H;
        org.telegram.messenger.oj ojVar = unVar.f42257v5;
        if (ojVar != null) {
            if (!z10) {
                unVar.C5 = true;
            }
            org.telegram.messenger.mj mjVar2 = ojVar.f17452b;
            if (mjVar2 != null) {
                int size = mjVar2.e.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) unVar.f42257v5.f17452b.e.get(i13);
                    if (kjVar.D4()) {
                        i10 = 3;
                    } else if (kjVar.T3()) {
                        if (i10 != 2) {
                            if (kjVar.Z3()) {
                                i10 = 2;
                            } else {
                                i10 = 1;
                            }
                        }
                    } else if (kjVar.z3()) {
                        z11 = true;
                    }
                    unVar.f42144m6[0].put(kjVar.f1(), kjVar);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle j10 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
            j10.putBoolean("quote", !z10);
            if (!z10 && (mjVar = unVar.f42257v5.f17451a) != null && !mjVar.e.isEmpty() && unVar.f42257v5.d == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            j10.putBoolean("reply_to", z12);
            if (z12 && (org.telegram.messenger.o5.o(((org.telegram.messenger.kj) unVar.f42257v5.f17451a.e.get(0)).b1())) != 0 && o10 != unVar.a() && o10 != unVar.getUserConfig().e() && i11 > 0) {
                j10.putLong("reply_to_author", o10);
            }
            j10.putInt("hasPoll", i10);
            j10.putBoolean("hasInvoice", z11);
            org.telegram.messenger.mj mjVar3 = unVar.f42257v5.f17452b;
            if (mjVar3 != null) {
                i12 = mjVar3.e.size();
            }
            j10.putInt("messagesCount", i12);
            j10.putBoolean("canSelectTopics", true);
            zx zxVar = new zx(j10);
            zxVar.C2 = unVar;
            unVar.presentFragment(zxVar);
        }
    }
}
