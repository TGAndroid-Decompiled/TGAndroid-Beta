package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ec0 implements Runnable {
    public final int f25664a;
    public final tc0 f25665b;
    public final Context f25666c;

    public ec0(tc0 tc0Var, Context context, int i10) {
        this.f25664a = i10;
        this.f25665b = tc0Var;
        this.f25666c = context;
    }

    @Override
    public final void run() {
        switch (this.f25664a) {
            case 0:
                tc0 tc0Var = this.f25665b;
                tc0Var.f30859c0.a(false);
                AndroidUtilities.runOnUIThread(new ec0(tc0Var, this.f25666c, 1));
                return;
            default:
                Context context = this.f25666c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.f25665b.f30859c0.F).show();
                    return;
                }
                return;
        }
    }
}
