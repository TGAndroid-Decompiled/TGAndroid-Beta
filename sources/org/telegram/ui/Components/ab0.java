package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ab0 implements Runnable {
    public final int f24326a;
    public final qb0 f24327b;
    public final Context f24328c;

    public ab0(qb0 qb0Var, Context context, int i10) {
        this.f24326a = i10;
        this.f24327b = qb0Var;
        this.f24328c = context;
    }

    @Override
    public final void run() {
        switch (this.f24326a) {
            case 0:
                qb0 qb0Var = this.f24327b;
                qb0Var.f29663c0.a(false);
                AndroidUtilities.runOnUIThread(new ab0(qb0Var, this.f24328c, 1));
                return;
            default:
                Context context = this.f24328c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.a1(context, 43, this.f24327b.f29663c0.F).show();
                    return;
                }
                return;
        }
    }
}
