package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class s30 implements Runnable {
    public final int f28183a;
    public final u30 f28184b;
    public final String f28185c;
    public final int d;

    public s30(u30 u30Var, String str, int i10, int i11) {
        this.f28183a = i11;
        this.f28184b = u30Var;
        this.f28185c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f28183a) {
            case 0:
                u30 u30Var = this.f28184b;
                String str = this.f28185c;
                int i10 = this.d;
                if (u30Var.e != null) {
                    u30Var.e = null;
                    AndroidUtilities.runOnUIThread(new s30(u30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                u30 u30Var2 = this.f28184b;
                String str2 = this.f28185c;
                int i11 = this.d;
                ArrayList arrayList = null;
                u30Var2.e = null;
                if (!ChatObject.isChannel(u30Var2.f28730w.V) && u30Var2.f28730w.W != null) {
                    arrayList = new ArrayList(u30Var2.f28730w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.c9(u30Var2, str2, i11, arrayList));
                } else {
                    u30Var2.h = false;
                }
                gg.c2 c2Var = u30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(u30Var2.f28730w.V);
                if (ChatObject.isChannel(u30Var2.f28730w.V)) {
                    j3 = u30Var2.f28730w.V.f18352id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}
