package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class za0 implements Runnable {
    public final int f30531a;
    public final pb0 f30532b;
    public final Context f30533c;

    public za0(pb0 pb0Var, Context context, int i10) {
        this.f30531a = i10;
        this.f30532b = pb0Var;
        this.f30533c = context;
    }

    @Override
    public final void run() {
        switch (this.f30531a) {
            case 0:
                pb0 pb0Var = this.f30532b;
                pb0Var.f26998c0.a(false);
                AndroidUtilities.runOnUIThread(new za0(pb0Var, this.f30533c, 1));
                return;
            default:
                Context context = this.f30533c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f30532b.f26998c0.F).show();
                    return;
                }
                return;
        }
    }
}
