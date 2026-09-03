package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class cb0 implements Runnable {
    public final int f23917a;
    public final rb0 f23918b;
    public final Context f23919c;

    public cb0(rb0 rb0Var, Context context, int i10) {
        this.f23917a = i10;
        this.f23918b = rb0Var;
        this.f23919c = context;
    }

    @Override
    public final void run() {
        switch (this.f23917a) {
            case 0:
                rb0 rb0Var = this.f23918b;
                rb0Var.W.a(false);
                AndroidUtilities.runOnUIThread(new cb0(rb0Var, this.f23919c, 1));
                return;
            default:
                Context context = this.f23919c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new eg.o1(context, 43, this.f23918b.W.C).show();
                    return;
                }
                return;
        }
    }
}
