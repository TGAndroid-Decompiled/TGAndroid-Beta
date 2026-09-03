package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z7 implements Runnable {
    public final int f31267a;
    public final b8 f31268b;
    public final String f31269c;

    public z7(b8 b8Var, String str, int i10) {
        this.f31267a = i10;
        this.f31268b = b8Var;
        this.f31269c = str;
    }

    @Override
    public final void run() {
        switch (this.f31267a) {
            case 0:
                b8 b8Var = this.f31268b;
                String str = this.f31269c;
                b8Var.f23577f = null;
                AndroidUtilities.runOnUIThread(new z7(b8Var, str, 1));
                return;
            default:
                b8 b8Var2 = this.f31268b;
                String str2 = this.f31269c;
                b8Var2.getClass();
                Utilities.searchQueue.postRunnable(new a8(b8Var2, str2, new ArrayList(b8Var2.f23578n.f23865u0)));
                return;
        }
    }
}
