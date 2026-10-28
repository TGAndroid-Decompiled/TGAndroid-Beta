package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class jr implements Runnable {
    public final int f40582a;
    public final lr f40583b;
    public final String f40584c;

    public jr(lr lrVar, String str, int i10) {
        this.f40582a = i10;
        this.f40583b = lrVar;
        this.f40584c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m4.v0 v0Var;
        boolean z10;
        long j10;
        switch (this.f40582a) {
            case 0:
                lr lrVar = this.f40583b;
                lrVar.getClass();
                AndroidUtilities.runOnUIThread(new jr(lrVar, this.f40584c, 1));
                return;
            default:
                lr lrVar2 = this.f40583b;
                lrVar2.f41239n = null;
                mr mrVar = lrVar2.f41244y;
                TLRPC.Chat chat = mrVar.f41530n;
                int i10 = mrVar.f41512d1;
                if (!ChatObject.isChannel(chat) && mrVar.f41539r != null) {
                    arrayList = new ArrayList(mrVar.f41539r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(mrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f40584c;
                if (arrayList == null && arrayList2 == null) {
                    lrVar2.f41241s = false;
                    v0Var = null;
                } else {
                    v0Var = new m4.v0(lrVar2, str, arrayList, arrayList2, 21);
                }
                ig.a2 a2Var = lrVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(mrVar.f41530n)) {
                    j10 = mrVar.M;
                } else {
                    j10 = 0;
                }
                a2Var.h(str, z10, false, true, false, false, j10, false, mrVar.N, 1, 0L, v0Var);
                return;
        }
    }
}
