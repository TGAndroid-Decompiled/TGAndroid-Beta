package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class zt0 implements Runnable {
    public final int f30982a;
    public final au0 f30983b;
    public final String f30984c;

    public zt0(au0 au0Var, String str, int i10) {
        this.f30982a = i10;
        this.f30983b = au0Var;
        this.f30984c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f30982a) {
            case 0:
                au0 au0Var = this.f30983b;
                String str = this.f30984c;
                au0Var.getClass();
                AndroidUtilities.runOnUIThread(new zt0(au0Var, str, 1));
                return;
            default:
                au0 au0Var2 = this.f30983b;
                String str2 = this.f30984c;
                ArrayList arrayList = null;
                au0Var2.f22772f = null;
                if (!ChatObject.isChannel(au0Var2.f22773n) && au0Var2.f22775s.f25522d1 != null) {
                    arrayList = new ArrayList(au0Var2.f22775s.f25522d1.participants.participants);
                }
                au0Var2.f22774r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new cn0((Object) au0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    au0Var2.f22774r = 1;
                }
                gg.c2 c2Var = au0Var2.e;
                if (ChatObject.isChannel(au0Var2.f22773n)) {
                    j3 = au0Var2.f22773n.f18336id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
