package org.telegram.ui.Components;

import android.content.Context;
public final class r90 implements Runnable {
    public final int f37572a;
    public final ca0 f37573b;
    public final Context f37574c;

    public r90(ca0 ca0Var, Context context, int i7) {
        this.f37572a = i7;
        this.f37573b = ca0Var;
        this.f37574c = context;
    }

    @Override
    public final void run() {
        switch (this.f37572a) {
            case 0:
                ca0 ca0Var = this.f37573b;
                ca0Var.f32524c0.a(false);
                org.telegram.messenger.g0.h3(new r90(ca0Var, this.f37574c, 1));
                return;
            default:
                Context context = this.f37574c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.w0(43, context, this.f37573b.f32524c0.F).show();
                    return;
                }
                return;
        }
    }
}
