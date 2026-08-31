package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z7 implements Runnable {
    public final int f33775a;
    public final b8 f33776b;
    public final String f33777c;

    public z7(b8 b8Var, String str, int i10) {
        this.f33775a = i10;
        this.f33776b = b8Var;
        this.f33777c = str;
    }

    @Override
    public final void run() {
        switch (this.f33775a) {
            case 0:
                b8 b8Var = this.f33776b;
                String str = this.f33777c;
                b8Var.f25515f = null;
                AndroidUtilities.runOnUIThread(new z7(b8Var, str, 1));
                return;
            default:
                b8 b8Var2 = this.f33776b;
                String str2 = this.f33777c;
                b8Var2.getClass();
                Utilities.searchQueue.postRunnable(new a8(b8Var2, str2, new ArrayList(b8Var2.f25516n.f25853u0)));
                return;
        }
    }
}
