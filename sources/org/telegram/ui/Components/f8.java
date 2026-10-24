package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f8 implements Runnable {
    public final int f26218a;
    public final h8 f26219b;
    public final String f26220c;

    public f8(h8 h8Var, String str, int i10) {
        this.f26218a = i10;
        this.f26219b = h8Var;
        this.f26220c = str;
    }

    @Override
    public final void run() {
        switch (this.f26218a) {
            case 0:
                h8 h8Var = this.f26219b;
                String str = this.f26220c;
                h8Var.f26896f = null;
                AndroidUtilities.runOnUIThread(new f8(h8Var, str, 1));
                return;
            default:
                h8 h8Var2 = this.f26219b;
                String str2 = this.f26220c;
                h8Var2.getClass();
                Utilities.searchQueue.postRunnable(new g8(h8Var2, str2, new ArrayList(h8Var2.f26897n.f27353w0)));
                return;
        }
    }
}
