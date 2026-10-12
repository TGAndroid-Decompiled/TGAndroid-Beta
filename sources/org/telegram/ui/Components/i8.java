package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i8 implements Runnable {
    public final int f27085a;
    public final k8 f27086b;
    public final String f27087c;

    public i8(k8 k8Var, String str, int i10) {
        this.f27085a = i10;
        this.f27086b = k8Var;
        this.f27087c = str;
    }

    @Override
    public final void run() {
        switch (this.f27085a) {
            case 0:
                k8 k8Var = this.f27086b;
                String str = this.f27087c;
                k8Var.f27778f = null;
                AndroidUtilities.runOnUIThread(new i8(k8Var, str, 1));
                return;
            default:
                k8 k8Var2 = this.f27086b;
                String str2 = this.f27087c;
                k8Var2.getClass();
                Utilities.searchQueue.postRunnable(new j8(k8Var2, str2, new ArrayList(k8Var2.f27779n.f28099x0)));
                return;
        }
    }
}
