package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;
public final class fk implements ViewTreeObserver.OnPreDrawListener {
    public final int f45657a;
    public final Object f45658b;

    public fk(Object obj, int i7) {
        this.f45657a = i7;
        this.f45658b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.f45657a;
        Object obj = this.f45658b;
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
