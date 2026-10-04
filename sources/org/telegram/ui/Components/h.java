package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26963a;
    public final b80 f26964b;
    public final boolean f26965c;
    public final Runnable d;

    public h(b80 b80Var, boolean z10, Runnable runnable, int i10) {
        this.f26963a = i10;
        this.f26964b = b80Var;
        this.f26965c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26963a) {
            case 0:
                this.f26964b.u();
                if (!this.f26965c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26964b.u();
                if (!this.f26965c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
