package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class du extends FrameLayout {
    public org.telegram.ui.ActionBar.h2 f46971a;
    public FrameLayout f46972b;
    public org.telegram.ui.ActionBar.k f46973c;
    public org.telegram.ui.Components.ck0 d;
    public di.b1 f46974e;
    public int f46975f;
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
        du[] duVarArr = euVar.f47315f;
        if (euVar.f47316n && (duVar = duVarArr[0]) == this) {
            euVar.f47314e.i(Math.abs(duVar.getTranslationX()) / duVarArr[0].getMeasuredWidth(), duVarArr[1].f46975f);
        }
    }
}
