package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f26893a;
    public final n70 f26894b;
    public final boolean f26895c;
    public final Runnable d;

    public i(n70 n70Var, boolean z10, Runnable runnable, int i10) {
        this.f26893a = i10;
        this.f26894b = n70Var;
        this.f26895c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26893a) {
            case 0:
                this.f26894b.u();
                if (!this.f26895c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26894b.u();
                if (!this.f26895c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
