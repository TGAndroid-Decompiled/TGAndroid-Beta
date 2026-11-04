package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class hk extends org.telegram.ui.Components.da0 {
    public final wm I;

    public hk(wm wmVar, Context context, wm wmVar2, eh.c cVar, org.telegram.messenger.dj djVar, TLRPC.User user, TLRPC.Chat chat, int i3, org.telegram.ui.Components.z90 z90Var, int i10, boolean z10) {
        super(context, wmVar2, cVar, djVar, user, chat, i3, z90Var, i10, z10);
        this.I = wmVar;
    }

    @Override
    public final void b() {
        org.telegram.messenger.zi ziVar;
        mm mmVar;
        wm wmVar = this.I;
        mm mmVar2 = wmVar.C5;
        if (mmVar2 != null && (ziVar = mmVar2.f47700a) != null && ((mmVar = wmVar.f51526w5.d) == null || mmVar.f47700a == null || ziVar.f1() == wmVar.f51526w5.d.f47700a.f1())) {
            return;
        }
        wmVar.C5 = wmVar.f51526w5.d;
    }

    @Override
    public final void c(boolean z10) {
        int i3;
        boolean z11;
        boolean z12;
        long o10;
        int i10;
        org.telegram.messenger.bj bjVar;
        int i11 = 0;
        a(false);
        wm wmVar = this.I;
        org.telegram.messenger.dj djVar = wmVar.f51526w5;
        if (djVar != null) {
            if (!z10) {
                wmVar.D5 = true;
            }
            org.telegram.messenger.bj bjVar2 = djVar.f22198b;
            if (bjVar2 != null) {
                int size = bjVar2.f21841e.size();
                i3 = 0;
                z11 = false;
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) wmVar.f51526w5.f22198b.f21841e.get(i12);
                    if (ziVar.E4()) {
                        i3 = 3;
                    } else if (ziVar.U3()) {
                        if (i3 != 2) {
                            if (ziVar.a4()) {
                                i3 = 2;
                            } else {
                                i3 = 1;
                            }
                        }
                    } else if (ziVar.A3()) {
                        z11 = true;
                    }
                    wmVar.f51412n6[0].put(ziVar.f1(), ziVar);
                }
            } else {
                i3 = 0;
                z11 = false;
            }
            Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
            l10.putBoolean("quote", !z10);
            if (!z10 && (bjVar = wmVar.f51526w5.f22197a) != null && !bjVar.f21841e.isEmpty() && wmVar.f51526w5.d == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            l10.putBoolean("reply_to", z12);
            if (z12 && (org.telegram.messenger.m5.o(((org.telegram.messenger.zi) wmVar.f51526w5.f22197a.f21841e.get(0)).b1())) != 0 && o10 != wmVar.a() && o10 != wmVar.getUserConfig().e() && i10 > 0) {
                l10.putLong("reply_to_author", o10);
            }
            l10.putInt("hasPoll", i3);
            l10.putBoolean("hasInvoice", z11);
            org.telegram.messenger.bj bjVar3 = wmVar.f51526w5.f22198b;
            if (bjVar3 != null) {
                i11 = bjVar3.f21841e.size();
            }
            l10.putInt("messagesCount", i11);
            l10.putBoolean("canSelectTopics", true);
            uw uwVar = new uw(l10);
            uwVar.D2 = wmVar;
            wmVar.presentFragment(uwVar);
        }
    }
}
