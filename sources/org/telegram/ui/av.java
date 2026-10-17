package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class av extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f35500a;
    public FrameLayout f35501b;
    public org.telegram.ui.ActionBar.k f35502c;
    public org.telegram.ui.Components.im0 d;
    public ai.u1 e;
    public int f35503f;
    public final bv h;

    public av(bv bvVar, Context context) {
        super(context);
        this.h = bvVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        av avVar;
        super.setTranslationX(f7);
        bv bvVar = this.h;
        av[] avVarArr = bvVar.f35747f;
        if (bvVar.f35748n && (avVar = avVarArr[0]) == this) {
            bvVar.e.j(Math.abs(avVar.getTranslationX()) / avVarArr[0].getMeasuredWidth(), avVarArr[1].f35503f);
        }
    }
}
