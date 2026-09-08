package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class o30 implements Runnable {
    public final int f28971a;
    public final q30 f28972b;
    public final String f28973c;
    public final int d;

    public o30(q30 q30Var, String str, int i10, int i11) {
        this.f28971a = i11;
        this.f28972b = q30Var;
        this.f28973c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f28971a) {
            case 0:
                q30 q30Var = this.f28972b;
                String str = this.f28973c;
                int i10 = this.d;
                if (q30Var.f29585e != null) {
                    q30Var.f29585e = null;
                    AndroidUtilities.runOnUIThread(new o30(q30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                q30 q30Var2 = this.f28972b;
                String str2 = this.f28973c;
                int i11 = this.d;
                ArrayList arrayList = null;
                q30Var2.f29585e = null;
                if (!ChatObject.isChannel(q30Var2.f29590w.V) && q30Var2.f29590w.W != null) {
                    arrayList = new ArrayList(q30Var2.f29590w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new bi.k8(q30Var2, str2, i11, arrayList));
                } else {
                    q30Var2.h = false;
                }
                hg.b2 b2Var = q30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(q30Var2.f29590w.V);
                if (ChatObject.isChannel(q30Var2.f29590w.V)) {
                    j3 = q30Var2.f29590w.V.f19896id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}
