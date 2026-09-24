package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class zt0 implements Runnable {
    public final int f30977a;
    public final au0 f30978b;
    public final String f30979c;

    public zt0(au0 au0Var, String str, int i10) {
        this.f30977a = i10;
        this.f30978b = au0Var;
        this.f30979c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f30977a) {
            case 0:
                au0 au0Var = this.f30978b;
                String str = this.f30979c;
                au0Var.getClass();
                AndroidUtilities.runOnUIThread(new zt0(au0Var, str, 1));
                return;
            default:
                au0 au0Var2 = this.f30978b;
                String str2 = this.f30979c;
                ArrayList arrayList = null;
                au0Var2.f22753f = null;
                if (!ChatObject.isChannel(au0Var2.f22754n) && au0Var2.f22756s.f25505d1 != null) {
                    arrayList = new ArrayList(au0Var2.f22756s.f25505d1.participants.participants);
                }
                au0Var2.f22755r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new cn0((Object) au0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    au0Var2.f22755r = 1;
                }
                gg.c2 c2Var = au0Var2.e;
                if (ChatObject.isChannel(au0Var2.f22754n)) {
                    j3 = au0Var2.f22754n.f18321id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
