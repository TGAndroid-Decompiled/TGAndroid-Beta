package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fk0 implements Runnable {
    public final int f34272a;
    public final gk0 f34273b;
    public final String f34274c;

    public fk0(gk0 gk0Var, String str, int i10) {
        this.f34272a = i10;
        this.f34273b = gk0Var;
        this.f34274c = str;
    }

    @Override
    public final void run() {
        switch (this.f34272a) {
            case 0:
                gk0 gk0Var = this.f34273b;
                String str = this.f34274c;
                gk0Var.getClass();
                AndroidUtilities.runOnUIThread(new fk0(gk0Var, str, 1));
                return;
            default:
                gk0 gk0Var2 = this.f34273b;
                String str2 = this.f34274c;
                tf.k1 k1Var = gk0Var2.h;
                int i10 = gk0Var2.f34638n.f31668s;
                boolean z4 = true;
                k1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new hf0(gk0Var2, str2, new ArrayList(gk0Var2.f34638n.f31669w), 8));
                return;
        }
    }
}
