package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24506a;
    public final v70 f24507b;
    public final boolean f24508c;
    public final Runnable d;

    public h(v70 v70Var, boolean z10, Runnable runnable, int i10) {
        this.f24506a = i10;
        this.f24507b = v70Var;
        this.f24508c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24506a) {
            case 0:
                this.f24507b.u();
                if (!this.f24508c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24507b.u();
                if (!this.f24508c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
