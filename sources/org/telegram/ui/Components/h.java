package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26912a;
    public final p80 f26913b;
    public final boolean f26914c;
    public final Runnable d;

    public h(p80 p80Var, boolean z10, Runnable runnable, int i10) {
        this.f26912a = i10;
        this.f26913b = p80Var;
        this.f26914c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26912a) {
            case 0:
                this.f26913b.u();
                if (!this.f26914c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26913b.u();
                if (!this.f26914c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
