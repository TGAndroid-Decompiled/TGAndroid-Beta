package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oq implements Runnable {
    public final int f50652a;
    public final qq f50653b;
    public final String f50654c;

    public oq(qq qqVar, String str, int i7) {
        this.f50652a = i7;
        this.f50653b = qqVar;
        this.f50654c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.messenger.camera.i iVar;
        boolean z10;
        long j3;
        switch (this.f50652a) {
            case 0:
                qq qqVar = this.f50653b;
                qqVar.getClass();
                org.telegram.messenger.g0.g3(new oq(qqVar, this.f50654c, 1));
                return;
            default:
                qq qqVar2 = this.f50653b;
                qqVar2.f51307n = null;
                rq rqVar = qqVar2.E;
                TLRPC.Chat chat = rqVar.f51756n;
                int i7 = rqVar.f51740e1;
                if (!org.telegram.messenger.v3.T(chat) && rqVar.f51764r != null) {
                    arrayList = new ArrayList(rqVar.f51764r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i7 == 1) {
                    arrayList2 = new ArrayList(rqVar.getContactsController().f24570f0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f50654c;
                if (arrayList == null && arrayList2 == null) {
                    qqVar2.f51309s = false;
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
                if (org.telegram.messenger.v3.T(rqVar.f51756n)) {
                    j3 = rqVar.N;
                } else {
                    j3 = 0;
                }
                z1Var.h(str, z10, false, true, false, false, j3, false, rqVar.O, 1, 0L, iVar);
                return;
        }
    }
}
