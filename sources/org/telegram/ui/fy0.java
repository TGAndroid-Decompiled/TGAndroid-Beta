package org.telegram.ui;

import android.view.View;
public final class fy0 implements View.OnClickListener {
    public final int f36991a;
    public final Runnable f36992b;

    public fy0(int i10, Runnable runnable) {
        this.f36991a = i10;
        this.f36992b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36991a) {
            case 0:
                this.f36992b.run();
                return;
            default:
                Runnable runnable = this.f36992b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
