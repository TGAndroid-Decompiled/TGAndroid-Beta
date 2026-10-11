package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i8 implements Runnable {
    public final int f27354a;
    public final k8 f27355b;
    public final String f27356c;

    public i8(k8 k8Var, String str, int i10) {
        this.f27354a = i10;
        this.f27355b = k8Var;
        this.f27356c = str;
    }

    @Override
    public final void run() {
        switch (this.f27354a) {
            case 0:
                k8 k8Var = this.f27355b;
                String str = this.f27356c;
                k8Var.f27980f = null;
                AndroidUtilities.runOnUIThread(new i8(k8Var, str, 1));
                return;
            default:
                k8 k8Var2 = this.f27355b;
                String str2 = this.f27356c;
                k8Var2.getClass();
                Utilities.searchQueue.postRunnable(new j8(k8Var2, str2, new ArrayList(k8Var2.f27981n.f28259x0)));
                return;
        }
    }
}
