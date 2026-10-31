package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class hl extends org.telegram.ui.Components.ab0 {
    public final un H;

    public hl(un unVar, Context context, un unVar2, tg.b bVar, org.telegram.messenger.nj njVar, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.wa0 wa0Var, int i11, boolean z10) {
        super(context, unVar2, bVar, njVar, user, chat, i10, wa0Var, i11, z10);
        this.H = unVar;
    }

    @Override
    public final void b() {
        org.telegram.messenger.jj jjVar;
        kn knVar;
        un unVar = this.H;
        kn knVar2 = unVar.B5;
        if (knVar2 != null && (jjVar = knVar2.f38905a) != null && ((knVar = unVar.f42446v5.d) == null || knVar.f38905a == null || jjVar.f1() == unVar.f42446v5.d.f38905a.f1())) {
            return;
        }
        unVar.B5 = unVar.f42446v5.d;
    }

    @Override
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        long o10;
        int i11;
        org.telegram.messenger.lj ljVar;
        int i12 = 0;
        a(false);
        un unVar = this.H;
        org.telegram.messenger.nj njVar = unVar.f42446v5;
        if (njVar != null) {
            if (!z10) {
                unVar.C5 = true;
            }
            org.telegram.messenger.lj ljVar2 = njVar.f17115b;
            if (ljVar2 != null) {
                int size = ljVar2.e.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) unVar.f42446v5.f17115b.e.get(i13);
                    if (jjVar.D4()) {
                        i10 = 3;
                    } else if (jjVar.T3()) {
                        if (i10 != 2) {
                            if (jjVar.Z3()) {
                                i10 = 2;
                            } else {
                                i10 = 1;
                            }
                        }
                    } else if (jjVar.z3()) {
                        z11 = true;
                    }
                    unVar.f42333m6[0].put(jjVar.f1(), jjVar);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle j10 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
            j10.putBoolean("quote", !z10);
            if (!z10 && (ljVar = unVar.f42446v5.f17114a) != null && !ljVar.e.isEmpty() && unVar.f42446v5.d == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            j10.putBoolean("reply_to", z12);
            if (z12 && (org.telegram.messenger.o5.o(((org.telegram.messenger.jj) unVar.f42446v5.f17114a.e.get(0)).b1())) != 0 && o10 != unVar.a() && o10 != unVar.getUserConfig().e() && i11 > 0) {
                j10.putLong("reply_to_author", o10);
            }
            j10.putInt("hasPoll", i10);
            j10.putBoolean("hasInvoice", z11);
            org.telegram.messenger.lj ljVar3 = unVar.f42446v5.f17115b;
            if (ljVar3 != null) {
                i12 = ljVar3.e.size();
            }
            j10.putInt("messagesCount", i12);
            j10.putBoolean("canSelectTopics", true);
            ay ayVar = new ay(j10);
            ayVar.C2 = unVar;
            unVar.presentFragment(ayVar);
        }
    }
}
