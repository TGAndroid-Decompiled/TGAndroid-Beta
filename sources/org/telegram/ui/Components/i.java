package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f23834a;
    public final w70 f23835b;
    public final boolean f23836c;
    public final Runnable d;

    public i(w70 w70Var, boolean z10, Runnable runnable, int i10) {
        this.f23834a = i10;
        this.f23835b = w70Var;
        this.f23836c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f23834a) {
            case 0:
                this.f23835b.u();
                if (!this.f23836c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f23835b.u();
                if (!this.f23836c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
