package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class du extends FrameLayout {
    public org.telegram.ui.ActionBar.g2 f47037a;
    public FrameLayout f47038b;
    public org.telegram.ui.ActionBar.k f47039c;
    public org.telegram.ui.Components.ek0 d;
    public di.b1 f47040e;
    public int f47041f;
    public final eu h;

    public du(eu euVar, Context context) {
        super(context);
        this.h = euVar;
    }

    @Override
    public final void setTranslationX(float f10) {
        du duVar;
        super.setTranslationX(f10);
        eu euVar = this.h;
        du[] duVarArr = euVar.f47384f;
        if (euVar.f47385n && (duVar = duVarArr[0]) == this) {
            euVar.f47383e.i(Math.abs(duVar.getTranslationX()) / duVarArr[0].getMeasuredWidth(), duVarArr[1].f47041f);
        }
    }
}
