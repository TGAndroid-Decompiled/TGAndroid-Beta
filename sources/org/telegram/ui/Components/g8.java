package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f26727a;
    public final i8 f26728b;
    public final String f26729c;

    public g8(i8 i8Var, String str, int i10) {
        this.f26727a = i10;
        this.f26728b = i8Var;
        this.f26729c = str;
    }

    @Override
    public final void run() {
        switch (this.f26727a) {
            case 0:
                i8 i8Var = this.f26728b;
                String str = this.f26729c;
                i8Var.f27420f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f26728b;
                String str2 = this.f26729c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f27421n.f27731x0)));
                return;
        }
    }
}
