package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class g90 implements Runnable {
    public final int f33863a = 1;
    public final LaunchActivity f33864b;
    public final byte[] f33865c;
    public final int d;
    public final Integer e;
    public final String f33866f;
    public final int h;
    public final long f33867n;
    public final Object f33868r;
    public final Object f33869s;
    public final Object v;

    public g90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f33864b = launchActivity;
        this.f33868r = bundle;
        this.f33865c = bArr;
        this.d = i10;
        this.e = num;
        this.f33866f = str;
        this.h = i11;
        this.f33867n = j3;
        this.f33869s = j0Var;
        this.v = m2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g90.run():void");
    }

    public g90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f33864b = launchActivity;
        this.f33868r = tLObject;
        this.e = num;
        this.f33869s = num2;
        this.f33865c = bArr;
        this.f33867n = j3;
        this.v = runnable;
        this.f33866f = str;
        this.d = i10;
        this.h = i11;
    }
}
