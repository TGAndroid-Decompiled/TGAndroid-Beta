package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f24386a;
    public final i8 f24387b;
    public final String f24388c;

    public g8(i8 i8Var, String str, int i10) {
        this.f24386a = i10;
        this.f24387b = i8Var;
        this.f24388c = str;
    }

    @Override
    public final void run() {
        switch (this.f24386a) {
            case 0:
                i8 i8Var = this.f24387b;
                String str = this.f24388c;
                i8Var.f24968f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f24387b;
                String str2 = this.f24388c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f24969n.f25331x0)));
                return;
        }
    }
}
