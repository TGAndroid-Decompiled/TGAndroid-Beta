package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class bc0 implements Runnable {
    public final int f24919a;
    public final qc0 f24920b;
    public final Context f24921c;

    public bc0(qc0 qc0Var, Context context, int i10) {
        this.f24919a = i10;
        this.f24920b = qc0Var;
        this.f24921c = context;
    }

    @Override
    public final void run() {
        switch (this.f24919a) {
            case 0:
                qc0 qc0Var = this.f24920b;
                qc0Var.f30183c0.a(false);
                AndroidUtilities.runOnUIThread(new bc0(qc0Var, this.f24921c, 1));
                return;
            default:
                Context context = this.f24921c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.f24920b.f30183c0.F).show();
                    return;
                }
                return;
        }
    }
}
