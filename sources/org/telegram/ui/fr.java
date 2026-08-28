package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class fr implements Runnable {
    public final int f38337a;
    public final ir f38338b;
    public final String f38339c;

    public fr(ir irVar, String str, int i9) {
        this.f38337a = i9;
        this.f38338b = irVar;
        this.f38339c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        k6 k6Var;
        boolean z10;
        long j10;
        switch (this.f38337a) {
            case 0:
                ir irVar = this.f38338b;
                irVar.getClass();
                AndroidUtilities.runOnUIThread(new fr(irVar, this.f38339c, 1));
                return;
            default:
                ir irVar2 = this.f38338b;
                irVar2.f39259n = null;
                jr jrVar = irVar2.f39264y;
                TLRPC.Chat chat = jrVar.f39595r;
                int i9 = jrVar.f39559a1;
                if (!ChatObject.isChannel(chat) && jrVar.f39598s != null) {
                    arrayList = new ArrayList(jrVar.f39598s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i9 == 1) {
                    arrayList2 = new ArrayList(jrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f38339c;
                if (arrayList == null && arrayList2 == null) {
                    irVar2.f39261s = false;
                    k6Var = null;
                } else {
                    k6Var = new k6(irVar2, str, arrayList, arrayList2, 13);
                }
                of.v1 v1Var = irVar2.h;
                if (i9 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(jrVar.f39595r)) {
                    j10 = jrVar.J;
                } else {
                    j10 = 0;
                }
                v1Var.h(str, z10, false, true, false, false, j10, false, jrVar.K, 1, 0L, k6Var);
                return;
        }
    }
}
