package org.telegram.ui;

import android.view.View;
public final class lv extends org.telegram.ui.Components.k6 {
    public final int f47698b;
    public final zw f47699c;

    public lv(zw zwVar, int i7) {
        super("animationValue", 0);
        this.f47698b = i7;
        switch (i7) {
            case 1:
                this.f47699c = zwVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f47699c = zwVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f47698b) {
            case 0:
                ((zw) obj).O4(f10);
                return;
            default:
                zw zwVar = this.f47699c;
                zwVar.I0 = f10;
                ((View) obj).setTranslationY(zwVar.J0 + f10);
                zwVar.R3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f47698b) {
            case 0:
                zw zwVar = (zw) obj;
                return Float.valueOf(this.f47699c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f47699c.I0);
        }
    }
}
