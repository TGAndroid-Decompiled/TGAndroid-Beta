package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class mb implements org.telegram.ui.Components.qj0 {
    public final int f50022a = 1;
    public final long f50023b;
    public final Context f50024c;
    public final KeyEvent.Callback d;
    public final Object f50025e;
    public final Object f50026f;

    public mb(sb sbVar, Context context, long j3, org.telegram.ui.ActionBar.i6 i6Var, b51 b51Var) {
        this.d = sbVar;
        this.f50024c = context;
        this.f50023b = j3;
        this.f50025e = i6Var;
        this.f50026f = b51Var;
    }

    @Override
    public final void b(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.b(int, android.view.View):void");
    }

    public mb(org.telegram.ui.Components.i60 i60Var, long j3, org.telegram.ui.ActionBar.g2 g2Var, a0.h hVar, Context context) {
        this.d = i60Var;
        this.f50023b = j3;
        this.f50025e = g2Var;
        this.f50026f = hVar;
        this.f50024c = context;
    }
}
