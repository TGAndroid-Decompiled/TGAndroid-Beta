package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qk0 implements Runnable {
    public final int f41184a;
    public final rk0 f41185b;
    public final String f41186c;

    public qk0(rk0 rk0Var, String str, int i10) {
        this.f41184a = i10;
        this.f41185b = rk0Var;
        this.f41186c = str;
    }

    @Override
    public final void run() {
        switch (this.f41184a) {
            case 0:
                rk0 rk0Var = this.f41185b;
                String str = this.f41186c;
                rk0Var.getClass();
                AndroidUtilities.runOnUIThread(new qk0(rk0Var, str, 1));
                return;
            default:
                rk0 rk0Var2 = this.f41185b;
                String str2 = this.f41186c;
                gg.b2 b2Var = rk0Var2.h;
                int i10 = rk0Var2.f41497n.f33872s;
                boolean z10 = true;
                b2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new of0(rk0Var2, str2, new ArrayList(rk0Var2.f41497n.f33873w), 8));
                return;
        }
    }
}
