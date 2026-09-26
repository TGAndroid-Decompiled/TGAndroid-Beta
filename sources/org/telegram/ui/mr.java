package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class mr implements Runnable {
    public final int f35645a;
    public final or f35646b;
    public final String f35647c;

    public mr(or orVar, String str, int i10) {
        this.f35645a = i10;
        this.f35646b = orVar;
        this.f35647c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        long j3;
        switch (this.f35645a) {
            case 0:
                or orVar = this.f35646b;
                orVar.getClass();
                AndroidUtilities.runOnUIThread(new mr(orVar, this.f35647c, 1));
                return;
            default:
                or orVar2 = this.f35646b;
                org.telegram.ui.ActionBar.l5 l5Var = null;
                orVar2.f36331n = null;
                pr prVar = orVar2.f36336y;
                TLRPC.Chat chat = prVar.f36645r;
                int i10 = prVar.f36620e1;
                if (!ChatObject.isChannel(chat) && prVar.f36648s != null) {
                    arrayList = new ArrayList(prVar.f36648s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(prVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f35647c;
                if (arrayList == null && arrayList2 == null) {
                    orVar2.f36333s = false;
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
                if (ChatObject.isChannel(prVar.f36645r)) {
                    j3 = prVar.N;
                } else {
                    j3 = 0;
                }
                c2Var.h(str, z10, false, true, false, false, j3, false, prVar.O, 1, 0L, l5Var2);
                return;
        }
    }
}
