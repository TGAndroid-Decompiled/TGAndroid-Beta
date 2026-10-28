package org.telegram.ui;

import android.view.View;
public final class kw extends org.telegram.ui.Components.u6 {
    public final int f40924b;
    public final ey f40925c;

    public kw(ey eyVar, int i10) {
        super("animationValue", 0);
        this.f40924b = i10;
        switch (i10) {
            case 1:
                this.f40925c = eyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f40925c = eyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f40924b) {
            case 0:
                ((ey) obj).K4(f7);
                return;
            default:
                ey eyVar = this.f40925c;
                eyVar.I0 = f7;
                ((View) obj).setTranslationY(eyVar.J0 + f7);
                eyVar.N3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40924b) {
            case 0:
                ey eyVar = (ey) obj;
                return Float.valueOf(this.f40925c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f40925c.I0);
        }
    }
}
