package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class lk0 implements Runnable {
    public final int f35368a;
    public final mk0 f35369b;
    public final String f35370c;

    public lk0(mk0 mk0Var, String str, int i10) {
        this.f35368a = i10;
        this.f35369b = mk0Var;
        this.f35370c = str;
    }

    @Override
    public final void run() {
        switch (this.f35368a) {
            case 0:
                mk0 mk0Var = this.f35369b;
                String str = this.f35370c;
                mk0Var.getClass();
                AndroidUtilities.runOnUIThread(new lk0(mk0Var, str, 1));
                return;
            default:
                mk0 mk0Var2 = this.f35369b;
                String str2 = this.f35370c;
                gg.c2 c2Var = mk0Var2.h;
                int i10 = mk0Var2.f35719n.f31158s;
                boolean z10 = true;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new mf0(mk0Var2, str2, new ArrayList(mk0Var2.f35719n.f31159w), 8));
                return;
        }
    }
}
