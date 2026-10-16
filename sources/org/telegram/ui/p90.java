package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class p90 implements Runnable {
    public final int f38851a = 1;
    public final LaunchActivity f38852b;
    public final byte[] f38853c;
    public final int d;
    public final Integer e;
    public final String f38854f;
    public final int h;
    public final long f38855n;
    public final Object f38856r;
    public final Object f38857s;
    public final Object v;

    public p90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, k0 k0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f38852b = launchActivity;
        this.f38856r = bundle;
        this.f38853c = bArr;
        this.d = i10;
        this.e = num;
        this.f38854f = str;
        this.h = i11;
        this.f38855n = j10;
        this.f38857s = k0Var;
        this.v = m2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p90.run():void");
    }

    public p90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f38852b = launchActivity;
        this.f38856r = tLObject;
        this.e = num;
        this.f38857s = num2;
        this.f38853c = bArr;
        this.f38855n = j10;
        this.v = runnable;
        this.f38854f = str;
        this.d = i10;
        this.h = i11;
    }
}
