package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jq implements Runnable {
    public final int f46668a;
    public final mq f46669b;
    public final String f46670c;

    public jq(mq mqVar, String str, int i3) {
        this.f46668a = i3;
        this.f46669b = mqVar;
        this.f46670c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        o4.b1 b1Var;
        boolean z10;
        long j10;
        switch (this.f46668a) {
            case 0:
                mq mqVar = this.f46669b;
                mqVar.getClass();
                org.telegram.messenger.g0.h3(new jq(mqVar, this.f46670c, 1));
                return;
            default:
                mq mqVar2 = this.f46669b;
                mqVar2.f47745n = null;
                nq nqVar = mqVar2.E;
                TLRPC.Chat chat = nqVar.f48074n;
                int i3 = nqVar.f48059e1;
                if (!org.telegram.messenger.t3.T(chat) && nqVar.f48083r != null) {
                    arrayList = new ArrayList(nqVar.f48083r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i3 == 1) {
                    arrayList2 = new ArrayList(nqVar.getContactsController().f22653f0);
                } else {
                    arrayList2 = null;
                }
                String str = this.f46670c;
                if (arrayList == null && arrayList2 == null) {
                    mqVar2.f47747s = false;
                    b1Var = null;
                } else {
                    b1Var = new o4.b1(mqVar2, str, arrayList, arrayList2, 19);
                }
                kg.v1 v1Var = mqVar2.h;
                if (i3 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (org.telegram.messenger.t3.T(nqVar.f48074n)) {
                    j10 = nqVar.N;
                } else {
                    j10 = 0;
                }
                v1Var.h(str, z10, false, true, false, false, j10, false, nqVar.O, 1, 0L, b1Var);
                return;
        }
    }
}
