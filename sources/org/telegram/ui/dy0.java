package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class dy0 implements bh.k {
    public final int f36760a;
    public final Object f36761b;

    public dy0(Object obj, int i10) {
        this.f36760a = i10;
        this.f36761b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f36760a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f36761b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f33882a.drawChild(canvas, view, j10);
            default:
                return ((we1) this.f36761b).drawChild(canvas, view, j10);
        }
    }
}
