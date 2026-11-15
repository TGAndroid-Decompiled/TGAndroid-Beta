package org.telegram.ui;

import android.view.View;
public final class jv extends org.telegram.ui.Components.j6 {
    public final int f48465b;
    public final yw f48466c;

    public jv(yw ywVar, int i7) {
        super("animationValue", 0);
        this.f48465b = i7;
        switch (i7) {
            case 1:
                this.f48466c = ywVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f48466c = ywVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f48465b) {
            case 0:
                ((yw) obj).O4(f10);
                return;
            default:
                yw ywVar = this.f48466c;
                ywVar.J0 = f10;
                ((View) obj).setTranslationY(ywVar.K0 + f10);
                ywVar.R3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f48465b) {
            case 0:
                yw ywVar = (yw) obj;
                return Float.valueOf(this.f48466c.O);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f48466c.J0);
        }
    }
}
