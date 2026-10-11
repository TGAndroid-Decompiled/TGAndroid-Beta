package org.telegram.ui;

import android.view.View;
public final class ax extends org.telegram.ui.Components.t6 {
    public final int f36230b;
    public final sy f36231c;

    public ax(sy syVar, int i10) {
        super("animationValue", 0);
        this.f36230b = i10;
        switch (i10) {
            case 1:
                this.f36231c = syVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f36231c = syVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f36230b) {
            case 0:
                ((sy) obj).z4(f7);
                return;
            default:
                sy syVar = this.f36231c;
                syVar.I0 = f7;
                ((View) obj).setTranslationY(syVar.J0 + f7);
                syVar.C3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f36230b) {
            case 0:
                sy syVar = (sy) obj;
                return Float.valueOf(this.f36231c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f36231c.I0);
        }
    }
}
