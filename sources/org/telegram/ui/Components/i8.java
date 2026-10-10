package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i8 implements Runnable {
    public final int f27264a;
    public final k8 f27265b;
    public final String f27266c;

    public i8(k8 k8Var, String str, int i10) {
        this.f27264a = i10;
        this.f27265b = k8Var;
        this.f27266c = str;
    }

    @Override
    public final void run() {
        switch (this.f27264a) {
            case 0:
                k8 k8Var = this.f27265b;
                String str = this.f27266c;
                k8Var.f27926f = null;
                AndroidUtilities.runOnUIThread(new i8(k8Var, str, 1));
                return;
            default:
                k8 k8Var2 = this.f27265b;
                String str2 = this.f27266c;
                k8Var2.getClass();
                Utilities.searchQueue.postRunnable(new j8(k8Var2, str2, new ArrayList(k8Var2.f27927n.f28220x0)));
                return;
        }
    }
}
