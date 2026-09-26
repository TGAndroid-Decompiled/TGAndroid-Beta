package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class g90 implements Runnable {
    public final int f33862a = 1;
    public final LaunchActivity f33863b;
    public final byte[] f33864c;
    public final int d;
    public final Integer e;
    public final String f33865f;
    public final int h;
    public final long f33866n;
    public final Object f33867r;
    public final Object f33868s;
    public final Object v;

    public g90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f33863b = launchActivity;
        this.f33867r = bundle;
        this.f33864c = bArr;
        this.d = i10;
        this.e = num;
        this.f33865f = str;
        this.h = i11;
        this.f33866n = j3;
        this.f33868s = j0Var;
        this.v = m2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g90.run():void");
    }

    public g90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f33863b = launchActivity;
        this.f33867r = tLObject;
        this.e = num;
        this.f33868s = num2;
        this.f33864c = bArr;
        this.f33866n = j3;
        this.v = runnable;
        this.f33865f = str;
        this.d = i10;
        this.h = i11;
    }
}
