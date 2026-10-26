package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class sb0 implements Runnable {
    public final int f32505a;
    public final hc0 f32506b;
    public final Context f32507c;

    public sb0(hc0 hc0Var, Context context, int i10) {
        this.f32505a = i10;
        this.f32506b = hc0Var;
        this.f32507c = context;
    }

    @Override
    public final void run() {
        switch (this.f32505a) {
            case 0:
                hc0 hc0Var = this.f32506b;
                hc0Var.f28919c0.a(false);
                AndroidUtilities.runOnUIThread(new sb0(hc0Var, this.f32507c, 1));
                return;
            default:
                Context context = this.f32507c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new tg.y0(context, 43, this.f32506b.f28919c0.F).show();
                    return;
                }
                return;
        }
    }
}
