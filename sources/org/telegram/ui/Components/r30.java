package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class r30 implements Runnable {
    public final int f28395a;
    public final t30 f28396b;
    public final String f28397c;
    public final int d;

    public r30(t30 t30Var, String str, int i10, int i11) {
        this.f28395a = i11;
        this.f28396b = t30Var;
        this.f28397c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f28395a) {
            case 0:
                t30 t30Var = this.f28396b;
                String str = this.f28397c;
                int i10 = this.d;
                if (t30Var.e != null) {
                    t30Var.e = null;
                    AndroidUtilities.runOnUIThread(new r30(t30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                t30 t30Var2 = this.f28396b;
                String str2 = this.f28397c;
                int i11 = this.d;
                ArrayList arrayList = null;
                t30Var2.e = null;
                if (!ChatObject.isChannel(t30Var2.f28889w.S) && t30Var2.f28889w.T != null) {
                    arrayList = new ArrayList(t30Var2.f28889w.T.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new cg.v1(t30Var2, str2, i11, arrayList2, 18));
                } else {
                    t30Var2.h = false;
                }
                tf.j1 j1Var = t30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(t30Var2.f28889w.S);
                if (ChatObject.isChannel(t30Var2.f28889w.S)) {
                    j10 = t30Var2.f28889w.S.f19159id;
                } else {
                    j10 = 0;
                }
                j1Var.g(str2, canAddUsers, false, true, false, j10, false, 2, i11);
                return;
        }
    }
}
