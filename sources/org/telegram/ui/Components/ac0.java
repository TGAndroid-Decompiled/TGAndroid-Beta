package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ac0 implements Runnable {
    public final int f24557a;
    public final pc0 f24558b;
    public final Context f24559c;

    public ac0(pc0 pc0Var, Context context, int i10) {
        this.f24557a = i10;
        this.f24558b = pc0Var;
        this.f24559c = context;
    }

    @Override
    public final void run() {
        switch (this.f24557a) {
            case 0:
                pc0 pc0Var = this.f24558b;
                pc0Var.f29848c0.a(false);
                AndroidUtilities.runOnUIThread(new ac0(pc0Var, this.f24559c, 1));
                return;
            default:
                Context context = this.f24559c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.f24558b.f29848c0.F).show();
                    return;
                }
                return;
        }
    }
}
