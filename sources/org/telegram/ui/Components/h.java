package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26728a;
    public final i80 f26729b;
    public final boolean f26730c;
    public final Runnable d;

    public h(i80 i80Var, boolean z10, Runnable runnable, int i10) {
        this.f26728a = i10;
        this.f26729b = i80Var;
        this.f26730c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26728a) {
            case 0:
                this.f26729b.u();
                if (!this.f26730c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26729b.u();
                if (!this.f26730c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
