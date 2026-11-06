package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;
public final class fk implements ViewTreeObserver.OnPreDrawListener {
    public final int f45652a;
    public final Object f45653b;

    public fk(Object obj, int i7) {
        this.f45652a = i7;
        this.f45653b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.f45652a;
        Object obj = this.f45653b;
        switch (i7) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.f2) ((gk) obj).d).actionBar;
                kVar.invalidate();
                return true;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                profileActivity.y5();
                profileActivity.z5();
                return true;
            default:
                ((c51) obj).t0();
                return true;
        }
    }
}
