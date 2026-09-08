package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ab0 implements Runnable {
    public final int f24352a;
    public final qb0 f24353b;
    public final Context f24354c;

    public ab0(qb0 qb0Var, Context context, int i10) {
        this.f24352a = i10;
        this.f24353b = qb0Var;
        this.f24354c = context;
    }

    @Override
    public final void run() {
        switch (this.f24352a) {
            case 0:
                qb0 qb0Var = this.f24353b;
                qb0Var.f29689c0.a(false);
                AndroidUtilities.runOnUIThread(new ab0(qb0Var, this.f24354c, 1));
                return;
            default:
                Context context = this.f24354c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.a1(context, 43, this.f24353b.f29689c0.F).show();
                    return;
                }
                return;
        }
    }
}
