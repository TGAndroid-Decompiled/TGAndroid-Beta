package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kb0 implements Runnable {
    public final int f25724a;
    public final zb0 f25725b;
    public final Context f25726c;

    public kb0(zb0 zb0Var, Context context, int i10) {
        this.f25724a = i10;
        this.f25725b = zb0Var;
        this.f25726c = context;
    }

    @Override
    public final void run() {
        switch (this.f25724a) {
            case 0:
                zb0 zb0Var = this.f25725b;
                zb0Var.f30829c0.a(false);
                AndroidUtilities.runOnUIThread(new kb0(zb0Var, this.f25726c, 1));
                return;
            default:
                Context context = this.f25726c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f25725b.f30829c0.F).show();
                    return;
                }
                return;
        }
    }
}
