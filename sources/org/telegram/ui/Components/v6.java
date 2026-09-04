package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31140a;
    public final Runnable f31141b;

    public v6(int i10, Runnable runnable) {
        this.f31140a = i10;
        this.f31141b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31140a) {
            case 0:
                this.f31141b.run();
                return;
            case 1:
                Runnable runnable = this.f31141b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31141b.run();
                return;
        }
    }
}
