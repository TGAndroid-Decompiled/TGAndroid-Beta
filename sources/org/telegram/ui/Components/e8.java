package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e8 implements Runnable {
    public final int f23505a;
    public final g8 f23506b;
    public final String f23507c;

    public e8(g8 g8Var, String str, int i10) {
        this.f23505a = i10;
        this.f23506b = g8Var;
        this.f23507c = str;
    }

    @Override
    public final void run() {
        switch (this.f23505a) {
            case 0:
                g8 g8Var = this.f23506b;
                String str = this.f23507c;
                g8Var.f24110f = null;
                AndroidUtilities.runOnUIThread(new e8(g8Var, str, 1));
                return;
            default:
                g8 g8Var2 = this.f23506b;
                String str2 = this.f23507c;
                g8Var2.getClass();
                Utilities.searchQueue.postRunnable(new f8(g8Var2, str2, new ArrayList(g8Var2.f24111n.f24573x0)));
                return;
        }
    }
}
