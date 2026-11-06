package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class nb implements org.telegram.ui.Components.bj0 {
    public final int f48006a = 1;
    public final long f48007b;
    public final Context f48008c;
    public final KeyEvent.Callback d;
    public final Object f48009e;
    public final Object f48010f;

    public nb(tb tbVar, Context context, long j3, org.telegram.ui.ActionBar.f6 f6Var, c51 c51Var) {
        this.d = tbVar;
        this.f48008c = context;
        this.f48007b = j3;
        this.f48009e = f6Var;
        this.f48010f = c51Var;
    }

    @Override
    public final void c(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb.c(int, android.view.View):void");
    }

    public nb(org.telegram.ui.Components.x50 x50Var, long j3, org.telegram.ui.ActionBar.f2 f2Var, a0.h hVar, Context context) {
        this.d = x50Var;
        this.f48007b = j3;
        this.f48009e = f2Var;
        this.f48010f = hVar;
        this.f48008c = context;
    }
}
