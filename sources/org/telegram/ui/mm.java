package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public abstract class mm extends org.telegram.ui.Components.wk0 implements ih.c7 {
    public final qn T2;

    public mm(qn qnVar, Context context, on onVar) {
        super(context, onVar);
        this.T2 = qnVar;
    }

    @Override
    public final void a(int[] iArr) {
        qn qnVar = this.T2;
        iArr[0] = ((int) qnVar.o9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.l0.A(3.0f, qnVar.f42077t0.getPaddingBottom(), qnVar.f42077t0.getMeasuredHeight());
    }
}
