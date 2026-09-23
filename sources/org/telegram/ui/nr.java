package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class nr implements Runnable {
    public final int f35580a;
    public final pr f35581b;
    public final String f35582c;

    public nr(pr prVar, String str, int i10) {
        this.f35580a = i10;
        this.f35581b = prVar;
        this.f35582c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.m5 m5Var;
        boolean z10;
        long j3;
        switch (this.f35580a) {
            case 0:
                pr prVar = this.f35581b;
                prVar.getClass();
                AndroidUtilities.runOnUIThread(new nr(prVar, this.f35582c, 1));
                return;
            default:
                pr prVar2 = this.f35581b;
                prVar2.f36168n = null;
                qr qrVar = prVar2.f36173y;
                TLRPC.Chat chat = qrVar.f36582r;
                int i10 = qrVar.f36557e1;
                if (!ChatObject.isChannel(chat) && qrVar.f36585s != null) {
                    arrayList = new ArrayList(qrVar.f36585s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(qrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f35582c;
                if (arrayList == null && arrayList2 == null) {
                    prVar2.f36170s = false;
                    m5Var = null;
                } else {
                    m5Var = new org.telegram.ui.ActionBar.m5(prVar2, str, arrayList, arrayList2, 14);
                }
                gg.c2 c2Var = prVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(qrVar.f36582r)) {
                    j3 = qrVar.N;
                } else {
                    j3 = 0;
                }
                c2Var.h(str, z10, false, true, false, false, j3, false, qrVar.O, 1, 0L, m5Var);
                return;
        }
    }
}
