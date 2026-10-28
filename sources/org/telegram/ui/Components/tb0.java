package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Runnable {
    public final int f32924a;
    public final ic0 f32925b;
    public final Context f32926c;

    public tb0(ic0 ic0Var, Context context, int i10) {
        this.f32924a = i10;
        this.f32925b = ic0Var;
        this.f32926c = context;
    }

    @Override
    public final void run() {
        switch (this.f32924a) {
            case 0:
                ic0 ic0Var = this.f32925b;
                ic0Var.f29306c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(ic0Var, this.f32926c, 1));
                return;
            default:
                Context context = this.f32926c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new tg.y0(context, 43, this.f32925b.f29306c0.F).show();
                    return;
                }
                return;
        }
    }
}
