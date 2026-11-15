package org.telegram.ui;

import android.view.View;
public final class jv extends org.telegram.ui.Components.j6 {
    public final int f48419b;
    public final yw f48420c;

    public jv(yw ywVar, int i7) {
        super("animationValue", 0);
        this.f48419b = i7;
        switch (i7) {
            case 1:
                this.f48420c = ywVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f48420c = ywVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f48419b) {
            case 0:
                ((yw) obj).O4(f10);
                return;
            default:
                yw ywVar = this.f48420c;
                ywVar.J0 = f10;
                ((View) obj).setTranslationY(ywVar.K0 + f10);
                ywVar.R3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f48419b) {
            case 0:
                yw ywVar = (yw) obj;
                return Float.valueOf(this.f48420c.O);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f48420c.J0);
        }
    }
}
