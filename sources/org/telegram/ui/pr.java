package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class pr implements Runnable {
    public final int f36593a;
    public final rr f36594b;
    public final String f36595c;

    public pr(rr rrVar, String str, int i10) {
        this.f36593a = i10;
        this.f36594b = rrVar;
        this.f36595c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.n5 n5Var;
        boolean z10;
        long j3;
        switch (this.f36593a) {
            case 0:
                rr rrVar = this.f36594b;
                rrVar.getClass();
                AndroidUtilities.runOnUIThread(new pr(rrVar, this.f36595c, 1));
                return;
            default:
                rr rrVar2 = this.f36594b;
                rrVar2.f37119n = null;
                sr srVar = rrVar2.f37124y;
                TLRPC.Chat chat = srVar.f37429r;
                int i10 = srVar.f37404e1;
                if (!ChatObject.isChannel(chat) && srVar.f37432s != null) {
                    arrayList = new ArrayList(srVar.f37432s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(srVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f36595c;
                if (arrayList == null && arrayList2 == null) {
                    rrVar2.f37121s = false;
                    n5Var = null;
                } else {
                    n5Var = new org.telegram.ui.ActionBar.n5(rrVar2, str, arrayList, arrayList2, 14);
                }
                gg.c2 c2Var = rrVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(srVar.f37429r)) {
                    j3 = srVar.N;
                } else {
                    j3 = 0;
                }
                c2Var.h(str, z10, false, true, false, false, j3, false, srVar.O, 1, 0L, n5Var);
                return;
        }
    }
}
