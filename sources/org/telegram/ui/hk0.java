package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class hk0 implements Runnable {
    public final int f37405a;
    public final ik0 f37406b;
    public final String f37407c;

    public hk0(ik0 ik0Var, String str, int i10) {
        this.f37405a = i10;
        this.f37406b = ik0Var;
        this.f37407c = str;
    }

    @Override
    public final void run() {
        switch (this.f37405a) {
            case 0:
                ik0 ik0Var = this.f37406b;
                String str = this.f37407c;
                ik0Var.getClass();
                AndroidUtilities.runOnUIThread(new hk0(ik0Var, str, 1));
                return;
            default:
                ik0 ik0Var2 = this.f37406b;
                String str2 = this.f37407c;
                uf.k1 k1Var = ik0Var2.h;
                int i10 = ik0Var2.f37740n.f34191s;
                boolean z4 = true;
                k1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new if0(ik0Var2, str2, new ArrayList(ik0Var2.f37740n.f34192w), 8));
                return;
        }
    }
}
