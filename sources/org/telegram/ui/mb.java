package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class mb implements org.telegram.ui.Components.gj0 {
    public final int f49197a = 1;
    public final long f49198b;
    public final Context f49199c;
    public final KeyEvent.Callback d;
    public final Object f49200e;
    public final Object f49201f;

    public mb(sb sbVar, Context context, long j3, org.telegram.ui.ActionBar.e6 e6Var, z41 z41Var) {
        this.d = sbVar;
        this.f49199c = context;
        this.f49198b = j3;
        this.f49200e = e6Var;
        this.f49201f = z41Var;
    }

    @Override
    public final void b(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.b(int, android.view.View):void");
    }

    public mb(org.telegram.ui.Components.a60 a60Var, long j3, org.telegram.ui.ActionBar.e2 e2Var, a0.h hVar, Context context) {
        this.d = a60Var;
        this.f49198b = j3;
        this.f49200e = e2Var;
        this.f49201f = hVar;
        this.f49199c = context;
    }
}
