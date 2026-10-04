package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class cq extends LinearLayout {
    public final fq f25424a;

    public cq(fq fqVar, Context context) {
        super(context);
        this.f25424a = fqVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        fq.m(this.f25424a);
    }
}
