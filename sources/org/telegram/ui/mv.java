package org.telegram.ui;

import android.view.View;
public final class mv extends org.telegram.ui.Components.q6 {
    public final int f49991b;
    public final cx f49992c;

    public mv(cx cxVar, int i7) {
        super("animationValue", 0);
        this.f49991b = i7;
        switch (i7) {
            case 1:
                this.f49992c = cxVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f49992c = cxVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f49991b) {
            case 0:
                ((cx) obj).W4(f10);
                return;
            default:
                cx cxVar = this.f49992c;
                cxVar.J0 = f10;
                ((View) obj).setTranslationY(cxVar.K0 + f10);
                cxVar.R3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f49991b) {
            case 0:
                cx cxVar = (cx) obj;
                return Float.valueOf(this.f49992c.O);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f49992c.J0);
        }
    }
}
