package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class nr implements Runnable {
    public final int f39444a;
    public final pr f39445b;
    public final String f39446c;

    public nr(pr prVar, String str, int i10) {
        this.f39444a = i10;
        this.f39445b = prVar;
        this.f39446c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ih ihVar;
        boolean z4;
        long j10;
        switch (this.f39444a) {
            case 0:
                pr prVar = this.f39445b;
                prVar.getClass();
                AndroidUtilities.runOnUIThread(new nr(prVar, this.f39446c, 1));
                return;
            default:
                pr prVar2 = this.f39445b;
                prVar2.f40111n = null;
                qr qrVar = prVar2.f40116y;
                TLRPC.Chat chat = qrVar.f40605r;
                int i10 = qrVar.f40572b1;
                if (!ChatObject.isChannel(chat) && qrVar.f40608s != null) {
                    arrayList = new ArrayList(qrVar.f40608s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(qrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f39446c;
                if (arrayList == null && arrayList2 == null) {
                    prVar2.f40113s = false;
                    ihVar = null;
                } else {
                    ihVar = new ih(prVar2, str, arrayList, arrayList2, 5);
                }
                uf.k1 k1Var = prVar2.h;
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ChatObject.isChannel(qrVar.f40605r)) {
                    j10 = qrVar.K;
                } else {
                    j10 = 0;
                }
                k1Var.h(str, z4, false, true, false, false, j10, false, qrVar.L, 1, 0L, ihVar);
                return;
        }
    }
}
