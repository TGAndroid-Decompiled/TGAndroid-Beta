package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class b70 implements Runnable {
    public final int f44206a = 1;
    public final LaunchActivity f44207b;
    public final byte[] f44208c;
    public final int d;
    public final Integer f44209e;
    public final String f44210f;
    public final int h;
    public final long f44211n;
    public final Object f44212r;
    public final Object f44213s;
    public final Object f44214w;

    public b70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f44207b = launchActivity;
        this.f44212r = bundle;
        this.f44208c = bArr;
        this.d = i7;
        this.f44209e = num;
        this.f44210f = str;
        this.h = i10;
        this.f44211n = j3;
        this.f44213s = j0Var;
        this.f44214w = f2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b70.run():void");
    }

    public b70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f44207b = launchActivity;
        this.f44212r = tLObject;
        this.f44209e = num;
        this.f44213s = num2;
        this.f44208c = bArr;
        this.f44211n = j3;
        this.f44214w = runnable;
        this.f44210f = str;
        this.d = i7;
        this.h = i10;
    }
}
