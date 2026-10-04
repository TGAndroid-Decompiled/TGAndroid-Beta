package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class k90 implements Runnable {
    public final int f37891a = 1;
    public final LaunchActivity f37892b;
    public final byte[] f37893c;
    public final int d;
    public final Integer f37894e;
    public final String f37895f;
    public final int h;
    public final long f37896n;
    public final Object f37897r;
    public final Object f37898s;
    public final Object v;

    public k90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37892b = launchActivity;
        this.f37897r = bundle;
        this.f37893c = bArr;
        this.d = i10;
        this.f37894e = num;
        this.f37895f = str;
        this.h = i11;
        this.f37896n = j3;
        this.f37898s = j0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k90.run():void");
    }

    public k90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f37892b = launchActivity;
        this.f37897r = tLObject;
        this.f37894e = num;
        this.f37898s = num2;
        this.f37893c = bArr;
        this.f37896n = j3;
        this.v = runnable;
        this.f37895f = str;
        this.d = i10;
        this.h = i11;
    }
}
