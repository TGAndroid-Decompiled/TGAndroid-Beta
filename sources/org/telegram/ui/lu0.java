package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class lu0 implements View.OnClickListener {
    public final int f49844a;
    public final Runnable f49845b;

    public lu0(int i7, Runnable runnable) {
        this.f49844a = i7;
        this.f49845b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49844a;
        Runnable runnable = this.f49845b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
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
