package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;
public final class gk implements ViewTreeObserver.OnPreDrawListener {
    public final int f48050a;
    public final Object f48051b;

    public gk(Object obj, int i7) {
        this.f48050a = i7;
        this.f48051b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.f48050a;
        Object obj = this.f48051b;
        switch (i7) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.h2) ((hk) obj).d).actionBar;
                kVar.invalidate();
                return true;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.C5();
                profileActivity.D5();
                return true;
            default:
                ((c51) obj).t0();
                return true;
        }
    }
}
