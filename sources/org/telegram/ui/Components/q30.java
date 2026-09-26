package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class q30 implements Runnable {
    public final int f27567a;
    public final s30 f27568b;
    public final String f27569c;
    public final int d;

    public q30(s30 s30Var, String str, int i10, int i11) {
        this.f27567a = i11;
        this.f27568b = s30Var;
        this.f27569c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f27567a) {
            case 0:
                s30 s30Var = this.f27568b;
                String str = this.f27569c;
                int i10 = this.d;
                if (s30Var.e != null) {
                    s30Var.e = null;
                    AndroidUtilities.runOnUIThread(new q30(s30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                s30 s30Var2 = this.f27568b;
                String str2 = this.f27569c;
                int i11 = this.d;
                ArrayList arrayList = null;
                s30Var2.e = null;
                if (!ChatObject.isChannel(s30Var2.f28130w.V) && s30Var2.f28130w.W != null) {
                    arrayList = new ArrayList(s30Var2.f28130w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.c9(s30Var2, str2, i11, arrayList));
                } else {
                    s30Var2.h = false;
                }
                gg.c2 c2Var = s30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(s30Var2.f28130w.V);
                if (ChatObject.isChannel(s30Var2.f28130w.V)) {
                    j3 = s30Var2.f28130w.V.f18335id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}
