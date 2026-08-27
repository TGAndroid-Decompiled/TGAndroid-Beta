package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

public final class pc extends zo0 {
    public final qc B;

    public pc(qc qcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, c6Var);
        this.B = qcVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        qc qcVar = this.B;
        TextView textView = qcVar.d;
        if (textView != null) {
            textView.setTextColor(qcVar.f41629b.h.getTextColor());
        }
    }
}
