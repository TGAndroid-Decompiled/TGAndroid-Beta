package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h8 implements Runnable {
    public final int f26804a;
    public final j8 f26805b;
    public final String f26806c;

    public h8(j8 j8Var, String str, int i10) {
        this.f26804a = i10;
        this.f26805b = j8Var;
        this.f26806c = str;
    }

    @Override
    public final void run() {
        switch (this.f26804a) {
            case 0:
                j8 j8Var = this.f26805b;
                String str = this.f26806c;
                j8Var.f27423f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                return;
            default:
                j8 j8Var2 = this.f26805b;
                String str2 = this.f26806c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.f27424n.f27805x0)));
                return;
        }
    }
}
