package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class kk0 implements Runnable {
    public final int f40956a;
    public final lk0 f40957b;
    public final String f40958c;

    public kk0(lk0 lk0Var, String str, int i10) {
        this.f40956a = i10;
        this.f40957b = lk0Var;
        this.f40958c = str;
    }

    @Override
    public final void run() {
        switch (this.f40956a) {
            case 0:
                lk0 lk0Var = this.f40957b;
                String str = this.f40958c;
                lk0Var.getClass();
                AndroidUtilities.runOnUIThread(new kk0(lk0Var, str, 1));
                return;
            default:
                lk0 lk0Var2 = this.f40957b;
                String str2 = this.f40958c;
                ig.a2 a2Var = lk0Var2.h;
                int i10 = lk0Var2.f41292n.f35576s;
                boolean z10 = true;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new oe0(lk0Var2, str2, new ArrayList(lk0Var2.f41292n.f35577w), 11));
                return;
        }
    }
}
