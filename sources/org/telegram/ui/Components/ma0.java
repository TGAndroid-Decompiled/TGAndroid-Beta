package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public final class ma0 implements Runnable {

    public final int f30635a;

    public final ab0 f30636b;

    public final Context f30637c;

    public ma0(ab0 ab0Var, Context context, int i10) {
        this.f30635a = i10;
        this.f30636b = ab0Var;
        this.f30637c = context;
    }

    @Override
    public final void run() {
        switch (this.f30635a) {
            case 0:
                ab0 ab0Var = this.f30636b;
                ab0Var.V.a(false);
                AndroidUtilities.runOnUIThread(new ma0(ab0Var, this.f30637c, 1));
                break;
            default:
                Context context = this.f30637c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new ag.g2(context, 43, this.f30636b.V.B).show();
                    break;
                }
                break;
        }
    }
}
