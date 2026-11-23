package org.telegram.ui.Components;

import android.view.View;
public final class m implements View.OnClickListener {
    public final int f37314a;
    public final a70 f37315b;
    public final boolean f37316c;
    public final Runnable d;

    public m(a70 a70Var, boolean z10, Runnable runnable, int i7) {
        this.f37314a = i7;
        this.f37315b = a70Var;
        this.f37316c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f37314a) {
            case 0:
                this.f37315b.v();
                if (!this.f37316c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f37315b.v();
                if (!this.f37316c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
