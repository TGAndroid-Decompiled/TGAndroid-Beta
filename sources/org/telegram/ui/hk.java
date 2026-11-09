package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;
public final class hk implements ViewTreeObserver.OnPreDrawListener {
    public final int f46336a;
    public final Object f46337b;

    public hk(Object obj, int i7) {
        this.f46336a = i7;
        this.f46337b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.f46336a;
        Object obj = this.f46337b;
        switch (i7) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.f2) ((ik) obj).d).actionBar;
                kVar.invalidate();
                return true;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.V6;
                profileActivity.B5();
                profileActivity.C5();
                return true;
            default:
                ((d51) obj).t0();
                return true;
        }
    }
}
