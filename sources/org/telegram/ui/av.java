package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class av extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f36556a;
    public FrameLayout f36557b;
    public org.telegram.ui.ActionBar.k f36558c;
    public org.telegram.ui.Components.wk0 d;
    public gh.f1 f36559e;
    public int f36560f;
    public final bv h;

    public av(bv bvVar, Context context) {
        super(context);
        this.h = bvVar;
    }

    @Override
    public final void setTranslationX(float f10) {
        av avVar;
        super.setTranslationX(f10);
        bv bvVar = this.h;
        av[] avVarArr = bvVar.f37000f;
        if (bvVar.f37001n && (avVar = avVarArr[0]) == this) {
            bvVar.f36999e.j(Math.abs(avVar.getTranslationX()) / avVarArr[0].getMeasuredWidth(), avVarArr[1].f36560f);
        }
    }
}
