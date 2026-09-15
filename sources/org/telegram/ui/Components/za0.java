package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class za0 implements Runnable {
    public final int f30534a;
    public final pb0 f30535b;
    public final Context f30536c;

    public za0(pb0 pb0Var, Context context, int i10) {
        this.f30534a = i10;
        this.f30535b = pb0Var;
        this.f30536c = context;
    }

    @Override
    public final void run() {
        switch (this.f30534a) {
            case 0:
                pb0 pb0Var = this.f30535b;
                pb0Var.f27001c0.a(false);
                AndroidUtilities.runOnUIThread(new za0(pb0Var, this.f30536c, 1));
                return;
            default:
                Context context = this.f30536c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f30535b.f27001c0.F).show();
                    return;
                }
                return;
        }
    }
}
