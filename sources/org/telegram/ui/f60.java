package org.telegram.ui;

import android.app.Activity;
public final class f60 implements Runnable {
    public final int f46999a;
    public final boolean f47000b;
    public final Object f47001c;
    public final Object d;

    public f60(Object obj, Object obj2, boolean z10, int i7) {
        this.f46999a = i7;
        this.f47001c = obj;
        this.d = obj2;
        this.f47000b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f60.run():void");
    }

    public f60(Object obj, boolean z10, Object obj2, int i7) {
        this.f46999a = i7;
        this.f47001c = obj;
        this.f47000b = z10;
        this.d = obj2;
    }

    public f60(org.telegram.ui.ActionBar.t1 t1Var, boolean z10, Activity activity) {
        this.f46999a = 9;
        this.d = t1Var;
        this.f47000b = z10;
        this.f47001c = activity;
    }
}
