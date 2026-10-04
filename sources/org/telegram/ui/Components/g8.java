package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f26717a;
    public final i8 f26718b;
    public final String f26719c;

    public g8(i8 i8Var, String str, int i10) {
        this.f26717a = i10;
        this.f26718b = i8Var;
        this.f26719c = str;
    }

    @Override
    public final void run() {
        switch (this.f26717a) {
            case 0:
                i8 i8Var = this.f26718b;
                String str = this.f26719c;
                i8Var.f27334f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f26718b;
                String str2 = this.f26719c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f27335n.f27658x0)));
                return;
        }
    }
}
