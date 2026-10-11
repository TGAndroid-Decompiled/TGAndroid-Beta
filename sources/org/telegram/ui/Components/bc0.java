package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class bc0 implements Runnable {
    public final int f24904a;
    public final qc0 f24905b;
    public final Context f24906c;

    public bc0(qc0 qc0Var, Context context, int i10) {
        this.f24904a = i10;
        this.f24905b = qc0Var;
        this.f24906c = context;
    }

    @Override
    public final void run() {
        switch (this.f24904a) {
            case 0:
                qc0 qc0Var = this.f24905b;
                qc0Var.f30132c0.a(false);
                AndroidUtilities.runOnUIThread(new bc0(qc0Var, this.f24906c, 1));
                return;
            default:
                Context context = this.f24906c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.f24905b.f30132c0.F).show();
                    return;
                }
                return;
        }
    }
}
