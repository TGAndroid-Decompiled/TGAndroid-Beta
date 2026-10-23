package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26751a;
    public final j80 f26752b;
    public final boolean f26753c;
    public final Runnable d;

    public h(j80 j80Var, boolean z10, Runnable runnable, int i10) {
        this.f26751a = i10;
        this.f26752b = j80Var;
        this.f26753c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26751a) {
            case 0:
                this.f26752b.u();
                if (!this.f26753c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26752b.u();
                if (!this.f26753c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
