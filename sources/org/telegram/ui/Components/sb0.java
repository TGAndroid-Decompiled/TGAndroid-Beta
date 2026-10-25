package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class sb0 implements Runnable {
    public final int f32503a;
    public final hc0 f32504b;
    public final Context f32505c;

    public sb0(hc0 hc0Var, Context context, int i10) {
        this.f32503a = i10;
        this.f32504b = hc0Var;
        this.f32505c = context;
    }

    @Override
    public final void run() {
        switch (this.f32503a) {
            case 0:
                hc0 hc0Var = this.f32504b;
                hc0Var.f28917c0.a(false);
                AndroidUtilities.runOnUIThread(new sb0(hc0Var, this.f32505c, 1));
                return;
            default:
                Context context = this.f32505c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new tg.y0(context, 43, this.f32504b.f28917c0.F).show();
                    return;
                }
                return;
        }
    }
}
