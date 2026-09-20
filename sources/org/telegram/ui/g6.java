package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class g6 implements ViewTreeObserver.OnPreDrawListener {
    public final int f33811a;
    public final Object f33812b;

    public g6(Object obj, int i10) {
        this.f33811a = i10;
        this.f33812b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f33811a) {
            case 0:
                ((z6) this.f33812b).z0();
                return true;
            default:
                kVar = ((org.telegram.ui.ActionBar.n2) ((al) this.f33812b).d).actionBar;
                kVar.invalidate();
                return true;
        }
    }
}
