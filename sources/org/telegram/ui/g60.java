package org.telegram.ui;

import android.app.Activity;
public final class g60 implements Runnable {
    public final int f45843a;
    public final boolean f45844b;
    public final Object f45845c;
    public final Object d;

    public g60(Object obj, Object obj2, boolean z9, int i7) {
        this.f45843a = i7;
        this.f45845c = obj;
        this.d = obj2;
        this.f45844b = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.run():void");
    }

    public g60(Object obj, boolean z9, Object obj2, int i7) {
        this.f45843a = i7;
        this.f45845c = obj;
        this.f45844b = z9;
        this.d = obj2;
    }

    public g60(org.telegram.ui.ActionBar.u1 u1Var, boolean z9, Activity activity) {
        this.f45843a = 9;
        this.d = u1Var;
        this.f45844b = z9;
        this.f45845c = activity;
    }
}
