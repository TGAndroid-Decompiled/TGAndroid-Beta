package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class p30 implements Runnable {
    public final int f27257a;
    public final r30 f27258b;
    public final String f27259c;
    public final int d;

    public p30(r30 r30Var, String str, int i10, int i11) {
        this.f27257a = i11;
        this.f27258b = r30Var;
        this.f27259c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f27257a) {
            case 0:
                r30 r30Var = this.f27258b;
                String str = this.f27259c;
                int i10 = this.d;
                if (r30Var.e != null) {
                    r30Var.e = null;
                    AndroidUtilities.runOnUIThread(new p30(r30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                r30 r30Var2 = this.f27258b;
                String str2 = this.f27259c;
                int i11 = this.d;
                ArrayList arrayList = null;
                r30Var2.e = null;
                if (!ChatObject.isChannel(r30Var2.f27844w.V) && r30Var2.f27844w.W != null) {
                    arrayList = new ArrayList(r30Var2.f27844w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.c9(r30Var2, str2, i11, arrayList));
                } else {
                    r30Var2.h = false;
                }
                gg.c2 c2Var = r30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(r30Var2.f27844w.V);
                if (ChatObject.isChannel(r30Var2.f27844w.V)) {
                    j3 = r30Var2.f27844w.V.f18336id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}
