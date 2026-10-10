package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26879a;
    public final q80 f26880b;
    public final boolean f26881c;
    public final Runnable d;

    public h(q80 q80Var, boolean z10, Runnable runnable, int i10) {
        this.f26879a = i10;
        this.f26880b = q80Var;
        this.f26881c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26879a) {
            case 0:
                this.f26880b.u();
                if (!this.f26881c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26880b.u();
                if (!this.f26881c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
