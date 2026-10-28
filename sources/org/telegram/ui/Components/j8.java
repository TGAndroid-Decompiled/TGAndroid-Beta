package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class j8 implements Runnable {
    public final int f29534a;
    public final l8 f29535b;
    public final String f29536c;

    public j8(l8 l8Var, String str, int i10) {
        this.f29534a = i10;
        this.f29535b = l8Var;
        this.f29536c = str;
    }

    @Override
    public final void run() {
        switch (this.f29534a) {
            case 0:
                l8 l8Var = this.f29535b;
                String str = this.f29536c;
                l8Var.f30135f = null;
                AndroidUtilities.runOnUIThread(new j8(l8Var, str, 1));
                return;
            default:
                l8 l8Var2 = this.f29535b;
                String str2 = this.f29536c;
                l8Var2.getClass();
                Utilities.searchQueue.postRunnable(new k8(l8Var2, str2, new ArrayList(l8Var2.f30136n.f30457w0)));
                return;
        }
    }
}
