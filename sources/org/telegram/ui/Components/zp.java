package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class zp extends LinearLayout {
    public final cq f30580a;

    public zp(cq cqVar, Context context) {
        super(context);
        this.f30580a = cqVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        cq.m(this.f30580a);
    }
}
