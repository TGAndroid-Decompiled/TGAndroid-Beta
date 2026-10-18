package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31184a;
    public final Runnable f31185b;

    public v6(int i10, Runnable runnable) {
        this.f31184a = i10;
        this.f31185b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31184a) {
            case 0:
                this.f31185b.run();
                return;
            case 1:
                Runnable runnable = this.f31185b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31185b.run();
                return;
        }
    }
}
