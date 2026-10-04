package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class mb0 implements Runnable {
    public final int f28573a;
    public final cc0 f28574b;
    public final Context f28575c;

    public mb0(cc0 cc0Var, Context context, int i10) {
        this.f28573a = i10;
        this.f28574b = cc0Var;
        this.f28575c = context;
    }

    @Override
    public final void run() {
        switch (this.f28573a) {
            case 0:
                cc0 cc0Var = this.f28574b;
                cc0Var.f25326c0.a(false);
                AndroidUtilities.runOnUIThread(new mb0(cc0Var, this.f28575c, 1));
                return;
            default:
                Context context = this.f28575c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.f28574b.f25326c0.F).show();
                    return;
                }
                return;
        }
    }
}
