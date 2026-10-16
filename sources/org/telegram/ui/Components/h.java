package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f25128a;
    public final l80 f25129b;
    public final boolean f25130c;
    public final Runnable d;

    public h(l80 l80Var, boolean z10, Runnable runnable, int i10) {
        this.f25128a = i10;
        this.f25129b = l80Var;
        this.f25130c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f25128a) {
            case 0:
                this.f25129b.u();
                if (!this.f25130c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25129b.u();
                if (!this.f25130c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
