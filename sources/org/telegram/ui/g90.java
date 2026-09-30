package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class g90 implements Runnable {
    public final int f33864a = 1;
    public final LaunchActivity f33865b;
    public final byte[] f33866c;
    public final int d;
    public final Integer e;
    public final String f33867f;
    public final int h;
    public final long f33868n;
    public final Object f33869r;
    public final Object f33870s;
    public final Object v;

    public g90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f33865b = launchActivity;
        this.f33869r = bundle;
        this.f33866c = bArr;
        this.d = i10;
        this.e = num;
        this.f33867f = str;
        this.h = i11;
        this.f33868n = j3;
        this.f33870s = j0Var;
        this.v = m2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g90.run():void");
    }

    public g90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f33865b = launchActivity;
        this.f33869r = tLObject;
        this.e = num;
        this.f33870s = num2;
        this.f33866c = bArr;
        this.f33868n = j3;
        this.v = runnable;
        this.f33867f = str;
        this.d = i10;
        this.h = i11;
    }
}
