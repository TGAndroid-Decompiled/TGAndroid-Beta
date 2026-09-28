package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24649a;
    public final a80 f24650b;
    public final boolean f24651c;
    public final Runnable d;

    public h(a80 a80Var, boolean z10, Runnable runnable, int i10) {
        this.f24649a = i10;
        this.f24650b = a80Var;
        this.f24651c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24649a) {
            case 0:
                this.f24650b.u();
                if (!this.f24651c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24650b.u();
                if (!this.f24651c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
