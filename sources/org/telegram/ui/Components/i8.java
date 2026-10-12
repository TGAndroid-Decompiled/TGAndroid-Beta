package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i8 implements Runnable {
    public final int f27070a;
    public final k8 f27071b;
    public final String f27072c;

    public i8(k8 k8Var, String str, int i10) {
        this.f27070a = i10;
        this.f27071b = k8Var;
        this.f27072c = str;
    }

    @Override
    public final void run() {
        switch (this.f27070a) {
            case 0:
                k8 k8Var = this.f27071b;
                String str = this.f27072c;
                k8Var.f27781f = null;
                AndroidUtilities.runOnUIThread(new i8(k8Var, str, 1));
                return;
            default:
                k8 k8Var2 = this.f27071b;
                String str2 = this.f27072c;
                k8Var2.getClass();
                Utilities.searchQueue.postRunnable(new j8(k8Var2, str2, new ArrayList(k8Var2.f27782n.f28084x0)));
                return;
        }
    }
}
