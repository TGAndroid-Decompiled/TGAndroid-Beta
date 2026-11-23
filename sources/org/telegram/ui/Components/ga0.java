package org.telegram.ui.Components;

import android.content.Context;
public final class ga0 implements Runnable {
    public final int f35468a;
    public final qa0 f35469b;
    public final Context f35470c;

    public ga0(qa0 qa0Var, Context context, int i7) {
        this.f35468a = i7;
        this.f35469b = qa0Var;
        this.f35470c = context;
    }

    @Override
    public final void run() {
        switch (this.f35468a) {
            case 0:
                qa0 qa0Var = this.f35469b;
                qa0Var.f38811d0.a(false);
                org.telegram.messenger.g0.g3(new ga0(qa0Var, this.f35470c, 1));
                return;
            default:
                Context context = this.f35470c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.y0(43, context, this.f35469b.f38811d0.G).show();
                    return;
                }
                return;
        }
    }
}
