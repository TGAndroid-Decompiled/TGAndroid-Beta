package org.telegram.ui;

import android.app.Activity;
public final class d80 implements Runnable {
    public final int f38752a;
    public final boolean f38753b;
    public final Object f38754c;
    public final Object d;

    public d80(Object obj, Object obj2, boolean z10, int i10) {
        this.f38752a = i10;
        this.f38754c = obj;
        this.d = obj2;
        this.f38753b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d80.run():void");
    }

    public d80(Object obj, boolean z10, Object obj2, int i10) {
        this.f38752a = i10;
        this.f38754c = obj;
        this.f38753b = z10;
        this.d = obj2;
    }

    public d80(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, Activity activity) {
        this.f38752a = 9;
        this.d = e2Var;
        this.f38753b = z10;
        this.f38754c = activity;
    }
}
