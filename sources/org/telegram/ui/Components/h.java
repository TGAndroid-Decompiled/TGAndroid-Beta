package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24705a;
    public final b80 f24706b;
    public final boolean f24707c;
    public final Runnable d;

    public h(b80 b80Var, boolean z10, Runnable runnable, int i10) {
        this.f24705a = i10;
        this.f24706b = b80Var;
        this.f24707c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24705a) {
            case 0:
                this.f24706b.u();
                if (!this.f24707c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24706b.u();
                if (!this.f24707c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
