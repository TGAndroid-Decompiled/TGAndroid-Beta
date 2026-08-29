package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class wa0 implements Runnable {
    public final int f34359a;
    public final lb0 f34360b;
    public final Context f34361c;

    public wa0(lb0 lb0Var, Context context, int i10) {
        this.f34359a = i10;
        this.f34360b = lb0Var;
        this.f34361c = context;
    }

    @Override
    public final void run() {
        switch (this.f34359a) {
            case 0:
                lb0 lb0Var = this.f34360b;
                lb0Var.V.a(false);
                AndroidUtilities.runOnUIThread(new wa0(lb0Var, this.f34361c, 1));
                return;
            default:
                Context context = this.f34361c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new cg.p1(context, 43, this.f34360b.V.B).show();
                    return;
                }
                return;
        }
    }
}
