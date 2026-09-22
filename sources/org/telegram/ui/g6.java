package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class g6 implements ViewTreeObserver.OnPreDrawListener {
    public final int f33839a;
    public final Object f33840b;

    public g6(Object obj, int i10) {
        this.f33839a = i10;
        this.f33840b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f33839a) {
            case 0:
                ((z6) this.f33840b).z0();
                return true;
            default:
                kVar = ((org.telegram.ui.ActionBar.n2) ((bl) this.f33840b).d).actionBar;
                kVar.invalidate();
                return true;
        }
    }
}
