package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ab0 implements Runnable {
    public final int f24353a;
    public final qb0 f24354b;
    public final Context f24355c;

    public ab0(qb0 qb0Var, Context context, int i10) {
        this.f24353a = i10;
        this.f24354b = qb0Var;
        this.f24355c = context;
    }

    @Override
    public final void run() {
        switch (this.f24353a) {
            case 0:
                qb0 qb0Var = this.f24354b;
                qb0Var.f29690c0.a(false);
                AndroidUtilities.runOnUIThread(new ab0(qb0Var, this.f24355c, 1));
                return;
            default:
                Context context = this.f24355c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.a1(context, 43, this.f24354b.f29690c0.F).show();
                    return;
                }
                return;
        }
    }
}
