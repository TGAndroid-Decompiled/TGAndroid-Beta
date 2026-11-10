package org.telegram.ui;

import android.app.Activity;
public final class j60 implements Runnable {
    public final int f46828a;
    public final boolean f46829b;
    public final Object f46830c;
    public final Object d;

    public j60(Object obj, Object obj2, boolean z9, int i7) {
        this.f46828a = i7;
        this.f46830c = obj;
        this.d = obj2;
        this.f46829b = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.run():void");
    }

    public j60(Object obj, boolean z9, Object obj2, int i7) {
        this.f46828a = i7;
        this.f46830c = obj;
        this.f46829b = z9;
        this.d = obj2;
    }

    public j60(org.telegram.ui.ActionBar.u1 u1Var, boolean z9, Activity activity) {
        this.f46828a = 9;
        this.d = u1Var;
        this.f46829b = z9;
        this.f46830c = activity;
    }
}
