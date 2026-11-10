package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class jc extends im0 {
    public final kc G;

    public jc(kc kcVar, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, j3, context, h6Var);
        this.G = kcVar;
    }

    @Override
    public final void b(int i7, boolean z9) {
        super.b(i7, z9);
        kc kcVar = this.G;
        TextView textView = kcVar.d;
        if (textView != null) {
            textView.setTextColor(kcVar.f47252b.h.getTextColor());
        }
    }
}
