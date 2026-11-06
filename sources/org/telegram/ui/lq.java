package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lq implements Runnable {
    public final int f47575a;
    public final nq f47576b;
    public final String f47577c;

    public lq(nq nqVar, String str, int i7) {
        this.f47575a = i7;
        this.f47576b = nqVar;
        this.f47577c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m6 m6Var;
        boolean z9;
        long j3;
        switch (this.f47575a) {
            case 0:
                nq nqVar = this.f47576b;
                nqVar.getClass();
                org.telegram.messenger.g0.h3(new lq(nqVar, this.f47577c, 1));
                return;
            default:
                nq nqVar2 = this.f47576b;
                nqVar2.f48111n = null;
                oq oqVar = nqVar2.D;
                TLRPC.Chat chat = oqVar.f48498n;
                int i7 = oqVar.f48479d1;
                if (!org.telegram.messenger.t3.T(chat) && oqVar.f48506r != null) {
                    arrayList = new ArrayList(oqVar.f48506r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i7 == 1) {
                    arrayList2 = new ArrayList(oqVar.getContactsController().f22582e0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f47577c;
                if (arrayList == null && arrayList2 == null) {
                    nqVar2.f48113s = false;
                    m6Var = null;
                } else {
                    m6Var = new m6(nqVar2, str, arrayList, arrayList2, 13);
                }
                jg.z1 z1Var = nqVar2.h;
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (org.telegram.messenger.t3.T(oqVar.f48498n)) {
                    j3 = oqVar.M;
                } else {
                    j3 = 0;
                }
                z1Var.h(str, z9, false, true, false, false, j3, false, oqVar.N, 1, 0L, m6Var);
                return;
        }
    }
}
