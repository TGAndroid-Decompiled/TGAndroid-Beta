package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class nb implements org.telegram.ui.Components.cj0 {
    public final int f48146a = 1;
    public final long f48147b;
    public final Context f48148c;
    public final KeyEvent.Callback d;
    public final Object f48149e;
    public final Object f48150f;

    public nb(tb tbVar, Context context, long j3, org.telegram.ui.ActionBar.g6 g6Var, d51 d51Var) {
        this.d = tbVar;
        this.f48148c = context;
        this.f48147b = j3;
        this.f48149e = g6Var;
        this.f48150f = d51Var;
    }

    @Override
    public final void c(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb.c(int, android.view.View):void");
    }

    public nb(org.telegram.ui.Components.y50 y50Var, long j3, org.telegram.ui.ActionBar.f2 f2Var, a0.h hVar, Context context) {
        this.d = y50Var;
        this.f48147b = j3;
        this.f48149e = f2Var;
        this.f48150f = hVar;
        this.f48148c = context;
    }
}
