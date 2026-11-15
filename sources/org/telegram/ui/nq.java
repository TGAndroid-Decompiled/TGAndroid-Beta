package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nq implements Runnable {
    public final int f49593a;
    public final pq f49594b;
    public final String f49595c;

    public nq(pq pqVar, String str, int i7) {
        this.f49593a = i7;
        this.f49594b = pqVar;
        this.f49595c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.l5 l5Var;
        boolean z10;
        long j3;
        switch (this.f49593a) {
            case 0:
                pq pqVar = this.f49594b;
                pqVar.getClass();
                org.telegram.messenger.g0.h3(new nq(pqVar, this.f49595c, 1));
                return;
            default:
                pq pqVar2 = this.f49594b;
                pqVar2.f50329n = null;
                qq qqVar = pqVar2.E;
                TLRPC.Chat chat = qqVar.f50737n;
                int i7 = qqVar.f50721e1;
                if (!org.telegram.messenger.t3.T(chat) && qqVar.f50745r != null) {
                    arrayList = new ArrayList(qqVar.f50745r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i7 == 1) {
                    arrayList2 = new ArrayList(qqVar.getContactsController().f23681f0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f49595c;
                if (arrayList == null && arrayList2 == null) {
                    pqVar2.f50331s = false;
                    l5Var = null;
                } else {
                    l5Var = new org.telegram.ui.ActionBar.l5(pqVar2, str, arrayList, arrayList2, 15);
                }
                jg.z1 z1Var = pqVar2.h;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (org.telegram.messenger.t3.T(qqVar.f50737n)) {
                    j3 = qqVar.N;
                } else {
                    j3 = 0;
                }
                z1Var.h(str, z10, false, true, false, false, j3, false, qqVar.O, 1, 0L, l5Var);
                return;
        }
    }
}
