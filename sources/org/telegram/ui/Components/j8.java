package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class j8 implements Runnable {
    public final int f29510a;
    public final l8 f29511b;
    public final String f29512c;

    public j8(l8 l8Var, String str, int i10) {
        this.f29510a = i10;
        this.f29511b = l8Var;
        this.f29512c = str;
    }

    @Override
    public final void run() {
        switch (this.f29510a) {
            case 0:
                l8 l8Var = this.f29511b;
                String str = this.f29512c;
                l8Var.f30099f = null;
                AndroidUtilities.runOnUIThread(new j8(l8Var, str, 1));
                return;
            default:
                l8 l8Var2 = this.f29511b;
                String str2 = this.f29512c;
                l8Var2.getClass();
                Utilities.searchQueue.postRunnable(new k8(l8Var2, str2, new ArrayList(l8Var2.f30100n.f30448w0)));
                return;
        }
    }
}
