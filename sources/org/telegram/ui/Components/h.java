package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24579a;
    public final y70 f24580b;
    public final boolean f24581c;
    public final Runnable d;

    public h(y70 y70Var, boolean z10, Runnable runnable, int i10) {
        this.f24579a = i10;
        this.f24580b = y70Var;
        this.f24581c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24579a) {
            case 0:
                this.f24580b.u();
                if (!this.f24581c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24580b.u();
                if (!this.f24581c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
