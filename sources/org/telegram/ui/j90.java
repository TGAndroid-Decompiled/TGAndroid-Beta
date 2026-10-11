package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class j90 implements Runnable {
    public final int f38946a = 1;
    public final LaunchActivity f38947b;
    public final byte[] f38948c;
    public final int d;
    public final Integer f38949e;
    public final String f38950f;
    public final int h;
    public final long f38951n;
    public final Object f38952r;
    public final Object f38953s;
    public final Object v;

    public j90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, i0 i0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f38947b = launchActivity;
        this.f38952r = bundle;
        this.f38948c = bArr;
        this.d = i10;
        this.f38949e = num;
        this.f38950f = str;
        this.h = i11;
        this.f38951n = j3;
        this.f38953s = i0Var;
        this.v = m2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j90.run():void");
    }

    public j90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f38947b = launchActivity;
        this.f38952r = tLObject;
        this.f38949e = num;
        this.f38953s = num2;
        this.f38948c = bArr;
        this.f38951n = j3;
        this.v = runnable;
        this.f38950f = str;
        this.d = i10;
        this.h = i11;
    }
}
