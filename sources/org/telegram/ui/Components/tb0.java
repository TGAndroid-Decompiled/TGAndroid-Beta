package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Runnable {
    public final int f30504a;
    public final ic0 f30505b;
    public final Context f30506c;

    public tb0(ic0 ic0Var, Context context, int i10) {
        this.f30504a = i10;
        this.f30505b = ic0Var;
        this.f30506c = context;
    }

    @Override
    public final void run() {
        switch (this.f30504a) {
            case 0:
                ic0 ic0Var = this.f30505b;
                ic0Var.f27185c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(ic0Var, this.f30506c, 1));
                return;
            default:
                Context context = this.f30506c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.x0(context, 43, this.f30505b.f27185c0.F).show();
                    return;
                }
                return;
        }
    }
}
