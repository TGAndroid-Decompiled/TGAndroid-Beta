package org.telegram.ui.Components;

import android.content.Context;
public final class ea0 implements Runnable {
    public final int f34658a;
    public final oa0 f34659b;
    public final Context f34660c;

    public ea0(oa0 oa0Var, Context context, int i7) {
        this.f34658a = i7;
        this.f34659b = oa0Var;
        this.f34660c = context;
    }

    @Override
    public final void run() {
        switch (this.f34658a) {
            case 0:
                oa0 oa0Var = this.f34659b;
                oa0Var.f38045d0.a(false);
                org.telegram.messenger.g0.g3(new ea0(oa0Var, this.f34660c, 1));
                return;
            default:
                Context context = this.f34660c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.z0(43, context, this.f34659b.f38045d0.G).show();
                    return;
                }
                return;
        }
    }
}
