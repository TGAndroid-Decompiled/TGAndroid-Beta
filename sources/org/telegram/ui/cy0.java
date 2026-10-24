package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class cy0 implements bh.k {
    public final int f36423a;
    public final Object f36424b;

    public cy0(Object obj, int i10) {
        this.f36423a = i10;
        this.f36424b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f36423a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f36424b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f33884a.drawChild(canvas, view, j10);
            default:
                return ((ve1) this.f36424b).drawChild(canvas, view, j10);
        }
    }
}
