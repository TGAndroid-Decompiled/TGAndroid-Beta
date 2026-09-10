package org.telegram.ui;

import android.view.View;
public final class ex extends org.telegram.ui.Components.q6 {
    public final int f32640b;
    public final wy f32641c;

    public ex(wy wyVar, int i10) {
        super("animationValue", 0);
        this.f32640b = i10;
        switch (i10) {
            case 1:
                this.f32641c = wyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f32641c = wyVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f32640b) {
            case 0:
                ((wy) obj).C4(f7);
                return;
            default:
                wy wyVar = this.f32641c;
                wyVar.I0 = f7;
                ((View) obj).setTranslationY(wyVar.J0 + f7);
                wyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f32640b) {
            case 0:
                wy wyVar = (wy) obj;
                return Float.valueOf(this.f32641c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f32641c.I0);
        }
    }
}
