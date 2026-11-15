package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class mb implements org.telegram.ui.Components.gj0 {
    public final int f49193a = 1;
    public final long f49194b;
    public final Context f49195c;
    public final KeyEvent.Callback d;
    public final Object f49196e;
    public final Object f49197f;

    public mb(sb sbVar, Context context, long j3, org.telegram.ui.ActionBar.e6 e6Var, z41 z41Var) {
        this.d = sbVar;
        this.f49195c = context;
        this.f49194b = j3;
        this.f49196e = e6Var;
        this.f49197f = z41Var;
    }

    @Override
    public final void b(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.b(int, android.view.View):void");
    }

    public mb(org.telegram.ui.Components.a60 a60Var, long j3, org.telegram.ui.ActionBar.e2 e2Var, a0.h hVar, Context context) {
        this.d = a60Var;
        this.f49194b = j3;
        this.f49196e = e2Var;
        this.f49197f = hVar;
        this.f49195c = context;
    }
}
