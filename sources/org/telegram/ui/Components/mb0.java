package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class mb0 implements Runnable {
    public final int f26365a;
    public final bc0 f26366b;
    public final Context f26367c;

    public mb0(bc0 bc0Var, Context context, int i10) {
        this.f26365a = i10;
        this.f26366b = bc0Var;
        this.f26367c = context;
    }

    @Override
    public final void run() {
        switch (this.f26365a) {
            case 0:
                bc0 bc0Var = this.f26366b;
                bc0Var.f22951c0.a(false);
                AndroidUtilities.runOnUIThread(new mb0(bc0Var, this.f26367c, 1));
                return;
            default:
                Context context = this.f26367c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f26366b.f22951c0.F).show();
                    return;
                }
                return;
        }
    }
}
