package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e8 implements Runnable {
    public final int f23508a;
    public final g8 f23509b;
    public final String f23510c;

    public e8(g8 g8Var, String str, int i10) {
        this.f23508a = i10;
        this.f23509b = g8Var;
        this.f23510c = str;
    }

    @Override
    public final void run() {
        switch (this.f23508a) {
            case 0:
                g8 g8Var = this.f23509b;
                String str = this.f23510c;
                g8Var.f24113f = null;
                AndroidUtilities.runOnUIThread(new e8(g8Var, str, 1));
                return;
            default:
                g8 g8Var2 = this.f23509b;
                String str2 = this.f23510c;
                g8Var2.getClass();
                Utilities.searchQueue.postRunnable(new f8(g8Var2, str2, new ArrayList(g8Var2.f24114n.f24576x0)));
                return;
        }
    }
}
