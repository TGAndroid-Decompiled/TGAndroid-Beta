package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class mb0 implements Runnable {
    public final int f28568a;
    public final cc0 f28569b;
    public final Context f28570c;

    public mb0(cc0 cc0Var, Context context, int i10) {
        this.f28568a = i10;
        this.f28569b = cc0Var;
        this.f28570c = context;
    }

    @Override
    public final void run() {
        switch (this.f28568a) {
            case 0:
                cc0 cc0Var = this.f28569b;
                cc0Var.f25321c0.a(false);
                AndroidUtilities.runOnUIThread(new mb0(cc0Var, this.f28570c, 1));
                return;
            default:
                Context context = this.f28570c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.f28569b.f25321c0.F).show();
                    return;
                }
                return;
        }
    }
}
