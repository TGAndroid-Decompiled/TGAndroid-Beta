package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f24387a;
    public final i8 f24388b;
    public final String f24389c;

    public g8(i8 i8Var, String str, int i10) {
        this.f24387a = i10;
        this.f24388b = i8Var;
        this.f24389c = str;
    }

    @Override
    public final void run() {
        switch (this.f24387a) {
            case 0:
                i8 i8Var = this.f24388b;
                String str = this.f24389c;
                i8Var.f24969f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f24388b;
                String str2 = this.f24389c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f24970n.f25332x0)));
                return;
        }
    }
}
