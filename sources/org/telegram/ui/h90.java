package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class h90 implements Runnable {
    public final int f33782a = 1;
    public final LaunchActivity f33783b;
    public final byte[] f33784c;
    public final int d;
    public final Integer e;
    public final String f33785f;
    public final int h;
    public final long f33786n;
    public final Object f33787r;
    public final Object f33788s;
    public final Object v;

    public h90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f33783b = launchActivity;
        this.f33787r = bundle;
        this.f33784c = bArr;
        this.d = i10;
        this.e = num;
        this.f33785f = str;
        this.h = i11;
        this.f33786n = j3;
        this.f33788s = j0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h90.run():void");
    }

    public h90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f33783b = launchActivity;
        this.f33787r = tLObject;
        this.e = num;
        this.f33788s = num2;
        this.f33784c = bArr;
        this.f33786n = j3;
        this.v = runnable;
        this.f33785f = str;
        this.d = i10;
        this.h = i11;
    }
}
