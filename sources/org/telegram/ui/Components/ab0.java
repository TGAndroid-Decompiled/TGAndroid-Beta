package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ab0 implements Runnable {
    public final int f24325a;
    public final qb0 f24326b;
    public final Context f24327c;

    public ab0(qb0 qb0Var, Context context, int i10) {
        this.f24325a = i10;
        this.f24326b = qb0Var;
        this.f24327c = context;
    }

    @Override
    public final void run() {
        switch (this.f24325a) {
            case 0:
                qb0 qb0Var = this.f24326b;
                qb0Var.f29662c0.a(false);
                AndroidUtilities.runOnUIThread(new ab0(qb0Var, this.f24327c, 1));
                return;
            default:
                Context context = this.f24327c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.a1(context, 43, this.f24326b.f29662c0.F).show();
                    return;
                }
                return;
        }
    }
}
