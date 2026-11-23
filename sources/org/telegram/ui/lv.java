package org.telegram.ui;

import android.view.View;
public final class lv extends org.telegram.ui.Components.p6 {
    public final int f49846b;
    public final bx f49847c;

    public lv(bx bxVar, int i7) {
        super("animationValue", 0);
        this.f49846b = i7;
        switch (i7) {
            case 1:
                this.f49847c = bxVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f49847c = bxVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f49846b) {
            case 0:
                ((bx) obj).W4(f10);
                return;
            default:
                bx bxVar = this.f49847c;
                bxVar.J0 = f10;
                ((View) obj).setTranslationY(bxVar.K0 + f10);
                bxVar.R3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f49846b) {
            case 0:
                bx bxVar = (bx) obj;
                return Float.valueOf(this.f49847c.O);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f49847c.J0);
        }
    }
}
