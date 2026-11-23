package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oq implements Runnable {
    public final int f50743a;
    public final qq f50744b;
    public final String f50745c;

    public oq(qq qqVar, String str, int i7) {
        this.f50743a = i7;
        this.f50744b = qqVar;
        this.f50745c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        oi.h hVar;
        boolean z10;
        long j3;
        switch (this.f50743a) {
            case 0:
                qq qqVar = this.f50744b;
                qqVar.getClass();
                org.telegram.messenger.g0.g3(new oq(qqVar, this.f50745c, 1));
                return;
            default:
                qq qqVar2 = this.f50744b;
                qqVar2.f51507n = null;
                rq rqVar = qqVar2.E;
                TLRPC.Chat chat = rqVar.f51839n;
                int i7 = rqVar.f51823e1;
                if (!org.telegram.messenger.v3.T(chat) && rqVar.f51847r != null) {
                    arrayList = new ArrayList(rqVar.f51847r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i7 == 1) {
                    arrayList2 = new ArrayList(rqVar.getContactsController().f24693f0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f50745c;
                if (arrayList == null && arrayList2 == null) {
                    qqVar2.f51509s = false;
                    hVar = null;
                } else {
                    hVar = new oi.h(qqVar2, str, arrayList, arrayList2, 19);
                }
                jg.z1 z1Var = qqVar2.h;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (org.telegram.messenger.v3.T(rqVar.f51839n)) {
                    j3 = rqVar.N;
                } else {
                    j3 = 0;
                }
                z1Var.h(str, z10, false, true, false, false, j3, false, rqVar.O, 1, 0L, hVar);
                return;
        }
    }
}
