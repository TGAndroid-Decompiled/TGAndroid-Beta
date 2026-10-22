package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31164a;
    public final Runnable f31165b;

    public v6(int i10, Runnable runnable) {
        this.f31164a = i10;
        this.f31165b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31164a) {
            case 0:
                this.f31165b.run();
                return;
            case 1:
                Runnable runnable = this.f31165b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31165b.run();
                return;
        }
    }
}
