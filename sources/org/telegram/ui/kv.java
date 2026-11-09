package org.telegram.ui;

import android.view.View;
public final class kv extends org.telegram.ui.Components.l6 {
    public final int f47374b;
    public final yw f47375c;

    public kv(yw ywVar, int i7) {
        super("animationValue", 0);
        this.f47374b = i7;
        switch (i7) {
            case 1:
                this.f47375c = ywVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f47375c = ywVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f47374b) {
            case 0:
                ((yw) obj).O4(f10);
                return;
            default:
                yw ywVar = this.f47375c;
                ywVar.I0 = f10;
                ((View) obj).setTranslationY(ywVar.J0 + f10);
                ywVar.R3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f47374b) {
            case 0:
                yw ywVar = (yw) obj;
                return Float.valueOf(this.f47375c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f47375c.I0);
        }
    }
}
