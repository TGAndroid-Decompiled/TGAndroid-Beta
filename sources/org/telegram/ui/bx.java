package org.telegram.ui;

import android.view.View;
public final class bx extends org.telegram.ui.Components.t6 {
    public final int f36452b;
    public final ty f36453c;

    public bx(ty tyVar, int i10) {
        super("animationValue", 0);
        this.f36452b = i10;
        switch (i10) {
            case 1:
                this.f36453c = tyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f36453c = tyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f36452b) {
            case 0:
                ((ty) obj).z4(f7);
                return;
            default:
                ty tyVar = this.f36453c;
                tyVar.I0 = f7;
                ((View) obj).setTranslationY(tyVar.J0 + f7);
                tyVar.C3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f36452b) {
            case 0:
                ty tyVar = (ty) obj;
                return Float.valueOf(this.f36453c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f36453c.I0);
        }
    }
}
