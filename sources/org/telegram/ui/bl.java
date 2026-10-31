package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;
public final class bl implements ViewTreeObserver.OnPreDrawListener {
    public final int f36276a;
    public final Object f36277b;

    public bl(Object obj, int i10) {
        this.f36276a = i10;
        this.f36277b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.l lVar;
        int i10 = this.f36276a;
        Object obj = this.f36277b;
        switch (i10) {
            case 0:
                lVar = ((org.telegram.ui.ActionBar.k2) ((cl) obj).d).actionBar;
                lVar.invalidate();
                return true;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.R6;
                profileActivity.x5();
                profileActivity.y5();
                return true;
            default:
                ((u61) obj).s0();
                return true;
        }
    }
}
