package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class o30 implements Runnable {
    public final int f28945a;
    public final q30 f28946b;
    public final String f28947c;
    public final int d;

    public o30(q30 q30Var, String str, int i10, int i11) {
        this.f28945a = i11;
        this.f28946b = q30Var;
        this.f28947c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f28945a) {
            case 0:
                q30 q30Var = this.f28946b;
                String str = this.f28947c;
                int i10 = this.d;
                if (q30Var.f29559e != null) {
                    q30Var.f29559e = null;
                    AndroidUtilities.runOnUIThread(new o30(q30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                q30 q30Var2 = this.f28946b;
                String str2 = this.f28947c;
                int i11 = this.d;
                ArrayList arrayList = null;
                q30Var2.f29559e = null;
                if (!ChatObject.isChannel(q30Var2.f29564w.V) && q30Var2.f29564w.W != null) {
                    arrayList = new ArrayList(q30Var2.f29564w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new bi.k8(q30Var2, str2, i11, arrayList));
                } else {
                    q30Var2.h = false;
                }
                hg.b2 b2Var = q30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(q30Var2.f29564w.V);
                if (ChatObject.isChannel(q30Var2.f29564w.V)) {
                    j3 = q30Var2.f29564w.V.f19869id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}
