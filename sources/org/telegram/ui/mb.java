package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class mb implements org.telegram.ui.Components.qj0 {
    public final int f49832a = 1;
    public final long f49833b;
    public final Context f49834c;
    public final KeyEvent.Callback d;
    public final Object f49835e;
    public final Object f49836f;

    public mb(sb sbVar, Context context, long j3, org.telegram.ui.ActionBar.h6 h6Var, c51 c51Var) {
        this.d = sbVar;
        this.f49834c = context;
        this.f49833b = j3;
        this.f49835e = h6Var;
        this.f49836f = c51Var;
    }

    @Override
    public final void c(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.c(int, android.view.View):void");
    }

    public mb(org.telegram.ui.Components.l60 l60Var, long j3, org.telegram.ui.ActionBar.g2 g2Var, a0.h hVar, Context context) {
        this.d = l60Var;
        this.f49833b = j3;
        this.f49835e = g2Var;
        this.f49836f = hVar;
        this.f49834c = context;
    }
}
