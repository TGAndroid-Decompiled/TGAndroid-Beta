package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26558a;
    public final z60 f26559b;
    public final boolean f26560c;
    public final Runnable d;

    public h(z60 z60Var, boolean z10, Runnable runnable, int i10) {
        this.f26558a = i10;
        this.f26559b = z60Var;
        this.f26560c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26558a) {
            case 0:
                this.f26559b.u();
                if (!this.f26560c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26559b.u();
                if (!this.f26560c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
