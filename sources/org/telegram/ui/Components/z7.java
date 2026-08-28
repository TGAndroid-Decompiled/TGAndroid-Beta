package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z7 implements Runnable {
    public final int f35216a;
    public final b8 f35217b;
    public final String f35218c;

    public z7(b8 b8Var, String str, int i9) {
        this.f35216a = i9;
        this.f35217b = b8Var;
        this.f35218c = str;
    }

    @Override
    public final void run() {
        switch (this.f35216a) {
            case 0:
                b8 b8Var = this.f35217b;
                String str = this.f35218c;
                b8Var.f27069f = null;
                AndroidUtilities.runOnUIThread(new z7(b8Var, str, 1));
                return;
            default:
                b8 b8Var2 = this.f35217b;
                String str2 = this.f35218c;
                b8Var2.getClass();
                Utilities.searchQueue.postRunnable(new a8(b8Var2, str2, new ArrayList(b8Var2.f27070n.f27403t0)));
                return;
        }
    }
}
