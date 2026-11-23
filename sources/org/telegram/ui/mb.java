package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class mb implements org.telegram.ui.Components.qj0 {
    public final int f49809a = 1;
    public final long f49810b;
    public final Context f49811c;
    public final KeyEvent.Callback d;
    public final Object f49812e;
    public final Object f49813f;

    public mb(sb sbVar, Context context, long j3, org.telegram.ui.ActionBar.h6 h6Var, c51 c51Var) {
        this.d = sbVar;
        this.f49811c = context;
        this.f49810b = j3;
        this.f49812e = h6Var;
        this.f49813f = c51Var;
    }

    @Override
    public final void c(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.c(int, android.view.View):void");
    }

    public mb(org.telegram.ui.Components.l60 l60Var, long j3, org.telegram.ui.ActionBar.g2 g2Var, a0.h hVar, Context context) {
        this.d = l60Var;
        this.f49810b = j3;
        this.f49812e = g2Var;
        this.f49813f = hVar;
        this.f49811c = context;
    }
}
