package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Runnable {
    public final int f30487a;
    public final ic0 f30488b;
    public final Context f30489c;

    public tb0(ic0 ic0Var, Context context, int i10) {
        this.f30487a = i10;
        this.f30488b = ic0Var;
        this.f30489c = context;
    }

    @Override
    public final void run() {
        switch (this.f30487a) {
            case 0:
                ic0 ic0Var = this.f30488b;
                ic0Var.f27237c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(ic0Var, this.f30489c, 1));
                return;
            default:
                Context context = this.f30489c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.f30488b.f27237c0.F).show();
                    return;
                }
                return;
        }
    }
}
