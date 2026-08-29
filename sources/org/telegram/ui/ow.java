package org.telegram.ui;

import android.view.View;
public final class ow extends org.telegram.ui.Components.q6 {
    public final int f41233b;
    public final fy f41234c;

    public ow(fy fyVar, int i10) {
        super("animationValue", 0);
        this.f41233b = i10;
        switch (i10) {
            case 1:
                this.f41234c = fyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f41234c = fyVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f9) {
        switch (this.f41233b) {
            case 0:
                ((fy) obj).C4(f9);
                return;
            default:
                fy fyVar = this.f41234c;
                fyVar.E0 = f9;
                ((View) obj).setTranslationY(fyVar.F0 + f9);
                fyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f41233b) {
            case 0:
                fy fyVar = (fy) obj;
                return Float.valueOf(this.f41234c.J);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f41234c.E0);
        }
    }
}
