package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24578a;
    public final y70 f24579b;
    public final boolean f24580c;
    public final Runnable d;

    public h(y70 y70Var, boolean z10, Runnable runnable, int i10) {
        this.f24578a = i10;
        this.f24579b = y70Var;
        this.f24580c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24578a) {
            case 0:
                this.f24579b.u();
                if (!this.f24580c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24579b.u();
                if (!this.f24580c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
