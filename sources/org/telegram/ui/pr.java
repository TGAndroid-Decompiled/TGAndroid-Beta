package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class pr implements Runnable {
    public final int f40973a;
    public final rr f40974b;
    public final String f40975c;

    public pr(rr rrVar, String str, int i10) {
        this.f40973a = i10;
        this.f40974b = rrVar;
        this.f40975c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.l5 l5Var;
        boolean z10;
        long j3;
        switch (this.f40973a) {
            case 0:
                rr rrVar = this.f40974b;
                rrVar.getClass();
                AndroidUtilities.runOnUIThread(new pr(rrVar, this.f40975c, 1));
                return;
            default:
                rr rrVar2 = this.f40974b;
                rrVar2.f41528n = null;
                sr srVar = rrVar2.f41533y;
                TLRPC.Chat chat = srVar.f41856r;
                int i10 = srVar.f41831e1;
                if (!ChatObject.isChannel(chat) && srVar.f41859s != null) {
                    arrayList = new ArrayList(srVar.f41859s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(srVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f40975c;
                if (arrayList == null && arrayList2 == null) {
                    rrVar2.f41530s = false;
                    l5Var = null;
                } else {
                    l5Var = new org.telegram.ui.ActionBar.l5(rrVar2, str, arrayList, arrayList2, 14);
                }
                gg.b2 b2Var = rrVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(srVar.f41856r)) {
                    j3 = srVar.N;
                } else {
                    j3 = 0;
                }
                b2Var.h(str, z10, false, true, false, false, j3, false, srVar.O, 1, 0L, l5Var);
                return;
        }
    }
}
