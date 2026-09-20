package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class hb0 implements Runnable {
    public final int f24601a;
    public final xb0 f24602b;
    public final Context f24603c;

    public hb0(xb0 xb0Var, Context context, int i10) {
        this.f24601a = i10;
        this.f24602b = xb0Var;
        this.f24603c = context;
    }

    @Override
    public final void run() {
        switch (this.f24601a) {
            case 0:
                xb0 xb0Var = this.f24602b;
                xb0Var.f30229c0.a(false);
                AndroidUtilities.runOnUIThread(new hb0(xb0Var, this.f24603c, 1));
                return;
            default:
                Context context = this.f24603c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f24602b.f30229c0.F).show();
                    return;
                }
                return;
        }
    }
}
