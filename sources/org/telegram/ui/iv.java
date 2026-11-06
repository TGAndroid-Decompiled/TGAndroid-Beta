package org.telegram.ui;

import android.view.View;
public final class iv extends org.telegram.ui.Components.l6 {
    public final int f46723b;
    public final ww f46724c;

    public iv(ww wwVar, int i7) {
        super("animationValue", 0);
        this.f46723b = i7;
        switch (i7) {
            case 1:
                this.f46724c = wwVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f46724c = wwVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f46723b) {
            case 0:
                ((ww) obj).O4(f10);
                return;
            default:
                ww wwVar = this.f46724c;
                wwVar.I0 = f10;
                ((View) obj).setTranslationY(wwVar.J0 + f10);
                wwVar.R3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f46723b) {
            case 0:
                ww wwVar = (ww) obj;
                return Float.valueOf(this.f46724c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f46724c.I0);
        }
    }
}
