package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oq implements Runnable {
    public final int f48565a;
    public final qq f48566b;
    public final String f48567c;

    public oq(qq qqVar, String str, int i7) {
        this.f48565a = i7;
        this.f48566b = qqVar;
        this.f48567c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m6 m6Var;
        boolean z9;
        long j3;
        switch (this.f48565a) {
            case 0:
                qq qqVar = this.f48566b;
                qqVar.getClass();
                org.telegram.messenger.g0.h3(new oq(qqVar, this.f48567c, 1));
                return;
            default:
                qq qqVar2 = this.f48566b;
                qqVar2.f49126n = null;
                rq rqVar = qqVar2.D;
                TLRPC.Chat chat = rqVar.f49525n;
                int i7 = rqVar.f49506d1;
                if (!org.telegram.messenger.t3.T(chat) && rqVar.f49533r != null) {
                    arrayList = new ArrayList(rqVar.f49533r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i7 == 1) {
                    arrayList2 = new ArrayList(rqVar.getContactsController().f22612e0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f48567c;
                if (arrayList == null && arrayList2 == null) {
                    qqVar2.f49128s = false;
                    m6Var = null;
                } else {
                    m6Var = new m6(qqVar2, str, arrayList, arrayList2, 13);
                }
                jg.z1 z1Var = qqVar2.h;
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (org.telegram.messenger.t3.T(rqVar.f49525n)) {
                    j3 = rqVar.M;
                } else {
                    j3 = 0;
                }
                z1Var.h(str, z9, false, true, false, false, j3, false, rqVar.N, 1, 0L, m6Var);
                return;
        }
    }
}
