package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f26712a;
    public final i8 f26713b;
    public final String f26714c;

    public g8(i8 i8Var, String str, int i10) {
        this.f26712a = i10;
        this.f26713b = i8Var;
        this.f26714c = str;
    }

    @Override
    public final void run() {
        switch (this.f26712a) {
            case 0:
                i8 i8Var = this.f26713b;
                String str = this.f26714c;
                i8Var.f27329f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f26713b;
                String str2 = this.f26714c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f27330n.f27653x0)));
                return;
        }
    }
}
