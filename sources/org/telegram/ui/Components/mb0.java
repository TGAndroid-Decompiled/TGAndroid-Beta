package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class mb0 implements Runnable {
    public final int f28652a;
    public final cc0 f28653b;
    public final Context f28654c;

    public mb0(cc0 cc0Var, Context context, int i10) {
        this.f28652a = i10;
        this.f28653b = cc0Var;
        this.f28654c = context;
    }

    @Override
    public final void run() {
        switch (this.f28652a) {
            case 0:
                cc0 cc0Var = this.f28653b;
                cc0Var.f25374c0.a(false);
                AndroidUtilities.runOnUIThread(new mb0(cc0Var, this.f28654c, 1));
                return;
            default:
                Context context = this.f28654c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.f28653b.f25374c0.F).show();
                    return;
                }
                return;
        }
    }
}
