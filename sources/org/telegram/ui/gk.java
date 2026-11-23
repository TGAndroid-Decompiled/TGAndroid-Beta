package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;
public final class gk implements ViewTreeObserver.OnPreDrawListener {
    public final int f48312a;
    public final Object f48313b;

    public gk(Object obj, int i7) {
        this.f48312a = i7;
        this.f48313b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.f48312a;
        Object obj = this.f48313b;
        switch (i7) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.g2) ((hk) obj).d).actionBar;
                kVar.invalidate();
                return true;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.C5();
                profileActivity.D5();
                return true;
            default:
                ((b51) obj).t0();
                return true;
        }
    }
}
