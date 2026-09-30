package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class mb0 implements Runnable {
    public final int f26363a;
    public final bc0 f26364b;
    public final Context f26365c;

    public mb0(bc0 bc0Var, Context context, int i10) {
        this.f26363a = i10;
        this.f26364b = bc0Var;
        this.f26365c = context;
    }

    @Override
    public final void run() {
        switch (this.f26363a) {
            case 0:
                bc0 bc0Var = this.f26364b;
                bc0Var.f22938c0.a(false);
                AndroidUtilities.runOnUIThread(new mb0(bc0Var, this.f26365c, 1));
                return;
            default:
                Context context = this.f26365c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f26364b.f22938c0.F).show();
                    return;
                }
                return;
        }
    }
}
