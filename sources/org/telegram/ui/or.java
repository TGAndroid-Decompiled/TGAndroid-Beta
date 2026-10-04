package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class or implements Runnable {
    public final int f39266a;
    public final qr f39267b;
    public final String f39268c;

    public or(qr qrVar, String str, int i10) {
        this.f39266a = i10;
        this.f39267b = qrVar;
        this.f39268c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.m5 m5Var;
        boolean z10;
        long j3;
        switch (this.f39266a) {
            case 0:
                qr qrVar = this.f39267b;
                qrVar.getClass();
                AndroidUtilities.runOnUIThread(new or(qrVar, this.f39268c, 1));
                return;
            default:
                qr qrVar2 = this.f39267b;
                qrVar2.f39796n = null;
                rr rrVar = qrVar2.f39801y;
                TLRPC.Chat chat = rrVar.f40222r;
                int i10 = rrVar.f40197e1;
                if (!ChatObject.isChannel(chat) && rrVar.f40225s != null) {
                    arrayList = new ArrayList(rrVar.f40225s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(rrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f39268c;
                if (arrayList == null && arrayList2 == null) {
                    qrVar2.f39798s = false;
                    m5Var = null;
                } else {
                    m5Var = new org.telegram.ui.ActionBar.m5(qrVar2, str, arrayList, arrayList2, 14);
                }
                gg.c2 c2Var = qrVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(rrVar.f40222r)) {
                    j3 = rrVar.N;
                } else {
                    j3 = 0;
                }
                c2Var.h(str, z10, false, true, false, false, j3, false, rrVar.O, 1, 0L, m5Var);
                return;
        }
    }
}
