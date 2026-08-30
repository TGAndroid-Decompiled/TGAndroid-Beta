package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class q30 implements Runnable {
    public final int f28046a;
    public final s30 f28047b;
    public final String f28048c;
    public final int d;

    public q30(s30 s30Var, String str, int i10, int i11) {
        this.f28046a = i11;
        this.f28047b = s30Var;
        this.f28048c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f28046a) {
            case 0:
                s30 s30Var = this.f28047b;
                String str = this.f28048c;
                int i10 = this.d;
                if (s30Var.e != null) {
                    s30Var.e = null;
                    AndroidUtilities.runOnUIThread(new q30(s30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                s30 s30Var2 = this.f28047b;
                String str2 = this.f28048c;
                int i11 = this.d;
                ArrayList arrayList = null;
                s30Var2.e = null;
                if (!ChatObject.isChannel(s30Var2.f28625w.S) && s30Var2.f28625w.T != null) {
                    arrayList = new ArrayList(s30Var2.f28625w.T.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new cg.v1(s30Var2, str2, i11, arrayList2, 18));
                } else {
                    s30Var2.h = false;
                }
                tf.k1 k1Var = s30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(s30Var2.f28625w.S);
                if (ChatObject.isChannel(s30Var2.f28625w.S)) {
                    j10 = s30Var2.f28625w.S.f19184id;
                } else {
                    j10 = 0;
                }
                k1Var.g(str2, canAddUsers, false, true, false, j10, false, 2, i11);
                return;
        }
    }
}
