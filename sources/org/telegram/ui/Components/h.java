package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26957a;
    public final b80 f26958b;
    public final boolean f26959c;
    public final Runnable d;

    public h(b80 b80Var, boolean z10, Runnable runnable, int i10) {
        this.f26957a = i10;
        this.f26958b = b80Var;
        this.f26959c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26957a) {
            case 0:
                this.f26958b.u();
                if (!this.f26959c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26958b.u();
                if (!this.f26959c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
