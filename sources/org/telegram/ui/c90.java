package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class c90 implements Runnable {
    public final int f35716a = 1;
    public final LaunchActivity f35717b;
    public final byte[] f35718c;
    public final int d;
    public final Integer f35719e;
    public final String f35720f;
    public final int h;
    public final long f35721n;
    public final Object f35722r;
    public final Object f35723s;
    public final Object v;

    public c90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, k0 k0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f35717b = launchActivity;
        this.f35722r = bundle;
        this.f35718c = bArr;
        this.d = i10;
        this.f35719e = num;
        this.f35720f = str;
        this.h = i11;
        this.f35721n = j10;
        this.f35723s = k0Var;
        this.v = p2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c90.run():void");
    }

    public c90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f35717b = launchActivity;
        this.f35722r = tLObject;
        this.f35719e = num;
        this.f35723s = num2;
        this.f35718c = bArr;
        this.f35721n = j10;
        this.v = runnable;
        this.f35720f = str;
        this.d = i10;
        this.h = i11;
    }
}
