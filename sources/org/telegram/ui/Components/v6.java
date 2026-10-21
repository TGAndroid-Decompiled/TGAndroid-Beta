package org.telegram.ui.Components;

import android.view.View;
public final class v6 implements View.OnClickListener {
    public final int f31161a;
    public final Runnable f31162b;

    public v6(int i10, Runnable runnable) {
        this.f31161a = i10;
        this.f31162b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31161a) {
            case 0:
                this.f31162b.run();
                return;
            case 1:
                Runnable runnable = this.f31162b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31162b.run();
                return;
        }
    }
}
