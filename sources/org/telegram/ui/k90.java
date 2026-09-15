package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class k90 implements Runnable {
    public final int f35075a = 1;
    public final LaunchActivity f35076b;
    public final byte[] f35077c;
    public final int d;
    public final Integer e;
    public final String f35078f;
    public final int h;
    public final long f35079n;
    public final Object f35080r;
    public final Object f35081s;
    public final Object v;

    public k90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, i0 i0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35076b = launchActivity;
        this.f35080r = bundle;
        this.f35077c = bArr;
        this.d = i10;
        this.e = num;
        this.f35078f = str;
        this.h = i11;
        this.f35079n = j3;
        this.f35081s = i0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k90.run():void");
    }

    public k90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f35076b = launchActivity;
        this.f35080r = tLObject;
        this.e = num;
        this.f35081s = num2;
        this.f35077c = bArr;
        this.f35079n = j3;
        this.v = runnable;
        this.f35078f = str;
        this.d = i10;
        this.h = i11;
    }
}
