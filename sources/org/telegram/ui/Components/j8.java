package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class j8 implements Runnable {
    public final int f26234a;
    public final l8 f26235b;
    public final String f26236c;

    public j8(l8 l8Var, String str, int i10) {
        this.f26234a = i10;
        this.f26235b = l8Var;
        this.f26236c = str;
    }

    @Override
    public final void run() {
        switch (this.f26234a) {
            case 0:
                l8 l8Var = this.f26235b;
                String str = this.f26236c;
                l8Var.f26974f = null;
                AndroidUtilities.runOnUIThread(new j8(l8Var, str, 1));
                return;
            default:
                l8 l8Var2 = this.f26235b;
                String str2 = this.f26236c;
                l8Var2.getClass();
                Utilities.searchQueue.postRunnable(new k8(l8Var2, str2, new ArrayList(l8Var2.f26975n.f27263x0)));
                return;
        }
    }
}
