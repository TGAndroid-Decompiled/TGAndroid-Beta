package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f28749a;
    public final k80 f28750b;
    public final boolean f28751c;
    public final Runnable d;

    public h(k80 k80Var, boolean z10, Runnable runnable, int i10) {
        this.f28749a = i10;
        this.f28750b = k80Var;
        this.f28751c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f28749a) {
            case 0:
                this.f28750b.u();
                if (!this.f28751c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28750b.u();
                if (!this.f28751c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
