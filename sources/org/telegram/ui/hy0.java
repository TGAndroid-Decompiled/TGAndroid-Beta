package org.telegram.ui;

import android.view.View;
public final class hy0 implements View.OnClickListener {
    public final int f37985a;
    public final Runnable f37986b;

    public hy0(int i10, Runnable runnable) {
        this.f37985a = i10;
        this.f37986b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37985a) {
            case 0:
                this.f37986b.run();
                return;
            default:
                Runnable runnable = this.f37986b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
