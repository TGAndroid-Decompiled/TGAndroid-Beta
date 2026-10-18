package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h8 implements Runnable {
    public final int f26797a;
    public final j8 f26798b;
    public final String f26799c;

    public h8(j8 j8Var, String str, int i10) {
        this.f26797a = i10;
        this.f26798b = j8Var;
        this.f26799c = str;
    }

    @Override
    public final void run() {
        switch (this.f26797a) {
            case 0:
                j8 j8Var = this.f26798b;
                String str = this.f26799c;
                j8Var.f27446f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                return;
            default:
                j8 j8Var2 = this.f26798b;
                String str2 = this.f26799c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.f27447n.f27801x0)));
                return;
        }
    }
}
