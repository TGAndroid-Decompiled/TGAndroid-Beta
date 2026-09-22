package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f8 implements Runnable {
    public final int f24129a;
    public final h8 f24130b;
    public final String f24131c;

    public f8(h8 h8Var, String str, int i10) {
        this.f24129a = i10;
        this.f24130b = h8Var;
        this.f24131c = str;
    }

    @Override
    public final void run() {
        switch (this.f24129a) {
            case 0:
                h8 h8Var = this.f24130b;
                String str = this.f24131c;
                h8Var.f24709f = null;
                AndroidUtilities.runOnUIThread(new f8(h8Var, str, 1));
                return;
            default:
                h8 h8Var2 = this.f24130b;
                String str2 = this.f24131c;
                h8Var2.getClass();
                Utilities.searchQueue.postRunnable(new g8(h8Var2, str2, new ArrayList(h8Var2.f24710n.f25027x0)));
                return;
        }
    }
}
