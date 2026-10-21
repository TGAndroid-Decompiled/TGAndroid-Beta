package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Runnable {
    public final int f30488a;
    public final ic0 f30489b;
    public final Context f30490c;

    public tb0(ic0 ic0Var, Context context, int i10) {
        this.f30488a = i10;
        this.f30489b = ic0Var;
        this.f30490c = context;
    }

    @Override
    public final void run() {
        switch (this.f30488a) {
            case 0:
                ic0 ic0Var = this.f30489b;
                ic0Var.f27237c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(ic0Var, this.f30490c, 1));
                return;
            default:
                Context context = this.f30490c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.f30489b.f27237c0.F).show();
                    return;
                }
                return;
        }
    }
}
