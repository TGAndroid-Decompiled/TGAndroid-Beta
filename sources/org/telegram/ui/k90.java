package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class k90 implements Runnable {
    public final int f37897a = 1;
    public final LaunchActivity f37898b;
    public final byte[] f37899c;
    public final int d;
    public final Integer f37900e;
    public final String f37901f;
    public final int h;
    public final long f37902n;
    public final Object f37903r;
    public final Object f37904s;
    public final Object v;

    public k90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37898b = launchActivity;
        this.f37903r = bundle;
        this.f37899c = bArr;
        this.d = i10;
        this.f37900e = num;
        this.f37901f = str;
        this.h = i11;
        this.f37902n = j3;
        this.f37904s = j0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k90.run():void");
    }

    public k90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f37898b = launchActivity;
        this.f37903r = tLObject;
        this.f37900e = num;
        this.f37904s = num2;
        this.f37899c = bArr;
        this.f37902n = j3;
        this.v = runnable;
        this.f37901f = str;
        this.d = i10;
        this.h = i11;
    }
}
