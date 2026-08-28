package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ak0 implements Runnable {
    public final int f36514a;
    public final bk0 f36515b;
    public final String f36516c;

    public ak0(bk0 bk0Var, String str, int i9) {
        this.f36514a = i9;
        this.f36515b = bk0Var;
        this.f36516c = str;
    }

    @Override
    public final void run() {
        switch (this.f36514a) {
            case 0:
                bk0 bk0Var = this.f36515b;
                String str = this.f36516c;
                bk0Var.getClass();
                AndroidUtilities.runOnUIThread(new ak0(bk0Var, str, 1));
                return;
            default:
                bk0 bk0Var2 = this.f36515b;
                String str2 = this.f36516c;
                of.v1 v1Var = bk0Var2.h;
                int i9 = bk0Var2.f36899n.f35550s;
                boolean z10 = true;
                v1Var.g(str2, true, (i9 == 1 || i9 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new ye0(bk0Var2, str2, new ArrayList(bk0Var2.f36899n.f35551w), 8));
                return;
        }
    }
}
