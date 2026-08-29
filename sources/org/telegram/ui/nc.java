package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class nc extends xo0 {
    public final oc B;

    public nc(oc ocVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, c6Var);
        this.B = ocVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        oc ocVar = this.B;
        TextView textView = ocVar.d;
        if (textView != null) {
            textView.setTextColor(ocVar.f41085b.h.getTextColor());
        }
    }
}
