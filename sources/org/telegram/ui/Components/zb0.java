package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class zb0 implements Runnable {
    public final int f31832a;
    public final pc0 f31833b;
    public final Context f31834c;

    public zb0(pc0 pc0Var, Context context, int i10) {
        this.f31832a = i10;
        this.f31833b = pc0Var;
        this.f31834c = context;
    }

    @Override
    public final void run() {
        switch (this.f31832a) {
            case 0:
                pc0 pc0Var = this.f31833b;
                pc0Var.f28286c0.a(false);
                AndroidUtilities.runOnUIThread(new zb0(pc0Var, this.f31834c, 1));
                return;
            default:
                Context context = this.f31834c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.f31833b.f28286c0.F).show();
                    return;
                }
                return;
        }
    }
}
