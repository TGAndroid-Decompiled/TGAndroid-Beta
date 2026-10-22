package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class er implements Runnable {
    public final int f36763a;
    public final gr f36764b;
    public final String f36765c;

    public er(gr grVar, String str, int i10) {
        this.f36763a = i10;
        this.f36764b = grVar;
        this.f36765c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.messenger.camera.i iVar;
        boolean z10;
        long j10;
        switch (this.f36763a) {
            case 0:
                gr grVar = this.f36764b;
                grVar.getClass();
                AndroidUtilities.runOnUIThread(new er(grVar, this.f36765c, 1));
                return;
            default:
                gr grVar2 = this.f36764b;
                grVar2.f37400n = null;
                hr hrVar = grVar2.f37405y;
                TLRPC.Chat chat = hrVar.f37756r;
                int i10 = hrVar.f37731e1;
                if (!ChatObject.isChannel(chat) && hrVar.f37759s != null) {
                    arrayList = new ArrayList(hrVar.f37759s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(hrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f36765c;
                if (arrayList == null && arrayList2 == null) {
                    grVar2.f37402s = false;
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
                if (ChatObject.isChannel(hrVar.f37756r)) {
                    j10 = hrVar.N;
                } else {
                    j10 = 0;
                }
                a2Var.h(str, z10, false, true, false, false, j10, false, hrVar.O, 1, 0L, iVar);
                return;
        }
    }
}
