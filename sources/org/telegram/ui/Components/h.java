package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26717a;
    public final i80 f26718b;
    public final boolean f26719c;
    public final Runnable d;

    public h(i80 i80Var, boolean z10, Runnable runnable, int i10) {
        this.f26717a = i10;
        this.f26718b = i80Var;
        this.f26719c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26717a) {
            case 0:
                this.f26718b.u();
                if (!this.f26719c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26718b.u();
                if (!this.f26719c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
