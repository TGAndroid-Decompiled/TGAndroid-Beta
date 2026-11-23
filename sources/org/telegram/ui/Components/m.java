package org.telegram.ui.Components;

import android.view.View;
public final class m implements View.OnClickListener {
    public final int f37354a;
    public final a70 f37355b;
    public final boolean f37356c;
    public final Runnable d;

    public m(a70 a70Var, boolean z10, Runnable runnable, int i7) {
        this.f37354a = i7;
        this.f37355b = a70Var;
        this.f37356c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f37354a) {
            case 0:
                this.f37355b.v();
                if (!this.f37356c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f37355b.v();
                if (!this.f37356c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
