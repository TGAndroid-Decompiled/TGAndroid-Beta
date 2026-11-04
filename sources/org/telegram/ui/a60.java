package org.telegram.ui;

import android.app.Activity;
public final class a60 implements Runnable {
    public final int f43637a;
    public final boolean f43638b;
    public final Object f43639c;
    public final Object d;

    public a60(Object obj, Object obj2, boolean z10, int i3) {
        this.f43637a = i3;
        this.f43639c = obj;
        this.d = obj2;
        this.f43638b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a60.run():void");
    }

    public a60(Object obj, boolean z10, Object obj2, int i3) {
        this.f43637a = i3;
        this.f43639c = obj;
        this.f43638b = z10;
        this.d = obj2;
    }

    public a60(org.telegram.ui.ActionBar.s1 s1Var, boolean z10, Activity activity) {
        this.f43637a = 9;
        this.d = s1Var;
        this.f43638b = z10;
        this.f43639c = activity;
    }
}
