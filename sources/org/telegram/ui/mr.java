package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class mr implements Runnable {
    public final int f35646a;
    public final or f35647b;
    public final String f35648c;

    public mr(or orVar, String str, int i10) {
        this.f35646a = i10;
        this.f35647b = orVar;
        this.f35648c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        long j3;
        switch (this.f35646a) {
            case 0:
                or orVar = this.f35647b;
                orVar.getClass();
                AndroidUtilities.runOnUIThread(new mr(orVar, this.f35648c, 1));
                return;
            default:
                or orVar2 = this.f35647b;
                org.telegram.ui.ActionBar.l5 l5Var = null;
                orVar2.f36332n = null;
                pr prVar = orVar2.f36337y;
                TLRPC.Chat chat = prVar.f36646r;
                int i10 = prVar.f36621e1;
                if (!ChatObject.isChannel(chat) && prVar.f36649s != null) {
                    arrayList = new ArrayList(prVar.f36649s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(prVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f35648c;
                if (arrayList == null && arrayList2 == null) {
                    orVar2.f36334s = false;
                } else {
                    l5Var = new org.telegram.ui.ActionBar.l5(orVar2, str, arrayList, arrayList2);
                }
                org.telegram.ui.ActionBar.l5 l5Var2 = l5Var;
                gg.c2 c2Var = orVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(prVar.f36646r)) {
                    j3 = prVar.N;
                } else {
                    j3 = 0;
                }
                c2Var.h(str, z10, false, true, false, false, j3, false, prVar.O, 1, 0L, l5Var2);
                return;
        }
    }
}
