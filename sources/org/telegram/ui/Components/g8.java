package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f24435a;
    public final i8 f24436b;
    public final String f24437c;

    public g8(i8 i8Var, String str, int i10) {
        this.f24435a = i10;
        this.f24436b = i8Var;
        this.f24437c = str;
    }

    @Override
    public final void run() {
        switch (this.f24435a) {
            case 0:
                i8 i8Var = this.f24436b;
                String str = this.f24437c;
                i8Var.f25002f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f24436b;
                String str2 = this.f24437c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f25003n.f25339x0)));
                return;
        }
    }
}
