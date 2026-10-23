package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26702a;
    public final i80 f26703b;
    public final boolean f26704c;
    public final Runnable d;

    public h(i80 i80Var, boolean z10, Runnable runnable, int i10) {
        this.f26702a = i10;
        this.f26703b = i80Var;
        this.f26704c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26702a) {
            case 0:
                this.f26703b.u();
                if (!this.f26704c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26703b.u();
                if (!this.f26704c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
