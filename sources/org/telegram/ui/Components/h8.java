package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h8 implements Runnable {
    public final int f26653a;
    public final j8 f26654b;
    public final String f26655c;

    public h8(j8 j8Var, String str, int i10) {
        this.f26653a = i10;
        this.f26654b = j8Var;
        this.f26655c = str;
    }

    @Override
    public final void run() {
        switch (this.f26653a) {
            case 0:
                j8 j8Var = this.f26654b;
                String str = this.f26655c;
                j8Var.f27402f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                return;
            default:
                j8 j8Var2 = this.f26654b;
                String str2 = this.f26655c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.f27403n.f27771x0)));
                return;
        }
    }
}
