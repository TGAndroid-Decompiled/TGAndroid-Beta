package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class za0 implements Runnable {
    public final int f30460a;
    public final pb0 f30461b;
    public final Context f30462c;

    public za0(pb0 pb0Var, Context context, int i10) {
        this.f30460a = i10;
        this.f30461b = pb0Var;
        this.f30462c = context;
    }

    @Override
    public final void run() {
        switch (this.f30460a) {
            case 0:
                pb0 pb0Var = this.f30461b;
                pb0Var.f26991c0.a(false);
                AndroidUtilities.runOnUIThread(new za0(pb0Var, this.f30462c, 1));
                return;
            default:
                Context context = this.f30462c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f30461b.f26991c0.F).show();
                    return;
                }
                return;
        }
    }
}
