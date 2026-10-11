package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class pr implements Runnable {
    public final int f40939a;
    public final rr f40940b;
    public final String f40941c;

    public pr(rr rrVar, String str, int i10) {
        this.f40939a = i10;
        this.f40940b = rrVar;
        this.f40941c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.l5 l5Var;
        boolean z10;
        long j3;
        switch (this.f40939a) {
            case 0:
                rr rrVar = this.f40940b;
                rrVar.getClass();
                AndroidUtilities.runOnUIThread(new pr(rrVar, this.f40941c, 1));
                return;
            default:
                rr rrVar2 = this.f40940b;
                rrVar2.f41494n = null;
                sr srVar = rrVar2.f41499y;
                TLRPC.Chat chat = srVar.f41822r;
                int i10 = srVar.f41797e1;
                if (!ChatObject.isChannel(chat) && srVar.f41825s != null) {
                    arrayList = new ArrayList(srVar.f41825s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(srVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f40941c;
                if (arrayList == null && arrayList2 == null) {
                    rrVar2.f41496s = false;
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
                if (ChatObject.isChannel(srVar.f41822r)) {
                    j3 = srVar.N;
                } else {
                    j3 = 0;
                }
                b2Var.h(str, z10, false, true, false, false, j3, false, srVar.O, 1, 0L, l5Var);
                return;
        }
    }
}
