package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class rt extends Dialog {
    public final bg.i1 f32285a;

    public rt(bg.i1 i1Var, Context context) {
        super(context);
        this.f32285a = i1Var;
    }

    @Override
    public final void dismiss() {
        st stVar = (st) this.f32285a.f1836b;
        stVar.f32551a.k(false);
        stVar.f32551a.e();
    }
}
