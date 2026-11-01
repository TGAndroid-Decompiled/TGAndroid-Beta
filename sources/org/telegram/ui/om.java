package org.telegram.ui;

import android.content.Context;
public abstract class om extends org.telegram.ui.Components.uk0 implements th.l5 {
    public final un f40191e3;

    public om(un unVar, Context context, sn snVar) {
        super(context, snVar);
        this.f40191e3 = unVar;
    }

    @Override
    public final void a(int[] iArr) {
        un unVar = this.f40191e3;
        iArr[0] = ((int) unVar.L9) - org.telegram.messenger.i0.L(4.0f);
        iArr[1] = org.telegram.messenger.m5.B(3.0f, unVar.f42303z0.getPaddingBottom(), unVar.f42303z0.getMeasuredHeight());
    }
}
