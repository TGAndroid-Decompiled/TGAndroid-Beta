package org.telegram.ui.Components;

import android.view.View;
public final class o6 implements View.OnClickListener {
    public final int f36519a;
    public final Runnable f36520b;

    public o6(int i7, Runnable runnable) {
        this.f36519a = i7;
        this.f36520b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36519a) {
            case 0:
                this.f36520b.run();
                return;
            case 1:
                Runnable runnable = this.f36520b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36520b.run();
                return;
        }
    }
}
