package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f26921a;
    public final n70 f26922b;
    public final boolean f26923c;
    public final Runnable d;

    public i(n70 n70Var, boolean z10, Runnable runnable, int i10) {
        this.f26921a = i10;
        this.f26922b = n70Var;
        this.f26923c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26921a) {
            case 0:
                this.f26922b.u();
                if (!this.f26923c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26922b.u();
                if (!this.f26923c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
