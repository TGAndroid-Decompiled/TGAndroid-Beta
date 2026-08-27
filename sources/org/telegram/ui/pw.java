package org.telegram.ui;

import android.view.View;

public final class pw extends org.telegram.ui.Components.l6 {

    public final int f41438b;

    public final gy f41439c;

    public pw(gy gyVar, int i10) {
        super("animationValue", 0);
        this.f41438b = i10;
        switch (i10) {
            case 1:
                this.f41439c = gyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.f41439c = gyVar;
                break;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f41438b) {
            case 0:
                ((gy) obj).C4(f10);
                break;
            default:
                gy gyVar = this.f41439c;
                gyVar.E0 = f10;
                ((View) obj).setTranslationY(gyVar.F0 + f10);
                gyVar.F3();
                break;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f41438b) {
            case 0:
                return Float.valueOf(this.f41439c.J);
            default:
                return Float.valueOf(this.f41439c.E0);
        }
    }
}
