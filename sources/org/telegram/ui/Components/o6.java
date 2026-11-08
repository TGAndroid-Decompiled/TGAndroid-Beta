package org.telegram.ui.Components;

import android.view.View;
public final class o6 implements View.OnClickListener {
    public final int f36580a;
    public final Runnable f36581b;

    public o6(int i7, Runnable runnable) {
        this.f36580a = i7;
        this.f36581b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36580a) {
            case 0:
                this.f36581b.run();
                return;
            case 1:
                Runnable runnable = this.f36581b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36581b.run();
                return;
        }
    }
}
