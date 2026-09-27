package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class bq extends LinearLayout {
    public final eq f23107a;

    public bq(eq eqVar, Context context) {
        super(context);
        this.f23107a = eqVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        eq.m(this.f23107a);
    }
}
