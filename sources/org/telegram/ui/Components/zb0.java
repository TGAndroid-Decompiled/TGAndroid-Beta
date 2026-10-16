package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class zb0 implements Runnable {
    public final int f31536a;
    public final pc0 f31537b;
    public final Context f31538c;

    public zb0(pc0 pc0Var, Context context, int i10) {
        this.f31536a = i10;
        this.f31537b = pc0Var;
        this.f31538c = context;
    }

    @Override
    public final void run() {
        switch (this.f31536a) {
            case 0:
                pc0 pc0Var = this.f31537b;
                pc0Var.f27967c0.a(false);
                AndroidUtilities.runOnUIThread(new zb0(pc0Var, this.f31538c, 1));
                return;
            default:
                Context context = this.f31538c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.f31537b.f27967c0.F).show();
                    return;
                }
                return;
        }
    }
}
