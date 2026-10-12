package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ec0 implements Runnable {
    public final int f25659a;
    public final tc0 f25660b;
    public final Context f25661c;

    public ec0(tc0 tc0Var, Context context, int i10) {
        this.f25659a = i10;
        this.f25660b = tc0Var;
        this.f25661c = context;
    }

    @Override
    public final void run() {
        switch (this.f25659a) {
            case 0:
                tc0 tc0Var = this.f25660b;
                tc0Var.f30856c0.a(false);
                AndroidUtilities.runOnUIThread(new ec0(tc0Var, this.f25661c, 1));
                return;
            default:
                Context context = this.f25661c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.f25660b.f30856c0.F).show();
                    return;
                }
                return;
        }
    }
}
