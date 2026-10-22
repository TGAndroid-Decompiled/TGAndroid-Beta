package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ku0 implements Runnable {
    public final int f27952a;
    public final lu0 f27953b;
    public final String f27954c;

    public ku0(lu0 lu0Var, String str, int i10) {
        this.f27952a = i10;
        this.f27953b = lu0Var;
        this.f27954c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f27952a) {
            case 0:
                lu0 lu0Var = this.f27953b;
                String str = this.f27954c;
                lu0Var.getClass();
                AndroidUtilities.runOnUIThread(new ku0(lu0Var, str, 1));
                return;
            default:
                lu0 lu0Var2 = this.f27953b;
                String str2 = this.f27954c;
                ArrayList arrayList = null;
                lu0Var2.f28281f = null;
                if (!ChatObject.isChannel(lu0Var2.f28282n) && lu0Var2.f28284s.f31036d1 != null) {
                    arrayList = new ArrayList(lu0Var2.f28284s.f31036d1.participants.participants);
                }
                lu0Var2.f28283r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new lg((Object) lu0Var2, (Object) str2, arrayList, 24));
                } else {
                    lu0Var2.f28283r = 1;
                }
                hg.a2 a2Var = lu0Var2.e;
                if (ChatObject.isChannel(lu0Var2.f28282n)) {
                    j10 = lu0Var2.f28282n.f20279id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}
