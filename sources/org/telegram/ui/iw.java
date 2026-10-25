package org.telegram.ui;

import android.view.View;
public final class iw extends org.telegram.ui.Components.u6 {
    public final int f40357b;
    public final cy f40358c;

    public iw(cy cyVar, int i10) {
        super("animationValue", 0);
        this.f40357b = i10;
        switch (i10) {
            case 1:
                this.f40358c = cyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f40358c = cyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f40357b) {
            case 0:
                ((cy) obj).K4(f7);
                return;
            default:
                cy cyVar = this.f40358c;
                cyVar.I0 = f7;
                ((View) obj).setTranslationY(cyVar.J0 + f7);
                cyVar.N3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40357b) {
            case 0:
                cy cyVar = (cy) obj;
                return Float.valueOf(this.f40358c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f40358c.I0);
        }
    }
}
