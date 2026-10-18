package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class bk0 implements Runnable {
    public final int f35724a;
    public final ck0 f35725b;
    public final String f35726c;

    public bk0(ck0 ck0Var, String str, int i10) {
        this.f35724a = i10;
        this.f35725b = ck0Var;
        this.f35726c = str;
    }

    @Override
    public final void run() {
        switch (this.f35724a) {
            case 0:
                ck0 ck0Var = this.f35725b;
                String str = this.f35726c;
                ck0Var.getClass();
                AndroidUtilities.runOnUIThread(new bk0(ck0Var, str, 1));
                return;
            default:
                ck0 ck0Var2 = this.f35725b;
                String str2 = this.f35726c;
                hg.a2 a2Var = ck0Var2.h;
                int i10 = ck0Var2.f35966n.f33206s;
                boolean z10 = true;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new xe0(ck0Var2, str2, new ArrayList(ck0Var2.f35966n.f33207w), 9));
                return;
        }
    }
}
