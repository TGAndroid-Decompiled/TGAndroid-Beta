package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class b80 implements Runnable {
    public final int f36126a = 1;
    public final LaunchActivity f36127b;
    public final byte[] f36128c;
    public final int d;
    public final Integer e;
    public final String f36129f;
    public final int h;
    public final long f36130n;
    public final Object f36131r;
    public final Object f36132s;
    public final Object f36133w;

    public b80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, k0 k0Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f36127b = launchActivity;
        this.f36131r = bundle;
        this.f36128c = bArr;
        this.d = i10;
        this.e = num;
        this.f36129f = str;
        this.h = i11;
        this.f36130n = j10;
        this.f36132s = k0Var;
        this.f36133w = k2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b80.run():void");
    }

    public b80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f36127b = launchActivity;
        this.f36131r = tLObject;
        this.e = num;
        this.f36132s = num2;
        this.f36128c = bArr;
        this.f36130n = j10;
        this.f36133w = runnable;
        this.f36129f = str;
        this.d = i10;
        this.h = i11;
    }
}
