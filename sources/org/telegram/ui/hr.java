package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class hr implements Runnable {
    public final int f40054a;
    public final jr f40055b;
    public final String f40056c;

    public hr(jr jrVar, String str, int i10) {
        this.f40054a = i10;
        this.f40055b = jrVar;
        this.f40056c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m4.v0 v0Var;
        boolean z10;
        long j10;
        switch (this.f40054a) {
            case 0:
                jr jrVar = this.f40055b;
                jrVar.getClass();
                AndroidUtilities.runOnUIThread(new hr(jrVar, this.f40056c, 1));
                return;
            default:
                jr jrVar2 = this.f40055b;
                jrVar2.f40721n = null;
                kr krVar = jrVar2.f40726y;
                TLRPC.Chat chat = krVar.f41029n;
                int i10 = krVar.f41011d1;
                if (!ChatObject.isChannel(chat) && krVar.f41038r != null) {
                    arrayList = new ArrayList(krVar.f41038r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(krVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f40056c;
                if (arrayList == null && arrayList2 == null) {
                    jrVar2.f40723s = false;
                    v0Var = null;
                } else {
                    v0Var = new m4.v0(jrVar2, str, arrayList, arrayList2, 21);
                }
                ig.a2 a2Var = jrVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(krVar.f41029n)) {
                    j10 = krVar.M;
                } else {
                    j10 = 0;
                }
                a2Var.h(str, z10, false, true, false, false, j10, false, krVar.N, 1, 0L, v0Var);
                return;
        }
    }
}
