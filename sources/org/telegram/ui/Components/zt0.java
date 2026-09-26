package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class zt0 implements Runnable {
    public final int f30981a;
    public final au0 f30982b;
    public final String f30983c;

    public zt0(au0 au0Var, String str, int i10) {
        this.f30981a = i10;
        this.f30982b = au0Var;
        this.f30983c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f30981a) {
            case 0:
                au0 au0Var = this.f30982b;
                String str = this.f30983c;
                au0Var.getClass();
                AndroidUtilities.runOnUIThread(new zt0(au0Var, str, 1));
                return;
            default:
                au0 au0Var2 = this.f30982b;
                String str2 = this.f30983c;
                ArrayList arrayList = null;
                au0Var2.f22771f = null;
                if (!ChatObject.isChannel(au0Var2.f22772n) && au0Var2.f22774s.f25521d1 != null) {
                    arrayList = new ArrayList(au0Var2.f22774s.f25521d1.participants.participants);
                }
                au0Var2.f22773r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new cn0((Object) au0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    au0Var2.f22773r = 1;
                }
                gg.c2 c2Var = au0Var2.e;
                if (ChatObject.isChannel(au0Var2.f22772n)) {
                    j3 = au0Var2.f22772n.f18335id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
