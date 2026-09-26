package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kb0 implements Runnable {
    public final int f25742a;
    public final zb0 f25743b;
    public final Context f25744c;

    public kb0(zb0 zb0Var, Context context, int i10) {
        this.f25742a = i10;
        this.f25743b = zb0Var;
        this.f25744c = context;
    }

    @Override
    public final void run() {
        switch (this.f25742a) {
            case 0:
                zb0 zb0Var = this.f25743b;
                zb0Var.f30839c0.a(false);
                AndroidUtilities.runOnUIThread(new kb0(zb0Var, this.f25744c, 1));
                return;
            default:
                Context context = this.f25744c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f25743b.f30839c0.F).show();
                    return;
                }
                return;
        }
    }
}
