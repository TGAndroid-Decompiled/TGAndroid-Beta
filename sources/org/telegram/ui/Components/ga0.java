package org.telegram.ui.Components;

import android.content.Context;
public final class ga0 implements Runnable {
    public final int f35506a;
    public final qa0 f35507b;
    public final Context f35508c;

    public ga0(qa0 qa0Var, Context context, int i7) {
        this.f35506a = i7;
        this.f35507b = qa0Var;
        this.f35508c = context;
    }

    @Override
    public final void run() {
        switch (this.f35506a) {
            case 0:
                qa0 qa0Var = this.f35507b;
                qa0Var.f38857d0.a(false);
                org.telegram.messenger.g0.g3(new ga0(qa0Var, this.f35508c, 1));
                return;
            default:
                Context context = this.f35508c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.y0(43, context, this.f35507b.f38857d0.G).show();
                    return;
                }
                return;
        }
    }
}
