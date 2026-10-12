package org.telegram.ui;

import android.view.View;
public final class cz0 implements View.OnClickListener {
    public final int f36584a;
    public final Runnable f36585b;

    public cz0(int i10, Runnable runnable) {
        this.f36584a = i10;
        this.f36585b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36584a) {
            case 0:
                this.f36585b.run();
                return;
            default:
                Runnable runnable = this.f36585b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
