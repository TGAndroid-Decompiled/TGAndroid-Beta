package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z7 implements Runnable {
    public final int f33828a;
    public final b8 f33829b;
    public final String f33830c;

    public z7(b8 b8Var, String str, int i10) {
        this.f33828a = i10;
        this.f33829b = b8Var;
        this.f33830c = str;
    }

    @Override
    public final void run() {
        switch (this.f33828a) {
            case 0:
                b8 b8Var = this.f33829b;
                String str = this.f33830c;
                b8Var.f25535f = null;
                AndroidUtilities.runOnUIThread(new z7(b8Var, str, 1));
                return;
            default:
                b8 b8Var2 = this.f33829b;
                String str2 = this.f33830c;
                b8Var2.getClass();
                Utilities.searchQueue.postRunnable(new a8(b8Var2, str2, new ArrayList(b8Var2.f25536n.f25827u0)));
                return;
        }
    }
}
