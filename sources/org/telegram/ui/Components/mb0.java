package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class mb0 implements Runnable {
    public final int f26364a;
    public final bc0 f26365b;
    public final Context f26366c;

    public mb0(bc0 bc0Var, Context context, int i10) {
        this.f26364a = i10;
        this.f26365b = bc0Var;
        this.f26366c = context;
    }

    @Override
    public final void run() {
        switch (this.f26364a) {
            case 0:
                bc0 bc0Var = this.f26365b;
                bc0Var.f22950c0.a(false);
                AndroidUtilities.runOnUIThread(new mb0(bc0Var, this.f26366c, 1));
                return;
            default:
                Context context = this.f26366c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f26365b.f22950c0.F).show();
                    return;
                }
                return;
        }
    }
}
