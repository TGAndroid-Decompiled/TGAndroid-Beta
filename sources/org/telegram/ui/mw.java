package org.telegram.ui;

import android.view.View;
public final class mw extends org.telegram.ui.Components.h6 {
    public final int f39624b;
    public final zx f39625c;

    public mw(zx zxVar, int i10) {
        super("animationValue", 0);
        this.f39624b = i10;
        switch (i10) {
            case 1:
                this.f39625c = zxVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f39625c = zxVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f39624b) {
            case 0:
                ((zx) obj).O4(f7);
                return;
            default:
                zx zxVar = this.f39625c;
                zxVar.I0 = f7;
                ((View) obj).setTranslationY(zxVar.J0 + f7);
                zxVar.R3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f39624b) {
            case 0:
                zx zxVar = (zx) obj;
                return Float.valueOf(this.f39625c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f39625c.I0);
        }
    }
}
