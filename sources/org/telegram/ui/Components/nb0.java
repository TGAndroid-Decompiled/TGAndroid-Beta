package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class nb0 implements Runnable {
    public final int f26650a;
    public final cc0 f26651b;
    public final Context f26652c;

    public nb0(cc0 cc0Var, Context context, int i10) {
        this.f26650a = i10;
        this.f26651b = cc0Var;
        this.f26652c = context;
    }

    @Override
    public final void run() {
        switch (this.f26650a) {
            case 0:
                cc0 cc0Var = this.f26651b;
                cc0Var.f23264c0.a(false);
                AndroidUtilities.runOnUIThread(new nb0(cc0Var, this.f26652c, 1));
                return;
            default:
                Context context = this.f26652c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f26651b.f23264c0.F).show();
                    return;
                }
                return;
        }
    }
}
