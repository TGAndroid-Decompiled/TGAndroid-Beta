package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class lb0 implements Runnable {
    public final int f25991a;
    public final ac0 f25992b;
    public final Context f25993c;

    public lb0(ac0 ac0Var, Context context, int i10) {
        this.f25991a = i10;
        this.f25992b = ac0Var;
        this.f25993c = context;
    }

    @Override
    public final void run() {
        switch (this.f25991a) {
            case 0:
                ac0 ac0Var = this.f25992b;
                ac0Var.f22650c0.a(false);
                AndroidUtilities.runOnUIThread(new lb0(ac0Var, this.f25993c, 1));
                return;
            default:
                Context context = this.f25993c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f25992b.f22650c0.F).show();
                    return;
                }
                return;
        }
    }
}
