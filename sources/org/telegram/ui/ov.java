package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ov extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f36433a;
    public FrameLayout f36434b;
    public org.telegram.ui.ActionBar.k f36435c;
    public org.telegram.ui.Components.ml0 d;
    public ai.w0 e;
    public int f36436f;
    public final pv h;

    public ov(pv pvVar, Context context) {
        super(context);
        this.h = pvVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        ov ovVar;
        super.setTranslationX(f7);
        pv pvVar = this.h;
        ov[] ovVarArr = pvVar.f36742f;
        if (pvVar.f36743n && (ovVar = ovVarArr[0]) == this) {
            pvVar.e.j(Math.abs(ovVar.getTranslationX()) / ovVarArr[0].getMeasuredWidth(), ovVarArr[1].f36436f);
        }
    }
}
