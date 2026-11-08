package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class nb implements org.telegram.ui.Components.bj0 {
    public final int f48014a = 1;
    public final long f48015b;
    public final Context f48016c;
    public final KeyEvent.Callback d;
    public final Object f48017e;
    public final Object f48018f;

    public nb(tb tbVar, Context context, long j3, org.telegram.ui.ActionBar.f6 f6Var, c51 c51Var) {
        this.d = tbVar;
        this.f48016c = context;
        this.f48015b = j3;
        this.f48017e = f6Var;
        this.f48018f = c51Var;
    }

    @Override
    public final void c(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb.c(int, android.view.View):void");
    }

    public nb(org.telegram.ui.Components.x50 x50Var, long j3, org.telegram.ui.ActionBar.f2 f2Var, a0.h hVar, Context context) {
        this.d = x50Var;
        this.f48015b = j3;
        this.f48017e = f2Var;
        this.f48018f = hVar;
        this.f48016c = context;
    }
}
