package org.telegram.ui;

import android.view.View;
public final class fv extends org.telegram.ui.Components.j6 {
    public final int f45374b;
    public final uw f45375c;

    public fv(uw uwVar, int i3) {
        super("animationValue", 0);
        this.f45374b = i3;
        switch (i3) {
            case 1:
                this.f45375c = uwVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f45375c = uwVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f45374b) {
            case 0:
                ((uw) obj).O4(f10);
                return;
            default:
                uw uwVar = this.f45375c;
                uwVar.J0 = f10;
                ((View) obj).setTranslationY(uwVar.K0 + f10);
                uwVar.R3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f45374b) {
            case 0:
                uw uwVar = (uw) obj;
                return Float.valueOf(this.f45375c.O);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f45375c.J0);
        }
    }
}
