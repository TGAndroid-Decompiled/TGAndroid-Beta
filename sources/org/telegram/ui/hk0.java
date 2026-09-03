package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class hk0 implements Runnable {
    public final int f34688a;
    public final ik0 f34689b;
    public final String f34690c;

    public hk0(ik0 ik0Var, String str, int i10) {
        this.f34688a = i10;
        this.f34689b = ik0Var;
        this.f34690c = str;
    }

    @Override
    public final void run() {
        switch (this.f34688a) {
            case 0:
                ik0 ik0Var = this.f34689b;
                String str = this.f34690c;
                ik0Var.getClass();
                AndroidUtilities.runOnUIThread(new hk0(ik0Var, str, 1));
                return;
            default:
                ik0 ik0Var2 = this.f34689b;
                String str2 = this.f34690c;
                tf.j1 j1Var = ik0Var2.h;
                int i10 = ik0Var2.f34995n.f31642s;
                boolean z4 = true;
                j1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new jf0(ik0Var2, str2, new ArrayList(ik0Var2.f34995n.f31643w), 8));
                return;
        }
    }
}
