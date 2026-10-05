package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class or implements Runnable {
    public final int f39281a;
    public final qr f39282b;
    public final String f39283c;

    public or(qr qrVar, String str, int i10) {
        this.f39281a = i10;
        this.f39282b = qrVar;
        this.f39283c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.m5 m5Var;
        boolean z10;
        long j3;
        switch (this.f39281a) {
            case 0:
                qr qrVar = this.f39282b;
                qrVar.getClass();
                AndroidUtilities.runOnUIThread(new or(qrVar, this.f39283c, 1));
                return;
            default:
                qr qrVar2 = this.f39282b;
                qrVar2.f39862n = null;
                rr rrVar = qrVar2.f39867y;
                TLRPC.Chat chat = rrVar.f40202r;
                int i10 = rrVar.f40177e1;
                if (!ChatObject.isChannel(chat) && rrVar.f40205s != null) {
                    arrayList = new ArrayList(rrVar.f40205s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(rrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f39283c;
                if (arrayList == null && arrayList2 == null) {
                    qrVar2.f39864s = false;
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
                if (ChatObject.isChannel(rrVar.f40202r)) {
                    j3 = rrVar.N;
                } else {
                    j3 = 0;
                }
                c2Var.h(str, z10, false, true, false, false, j3, false, rrVar.O, 1, 0L, m5Var);
                return;
        }
    }
}
