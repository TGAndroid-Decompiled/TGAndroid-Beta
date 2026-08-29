package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class d8 implements Runnable {
    public final int f27700a;
    public final f8 f27701b;
    public final String f27702c;

    public d8(f8 f8Var, String str, int i10) {
        this.f27700a = i10;
        this.f27701b = f8Var;
        this.f27702c = str;
    }

    @Override
    public final void run() {
        switch (this.f27700a) {
            case 0:
                f8 f8Var = this.f27701b;
                String str = this.f27702c;
                f8Var.f28347f = null;
                AndroidUtilities.runOnUIThread(new d8(f8Var, str, 1));
                return;
            default:
                f8 f8Var2 = this.f27701b;
                String str2 = this.f27702c;
                f8Var2.getClass();
                Utilities.searchQueue.postRunnable(new e8(f8Var2, str2, new ArrayList(f8Var2.f28348n.f28801t0)));
                return;
        }
    }
}
