package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ib0 implements Runnable {
    public final int f24898a;
    public final yb0 f24899b;
    public final Context f24900c;

    public ib0(yb0 yb0Var, Context context, int i10) {
        this.f24898a = i10;
        this.f24899b = yb0Var;
        this.f24900c = context;
    }

    @Override
    public final void run() {
        switch (this.f24898a) {
            case 0:
                yb0 yb0Var = this.f24899b;
                yb0Var.f30537c0.a(false);
                AndroidUtilities.runOnUIThread(new ib0(yb0Var, this.f24900c, 1));
                return;
            default:
                Context context = this.f24900c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f24899b.f30537c0.F).show();
                    return;
                }
                return;
        }
    }
}
