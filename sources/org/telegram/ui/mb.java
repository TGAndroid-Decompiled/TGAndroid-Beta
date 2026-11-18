package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class mb implements org.telegram.ui.Components.oj0 {
    public final int f49818a = 1;
    public final long f49819b;
    public final Context f49820c;
    public final KeyEvent.Callback d;
    public final Object f49821e;
    public final Object f49822f;

    public mb(sb sbVar, Context context, long j3, org.telegram.ui.ActionBar.i6 i6Var, c51 c51Var) {
        this.d = sbVar;
        this.f49820c = context;
        this.f49819b = j3;
        this.f49821e = i6Var;
        this.f49822f = c51Var;
    }

    @Override
    public final void c(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.c(int, android.view.View):void");
    }

    public mb(org.telegram.ui.Components.j60 j60Var, long j3, org.telegram.ui.ActionBar.h2 h2Var, a0.h hVar, Context context) {
        this.d = j60Var;
        this.f49819b = j3;
        this.f49821e = h2Var;
        this.f49822f = hVar;
        this.f49820c = context;
    }
}
