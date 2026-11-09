package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nq implements Runnable {
    public final int f48221a;
    public final pq f48222b;
    public final String f48223c;

    public nq(pq pqVar, String str, int i7) {
        this.f48221a = i7;
        this.f48222b = pqVar;
        this.f48223c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m6 m6Var;
        boolean z9;
        long j3;
        switch (this.f48221a) {
            case 0:
                pq pqVar = this.f48222b;
                pqVar.getClass();
                org.telegram.messenger.g0.h3(new nq(pqVar, this.f48223c, 1));
                return;
            default:
                pq pqVar2 = this.f48222b;
                pqVar2.f48781n = null;
                qq qqVar = pqVar2.D;
                TLRPC.Chat chat = qqVar.f49144n;
                int i7 = qqVar.f49125d1;
                if (!org.telegram.messenger.t3.T(chat) && qqVar.f49152r != null) {
                    arrayList = new ArrayList(qqVar.f49152r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i7 == 1) {
                    arrayList2 = new ArrayList(qqVar.getContactsController().f22608e0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f48223c;
                if (arrayList == null && arrayList2 == null) {
                    pqVar2.f48783s = false;
                    m6Var = null;
                } else {
                    m6Var = new m6(pqVar2, str, arrayList, arrayList2, 13);
                }
                jg.z1 z1Var = pqVar2.h;
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (org.telegram.messenger.t3.T(qqVar.f49144n)) {
                    j3 = qqVar.M;
                } else {
                    j3 = 0;
                }
                z1Var.h(str, z9, false, true, false, false, j3, false, qqVar.N, 1, 0L, m6Var);
                return;
        }
    }
}
