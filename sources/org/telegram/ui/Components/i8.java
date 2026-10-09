package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i8 implements Runnable {
    public final int f27261a;
    public final k8 f27262b;
    public final String f27263c;

    public i8(k8 k8Var, String str, int i10) {
        this.f27261a = i10;
        this.f27262b = k8Var;
        this.f27263c = str;
    }

    @Override
    public final void run() {
        switch (this.f27261a) {
            case 0:
                k8 k8Var = this.f27262b;
                String str = this.f27263c;
                k8Var.f27871f = null;
                AndroidUtilities.runOnUIThread(new i8(k8Var, str, 1));
                return;
            default:
                k8 k8Var2 = this.f27262b;
                String str2 = this.f27263c;
                k8Var2.getClass();
                Utilities.searchQueue.postRunnable(new j8(k8Var2, str2, new ArrayList(k8Var2.f27872n.f28362x0)));
                return;
        }
    }
}
