package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f23264a;
    public final i8 f23265b;
    public final String f23266c;

    public g8(i8 i8Var, String str, int i10) {
        this.f23264a = i10;
        this.f23265b = i8Var;
        this.f23266c = str;
    }

    @Override
    public final void run() {
        switch (this.f23264a) {
            case 0:
                i8 i8Var = this.f23265b;
                String str = this.f23266c;
                i8Var.f23922f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f23265b;
                String str2 = this.f23266c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f23923n.f24306x0)));
                return;
        }
    }
}
