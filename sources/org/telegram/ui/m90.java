package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class m90 implements Runnable {
    public final int f39968a = 1;
    public final LaunchActivity f39969b;
    public final byte[] f39970c;
    public final int d;
    public final Integer f39971e;
    public final String f39972f;
    public final int h;
    public final long f39973n;
    public final Object f39974r;
    public final Object f39975s;
    public final Object v;

    public m90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f39969b = launchActivity;
        this.f39974r = bundle;
        this.f39970c = bArr;
        this.d = i10;
        this.f39971e = num;
        this.f39972f = str;
        this.h = i11;
        this.f39973n = j3;
        this.f39975s = j0Var;
        this.v = m2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m90.run():void");
    }

    public m90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f39969b = launchActivity;
        this.f39974r = tLObject;
        this.f39971e = num;
        this.f39975s = num2;
        this.f39970c = bArr;
        this.f39973n = j3;
        this.v = runnable;
        this.f39972f = str;
        this.d = i10;
        this.h = i11;
    }
}
