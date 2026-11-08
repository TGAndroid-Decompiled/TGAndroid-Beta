package org.telegram.ui.Components;

import android.content.Context;
public final class r90 implements Runnable {
    public final int f37592a;
    public final ca0 f37593b;
    public final Context f37594c;

    public r90(ca0 ca0Var, Context context, int i7) {
        this.f37592a = i7;
        this.f37593b = ca0Var;
        this.f37594c = context;
    }

    @Override
    public final void run() {
        switch (this.f37592a) {
            case 0:
                ca0 ca0Var = this.f37593b;
                ca0Var.f32525c0.a(false);
                org.telegram.messenger.g0.h3(new r90(ca0Var, this.f37594c, 1));
                return;
            default:
                Context context = this.f37594c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.w0(43, context, this.f37593b.f32525c0.F).show();
                    return;
                }
                return;
        }
    }
}
