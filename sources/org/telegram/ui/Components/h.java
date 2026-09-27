package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24679a;
    public final a80 f24680b;
    public final boolean f24681c;
    public final Runnable d;

    public h(a80 a80Var, boolean z10, Runnable runnable, int i10) {
        this.f24679a = i10;
        this.f24680b = a80Var;
        this.f24681c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24679a) {
            case 0:
                this.f24680b.u();
                if (!this.f24681c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24680b.u();
                if (!this.f24681c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
