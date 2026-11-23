package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class du extends FrameLayout {
    public org.telegram.ui.ActionBar.g2 f47040a;
    public FrameLayout f47041b;
    public org.telegram.ui.ActionBar.k f47042c;
    public org.telegram.ui.Components.ek0 d;
    public di.b1 f47043e;
    public int f47044f;
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
        du[] duVarArr = euVar.f47388f;
        if (euVar.f47389n && (duVar = duVarArr[0]) == this) {
            euVar.f47387e.i(Math.abs(duVar.getTranslationX()) / duVarArr[0].getMeasuredWidth(), duVarArr[1].f47044f);
        }
    }
}
