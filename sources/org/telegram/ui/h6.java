package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class h6 implements ViewTreeObserver.OnPreDrawListener {
    public final int f34185a;
    public final Object f34186b;

    public h6(Object obj, int i10) {
        this.f34185a = i10;
        this.f34186b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f34185a) {
            case 0:
                ((a7) this.f34186b).z0();
                return true;
            default:
                kVar = ((org.telegram.ui.ActionBar.o2) ((cl) this.f34186b).d).actionBar;
                kVar.invalidate();
                return true;
        }
    }
}
