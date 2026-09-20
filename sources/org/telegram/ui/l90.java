package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class l90 implements Runnable {
    public final int f35374a = 1;
    public final LaunchActivity f35375b;
    public final byte[] f35376c;
    public final int d;
    public final Integer e;
    public final String f35377f;
    public final int h;
    public final long f35378n;
    public final Object f35379r;
    public final Object f35380s;
    public final Object v;

    public l90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, i0 i0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35375b = launchActivity;
        this.f35379r = bundle;
        this.f35376c = bArr;
        this.d = i10;
        this.e = num;
        this.f35377f = str;
        this.h = i11;
        this.f35378n = j3;
        this.f35380s = i0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l90.run():void");
    }

    public l90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f35375b = launchActivity;
        this.f35379r = tLObject;
        this.e = num;
        this.f35380s = num2;
        this.f35376c = bArr;
        this.f35378n = j3;
        this.v = runnable;
        this.f35377f = str;
        this.d = i10;
        this.h = i11;
    }
}
