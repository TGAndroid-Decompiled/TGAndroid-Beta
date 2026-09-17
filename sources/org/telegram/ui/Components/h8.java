package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h8 implements Runnable {
    public final int f26627a;
    public final j8 f26628b;
    public final String f26629c;

    public h8(j8 j8Var, String str, int i10) {
        this.f26627a = i10;
        this.f26628b = j8Var;
        this.f26629c = str;
    }

    @Override
    public final void run() {
        switch (this.f26627a) {
            case 0:
                j8 j8Var = this.f26628b;
                String str = this.f26629c;
                j8Var.f27376f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                return;
            default:
                j8 j8Var2 = this.f26628b;
                String str2 = this.f26629c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.f27377n.f27745x0)));
                return;
        }
    }
}
