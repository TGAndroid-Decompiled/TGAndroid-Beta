package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ac0 implements Runnable {
    public final int f24659a;
    public final pc0 f24660b;
    public final Context f24661c;

    public ac0(pc0 pc0Var, Context context, int i10) {
        this.f24659a = i10;
        this.f24660b = pc0Var;
        this.f24661c = context;
    }

    @Override
    public final void run() {
        switch (this.f24659a) {
            case 0:
                pc0 pc0Var = this.f24660b;
                pc0Var.f29845c0.a(false);
                AndroidUtilities.runOnUIThread(new ac0(pc0Var, this.f24661c, 1));
                return;
            default:
                Context context = this.f24661c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.f24660b.f29845c0.F).show();
                    return;
                }
                return;
        }
    }
}
