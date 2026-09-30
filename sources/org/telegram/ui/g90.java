package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class g90 implements Runnable {
    public final int f34004a = 1;
    public final LaunchActivity f34005b;
    public final byte[] f34006c;
    public final int d;
    public final Integer e;
    public final String f34007f;
    public final int h;
    public final long f34008n;
    public final Object f34009r;
    public final Object f34010s;
    public final Object v;

    public g90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f34005b = launchActivity;
        this.f34009r = bundle;
        this.f34006c = bArr;
        this.d = i10;
        this.e = num;
        this.f34007f = str;
        this.h = i11;
        this.f34008n = j3;
        this.f34010s = j0Var;
        this.v = m2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g90.run():void");
    }

    public g90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f34005b = launchActivity;
        this.f34009r = tLObject;
        this.e = num;
        this.f34010s = num2;
        this.f34006c = bArr;
        this.f34008n = j3;
        this.v = runnable;
        this.f34007f = str;
        this.d = i10;
        this.h = i11;
    }
}
