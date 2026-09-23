package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f24204a;
    public final i8 f24205b;
    public final String f24206c;

    public g8(i8 i8Var, String str, int i10) {
        this.f24204a = i10;
        this.f24205b = i8Var;
        this.f24206c = str;
    }

    @Override
    public final void run() {
        switch (this.f24204a) {
            case 0:
                i8 i8Var = this.f24205b;
                String str = this.f24206c;
                i8Var.f24897f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f24205b;
                String str2 = this.f24206c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f24898n.f25192x0)));
                return;
        }
    }
}
