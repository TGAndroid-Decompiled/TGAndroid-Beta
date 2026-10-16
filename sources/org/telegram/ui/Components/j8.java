package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class j8 implements Runnable {
    public final int f25916a;
    public final l8 f25917b;
    public final String f25918c;

    public j8(l8 l8Var, String str, int i10) {
        this.f25916a = i10;
        this.f25917b = l8Var;
        this.f25918c = str;
    }

    @Override
    public final void run() {
        switch (this.f25916a) {
            case 0:
                l8 l8Var = this.f25917b;
                String str = this.f25918c;
                l8Var.f26635f = null;
                AndroidUtilities.runOnUIThread(new j8(l8Var, str, 1));
                return;
            default:
                l8 l8Var2 = this.f25917b;
                String str2 = this.f25918c;
                l8Var2.getClass();
                Utilities.searchQueue.postRunnable(new k8(l8Var2, str2, new ArrayList(l8Var2.f26636n.f26997x0)));
                return;
        }
    }
}
