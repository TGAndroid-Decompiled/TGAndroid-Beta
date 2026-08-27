package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

public final class dv extends FrameLayout {

    public org.telegram.ui.ActionBar.n2 f37553a;

    public FrameLayout f37554b;

    public org.telegram.ui.ActionBar.k f37555c;
    public org.telegram.ui.Components.zk0 d;

    public hh.f1 f37556e;

    public int f37557f;
    public final ev h;

    public dv(ev evVar, Context context) {
        super(context);
        this.h = evVar;
    }

    @Override
    public final void setTranslationX(float f10) {
        dv dvVar;
        super.setTranslationX(f10);
        ev evVar = this.h;
        dv[] dvVarArr = evVar.f37857f;
        if (evVar.f37858n && (dvVar = dvVarArr[0]) == this) {
            evVar.f37856e.j(Math.abs(dvVar.getTranslationX()) / dvVarArr[0].getMeasuredWidth(), dvVarArr[1].f37557f);
        }
    }
}
