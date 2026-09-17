package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f26894a;
    public final n70 f26895b;
    public final boolean f26896c;
    public final Runnable d;

    public i(n70 n70Var, boolean z10, Runnable runnable, int i10) {
        this.f26894a = i10;
        this.f26895b = n70Var;
        this.f26896c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26894a) {
            case 0:
                this.f26895b.u();
                if (!this.f26896c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26895b.u();
                if (!this.f26896c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
