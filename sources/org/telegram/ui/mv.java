package org.telegram.ui;

import android.view.View;
public final class mv extends org.telegram.ui.Components.p6 {
    public final int f49950b;
    public final cx f49951c;

    public mv(cx cxVar, int i7) {
        super("animationValue", 0);
        this.f49950b = i7;
        switch (i7) {
            case 1:
                this.f49951c = cxVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f49951c = cxVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f49950b) {
            case 0:
                ((cx) obj).W4(f10);
                return;
            default:
                cx cxVar = this.f49951c;
                cxVar.J0 = f10;
                ((View) obj).setTranslationY(cxVar.K0 + f10);
                cxVar.R3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f49950b) {
            case 0:
                cx cxVar = (cx) obj;
                return Float.valueOf(this.f49951c.O);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f49951c.J0);
        }
    }
}
