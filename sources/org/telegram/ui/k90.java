package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class k90 implements Runnable {
    public final int f39228a = 1;
    public final LaunchActivity f39229b;
    public final byte[] f39230c;
    public final int d;
    public final Integer f39231e;
    public final String f39232f;
    public final int h;
    public final long f39233n;
    public final Object f39234r;
    public final Object f39235s;
    public final Object v;

    public k90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39229b = launchActivity;
        this.f39234r = bundle;
        this.f39230c = bArr;
        this.d = i10;
        this.f39231e = num;
        this.f39232f = str;
        this.h = i11;
        this.f39233n = j3;
        this.f39235s = j0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k90.run():void");
    }

    public k90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f39229b = launchActivity;
        this.f39234r = tLObject;
        this.f39231e = num;
        this.f39235s = num2;
        this.f39230c = bArr;
        this.f39233n = j3;
        this.v = runnable;
        this.f39232f = str;
        this.d = i10;
        this.h = i11;
    }
}
