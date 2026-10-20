package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31160a;
    public final Runnable f31161b;

    public v6(int i10, Runnable runnable) {
        this.f31160a = i10;
        this.f31161b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31160a) {
            case 0:
                this.f31161b.run();
                return;
            case 1:
                Runnable runnable = this.f31161b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31161b.run();
                return;
        }
    }
}
