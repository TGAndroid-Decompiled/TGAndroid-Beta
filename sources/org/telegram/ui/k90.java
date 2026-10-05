package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class k90 implements Runnable {
    public final int f37921a = 1;
    public final LaunchActivity f37922b;
    public final byte[] f37923c;
    public final int d;
    public final Integer f37924e;
    public final String f37925f;
    public final int h;
    public final long f37926n;
    public final Object f37927r;
    public final Object f37928s;
    public final Object v;

    public k90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37922b = launchActivity;
        this.f37927r = bundle;
        this.f37923c = bArr;
        this.d = i10;
        this.f37924e = num;
        this.f37925f = str;
        this.h = i11;
        this.f37926n = j3;
        this.f37928s = j0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k90.run():void");
    }

    public k90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f37922b = launchActivity;
        this.f37927r = tLObject;
        this.f37924e = num;
        this.f37928s = num2;
        this.f37923c = bArr;
        this.f37926n = j3;
        this.v = runnable;
        this.f37925f = str;
        this.d = i10;
        this.h = i11;
    }
}
