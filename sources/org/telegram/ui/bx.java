package org.telegram.ui;

import android.view.View;
public final class bx extends org.telegram.ui.Components.t6 {
    public final int f36454b;
    public final ty f36455c;

    public bx(ty tyVar, int i10) {
        super("animationValue", 0);
        this.f36454b = i10;
        switch (i10) {
            case 1:
                this.f36455c = tyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f36455c = tyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f36454b) {
            case 0:
                ((ty) obj).z4(f7);
                return;
            default:
                ty tyVar = this.f36455c;
                tyVar.I0 = f7;
                ((View) obj).setTranslationY(tyVar.J0 + f7);
                tyVar.C3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f36454b) {
            case 0:
                ty tyVar = (ty) obj;
                return Float.valueOf(this.f36455c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f36455c.I0);
        }
    }
}
