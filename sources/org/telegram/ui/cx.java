package org.telegram.ui;

import android.view.View;
public final class cx extends org.telegram.ui.Components.s6 {
    public final int f35593b;
    public final uy f35594c;

    public cx(uy uyVar, int i10) {
        super("animationValue", 0);
        this.f35593b = i10;
        switch (i10) {
            case 1:
                this.f35594c = uyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f35594c = uyVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f35593b) {
            case 0:
                ((uy) obj).C4(f7);
                return;
            default:
                uy uyVar = this.f35594c;
                uyVar.I0 = f7;
                ((View) obj).setTranslationY(uyVar.J0 + f7);
                uyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f35593b) {
            case 0:
                uy uyVar = (uy) obj;
                return Float.valueOf(this.f35594c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f35594c.I0);
        }
    }
}
