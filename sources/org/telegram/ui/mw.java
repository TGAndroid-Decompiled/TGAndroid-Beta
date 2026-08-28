package org.telegram.ui;

import android.view.View;
public final class mw extends org.telegram.ui.Components.l6 {
    public final int f40539b;
    public final dy f40540c;

    public mw(dy dyVar, int i9) {
        super("animationValue", 0);
        this.f40539b = i9;
        switch (i9) {
            case 1:
                this.f40540c = dyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f40540c = dyVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f40539b) {
            case 0:
                ((dy) obj).C4(f10);
                return;
            default:
                dy dyVar = this.f40540c;
                dyVar.E0 = f10;
                ((View) obj).setTranslationY(dyVar.F0 + f10);
                dyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40539b) {
            case 0:
                dy dyVar = (dy) obj;
                return Float.valueOf(this.f40540c.J);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f40540c.E0);
        }
    }
}
