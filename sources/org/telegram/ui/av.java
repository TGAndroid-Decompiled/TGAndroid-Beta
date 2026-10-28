package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class av extends FrameLayout {
    public org.telegram.ui.ActionBar.r2 f37828a;
    public FrameLayout f37829b;
    public org.telegram.ui.ActionBar.k f37830c;
    public org.telegram.ui.Components.nm0 d;
    public bi.r1 e;
    public int f37831f;
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
        av[] avVarArr = bvVar.f38108f;
        if (bvVar.f38109n && (avVar = avVarArr[0]) == this) {
            bvVar.e.i(Math.abs(avVar.getTranslationX()) / avVarArr[0].getMeasuredWidth(), avVarArr[1].f37831f);
        }
    }
}
