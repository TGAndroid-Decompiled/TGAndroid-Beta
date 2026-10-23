package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h8 implements Runnable {
    public final int f26808a;
    public final j8 f26809b;
    public final String f26810c;

    public h8(j8 j8Var, String str, int i10) {
        this.f26808a = i10;
        this.f26809b = j8Var;
        this.f26810c = str;
    }

    @Override
    public final void run() {
        switch (this.f26808a) {
            case 0:
                j8 j8Var = this.f26809b;
                String str = this.f26810c;
                j8Var.f27427f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                return;
            default:
                j8 j8Var2 = this.f26809b;
                String str2 = this.f26810c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.f27428n.f27809x0)));
                return;
        }
    }
}
