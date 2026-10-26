package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class lq extends LinearLayout {
    public final oq f30263a;

    public lq(oq oqVar, Context context) {
        super(context);
        this.f30263a = oqVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        oq.m(this.f30263a);
    }
}
