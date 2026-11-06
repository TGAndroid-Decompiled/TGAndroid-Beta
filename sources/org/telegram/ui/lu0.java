package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class lu0 implements View.OnClickListener {
    public final int f47591a;
    public final Runnable f47592b;

    public lu0(int i7, Runnable runnable) {
        this.f47591a = i7;
        this.f47592b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f47591a;
        Runnable runnable = this.f47592b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.S6;
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
