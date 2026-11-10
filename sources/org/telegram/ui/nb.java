package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class nb implements org.telegram.ui.Components.bj0 {
    public final int f48169a = 1;
    public final long f48170b;
    public final Context f48171c;
    public final KeyEvent.Callback d;
    public final Object f48172e;
    public final Object f48173f;

    public nb(tb tbVar, Context context, long j3, org.telegram.ui.ActionBar.h6 h6Var, e51 e51Var) {
        this.d = tbVar;
        this.f48171c = context;
        this.f48170b = j3;
        this.f48172e = h6Var;
        this.f48173f = e51Var;
    }

    @Override
    public final void c(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb.c(int, android.view.View):void");
    }

    public nb(org.telegram.ui.Components.x50 x50Var, long j3, org.telegram.ui.ActionBar.f2 f2Var, a0.h hVar, Context context) {
        this.d = x50Var;
        this.f48170b = j3;
        this.f48172e = f2Var;
        this.f48173f = hVar;
        this.f48171c = context;
    }
}
