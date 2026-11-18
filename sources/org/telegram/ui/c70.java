package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class c70 implements Runnable {
    public final int f46442a = 1;
    public final LaunchActivity f46443b;
    public final byte[] f46444c;
    public final int d;
    public final Integer f46445e;
    public final String f46446f;
    public final int h;
    public final long f46447n;
    public final Object f46448r;
    public final Object f46449s;
    public final Object f46450w;

    public c70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f46443b = launchActivity;
        this.f46448r = bundle;
        this.f46444c = bArr;
        this.d = i7;
        this.f46445e = num;
        this.f46446f = str;
        this.h = i10;
        this.f46447n = j3;
        this.f46449s = j0Var;
        this.f46450w = h2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c70.run():void");
    }

    public c70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f46443b = launchActivity;
        this.f46448r = tLObject;
        this.f46445e = num;
        this.f46449s = num2;
        this.f46444c = bArr;
        this.f46447n = j3;
        this.f46450w = runnable;
        this.f46446f = str;
        this.d = i7;
        this.h = i10;
    }
}
