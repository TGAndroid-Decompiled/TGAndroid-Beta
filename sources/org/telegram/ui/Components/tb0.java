package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Runnable {
    public final int f30464a;
    public final ic0 f30465b;
    public final Context f30466c;

    public tb0(ic0 ic0Var, Context context, int i10) {
        this.f30464a = i10;
        this.f30465b = ic0Var;
        this.f30466c = context;
    }

    @Override
    public final void run() {
        switch (this.f30464a) {
            case 0:
                ic0 ic0Var = this.f30465b;
                ic0Var.f27200c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(ic0Var, this.f30466c, 1));
                return;
            default:
                Context context = this.f30466c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.f30465b.f27200c0.F).show();
                    return;
                }
                return;
        }
    }
}
