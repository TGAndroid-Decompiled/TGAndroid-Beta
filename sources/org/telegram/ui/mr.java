package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mr implements Runnable {
    public final int f39753a;
    public final or f39754b;
    public final String f39755c;

    public mr(or orVar, String str, int i10) {
        this.f39753a = i10;
        this.f39754b = orVar;
        this.f39755c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        fp fpVar;
        boolean z10;
        long j10;
        switch (this.f39753a) {
            case 0:
                or orVar = this.f39754b;
                orVar.getClass();
                org.telegram.messenger.i0.g3(new mr(orVar, this.f39755c, 1));
                return;
            default:
                or orVar2 = this.f39754b;
                orVar2.f40371n = null;
                pr prVar = orVar2.D;
                TLRPC.Chat chat = prVar.f40746n;
                int i10 = prVar.f40728d1;
                if (!org.telegram.messenger.w3.T(chat) && prVar.f40755r != null) {
                    arrayList = new ArrayList(prVar.f40755r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(prVar.getContactsController().f16065e0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f39755c;
                if (arrayList == null && arrayList2 == null) {
                    orVar2.f40373s = false;
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
                if (org.telegram.messenger.w3.T(prVar.f40746n)) {
                    j10 = prVar.M;
                } else {
                    j10 = 0;
                }
                m1Var.h(str, z10, false, true, false, false, j10, false, prVar.N, 1, 0L, fpVar);
                return;
        }
    }
}
