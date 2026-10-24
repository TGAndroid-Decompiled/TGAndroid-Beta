package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class v30 implements Runnable {
    public final int f31292a;
    public final x30 f31293b;
    public final String f31294c;
    public final int d;

    public v30(x30 x30Var, String str, int i10, int i11) {
        this.f31292a = i11;
        this.f31293b = x30Var;
        this.f31294c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f31292a) {
            case 0:
                x30 x30Var = this.f31293b;
                String str = this.f31294c;
                int i10 = this.d;
                if (x30Var.e != null) {
                    x30Var.e = null;
                    AndroidUtilities.runOnUIThread(new v30(x30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                x30 x30Var2 = this.f31293b;
                String str2 = this.f31294c;
                int i11 = this.d;
                ArrayList arrayList = null;
                x30Var2.e = null;
                if (!ChatObject.isChannel(x30Var2.f32507w.V) && x30Var2.f32507w.W != null) {
                    arrayList = new ArrayList(x30Var2.f32507w.W.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new ai.db(x30Var2, str2, i11, arrayList2, 22));
                } else {
                    x30Var2.h = false;
                }
                hg.a2 a2Var = x30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(x30Var2.f32507w.V);
                if (ChatObject.isChannel(x30Var2.f32507w.V)) {
                    j10 = x30Var2.f32507w.V.f20344id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, canAddUsers, false, true, false, j10, false, 2, i11);
                return;
        }
    }
}
