package org.telegram.ui;

import android.view.View;
public final class bx extends org.telegram.ui.Components.r6 {
    public final int f35232b;
    public final uy f35233c;

    public bx(uy uyVar, int i10) {
        super("animationValue", 0);
        this.f35232b = i10;
        switch (i10) {
            case 1:
                this.f35233c = uyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f35233c = uyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f35232b) {
            case 0:
                ((uy) obj).L4(f7);
                return;
            default:
                uy uyVar = this.f35233c;
                uyVar.I0 = f7;
                ((View) obj).setTranslationY(uyVar.J0 + f7);
                uyVar.O3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f35232b) {
            case 0:
                uy uyVar = (uy) obj;
                return Float.valueOf(this.f35233c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f35233c.I0);
        }
    }
}
