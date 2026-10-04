package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class s30 implements Runnable {
    public final int f30609a;
    public final u30 f30610b;
    public final String f30611c;
    public final int d;

    public s30(u30 u30Var, String str, int i10, int i11) {
        this.f30609a = i11;
        this.f30610b = u30Var;
        this.f30611c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f30609a) {
            case 0:
                u30 u30Var = this.f30610b;
                String str = this.f30611c;
                int i10 = this.d;
                if (u30Var.f31267e != null) {
                    u30Var.f31267e = null;
                    AndroidUtilities.runOnUIThread(new s30(u30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                u30 u30Var2 = this.f30610b;
                String str2 = this.f30611c;
                int i11 = this.d;
                ArrayList arrayList = null;
                u30Var2.f31267e = null;
                if (!ChatObject.isChannel(u30Var2.f31272w.V) && u30Var2.f31272w.W != null) {
                    arrayList = new ArrayList(u30Var2.f31272w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.c9(u30Var2, str2, i11, arrayList));
                } else {
                    u30Var2.h = false;
                }
                gg.c2 c2Var = u30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(u30Var2.f31272w.V);
                if (ChatObject.isChannel(u30Var2.f31272w.V)) {
                    j3 = u30Var2.f31272w.V.f20037id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}
