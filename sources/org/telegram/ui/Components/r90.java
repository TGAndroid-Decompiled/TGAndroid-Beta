package org.telegram.ui.Components;

import android.content.Context;
public final class r90 implements Runnable {
    public final int f37611a;
    public final ca0 f37612b;
    public final Context f37613c;

    public r90(ca0 ca0Var, Context context, int i7) {
        this.f37611a = i7;
        this.f37612b = ca0Var;
        this.f37613c = context;
    }

    @Override
    public final void run() {
        switch (this.f37611a) {
            case 0:
                ca0 ca0Var = this.f37612b;
                ca0Var.f32507c0.a(false);
                org.telegram.messenger.g0.h3(new r90(ca0Var, this.f37613c, 1));
                return;
            default:
                Context context = this.f37613c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.w0(43, context, this.f37612b.f32507c0.F).show();
                    return;
                }
                return;
        }
    }
}
