package org.telegram.ui;

import android.view.View;
public final class cx extends org.telegram.ui.Components.q6 {
    public final int f32903b;
    public final uy f32904c;

    public cx(uy uyVar, int i10) {
        super("animationValue", 0);
        this.f32903b = i10;
        switch (i10) {
            case 1:
                this.f32904c = uyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f32904c = uyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f32903b) {
            case 0:
                ((uy) obj).C4(f7);
                return;
            default:
                uy uyVar = this.f32904c;
                uyVar.I0 = f7;
                ((View) obj).setTranslationY(uyVar.J0 + f7);
                uyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f32903b) {
            case 0:
                uy uyVar = (uy) obj;
                return Float.valueOf(this.f32904c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f32904c.I0);
        }
    }
}
