package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26575a;
    public final s80 f26576b;
    public final boolean f26577c;
    public final Runnable d;

    public h(s80 s80Var, boolean z10, Runnable runnable, int i10) {
        this.f26575a = i10;
        this.f26576b = s80Var;
        this.f26577c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26575a) {
            case 0:
                this.f26576b.u();
                if (!this.f26577c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26576b.u();
                if (!this.f26577c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
