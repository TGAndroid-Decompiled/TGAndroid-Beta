package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class jb0 implements Runnable {
    public final int f24338a;
    public final yb0 f24339b;
    public final Context f24340c;

    public jb0(yb0 yb0Var, Context context, int i10) {
        this.f24338a = i10;
        this.f24339b = yb0Var;
        this.f24340c = context;
    }

    @Override
    public final void run() {
        switch (this.f24338a) {
            case 0:
                yb0 yb0Var = this.f24339b;
                yb0Var.f29295c0.a(false);
                AndroidUtilities.runOnUIThread(new jb0(yb0Var, this.f24340c, 1));
                return;
            default:
                Context context = this.f24340c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new qg.a1(context, 43, this.f24339b.f29295c0.F).show();
                    return;
                }
                return;
        }
    }
}
