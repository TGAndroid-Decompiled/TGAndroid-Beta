package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24463a;
    public final o70 f24464b;
    public final boolean f24465c;
    public final Runnable d;

    public h(o70 o70Var, boolean z10, Runnable runnable, int i10) {
        this.f24463a = i10;
        this.f24464b = o70Var;
        this.f24465c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24463a) {
            case 0:
                this.f24464b.u();
                if (!this.f24465c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24464b.u();
                if (!this.f24465c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
