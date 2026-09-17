package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class l90 implements Runnable {
    public final int f38236a = 1;
    public final LaunchActivity f38237b;
    public final byte[] f38238c;
    public final int d;
    public final Integer f38239e;
    public final String f38240f;
    public final int h;
    public final long f38241n;
    public final Object f38242r;
    public final Object f38243s;
    public final Object v;

    public l90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, i0 i0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f38237b = launchActivity;
        this.f38242r = bundle;
        this.f38238c = bArr;
        this.d = i10;
        this.f38239e = num;
        this.f38240f = str;
        this.h = i11;
        this.f38241n = j3;
        this.f38243s = i0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l90.run():void");
    }

    public l90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f38237b = launchActivity;
        this.f38242r = tLObject;
        this.f38239e = num;
        this.f38243s = num2;
        this.f38238c = bArr;
        this.f38241n = j3;
        this.v = runnable;
        this.f38240f = str;
        this.d = i10;
        this.h = i11;
    }
}
