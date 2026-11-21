package org.telegram.ui.Components;

import android.content.Context;
public final class ga0 implements Runnable {
    public final int f35487a;
    public final qa0 f35488b;
    public final Context f35489c;

    public ga0(qa0 qa0Var, Context context, int i7) {
        this.f35487a = i7;
        this.f35488b = qa0Var;
        this.f35489c = context;
    }

    @Override
    public final void run() {
        switch (this.f35487a) {
            case 0:
                qa0 qa0Var = this.f35488b;
                qa0Var.f38864d0.a(false);
                org.telegram.messenger.g0.g3(new ga0(qa0Var, this.f35489c, 1));
                return;
            default:
                Context context = this.f35489c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.y0(43, context, this.f35488b.f38864d0.G).show();
                    return;
                }
                return;
        }
    }
}
