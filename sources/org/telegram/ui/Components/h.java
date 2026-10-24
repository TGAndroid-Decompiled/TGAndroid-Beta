package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26819a;
    public final h80 f26820b;
    public final boolean f26821c;
    public final Runnable d;

    public h(h80 h80Var, boolean z10, Runnable runnable, int i10) {
        this.f26819a = i10;
        this.f26820b = h80Var;
        this.f26821c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26819a) {
            case 0:
                this.f26820b.u();
                if (!this.f26821c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26820b.u();
                if (!this.f26821c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
