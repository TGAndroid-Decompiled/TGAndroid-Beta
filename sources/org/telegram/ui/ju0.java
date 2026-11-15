package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class ju0 implements View.OnClickListener {
    public final int f48463a;
    public final Runnable f48464b;

    public ju0(int i7, Runnable runnable) {
        this.f48463a = i7;
        this.f48464b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f48463a;
        Runnable runnable = this.f48464b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.X6;
                runnable.run();
                return;
            default:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
