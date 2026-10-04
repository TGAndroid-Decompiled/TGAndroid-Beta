package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class mb0 implements Runnable {
    public final int f28567a;
    public final cc0 f28568b;
    public final Context f28569c;

    public mb0(cc0 cc0Var, Context context, int i10) {
        this.f28567a = i10;
        this.f28568b = cc0Var;
        this.f28569c = context;
    }

    @Override
    public final void run() {
        switch (this.f28567a) {
            case 0:
                cc0 cc0Var = this.f28568b;
                cc0Var.f25320c0.a(false);
                AndroidUtilities.runOnUIThread(new mb0(cc0Var, this.f28569c, 1));
                return;
            default:
                Context context = this.f28569c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.f28568b.f25320c0.F).show();
                    return;
                }
                return;
        }
    }
}
