package org.telegram.ui.Components;

import android.view.View;
public final class l implements View.OnClickListener {
    public final int f36953a;
    public final x60 f36954b;
    public final boolean f36955c;
    public final Runnable d;

    public l(x60 x60Var, boolean z10, Runnable runnable, int i7) {
        this.f36953a = i7;
        this.f36954b = x60Var;
        this.f36955c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f36953a) {
            case 0:
                this.f36954b.v();
                if (!this.f36955c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36954b.v();
                if (!this.f36955c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
