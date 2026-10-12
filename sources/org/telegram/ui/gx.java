package org.telegram.ui;

import android.view.View;
public final class gx extends org.telegram.ui.Components.u6 {
    public final int f36538b;
    public final yy f36539c;

    public gx(yy yyVar, int i10) {
        super("animationValue", 0);
        this.f36538b = i10;
        switch (i10) {
            case 1:
                this.f36539c = yyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f36539c = yyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f36538b) {
            case 0:
                ((yy) obj).z4(f7);
                return;
            default:
                yy yyVar = this.f36539c;
                yyVar.I0 = f7;
                ((View) obj).setTranslationY(yyVar.J0 + f7);
                yyVar.C3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f36538b) {
            case 0:
                yy yyVar = (yy) obj;
                return Float.valueOf(this.f36539c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f36539c.I0);
        }
    }
}
