package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24658a;
    public final y70 f24659b;
    public final boolean f24660c;
    public final Runnable d;

    public h(y70 y70Var, boolean z10, Runnable runnable, int i10) {
        this.f24658a = i10;
        this.f24659b = y70Var;
        this.f24660c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24658a) {
            case 0:
                this.f24659b.u();
                if (!this.f24660c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24659b.u();
                if (!this.f24660c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
