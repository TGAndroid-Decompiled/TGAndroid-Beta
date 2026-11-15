package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f35131a;
    public final m60 f35132b;
    public final boolean f35133c;
    public final Runnable d;

    public h(m60 m60Var, boolean z10, Runnable runnable, int i7) {
        this.f35131a = i7;
        this.f35132b = m60Var;
        this.f35133c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f35131a) {
            case 0:
                this.f35132b.u();
                if (!this.f35133c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f35132b.u();
                if (!this.f35133c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
