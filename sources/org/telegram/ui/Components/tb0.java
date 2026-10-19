package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Runnable {
    public final int f30466a;
    public final ic0 f30467b;
    public final Context f30468c;

    public tb0(ic0 ic0Var, Context context, int i10) {
        this.f30466a = i10;
        this.f30467b = ic0Var;
        this.f30468c = context;
    }

    @Override
    public final void run() {
        switch (this.f30466a) {
            case 0:
                ic0 ic0Var = this.f30467b;
                ic0Var.f27202c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(ic0Var, this.f30468c, 1));
                return;
            default:
                Context context = this.f30468c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.f30467b.f27202c0.F).show();
                    return;
                }
                return;
        }
    }
}
