package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class lb0 implements Runnable {
    public final int f26035a;
    public final ac0 f26036b;
    public final Context f26037c;

    public lb0(ac0 ac0Var, Context context, int i10) {
        this.f26035a = i10;
        this.f26036b = ac0Var;
        this.f26037c = context;
    }

    @Override
    public final void run() {
        switch (this.f26035a) {
            case 0:
                ac0 ac0Var = this.f26036b;
                ac0Var.f22606c0.a(false);
                AndroidUtilities.runOnUIThread(new lb0(ac0Var, this.f26037c, 1));
                return;
            default:
                Context context = this.f26037c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.f26036b.f22606c0.F).show();
                    return;
                }
                return;
        }
    }
}
