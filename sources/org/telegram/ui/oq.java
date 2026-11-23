package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oq implements Runnable {
    public final int f50645a;
    public final qq f50646b;
    public final String f50647c;

    public oq(qq qqVar, String str, int i7) {
        this.f50645a = i7;
        this.f50646b = qqVar;
        this.f50647c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.messenger.camera.i iVar;
        boolean z10;
        long j3;
        switch (this.f50645a) {
            case 0:
                qq qqVar = this.f50646b;
                qqVar.getClass();
                org.telegram.messenger.g0.g3(new oq(qqVar, this.f50647c, 1));
                return;
            default:
                qq qqVar2 = this.f50646b;
                qqVar2.f51325n = null;
                rq rqVar = qqVar2.E;
                TLRPC.Chat chat = rqVar.f51724n;
                int i7 = rqVar.f51708e1;
                if (!org.telegram.messenger.v3.T(chat) && rqVar.f51732r != null) {
                    arrayList = new ArrayList(rqVar.f51732r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i7 == 1) {
                    arrayList2 = new ArrayList(rqVar.getContactsController().f24605f0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f50647c;
                if (arrayList == null && arrayList2 == null) {
                    qqVar2.f51327s = false;
                    iVar = null;
                } else {
                    iVar = new org.telegram.messenger.camera.i(qqVar2, str, arrayList, arrayList2, 18);
                }
                jg.z1 z1Var = qqVar2.h;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (org.telegram.messenger.v3.T(rqVar.f51724n)) {
                    j3 = rqVar.N;
                } else {
                    j3 = 0;
                }
                z1Var.h(str, z10, false, true, false, false, j3, false, rqVar.O, 1, 0L, iVar);
                return;
        }
    }
}
