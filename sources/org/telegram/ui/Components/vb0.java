package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class vb0 implements Runnable {
    public final int f31400a;
    public final lc0 f31401b;
    public final Context f31402c;

    public vb0(lc0 lc0Var, Context context, int i10) {
        this.f31400a = i10;
        this.f31401b = lc0Var;
        this.f31402c = context;
    }

    @Override
    public final void run() {
        switch (this.f31400a) {
            case 0:
                lc0 lc0Var = this.f31401b;
                lc0Var.f28340c0.a(false);
                AndroidUtilities.runOnUIThread(new vb0(lc0Var, this.f31402c, 1));
                return;
            default:
                Context context = this.f31402c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.f31401b.f28340c0.F).show();
                    return;
                }
                return;
        }
    }
}
