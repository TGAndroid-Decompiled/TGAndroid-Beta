package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements Runnable {
    public final int f38651a;
    public final ir f38652b;
    public final String f38653c;

    public gr(ir irVar, String str, int i10) {
        this.f38651a = i10;
        this.f38652b = irVar;
        this.f38653c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        gg ggVar;
        boolean z10;
        long j10;
        switch (this.f38651a) {
            case 0:
                ir irVar = this.f38652b;
                irVar.getClass();
                AndroidUtilities.runOnUIThread(new gr(irVar, this.f38653c, 1));
                return;
            default:
                ir irVar2 = this.f38652b;
                irVar2.f39324n = null;
                jr jrVar = irVar2.f39329y;
                TLRPC.Chat chat = jrVar.f39656r;
                int i10 = jrVar.f39620a1;
                if (!ChatObject.isChannel(chat) && jrVar.f39659s != null) {
                    arrayList = new ArrayList(jrVar.f39659s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(jrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f38653c;
                if (arrayList == null && arrayList2 == null) {
                    irVar2.f39326s = false;
                    ggVar = null;
                } else {
                    ggVar = new gg(irVar2, str, arrayList, arrayList2, 7);
                }
                rf.k1 k1Var = irVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(jrVar.f39656r)) {
                    j10 = jrVar.J;
                } else {
                    j10 = 0;
                }
                k1Var.h(str, z10, false, true, false, false, j10, false, jrVar.K, 1, 0L, ggVar);
                return;
        }
    }
}
