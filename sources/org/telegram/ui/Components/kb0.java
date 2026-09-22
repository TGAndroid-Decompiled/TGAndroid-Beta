package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kb0 implements Runnable {
    public final int f25663a;
    public final ac0 f25664b;
    public final Context f25665c;

    public kb0(ac0 ac0Var, Context context, int i10) {
        this.f25663a = i10;
        this.f25664b = ac0Var;
        this.f25665c = context;
    }

    @Override
    public final void run() {
        switch (this.f25663a) {
            case 0:
                ac0 ac0Var = this.f25664b;
                ac0Var.f22625c0.a(false);
                AndroidUtilities.runOnUIThread(new kb0(ac0Var, this.f25665c, 1));
                return;
            default:
                Context context = this.f25665c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f25664b.f22625c0.F).show();
                    return;
                }
                return;
        }
    }
}
