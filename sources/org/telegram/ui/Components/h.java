package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f28751a;
    public final k80 f28752b;
    public final boolean f28753c;
    public final Runnable d;

    public h(k80 k80Var, boolean z10, Runnable runnable, int i10) {
        this.f28751a = i10;
        this.f28752b = k80Var;
        this.f28753c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f28751a) {
            case 0:
                this.f28752b.u();
                if (!this.f28753c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28752b.u();
                if (!this.f28753c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
