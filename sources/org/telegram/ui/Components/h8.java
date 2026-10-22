package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h8 implements Runnable {
    public final int f26807a;
    public final j8 f26808b;
    public final String f26809c;

    public h8(j8 j8Var, String str, int i10) {
        this.f26807a = i10;
        this.f26808b = j8Var;
        this.f26809c = str;
    }

    @Override
    public final void run() {
        switch (this.f26807a) {
            case 0:
                j8 j8Var = this.f26808b;
                String str = this.f26809c;
                j8Var.f27426f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                return;
            default:
                j8 j8Var2 = this.f26808b;
                String str2 = this.f26809c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.f27427n.f27808x0)));
                return;
        }
    }
}
