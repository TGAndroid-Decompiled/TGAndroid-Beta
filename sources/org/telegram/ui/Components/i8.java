package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i8 implements Runnable {
    public final int f27206a;
    public final k8 f27207b;
    public final String f27208c;

    public i8(k8 k8Var, String str, int i10) {
        this.f27206a = i10;
        this.f27207b = k8Var;
        this.f27208c = str;
    }

    @Override
    public final void run() {
        switch (this.f27206a) {
            case 0:
                k8 k8Var = this.f27207b;
                String str = this.f27208c;
                k8Var.f27864f = null;
                AndroidUtilities.runOnUIThread(new i8(k8Var, str, 1));
                return;
            default:
                k8 k8Var2 = this.f27207b;
                String str2 = this.f27208c;
                k8Var2.getClass();
                Utilities.searchQueue.postRunnable(new j8(k8Var2, str2, new ArrayList(k8Var2.f27865n.f28227x0)));
                return;
        }
    }
}
