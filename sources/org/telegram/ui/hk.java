package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;
public final class hk implements ViewTreeObserver.OnPreDrawListener {
    public final int f46378a;
    public final Object f46379b;

    public hk(Object obj, int i7) {
        this.f46378a = i7;
        this.f46379b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.l lVar;
        int i7 = this.f46378a;
        Object obj = this.f46379b;
        switch (i7) {
            case 0:
                lVar = ((org.telegram.ui.ActionBar.f2) ((ik) obj).d).actionBar;
                lVar.invalidate();
                return true;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.V6;
                profileActivity.B5();
                profileActivity.C5();
                return true;
            default:
                ((e51) obj).t0();
                return true;
        }
    }
}
