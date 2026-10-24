package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements Runnable {
    public final int f37640a;
    public final ir f37641b;
    public final String f37642c;

    public gr(ir irVar, String str, int i10) {
        this.f37640a = i10;
        this.f37641b = irVar;
        this.f37642c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.messenger.camera.i iVar;
        boolean z10;
        long j10;
        switch (this.f37640a) {
            case 0:
                ir irVar = this.f37641b;
                irVar.getClass();
                AndroidUtilities.runOnUIThread(new gr(irVar, this.f37642c, 1));
                return;
            default:
                ir irVar2 = this.f37641b;
                irVar2.f38369n = null;
                jr jrVar = irVar2.f38374y;
                TLRPC.Chat chat = jrVar.f38653r;
                int i10 = jrVar.f38628e1;
                if (!ChatObject.isChannel(chat) && jrVar.f38656s != null) {
                    arrayList = new ArrayList(jrVar.f38656s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(jrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f37642c;
                if (arrayList == null && arrayList2 == null) {
                    irVar2.f38371s = false;
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
                if (ChatObject.isChannel(jrVar.f38653r)) {
                    j10 = jrVar.N;
                } else {
                    j10 = 0;
                }
                a2Var.h(str, z10, false, true, false, false, j10, false, jrVar.O, 1, 0L, iVar);
                return;
        }
    }
}
