package org.telegram.ui;

import android.app.Activity;
public final class f80 implements Runnable {
    public final int f39253a;
    public final boolean f39254b;
    public final Object f39255c;
    public final Object d;

    public f80(Object obj, Object obj2, boolean z10, int i10) {
        this.f39253a = i10;
        this.f39255c = obj;
        this.d = obj2;
        this.f39254b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f80.run():void");
    }

    public f80(Object obj, boolean z10, Object obj2, int i10) {
        this.f39253a = i10;
        this.f39255c = obj;
        this.f39254b = z10;
        this.d = obj2;
    }

    public f80(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, Activity activity) {
        this.f39253a = 9;
        this.d = e2Var;
        this.f39254b = z10;
        this.f39255c = activity;
    }
}
