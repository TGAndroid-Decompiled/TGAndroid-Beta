package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f24369a;
    public final i8 f24370b;
    public final String f24371c;

    public g8(i8 i8Var, String str, int i10) {
        this.f24369a = i10;
        this.f24370b = i8Var;
        this.f24371c = str;
    }

    @Override
    public final void run() {
        switch (this.f24369a) {
            case 0:
                i8 i8Var = this.f24370b;
                String str = this.f24371c;
                i8Var.f24943f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f24370b;
                String str2 = this.f24371c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f24944n.f25306x0)));
                return;
        }
    }
}
