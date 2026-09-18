package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24513a;
    public final w70 f24514b;
    public final boolean f24515c;
    public final Runnable d;

    public h(w70 w70Var, boolean z10, Runnable runnable, int i10) {
        this.f24513a = i10;
        this.f24514b = w70Var;
        this.f24515c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24513a) {
            case 0:
                this.f24514b.u();
                if (!this.f24515c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24514b.u();
                if (!this.f24515c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
