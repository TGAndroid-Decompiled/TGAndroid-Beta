package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class i40 implements Runnable {
    public final int f27033a;
    public final k40 f27034b;
    public final String f27035c;
    public final int d;

    public i40(k40 k40Var, String str, int i10, int i11) {
        this.f27033a = i11;
        this.f27034b = k40Var;
        this.f27035c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f27033a) {
            case 0:
                k40 k40Var = this.f27034b;
                String str = this.f27035c;
                int i10 = this.d;
                if (k40Var.f27752e != null) {
                    k40Var.f27752e = null;
                    AndroidUtilities.runOnUIThread(new i40(k40Var, str, i10, 1));
                    return;
                }
                return;
            default:
                k40 k40Var2 = this.f27034b;
                String str2 = this.f27035c;
                int i11 = this.d;
                ArrayList arrayList = null;
                k40Var2.f27752e = null;
                if (!ChatObject.isChannel(k40Var2.f27757w.V) && k40Var2.f27757w.W != null) {
                    arrayList = new ArrayList(k40Var2.f27757w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.d9(k40Var2, str2, i11, arrayList));
                } else {
                    k40Var2.h = false;
                }
                gg.b2 b2Var = k40Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(k40Var2.f27757w.V);
                if (ChatObject.isChannel(k40Var2.f27757w.V)) {
                    j3 = k40Var2.f27757w.V.f19803id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}
