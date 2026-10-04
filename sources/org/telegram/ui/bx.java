package org.telegram.ui;

import android.view.View;
public final class bx extends org.telegram.ui.Components.r6 {
    public final int f35208b;
    public final uy f35209c;

    public bx(uy uyVar, int i10) {
        super("animationValue", 0);
        this.f35208b = i10;
        switch (i10) {
            case 1:
                this.f35209c = uyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f35209c = uyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f35208b) {
            case 0:
                ((uy) obj).L4(f7);
                return;
            default:
                uy uyVar = this.f35209c;
                uyVar.I0 = f7;
                ((View) obj).setTranslationY(uyVar.J0 + f7);
                uyVar.O3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f35208b) {
            case 0:
                uy uyVar = (uy) obj;
                return Float.valueOf(this.f35209c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f35209c.I0);
        }
    }
}
