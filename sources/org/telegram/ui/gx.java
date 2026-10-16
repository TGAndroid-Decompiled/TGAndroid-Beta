package org.telegram.ui;

import android.view.View;
public final class gx extends org.telegram.ui.Components.u6 {
    public final int f36324b;
    public final yy f36325c;

    public gx(yy yyVar, int i10) {
        super("animationValue", 0);
        this.f36324b = i10;
        switch (i10) {
            case 1:
                this.f36325c = yyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f36325c = yyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f36324b) {
            case 0:
                ((yy) obj).A4(f7);
                return;
            default:
                yy yyVar = this.f36325c;
                yyVar.I0 = f7;
                ((View) obj).setTranslationY(yyVar.J0 + f7);
                yyVar.D3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f36324b) {
            case 0:
                yy yyVar = (yy) obj;
                return Float.valueOf(this.f36325c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f36325c.I0);
        }
    }
}
