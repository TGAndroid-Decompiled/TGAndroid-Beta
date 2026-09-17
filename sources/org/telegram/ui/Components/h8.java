package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h8 implements Runnable {
    public final int f26654a;
    public final j8 f26655b;
    public final String f26656c;

    public h8(j8 j8Var, String str, int i10) {
        this.f26654a = i10;
        this.f26655b = j8Var;
        this.f26656c = str;
    }

    @Override
    public final void run() {
        switch (this.f26654a) {
            case 0:
                j8 j8Var = this.f26655b;
                String str = this.f26656c;
                j8Var.f27403f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                return;
            default:
                j8 j8Var2 = this.f26655b;
                String str2 = this.f26656c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.f27404n.f27772x0)));
                return;
        }
    }
}
