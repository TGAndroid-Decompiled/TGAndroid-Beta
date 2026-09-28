package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f24445a;
    public final i8 f24446b;
    public final String f24447c;

    public g8(i8 i8Var, String str, int i10) {
        this.f24445a = i10;
        this.f24446b = i8Var;
        this.f24447c = str;
    }

    @Override
    public final void run() {
        switch (this.f24445a) {
            case 0:
                i8 i8Var = this.f24446b;
                String str = this.f24447c;
                i8Var.f25022f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f24446b;
                String str2 = this.f24447c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f25023n.f25359x0)));
                return;
        }
    }
}
