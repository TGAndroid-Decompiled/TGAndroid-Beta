package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class j90 implements Runnable {
    public final int f38980a = 1;
    public final LaunchActivity f38981b;
    public final byte[] f38982c;
    public final int d;
    public final Integer f38983e;
    public final String f38984f;
    public final int h;
    public final long f38985n;
    public final Object f38986r;
    public final Object f38987s;
    public final Object v;

    public j90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, i0 i0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f38981b = launchActivity;
        this.f38986r = bundle;
        this.f38982c = bArr;
        this.d = i10;
        this.f38983e = num;
        this.f38984f = str;
        this.h = i11;
        this.f38985n = j3;
        this.f38987s = i0Var;
        this.v = m2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j90.run():void");
    }

    public j90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f38981b = launchActivity;
        this.f38986r = tLObject;
        this.f38983e = num;
        this.f38987s = num2;
        this.f38982c = bArr;
        this.f38985n = j3;
        this.v = runnable;
        this.f38984f = str;
        this.d = i10;
        this.h = i11;
    }
}
