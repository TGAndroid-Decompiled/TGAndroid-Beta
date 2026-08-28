package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ia0 implements Runnable {
    public final int f29409a;
    public final wa0 f29410b;
    public final Context f29411c;

    public ia0(wa0 wa0Var, Context context, int i9) {
        this.f29409a = i9;
        this.f29410b = wa0Var;
        this.f29411c = context;
    }

    @Override
    public final void run() {
        switch (this.f29409a) {
            case 0:
                wa0 wa0Var = this.f29410b;
                wa0Var.V.a(false);
                AndroidUtilities.runOnUIThread(new ia0(wa0Var, this.f29411c, 1));
                return;
            default:
                Context context = this.f29411c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new zf.x0(context, 43, this.f29410b.V.B).show();
                    return;
                }
                return;
        }
    }
}
