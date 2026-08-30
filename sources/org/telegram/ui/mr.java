package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class mr implements Runnable {
    public final int f36373a;
    public final or f36374b;
    public final String f36375c;

    public mr(or orVar, String str, int i10) {
        this.f36373a = i10;
        this.f36374b = orVar;
        this.f36375c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ih ihVar;
        boolean z4;
        long j10;
        switch (this.f36373a) {
            case 0:
                or orVar = this.f36374b;
                orVar.getClass();
                AndroidUtilities.runOnUIThread(new mr(orVar, this.f36375c, 1));
                return;
            default:
                or orVar2 = this.f36374b;
                orVar2.f36962n = null;
                pr prVar = orVar2.f36967y;
                TLRPC.Chat chat = prVar.f37481r;
                int i10 = prVar.f37449b1;
                if (!ChatObject.isChannel(chat) && prVar.f37484s != null) {
                    arrayList = new ArrayList(prVar.f37484s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(prVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f36375c;
                if (arrayList == null && arrayList2 == null) {
                    orVar2.f36964s = false;
                    ihVar = null;
                } else {
                    ihVar = new ih(orVar2, str, arrayList, arrayList2, 5);
                }
                tf.k1 k1Var = orVar2.h;
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ChatObject.isChannel(prVar.f37481r)) {
                    j10 = prVar.K;
                } else {
                    j10 = 0;
                }
                k1Var.h(str, z4, false, true, false, false, j10, false, prVar.L, 1, 0L, ihVar);
                return;
        }
    }
}
