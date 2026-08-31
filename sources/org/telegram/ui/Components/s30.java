package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class s30 implements Runnable {
    public final int f30973a;
    public final u30 f30974b;
    public final String f30975c;
    public final int d;

    public s30(u30 u30Var, String str, int i10, int i11) {
        this.f30973a = i11;
        this.f30974b = u30Var;
        this.f30975c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f30973a) {
            case 0:
                u30 u30Var = this.f30974b;
                String str = this.f30975c;
                int i10 = this.d;
                if (u30Var.f31537e != null) {
                    u30Var.f31537e = null;
                    AndroidUtilities.runOnUIThread(new s30(u30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                u30 u30Var2 = this.f30974b;
                String str2 = this.f30975c;
                int i11 = this.d;
                ArrayList arrayList = null;
                u30Var2.f31537e = null;
                if (!ChatObject.isChannel(u30Var2.f31542w.S) && u30Var2.f31542w.T != null) {
                    arrayList = new ArrayList(u30Var2.f31542w.T.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new dg.u1(u30Var2, str2, i11, arrayList2, 18));
                } else {
                    u30Var2.h = false;
                }
                uf.k1 k1Var = u30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(u30Var2.f31542w.S);
                if (ChatObject.isChannel(u30Var2.f31542w.S)) {
                    j10 = u30Var2.f31542w.S.f20843id;
                } else {
                    j10 = 0;
                }
                k1Var.g(str2, canAddUsers, false, true, false, j10, false, 2, i11);
                return;
        }
    }
}
