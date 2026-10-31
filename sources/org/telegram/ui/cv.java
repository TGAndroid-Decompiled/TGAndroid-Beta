package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class cv extends FrameLayout {
    public org.telegram.ui.ActionBar.k2 f36553a;
    public FrameLayout f36554b;
    public org.telegram.ui.ActionBar.l f36555c;
    public org.telegram.ui.Components.tk0 d;
    public ag.b1 e;
    public int f36556f;
    public final dv h;

    public cv(dv dvVar, Context context) {
        super(context);
        this.h = dvVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        cv cvVar;
        super.setTranslationX(f7);
        dv dvVar = this.h;
        cv[] cvVarArr = dvVar.f36841f;
        if (dvVar.f36842n && (cvVar = cvVarArr[0]) == this) {
            dvVar.e.i(Math.abs(cvVar.getTranslationX()) / cvVarArr[0].getMeasuredWidth(), cvVarArr[1].f36556f);
        }
    }
}
