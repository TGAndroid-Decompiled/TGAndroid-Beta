package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f26920a;
    public final n70 f26921b;
    public final boolean f26922c;
    public final Runnable d;

    public i(n70 n70Var, boolean z10, Runnable runnable, int i10) {
        this.f26920a = i10;
        this.f26921b = n70Var;
        this.f26922c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26920a) {
            case 0:
                this.f26921b.u();
                if (!this.f26922c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26921b.u();
                if (!this.f26922c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
