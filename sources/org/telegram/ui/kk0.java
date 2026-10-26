package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class kk0 implements Runnable {
    public final int f40959a;
    public final lk0 f40960b;
    public final String f40961c;

    public kk0(lk0 lk0Var, String str, int i10) {
        this.f40959a = i10;
        this.f40960b = lk0Var;
        this.f40961c = str;
    }

    @Override
    public final void run() {
        switch (this.f40959a) {
            case 0:
                lk0 lk0Var = this.f40960b;
                String str = this.f40961c;
                lk0Var.getClass();
                AndroidUtilities.runOnUIThread(new kk0(lk0Var, str, 1));
                return;
            default:
                lk0 lk0Var2 = this.f40960b;
                String str2 = this.f40961c;
                ig.a2 a2Var = lk0Var2.h;
                int i10 = lk0Var2.f41295n.f35579s;
                boolean z10 = true;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new oe0(lk0Var2, str2, new ArrayList(lk0Var2.f41295n.f35580w), 11));
                return;
        }
    }
}
