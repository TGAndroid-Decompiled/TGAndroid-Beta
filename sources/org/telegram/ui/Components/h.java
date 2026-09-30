package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24650a;
    public final a80 f24651b;
    public final boolean f24652c;
    public final Runnable d;

    public h(a80 a80Var, boolean z10, Runnable runnable, int i10) {
        this.f24650a = i10;
        this.f24651b = a80Var;
        this.f24652c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24650a) {
            case 0:
                this.f24651b.u();
                if (!this.f24652c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24651b.u();
                if (!this.f24652c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
