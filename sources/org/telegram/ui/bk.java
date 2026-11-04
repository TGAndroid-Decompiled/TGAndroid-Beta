package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;
public final class bk implements ViewTreeObserver.OnPreDrawListener {
    public final int f44067a;
    public final Object f44068b;

    public bk(Object obj, int i3) {
        this.f44067a = i3;
        this.f44068b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        int i3 = this.f44067a;
        Object obj = this.f44068b;
        switch (i3) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.d2) ((ck) obj).d).actionBar;
                kVar.invalidate();
                return true;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.T6;
                profileActivity.y5();
                profileActivity.z5();
                return true;
            default:
                ((r41) obj).t0();
                return true;
        }
    }
}
