package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h8 implements Runnable {
    public final int f26626a;
    public final j8 f26627b;
    public final String f26628c;

    public h8(j8 j8Var, String str, int i10) {
        this.f26626a = i10;
        this.f26627b = j8Var;
        this.f26628c = str;
    }

    @Override
    public final void run() {
        switch (this.f26626a) {
            case 0:
                j8 j8Var = this.f26627b;
                String str = this.f26628c;
                j8Var.f27375f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                return;
            default:
                j8 j8Var2 = this.f26627b;
                String str2 = this.f26628c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.f27376n.f27744x0)));
                return;
        }
    }
}
