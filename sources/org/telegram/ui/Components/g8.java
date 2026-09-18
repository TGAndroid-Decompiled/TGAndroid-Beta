package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f24329a;
    public final i8 f24330b;
    public final String f24331c;

    public g8(i8 i8Var, String str, int i10) {
        this.f24329a = i10;
        this.f24330b = i8Var;
        this.f24331c = str;
    }

    @Override
    public final void run() {
        switch (this.f24329a) {
            case 0:
                i8 i8Var = this.f24330b;
                String str = this.f24331c;
                i8Var.f24866f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f24330b;
                String str2 = this.f24331c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f24867n.f25230x0)));
                return;
        }
    }
}
