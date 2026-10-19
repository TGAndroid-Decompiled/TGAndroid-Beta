package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class er implements Runnable {
    public final int f36759a;
    public final gr f36760b;
    public final String f36761c;

    public er(gr grVar, String str, int i10) {
        this.f36759a = i10;
        this.f36760b = grVar;
        this.f36761c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.messenger.camera.i iVar;
        boolean z10;
        long j10;
        switch (this.f36759a) {
            case 0:
                gr grVar = this.f36760b;
                grVar.getClass();
                AndroidUtilities.runOnUIThread(new er(grVar, this.f36761c, 1));
                return;
            default:
                gr grVar2 = this.f36760b;
                grVar2.f37416n = null;
                hr hrVar = grVar2.f37421y;
                TLRPC.Chat chat = hrVar.f37775r;
                int i10 = hrVar.f37750e1;
                if (!ChatObject.isChannel(chat) && hrVar.f37778s != null) {
                    arrayList = new ArrayList(hrVar.f37778s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(hrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f36761c;
                if (arrayList == null && arrayList2 == null) {
                    grVar2.f37418s = false;
                    iVar = null;
                } else {
                    iVar = new org.telegram.messenger.camera.i(grVar2, str, arrayList, arrayList2, 18);
                }
                hg.a2 a2Var = grVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(hrVar.f37775r)) {
                    j10 = hrVar.N;
                } else {
                    j10 = 0;
                }
                a2Var.h(str, z10, false, true, false, false, j10, false, hrVar.O, 1, 0L, iVar);
                return;
        }
    }
}
