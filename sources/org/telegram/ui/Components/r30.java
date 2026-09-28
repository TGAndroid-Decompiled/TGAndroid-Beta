package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class r30 implements Runnable {
    public final int f27896a;
    public final t30 f27897b;
    public final String f27898c;
    public final int d;

    public r30(t30 t30Var, String str, int i10, int i11) {
        this.f27896a = i11;
        this.f27897b = t30Var;
        this.f27898c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f27896a) {
            case 0:
                t30 t30Var = this.f27897b;
                String str = this.f27898c;
                int i10 = this.d;
                if (t30Var.e != null) {
                    t30Var.e = null;
                    AndroidUtilities.runOnUIThread(new r30(t30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                t30 t30Var2 = this.f27897b;
                String str2 = this.f27898c;
                int i11 = this.d;
                ArrayList arrayList = null;
                t30Var2.e = null;
                if (!ChatObject.isChannel(t30Var2.f28439w.V) && t30Var2.f28439w.W != null) {
                    arrayList = new ArrayList(t30Var2.f28439w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.c9(t30Var2, str2, i11, arrayList));
                } else {
                    t30Var2.h = false;
                }
                gg.c2 c2Var = t30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(t30Var2.f28439w.V);
                if (ChatObject.isChannel(t30Var2.f28439w.V)) {
                    j3 = t30Var2.f28439w.V.f18336id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}
