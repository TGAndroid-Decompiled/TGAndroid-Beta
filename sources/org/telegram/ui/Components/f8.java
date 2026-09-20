package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f8 implements Runnable {
    public final int f24024a;
    public final h8 f24025b;
    public final String f24026c;

    public f8(h8 h8Var, String str, int i10) {
        this.f24024a = i10;
        this.f24025b = h8Var;
        this.f24026c = str;
    }

    @Override
    public final void run() {
        switch (this.f24024a) {
            case 0:
                h8 h8Var = this.f24025b;
                String str = this.f24026c;
                h8Var.f24564f = null;
                AndroidUtilities.runOnUIThread(new f8(h8Var, str, 1));
                return;
            default:
                h8 h8Var2 = this.f24025b;
                String str2 = this.f24026c;
                h8Var2.getClass();
                Utilities.searchQueue.postRunnable(new g8(h8Var2, str2, new ArrayList(h8Var2.f24565n.f24939x0)));
                return;
        }
    }
}
