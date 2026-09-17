package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class za0 implements Runnable {
    public final int f30457a;
    public final pb0 f30458b;
    public final Context f30459c;

    public za0(pb0 pb0Var, Context context, int i10) {
        this.f30457a = i10;
        this.f30458b = pb0Var;
        this.f30459c = context;
    }

    @Override
    public final void run() {
        switch (this.f30457a) {
            case 0:
                pb0 pb0Var = this.f30458b;
                pb0Var.f26988c0.a(false);
                AndroidUtilities.runOnUIThread(new za0(pb0Var, this.f30459c, 1));
                return;
            default:
                Context context = this.f30459c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f30458b.f26988c0.F).show();
                    return;
                }
                return;
        }
    }
}
