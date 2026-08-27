package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class y7 implements Runnable {

    public final int f34830a;

    public final a8 f34831b;

    public final String f34832c;

    public y7(a8 a8Var, String str, int i10) {
        this.f34830a = i10;
        this.f34831b = a8Var;
        this.f34832c = str;
    }

    @Override
    public final void run() {
        switch (this.f34830a) {
            case 0:
                a8 a8Var = this.f34831b;
                String str = this.f34832c;
                a8Var.f26656f = null;
                AndroidUtilities.runOnUIThread(new y7(a8Var, str, 1));
                break;
            default:
                a8 a8Var2 = this.f34831b;
                String str2 = this.f34832c;
                a8Var2.getClass();
                Utilities.searchQueue.postRunnable(new z7(a8Var2, str2, new ArrayList(a8Var2.f26657n.f27035t0)));
                break;
        }
    }
}
