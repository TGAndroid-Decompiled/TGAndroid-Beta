package org.telegram.ui.Components;

import android.content.Context;
public final class s90 implements Runnable {
    public final int f37986a;
    public final da0 f37987b;
    public final Context f37988c;

    public s90(da0 da0Var, Context context, int i7) {
        this.f37986a = i7;
        this.f37987b = da0Var;
        this.f37988c = context;
    }

    @Override
    public final void run() {
        switch (this.f37986a) {
            case 0:
                da0 da0Var = this.f37987b;
                da0Var.f32920c0.a(false);
                org.telegram.messenger.g0.h3(new s90(da0Var, this.f37988c, 1));
                return;
            default:
                Context context = this.f37988c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.w0(43, context, this.f37987b.f32920c0.F).show();
                    return;
                }
                return;
        }
    }
}
