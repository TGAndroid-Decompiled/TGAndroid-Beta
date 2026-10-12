package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26571a;
    public final s80 f26572b;
    public final boolean f26573c;
    public final Runnable d;

    public h(s80 s80Var, boolean z10, Runnable runnable, int i10) {
        this.f26571a = i10;
        this.f26572b = s80Var;
        this.f26573c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26571a) {
            case 0:
                this.f26572b.u();
                if (!this.f26573c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26572b.u();
                if (!this.f26573c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
