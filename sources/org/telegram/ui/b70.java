package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class b70 implements Runnable {
    public final int f44205a = 1;
    public final LaunchActivity f44206b;
    public final byte[] f44207c;
    public final int d;
    public final Integer f44208e;
    public final String f44209f;
    public final int h;
    public final long f44210n;
    public final Object f44211r;
    public final Object f44212s;
    public final Object f44213w;

    public b70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f44206b = launchActivity;
        this.f44211r = bundle;
        this.f44207c = bArr;
        this.d = i7;
        this.f44208e = num;
        this.f44209f = str;
        this.h = i10;
        this.f44210n = j3;
        this.f44212s = j0Var;
        this.f44213w = f2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b70.run():void");
    }

    public b70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f44206b = launchActivity;
        this.f44211r = tLObject;
        this.f44208e = num;
        this.f44212s = num2;
        this.f44207c = bArr;
        this.f44210n = j3;
        this.f44213w = runnable;
        this.f44209f = str;
        this.d = i7;
        this.h = i10;
    }
}
