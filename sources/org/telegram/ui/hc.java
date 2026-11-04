package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class hc extends am0 {
    public final ic H;

    public hc(ic icVar, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, j10, context, e6Var);
        this.H = icVar;
    }

    @Override
    public final void b(int i3, boolean z10) {
        super.b(i3, z10);
        ic icVar = this.H;
        TextView textView = icVar.d;
        if (textView != null) {
            textView.setTextColor(icVar.f46234b.h.getTextColor());
        }
    }
}
