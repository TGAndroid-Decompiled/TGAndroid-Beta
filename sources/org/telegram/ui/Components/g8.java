package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f24446a;
    public final i8 f24447b;
    public final String f24448c;

    public g8(i8 i8Var, String str, int i10) {
        this.f24446a = i10;
        this.f24447b = i8Var;
        this.f24448c = str;
    }

    @Override
    public final void run() {
        switch (this.f24446a) {
            case 0:
                i8 i8Var = this.f24447b;
                String str = this.f24448c;
                i8Var.f25023f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f24447b;
                String str2 = this.f24448c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f25024n.f25360x0)));
                return;
        }
    }
}
