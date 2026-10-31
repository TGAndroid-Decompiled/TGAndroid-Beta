package org.telegram.ui;

import android.view.View;
public final class nw extends org.telegram.ui.Components.h6 {
    public final int f40060b;
    public final ay f40061c;

    public nw(ay ayVar, int i10) {
        super("animationValue", 0);
        this.f40060b = i10;
        switch (i10) {
            case 1:
                this.f40061c = ayVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f40061c = ayVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f40060b) {
            case 0:
                ((ay) obj).N4(f7);
                return;
            default:
                ay ayVar = this.f40061c;
                ayVar.I0 = f7;
                ((View) obj).setTranslationY(ayVar.J0 + f7);
                ayVar.Q3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40060b) {
            case 0:
                ay ayVar = (ay) obj;
                return Float.valueOf(this.f40061c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f40061c.I0);
        }
    }
}
