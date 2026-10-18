package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements Runnable {
    public final int f37276a;
    public final ir f37277b;
    public final String f37278c;

    public gr(ir irVar, String str, int i10) {
        this.f37276a = i10;
        this.f37277b = irVar;
        this.f37278c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.messenger.camera.i iVar;
        boolean z10;
        long j10;
        switch (this.f37276a) {
            case 0:
                ir irVar = this.f37277b;
                irVar.getClass();
                AndroidUtilities.runOnUIThread(new gr(irVar, this.f37278c, 1));
                return;
            default:
                ir irVar2 = this.f37277b;
                irVar2.f37958n = null;
                jr jrVar = irVar2.f37963y;
                TLRPC.Chat chat = jrVar.f38295r;
                int i10 = jrVar.f38270e1;
                if (!ChatObject.isChannel(chat) && jrVar.f38298s != null) {
                    arrayList = new ArrayList(jrVar.f38298s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(jrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f37278c;
                if (arrayList == null && arrayList2 == null) {
                    irVar2.f37960s = false;
                    iVar = null;
                } else {
                    iVar = new org.telegram.messenger.camera.i(irVar2, str, arrayList, arrayList2, 18);
                }
                hg.a2 a2Var = irVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(jrVar.f38295r)) {
                    j10 = jrVar.N;
                } else {
                    j10 = 0;
                }
                a2Var.h(str, z10, false, true, false, false, j10, false, jrVar.O, 1, 0L, iVar);
                return;
        }
    }
}
