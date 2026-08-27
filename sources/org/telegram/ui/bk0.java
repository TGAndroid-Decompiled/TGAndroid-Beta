package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class bk0 implements Runnable {

    public final int f36847a;

    public final ck0 f36848b;

    public final String f36849c;

    public bk0(ck0 ck0Var, String str, int i10) {
        this.f36847a = i10;
        this.f36848b = ck0Var;
        this.f36849c = str;
    }

    @Override
    public final void run() {
        switch (this.f36847a) {
            case 0:
                ck0 ck0Var = this.f36848b;
                String str = this.f36849c;
                ck0Var.getClass();
                AndroidUtilities.runOnUIThread(new bk0(ck0Var, str, 1));
                break;
            default:
                ck0 ck0Var2 = this.f36848b;
                String str2 = this.f36849c;
                pf.j1 j1Var = ck0Var2.h;
                int i10 = ck0Var2.f37111n.f35553s;
                j1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new bf0(ck0Var2, str2, new ArrayList(ck0Var2.f37111n.f35554w), 8));
                break;
        }
    }
}
