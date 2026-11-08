package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class b70 implements Runnable {
    public final int f44211a = 1;
    public final LaunchActivity f44212b;
    public final byte[] f44213c;
    public final int d;
    public final Integer f44214e;
    public final String f44215f;
    public final int h;
    public final long f44216n;
    public final Object f44217r;
    public final Object f44218s;
    public final Object f44219w;

    public b70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f44212b = launchActivity;
        this.f44217r = bundle;
        this.f44213c = bArr;
        this.d = i7;
        this.f44214e = num;
        this.f44215f = str;
        this.h = i10;
        this.f44216n = j3;
        this.f44218s = j0Var;
        this.f44219w = f2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b70.run():void");
    }

    public b70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f44212b = launchActivity;
        this.f44217r = tLObject;
        this.f44214e = num;
        this.f44218s = num2;
        this.f44213c = bArr;
        this.f44216n = j3;
        this.f44219w = runnable;
        this.f44215f = str;
        this.d = i7;
        this.h = i10;
    }
}
