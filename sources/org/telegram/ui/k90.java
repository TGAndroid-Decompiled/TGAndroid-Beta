package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class k90 implements Runnable {
    public final int f39184a = 1;
    public final LaunchActivity f39185b;
    public final byte[] f39186c;
    public final int d;
    public final Integer f39187e;
    public final String f39188f;
    public final int h;
    public final long f39189n;
    public final Object f39190r;
    public final Object f39191s;
    public final Object v;

    public k90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39185b = launchActivity;
        this.f39190r = bundle;
        this.f39186c = bArr;
        this.d = i10;
        this.f39187e = num;
        this.f39188f = str;
        this.h = i11;
        this.f39189n = j3;
        this.f39191s = j0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k90.run():void");
    }

    public k90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f39185b = launchActivity;
        this.f39190r = tLObject;
        this.f39187e = num;
        this.f39191s = num2;
        this.f39186c = bArr;
        this.f39189n = j3;
        this.v = runnable;
        this.f39188f = str;
        this.d = i10;
        this.h = i11;
    }
}
