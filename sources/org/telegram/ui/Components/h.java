package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f28902a;
    public final x60 f28903b;
    public final boolean f28904c;
    public final Runnable d;

    public h(x60 x60Var, boolean z10, Runnable runnable, int i9) {
        this.f28902a = i9;
        this.f28903b = x60Var;
        this.f28904c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f28902a) {
            case 0:
                this.f28903b.u();
                if (!this.f28904c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28903b.u();
                if (!this.f28904c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
