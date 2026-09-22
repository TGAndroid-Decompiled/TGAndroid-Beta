package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e8 implements Runnable {
    public final int f23575a;
    public final g8 f23576b;
    public final String f23577c;

    public e8(g8 g8Var, String str, int i10) {
        this.f23575a = i10;
        this.f23576b = g8Var;
        this.f23577c = str;
    }

    @Override
    public final void run() {
        switch (this.f23575a) {
            case 0:
                g8 g8Var = this.f23576b;
                String str = this.f23577c;
                g8Var.f24244f = null;
                AndroidUtilities.runOnUIThread(new e8(g8Var, str, 1));
                return;
            default:
                g8 g8Var2 = this.f23576b;
                String str2 = this.f23577c;
                g8Var2.getClass();
                Utilities.searchQueue.postRunnable(new f8(g8Var2, str2, new ArrayList(g8Var2.f24245n.f24584x0)));
                return;
        }
    }
}
