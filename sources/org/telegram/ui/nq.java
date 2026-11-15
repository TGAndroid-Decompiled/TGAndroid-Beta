package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nq implements Runnable {
    public final int f49603a;
    public final pq f49604b;
    public final String f49605c;

    public nq(pq pqVar, String str, int i7) {
        this.f49603a = i7;
        this.f49604b = pqVar;
        this.f49605c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        long j3;
        switch (this.f49603a) {
            case 0:
                pq pqVar = this.f49604b;
                pqVar.getClass();
                org.telegram.messenger.g0.h3(new nq(pqVar, this.f49605c, 1));
                return;
            default:
                pq pqVar2 = this.f49604b;
                org.telegram.ui.ActionBar.m5 m5Var = null;
                pqVar2.f50338n = null;
                qq qqVar = pqVar2.E;
                TLRPC.Chat chat = qqVar.f50738n;
                int i7 = qqVar.f50722e1;
                if (!org.telegram.messenger.t3.T(chat) && qqVar.f50746r != null) {
                    arrayList = new ArrayList(qqVar.f50746r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i7 == 1) {
                    arrayList2 = new ArrayList(qqVar.getContactsController().f23679f0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f49605c;
                if (arrayList == null && arrayList2 == null) {
                    pqVar2.f50340s = false;
                } else {
                    m5Var = new org.telegram.ui.ActionBar.m5(pqVar2, str, arrayList, arrayList2);
                }
                org.telegram.ui.ActionBar.m5 m5Var2 = m5Var;
                jg.z1 z1Var = pqVar2.h;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (org.telegram.messenger.t3.T(qqVar.f50738n)) {
                    j3 = qqVar.N;
                } else {
                    j3 = 0;
                }
                z1Var.h(str, z10, false, true, false, false, j3, false, qqVar.O, 1, 0L, m5Var2);
                return;
        }
    }
}
