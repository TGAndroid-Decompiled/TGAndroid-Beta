package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class bb0 implements Runnable {
    public final int f23624a;
    public final qb0 f23625b;
    public final Context f23626c;

    public bb0(qb0 qb0Var, Context context, int i10) {
        this.f23624a = i10;
        this.f23625b = qb0Var;
        this.f23626c = context;
    }

    @Override
    public final void run() {
        switch (this.f23624a) {
            case 0:
                qb0 qb0Var = this.f23625b;
                qb0Var.W.a(false);
                AndroidUtilities.runOnUIThread(new bb0(qb0Var, this.f23626c, 1));
                return;
            default:
                Context context = this.f23626c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new eg.o1(context, 43, this.f23625b.W.C).show();
                    return;
                }
                return;
        }
    }
}
