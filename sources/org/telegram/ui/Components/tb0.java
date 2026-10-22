package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Runnable {
    public final int f30491a;
    public final ic0 f30492b;
    public final Context f30493c;

    public tb0(ic0 ic0Var, Context context, int i10) {
        this.f30491a = i10;
        this.f30492b = ic0Var;
        this.f30493c = context;
    }

    @Override
    public final void run() {
        switch (this.f30491a) {
            case 0:
                ic0 ic0Var = this.f30492b;
                ic0Var.f27240c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(ic0Var, this.f30493c, 1));
                return;
            default:
                Context context = this.f30493c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.f30492b.f27240c0.F).show();
                    return;
                }
                return;
        }
    }
}
