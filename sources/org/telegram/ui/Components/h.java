package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f27021a;
    public final b80 f27022b;
    public final boolean f27023c;
    public final Runnable d;

    public h(b80 b80Var, boolean z10, Runnable runnable, int i10) {
        this.f27021a = i10;
        this.f27022b = b80Var;
        this.f27023c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f27021a) {
            case 0:
                this.f27022b.u();
                if (!this.f27023c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27022b.u();
                if (!this.f27023c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
