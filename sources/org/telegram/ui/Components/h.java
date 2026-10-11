package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26855a;
    public final q80 f26856b;
    public final boolean f26857c;
    public final Runnable d;

    public h(q80 q80Var, boolean z10, Runnable runnable, int i10) {
        this.f26855a = i10;
        this.f26856b = q80Var;
        this.f26857c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26855a) {
            case 0:
                this.f26856b.u();
                if (!this.f26857c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26856b.u();
                if (!this.f26857c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
