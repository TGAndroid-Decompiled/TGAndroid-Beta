package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class du extends FrameLayout {
    public org.telegram.ui.ActionBar.h2 f47048a;
    public FrameLayout f47049b;
    public org.telegram.ui.ActionBar.k f47050c;
    public org.telegram.ui.Components.ck0 d;
    public di.b1 f47051e;
    public int f47052f;
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
        du[] duVarArr = euVar.f47359f;
        if (euVar.f47360n && (duVar = duVarArr[0]) == this) {
            euVar.f47358e.i(Math.abs(duVar.getTranslationX()) / duVarArr[0].getMeasuredWidth(), duVarArr[1].f47052f);
        }
    }
}
