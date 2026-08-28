package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class oc extends yo0 {
    public final pc B;

    public oc(pc pcVar, Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, j10, context, b6Var);
        this.B = pcVar;
    }

    @Override
    public final void b(int i9, boolean z10) {
        super.b(i9, z10);
        pc pcVar = this.B;
        TextView textView = pcVar.d;
        if (textView != null) {
            textView.setTextColor(pcVar.f41437b.h.getTextColor());
        }
    }
}
