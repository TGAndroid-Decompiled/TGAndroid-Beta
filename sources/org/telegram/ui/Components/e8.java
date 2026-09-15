package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e8 implements Runnable {
    public final int f23578a;
    public final g8 f23579b;
    public final String f23580c;

    public e8(g8 g8Var, String str, int i10) {
        this.f23578a = i10;
        this.f23579b = g8Var;
        this.f23580c = str;
    }

    @Override
    public final void run() {
        switch (this.f23578a) {
            case 0:
                g8 g8Var = this.f23579b;
                String str = this.f23580c;
                g8Var.f24247f = null;
                AndroidUtilities.runOnUIThread(new e8(g8Var, str, 1));
                return;
            default:
                g8 g8Var2 = this.f23579b;
                String str2 = this.f23580c;
                g8Var2.getClass();
                Utilities.searchQueue.postRunnable(new f8(g8Var2, str2, new ArrayList(g8Var2.f24248n.f24581x0)));
                return;
        }
    }
}
