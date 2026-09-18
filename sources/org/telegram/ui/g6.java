package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class g6 implements ViewTreeObserver.OnPreDrawListener {
    public final int f33702a;
    public final Object f33703b;

    public g6(Object obj, int i10) {
        this.f33702a = i10;
        this.f33703b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f33702a) {
            case 0:
                ((z6) this.f33703b).z0();
                return true;
            default:
                kVar = ((org.telegram.ui.ActionBar.n2) ((al) this.f33703b).d).actionBar;
                kVar.invalidate();
                return true;
        }
    }
}
