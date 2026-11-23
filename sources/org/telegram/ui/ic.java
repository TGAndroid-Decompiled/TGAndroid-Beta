package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class ic extends jm0 {
    public final jc H;

    public ic(jc jcVar, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, j3, context, h6Var);
        this.H = jcVar;
    }

    @Override
    public final void b(int i7, boolean z10) {
        super.b(i7, z10);
        jc jcVar = this.H;
        TextView textView = jcVar.d;
        if (textView != null) {
            textView.setTextColor(jcVar.f48963b.h.getTextColor());
        }
    }
}
