package org.telegram.ui.Components;

import android.content.Context;
public final class n90 implements Runnable {
    public final int f36418a;
    public final x90 f36419b;
    public final Context f36420c;

    public n90(x90 x90Var, Context context, int i3) {
        this.f36418a = i3;
        this.f36419b = x90Var;
        this.f36420c = context;
    }

    @Override
    public final void run() {
        switch (this.f36418a) {
            case 0:
                x90 x90Var = this.f36419b;
                x90Var.f40291d0.a(false);
                org.telegram.messenger.g0.h3(new n90(x90Var, this.f36420c, 1));
                return;
            default:
                Context context = this.f36420c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new vg.v0(43, context, this.f36419b.f40291d0.G).show();
                    return;
                }
                return;
        }
    }
}
