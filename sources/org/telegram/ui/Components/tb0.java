package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Runnable {
    public final int f30492a;
    public final ic0 f30493b;
    public final Context f30494c;

    public tb0(ic0 ic0Var, Context context, int i10) {
        this.f30492a = i10;
        this.f30493b = ic0Var;
        this.f30494c = context;
    }

    @Override
    public final void run() {
        switch (this.f30492a) {
            case 0:
                ic0 ic0Var = this.f30493b;
                ic0Var.f27241c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(ic0Var, this.f30494c, 1));
                return;
            default:
                Context context = this.f30494c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.f30493b.f27241c0.F).show();
                    return;
                }
                return;
        }
    }
}
