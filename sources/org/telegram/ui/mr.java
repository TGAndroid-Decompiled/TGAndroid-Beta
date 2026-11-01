package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mr implements Runnable {
    public final int f39603a;
    public final or f39604b;
    public final String f39605c;

    public mr(or orVar, String str, int i10) {
        this.f39603a = i10;
        this.f39604b = orVar;
        this.f39605c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        fp fpVar;
        boolean z10;
        long j10;
        switch (this.f39603a) {
            case 0:
                or orVar = this.f39604b;
                orVar.getClass();
                org.telegram.messenger.i0.g3(new mr(orVar, this.f39605c, 1));
                return;
            default:
                or orVar2 = this.f39604b;
                orVar2.f40253n = null;
                pr prVar = orVar2.D;
                TLRPC.Chat chat = prVar.f40553n;
                int i10 = prVar.f40535d1;
                if (!org.telegram.messenger.w3.T(chat) && prVar.f40562r != null) {
                    arrayList = new ArrayList(prVar.f40562r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(prVar.getContactsController().f16218e0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f39605c;
                if (arrayList == null && arrayList2 == null) {
                    orVar2.f40255s = false;
                    fpVar = null;
                } else {
                    fpVar = new fp(orVar2, str, arrayList, arrayList2, 3);
                }
                zf.m1 m1Var = orVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (org.telegram.messenger.w3.T(prVar.f40553n)) {
                    j10 = prVar.M;
                } else {
                    j10 = 0;
                }
                m1Var.h(str, z10, false, true, false, false, j10, false, prVar.N, 1, 0L, fpVar);
                return;
        }
    }
}
