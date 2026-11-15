package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;
public final class fk implements ViewTreeObserver.OnPreDrawListener {
    public final int f47151a;
    public final Object f47152b;

    public fk(Object obj, int i7) {
        this.f47151a = i7;
        this.f47152b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.f47151a;
        Object obj = this.f47152b;
        switch (i7) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.e2) ((gk) obj).d).actionBar;
                kVar.invalidate();
                return true;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.X6;
                profileActivity.B5();
                profileActivity.C5();
                return true;
            default:
                ((z41) obj).t0();
                return true;
        }
    }
}
