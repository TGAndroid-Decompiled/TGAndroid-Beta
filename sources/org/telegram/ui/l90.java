package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class l90 implements Runnable {
    public final int f35305a = 1;
    public final LaunchActivity f35306b;
    public final byte[] f35307c;
    public final int d;
    public final Integer e;
    public final String f35308f;
    public final int h;
    public final long f35309n;
    public final Object f35310r;
    public final Object f35311s;
    public final Object v;

    public l90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, i0 i0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35306b = launchActivity;
        this.f35310r = bundle;
        this.f35307c = bArr;
        this.d = i10;
        this.e = num;
        this.f35308f = str;
        this.h = i11;
        this.f35309n = j3;
        this.f35311s = i0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l90.run():void");
    }

    public l90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f35306b = launchActivity;
        this.f35310r = tLObject;
        this.e = num;
        this.f35311s = num2;
        this.f35307c = bArr;
        this.f35309n = j3;
        this.v = runnable;
        this.f35308f = str;
        this.d = i10;
        this.h = i11;
    }
}
