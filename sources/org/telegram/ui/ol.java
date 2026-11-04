package org.telegram.ui;

import android.content.Context;
public abstract class ol extends org.telegram.ui.Components.tj0 implements ei.g7 {
    public final wm f48307f3;

    public ol(wm wmVar, Context context, um umVar) {
        super(context, umVar);
        this.f48307f3 = wmVar;
    }

    @Override
    public final void a(int[] iArr) {
        wm wmVar = this.f48307f3;
        iArr[0] = ((int) wmVar.M9) - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = org.telegram.messenger.k5.B(3.0f, wmVar.A0.getPaddingBottom(), wmVar.A0.getMeasuredHeight());
    }
}
