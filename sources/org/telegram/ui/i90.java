package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class i90 implements Runnable {
    public final int f34396a = 1;
    public final LaunchActivity f34397b;
    public final byte[] f34398c;
    public final int d;
    public final Integer e;
    public final String f34399f;
    public final int h;
    public final long f34400n;
    public final Object f34401r;
    public final Object f34402s;
    public final Object v;

    public i90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, k0 k0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f34397b = launchActivity;
        this.f34401r = bundle;
        this.f34398c = bArr;
        this.d = i10;
        this.e = num;
        this.f34399f = str;
        this.h = i11;
        this.f34400n = j3;
        this.f34402s = k0Var;
        this.v = o2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i90.run():void");
    }

    public i90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f34397b = launchActivity;
        this.f34401r = tLObject;
        this.e = num;
        this.f34402s = num2;
        this.f34398c = bArr;
        this.f34400n = j3;
        this.v = runnable;
        this.f34399f = str;
        this.d = i10;
        this.h = i11;
    }
}
