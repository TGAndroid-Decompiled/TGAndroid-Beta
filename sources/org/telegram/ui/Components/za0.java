package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class za0 implements Runnable {
    public final int f30552a;
    public final ob0 f30553b;
    public final Context f30554c;

    public za0(ob0 ob0Var, Context context, int i10) {
        this.f30552a = i10;
        this.f30553b = ob0Var;
        this.f30554c = context;
    }

    @Override
    public final void run() {
        switch (this.f30552a) {
            case 0:
                ob0 ob0Var = this.f30553b;
                ob0Var.f26708c0.a(false);
                AndroidUtilities.runOnUIThread(new za0(ob0Var, this.f30554c, 1));
                return;
            default:
                Context context = this.f30554c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f30553b.f26708c0.F).show();
                    return;
                }
                return;
        }
    }
}
