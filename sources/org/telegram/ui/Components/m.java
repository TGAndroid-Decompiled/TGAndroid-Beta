package org.telegram.ui.Components;

import android.view.View;
public final class m implements View.OnClickListener {
    public final int f37348a;
    public final a70 f37349b;
    public final boolean f37350c;
    public final Runnable d;

    public m(a70 a70Var, boolean z10, Runnable runnable, int i7) {
        this.f37348a = i7;
        this.f37349b = a70Var;
        this.f37350c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f37348a) {
            case 0:
                this.f37349b.v();
                if (!this.f37350c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f37349b.v();
                if (!this.f37350c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
