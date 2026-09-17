package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31168a;
    public final Runnable f31169b;

    public v6(int i10, Runnable runnable) {
        this.f31168a = i10;
        this.f31169b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31168a) {
            case 0:
                this.f31169b.run();
                return;
            case 1:
                Runnable runnable = this.f31169b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31169b.run();
                return;
        }
    }
}
