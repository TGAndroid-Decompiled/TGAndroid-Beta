package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class i6 implements ViewTreeObserver.OnPreDrawListener {
    public final int f34370a;
    public final Object f34371b;

    public i6(Object obj, int i10) {
        this.f34370a = i10;
        this.f34371b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f34370a) {
            case 0:
                ((b7) this.f34371b).z0();
                return true;
            default:
                lVar = ((org.telegram.ui.ActionBar.o2) ((al) this.f34371b).d).actionBar;
                lVar.invalidate();
                return true;
        }
    }
}
