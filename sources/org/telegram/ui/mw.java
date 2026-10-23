package org.telegram.ui;

import android.view.View;
public final class mw extends org.telegram.ui.Components.s6 {
    public final int f39713b;
    public final ey f39714c;

    public mw(ey eyVar, int i10) {
        super("animationValue", 0);
        this.f39713b = i10;
        switch (i10) {
            case 1:
                this.f39714c = eyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f39714c = eyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f39713b) {
            case 0:
                ((ey) obj).A4(f7);
                return;
            default:
                ey eyVar = this.f39714c;
                eyVar.I0 = f7;
                ((View) obj).setTranslationY(eyVar.J0 + f7);
                eyVar.D3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f39713b) {
            case 0:
                ey eyVar = (ey) obj;
                return Float.valueOf(this.f39714c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f39714c.I0);
        }
    }
}
