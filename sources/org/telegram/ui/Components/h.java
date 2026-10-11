package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26908a;
    public final p80 f26909b;
    public final boolean f26910c;
    public final Runnable d;

    public h(p80 p80Var, boolean z10, Runnable runnable, int i10) {
        this.f26908a = i10;
        this.f26909b = p80Var;
        this.f26910c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26908a) {
            case 0:
                this.f26909b.u();
                if (!this.f26910c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26909b.u();
                if (!this.f26910c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
