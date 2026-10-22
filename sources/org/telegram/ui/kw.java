package org.telegram.ui;

import android.view.View;
public final class kw extends org.telegram.ui.Components.s6 {
    public final int f38679b;
    public final cy f38680c;

    public kw(cy cyVar, int i10) {
        super("animationValue", 0);
        this.f38679b = i10;
        switch (i10) {
            case 1:
                this.f38680c = cyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f38680c = cyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f38679b) {
            case 0:
                ((cy) obj).A4(f7);
                return;
            default:
                cy cyVar = this.f38680c;
                cyVar.I0 = f7;
                ((View) obj).setTranslationY(cyVar.J0 + f7);
                cyVar.D3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f38679b) {
            case 0:
                cy cyVar = (cy) obj;
                return Float.valueOf(this.f38680c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f38680c.I0);
        }
    }
}
