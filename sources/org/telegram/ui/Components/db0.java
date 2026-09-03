package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class db0 implements Runnable {
    public final int f26246a;
    public final sb0 f26247b;
    public final Context f26248c;

    public db0(sb0 sb0Var, Context context, int i10) {
        this.f26246a = i10;
        this.f26247b = sb0Var;
        this.f26248c = context;
    }

    @Override
    public final void run() {
        switch (this.f26246a) {
            case 0:
                sb0 sb0Var = this.f26247b;
                sb0Var.W.a(false);
                AndroidUtilities.runOnUIThread(new db0(sb0Var, this.f26248c, 1));
                return;
            default:
                Context context = this.f26248c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new fg.n1(context, 43, this.f26247b.W.C).show();
                    return;
                }
                return;
        }
    }
}
