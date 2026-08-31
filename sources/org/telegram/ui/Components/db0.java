package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class db0 implements Runnable {
    public final int f26243a;
    public final sb0 f26244b;
    public final Context f26245c;

    public db0(sb0 sb0Var, Context context, int i10) {
        this.f26243a = i10;
        this.f26244b = sb0Var;
        this.f26245c = context;
    }

    @Override
    public final void run() {
        switch (this.f26243a) {
            case 0:
                sb0 sb0Var = this.f26244b;
                sb0Var.W.a(false);
                AndroidUtilities.runOnUIThread(new db0(sb0Var, this.f26245c, 1));
                return;
            default:
                Context context = this.f26245c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new fg.n1(context, 43, this.f26244b.W.C).show();
                    return;
                }
                return;
        }
    }
}
