package org.telegram.ui;

import android.view.View;
public final class ex extends org.telegram.ui.Components.p6 {
    public final int f33491b;
    public final wy f33492c;

    public ex(wy wyVar, int i10) {
        super("animationValue", 0);
        this.f33491b = i10;
        switch (i10) {
            case 1:
                this.f33492c = wyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f33492c = wyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f33491b) {
            case 0:
                ((wy) obj).C4(f7);
                return;
            default:
                wy wyVar = this.f33492c;
                wyVar.I0 = f7;
                ((View) obj).setTranslationY(wyVar.J0 + f7);
                wyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f33491b) {
            case 0:
                wy wyVar = (wy) obj;
                return Float.valueOf(this.f33492c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f33492c.I0);
        }
    }
}
