package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class or implements Runnable {
    public final int f36871a;
    public final qr f36872b;
    public final String f36873c;

    public or(qr qrVar, String str, int i10) {
        this.f36871a = i10;
        this.f36872b = qrVar;
        this.f36873c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        kh khVar;
        boolean z4;
        long j10;
        switch (this.f36871a) {
            case 0:
                qr qrVar = this.f36872b;
                qrVar.getClass();
                AndroidUtilities.runOnUIThread(new or(qrVar, this.f36873c, 1));
                return;
            default:
                qr qrVar2 = this.f36872b;
                qrVar2.f37459n = null;
                rr rrVar = qrVar2.f37464y;
                TLRPC.Chat chat = rrVar.f37992r;
                int i10 = rrVar.f37960b1;
                if (!ChatObject.isChannel(chat) && rrVar.f37995s != null) {
                    arrayList = new ArrayList(rrVar.f37995s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(rrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f36873c;
                if (arrayList == null && arrayList2 == null) {
                    qrVar2.f37461s = false;
                    khVar = null;
                } else {
                    khVar = new kh(qrVar2, str, arrayList, arrayList2, 5);
                }
                tf.j1 j1Var = qrVar2.h;
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ChatObject.isChannel(rrVar.f37992r)) {
                    j10 = rrVar.K;
                } else {
                    j10 = 0;
                }
                j1Var.h(str, z4, false, true, false, false, j10, false, rrVar.L, 1, 0L, khVar);
                return;
        }
    }
}
