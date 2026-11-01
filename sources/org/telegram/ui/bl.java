package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;
public final class bl implements ViewTreeObserver.OnPreDrawListener {
    public final int f36080a;
    public final Object f36081b;

    public bl(Object obj, int i10) {
        this.f36080a = i10;
        this.f36081b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.l lVar;
        int i10 = this.f36080a;
        Object obj = this.f36081b;
        switch (i10) {
            case 0:
                lVar = ((org.telegram.ui.ActionBar.k2) ((cl) obj).d).actionBar;
                lVar.invalidate();
                return true;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                profileActivity.y5();
                profileActivity.z5();
                return true;
            default:
                ((s61) obj).t0();
                return true;
        }
    }
}
