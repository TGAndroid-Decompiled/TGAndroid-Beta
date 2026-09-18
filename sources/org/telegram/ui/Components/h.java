package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24432a;
    public final n70 f24433b;
    public final boolean f24434c;
    public final Runnable d;

    public h(n70 n70Var, boolean z10, Runnable runnable, int i10) {
        this.f24432a = i10;
        this.f24433b = n70Var;
        this.f24434c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24432a) {
            case 0:
                this.f24433b.u();
                if (!this.f24434c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24433b.u();
                if (!this.f24434c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
