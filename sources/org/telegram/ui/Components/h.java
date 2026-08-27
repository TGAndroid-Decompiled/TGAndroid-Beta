package org.telegram.ui.Components;

import android.view.View;

public final class h implements View.OnClickListener {

    public final int f28874a;

    public final b70 f28875b;

    public final boolean f28876c;
    public final Runnable d;

    public h(b70 b70Var, boolean z10, Runnable runnable, int i10) {
        this.f28874a = i10;
        this.f28875b = b70Var;
        this.f28876c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f28874a) {
            case 0:
                this.f28875b.u();
                if (!this.f28876c && (runnable = this.d) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                this.f28875b.u();
                if (!this.f28876c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
