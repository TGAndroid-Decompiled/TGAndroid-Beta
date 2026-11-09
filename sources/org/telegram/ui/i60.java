package org.telegram.ui;

import android.app.Activity;
public final class i60 implements Runnable {
    public final int f46473a;
    public final boolean f46474b;
    public final Object f46475c;
    public final Object d;

    public i60(Object obj, Object obj2, boolean z9, int i7) {
        this.f46473a = i7;
        this.f46475c = obj;
        this.d = obj2;
        this.f46474b = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i60.run():void");
    }

    public i60(Object obj, boolean z9, Object obj2, int i7) {
        this.f46473a = i7;
        this.f46475c = obj;
        this.f46474b = z9;
        this.d = obj2;
    }

    public i60(org.telegram.ui.ActionBar.u1 u1Var, boolean z9, Activity activity) {
        this.f46473a = 9;
        this.d = u1Var;
        this.f46474b = z9;
        this.f46475c = activity;
    }
}
