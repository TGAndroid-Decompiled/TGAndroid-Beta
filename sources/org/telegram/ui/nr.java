package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class nr implements Runnable {
    public final int f36074a;
    public final pr f36075b;
    public final String f36076c;

    public nr(pr prVar, String str, int i10) {
        this.f36074a = i10;
        this.f36075b = prVar;
        this.f36076c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.n5 n5Var;
        boolean z10;
        long j3;
        switch (this.f36074a) {
            case 0:
                pr prVar = this.f36075b;
                prVar.getClass();
                AndroidUtilities.runOnUIThread(new nr(prVar, this.f36076c, 1));
                return;
            default:
                pr prVar2 = this.f36075b;
                prVar2.f36522n = null;
                qr qrVar = prVar2.f36527y;
                TLRPC.Chat chat = qrVar.f36854r;
                int i10 = qrVar.f36829e1;
                if (!ChatObject.isChannel(chat) && qrVar.f36857s != null) {
                    arrayList = new ArrayList(qrVar.f36857s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(qrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f36076c;
                if (arrayList == null && arrayList2 == null) {
                    prVar2.f36524s = false;
                    n5Var = null;
                } else {
                    n5Var = new org.telegram.ui.ActionBar.n5(prVar2, str, arrayList, arrayList2, 14);
                }
                gg.c2 c2Var = prVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(qrVar.f36854r)) {
                    j3 = qrVar.N;
                } else {
                    j3 = 0;
                }
                c2Var.h(str, z10, false, true, false, false, j3, false, qrVar.O, 1, 0L, n5Var);
                return;
        }
    }
}
