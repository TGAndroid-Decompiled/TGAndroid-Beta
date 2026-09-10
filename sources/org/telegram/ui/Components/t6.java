package org.telegram.ui.Components;

import android.view.View;
public final class t6 implements View.OnClickListener {
    public final int f27343a;
    public final Runnable f27344b;

    public t6(int i10, Runnable runnable) {
        this.f27343a = i10;
        this.f27344b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27343a) {
            case 0:
                this.f27344b.run();
                return;
            case 1:
                Runnable runnable = this.f27344b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27344b.run();
                return;
        }
    }
}
