package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h8 implements Runnable {
    public final int f26799a;
    public final j8 f26800b;
    public final String f26801c;

    public h8(j8 j8Var, String str, int i10) {
        this.f26799a = i10;
        this.f26800b = j8Var;
        this.f26801c = str;
    }

    @Override
    public final void run() {
        switch (this.f26799a) {
            case 0:
                j8 j8Var = this.f26800b;
                String str = this.f26801c;
                j8Var.f27444f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                return;
            default:
                j8 j8Var2 = this.f26800b;
                String str2 = this.f26801c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.f27445n.f27773x0)));
                return;
        }
    }
}
