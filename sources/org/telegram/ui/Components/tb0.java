package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Runnable {
    public final int f30511a;
    public final ic0 f30512b;
    public final Context f30513c;

    public tb0(ic0 ic0Var, Context context, int i10) {
        this.f30511a = i10;
        this.f30512b = ic0Var;
        this.f30513c = context;
    }

    @Override
    public final void run() {
        switch (this.f30511a) {
            case 0:
                ic0 ic0Var = this.f30512b;
                ic0Var.f27192c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(ic0Var, this.f30513c, 1));
                return;
            default:
                Context context = this.f30513c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.x0(context, 43, this.f30512b.f27192c0.F).show();
                    return;
                }
                return;
        }
    }
}
