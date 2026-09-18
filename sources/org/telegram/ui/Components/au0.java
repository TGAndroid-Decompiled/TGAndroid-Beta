package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class au0 implements Runnable {
    public final int f22729a;
    public final bu0 f22730b;
    public final String f22731c;

    public au0(bu0 bu0Var, String str, int i10) {
        this.f22729a = i10;
        this.f22730b = bu0Var;
        this.f22731c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f22729a) {
            case 0:
                bu0 bu0Var = this.f22730b;
                String str = this.f22731c;
                bu0Var.getClass();
                AndroidUtilities.runOnUIThread(new au0(bu0Var, str, 1));
                return;
            default:
                bu0 bu0Var2 = this.f22730b;
                String str2 = this.f22731c;
                ArrayList arrayList = null;
                bu0Var2.f23078f = null;
                if (!ChatObject.isChannel(bu0Var2.f23079n) && bu0Var2.f23081s.f25810d1 != null) {
                    arrayList = new ArrayList(bu0Var2.f23081s.f25810d1.participants.participants);
                }
                bu0Var2.f23080r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new dn0((Object) bu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    bu0Var2.f23080r = 1;
                }
                gg.c2 c2Var = bu0Var2.e;
                if (ChatObject.isChannel(bu0Var2.f23079n)) {
                    j3 = bu0Var2.f23079n.f18296id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
