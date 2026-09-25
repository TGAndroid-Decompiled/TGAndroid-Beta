package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kb0 implements Runnable {
    public final int f25743a;
    public final zb0 f25744b;
    public final Context f25745c;

    public kb0(zb0 zb0Var, Context context, int i10) {
        this.f25743a = i10;
        this.f25744b = zb0Var;
        this.f25745c = context;
    }

    @Override
    public final void run() {
        switch (this.f25743a) {
            case 0:
                zb0 zb0Var = this.f25744b;
                zb0Var.f30840c0.a(false);
                AndroidUtilities.runOnUIThread(new kb0(zb0Var, this.f25745c, 1));
                return;
            default:
                Context context = this.f25745c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f25744b.f30840c0.F).show();
                    return;
                }
                return;
        }
    }
}
