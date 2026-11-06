package org.telegram.ui.Components;

import android.view.View;
public final class o6 implements View.OnClickListener {
    public final int f36636a;
    public final Runnable f36637b;

    public o6(int i7, Runnable runnable) {
        this.f36636a = i7;
        this.f36637b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36636a) {
            case 0:
                this.f36637b.run();
                return;
            case 1:
                Runnable runnable = this.f36637b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36637b.run();
                return;
        }
    }
}
