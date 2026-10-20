package org.telegram.ui;

import android.view.View;
public final class kw extends org.telegram.ui.Components.s6 {
    public final int f38675b;
    public final cy f38676c;

    public kw(cy cyVar, int i10) {
        super("animationValue", 0);
        this.f38675b = i10;
        switch (i10) {
            case 1:
                this.f38676c = cyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f38676c = cyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f38675b) {
            case 0:
                ((cy) obj).A4(f7);
                return;
            default:
                cy cyVar = this.f38676c;
                cyVar.I0 = f7;
                ((View) obj).setTranslationY(cyVar.J0 + f7);
                cyVar.D3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f38675b) {
            case 0:
                cy cyVar = (cy) obj;
                return Float.valueOf(this.f38676c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f38676c.I0);
        }
    }
}
