package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26701a;
    public final i80 f26702b;
    public final boolean f26703c;
    public final Runnable d;

    public h(i80 i80Var, boolean z10, Runnable runnable, int i10) {
        this.f26701a = i10;
        this.f26702b = i80Var;
        this.f26703c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26701a) {
            case 0:
                this.f26702b.u();
                if (!this.f26703c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26702b.u();
                if (!this.f26703c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
