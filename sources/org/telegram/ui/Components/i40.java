package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class i40 implements Runnable {
    public final int f27048a;
    public final k40 f27049b;
    public final String f27050c;
    public final int d;

    public i40(k40 k40Var, String str, int i10, int i11) {
        this.f27048a = i11;
        this.f27049b = k40Var;
        this.f27050c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f27048a) {
            case 0:
                k40 k40Var = this.f27049b;
                String str = this.f27050c;
                int i10 = this.d;
                if (k40Var.f27749e != null) {
                    k40Var.f27749e = null;
                    AndroidUtilities.runOnUIThread(new i40(k40Var, str, i10, 1));
                    return;
                }
                return;
            default:
                k40 k40Var2 = this.f27049b;
                String str2 = this.f27050c;
                int i11 = this.d;
                ArrayList arrayList = null;
                k40Var2.f27749e = null;
                if (!ChatObject.isChannel(k40Var2.f27754w.V) && k40Var2.f27754w.W != null) {
                    arrayList = new ArrayList(k40Var2.f27754w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.d9(k40Var2, str2, i11, arrayList));
                } else {
                    k40Var2.h = false;
                }
                gg.b2 b2Var = k40Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(k40Var2.f27754w.V);
                if (ChatObject.isChannel(k40Var2.f27754w.V)) {
                    j3 = k40Var2.f27754w.V.f19802id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}
