package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class m90 implements Runnable {
    public final int f39965a = 1;
    public final LaunchActivity f39966b;
    public final byte[] f39967c;
    public final int d;
    public final Integer f39968e;
    public final String f39969f;
    public final int h;
    public final long f39970n;
    public final Object f39971r;
    public final Object f39972s;
    public final Object v;

    public m90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f39966b = launchActivity;
        this.f39971r = bundle;
        this.f39967c = bArr;
        this.d = i10;
        this.f39968e = num;
        this.f39969f = str;
        this.h = i11;
        this.f39970n = j3;
        this.f39972s = j0Var;
        this.v = m2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m90.run():void");
    }

    public m90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f39966b = launchActivity;
        this.f39971r = tLObject;
        this.f39968e = num;
        this.f39972s = num2;
        this.f39967c = bArr;
        this.f39970n = j3;
        this.v = runnable;
        this.f39969f = str;
        this.d = i10;
        this.h = i11;
    }
}
