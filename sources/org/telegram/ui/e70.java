package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class e70 implements Runnable {
    public final int f45181a = 1;
    public final LaunchActivity f45182b;
    public final byte[] f45183c;
    public final int d;
    public final Integer f45184e;
    public final String f45185f;
    public final int h;
    public final long f45186n;
    public final Object f45187r;
    public final Object f45188s;
    public final Object f45189w;

    public e70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f45182b = launchActivity;
        this.f45187r = bundle;
        this.f45183c = bArr;
        this.d = i7;
        this.f45184e = num;
        this.f45185f = str;
        this.h = i10;
        this.f45186n = j3;
        this.f45188s = j0Var;
        this.f45189w = f2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e70.run():void");
    }

    public e70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f45182b = launchActivity;
        this.f45187r = tLObject;
        this.f45184e = num;
        this.f45188s = num2;
        this.f45183c = bArr;
        this.f45186n = j3;
        this.f45189w = runnable;
        this.f45185f = str;
        this.d = i7;
        this.h = i10;
    }
}
