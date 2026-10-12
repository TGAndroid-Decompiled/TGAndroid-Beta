package org.telegram.ui;

import android.view.View;
public final class dx extends org.telegram.ui.Components.t6 {
    public final int f36926b;
    public final vy f36927c;

    public dx(vy vyVar, int i10) {
        super("animationValue", 0);
        this.f36926b = i10;
        switch (i10) {
            case 1:
                this.f36927c = vyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f36927c = vyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f36926b) {
            case 0:
                ((vy) obj).z4(f7);
                return;
            default:
                vy vyVar = this.f36927c;
                vyVar.I0 = f7;
                ((View) obj).setTranslationY(vyVar.J0 + f7);
                vyVar.C3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f36926b) {
            case 0:
                vy vyVar = (vy) obj;
                return Float.valueOf(this.f36927c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f36927c.I0);
        }
    }
}
