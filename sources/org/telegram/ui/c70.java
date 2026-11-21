package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class c70 implements Runnable {
    public final int f46474a = 1;
    public final LaunchActivity f46475b;
    public final byte[] f46476c;
    public final int d;
    public final Integer f46477e;
    public final String f46478f;
    public final int h;
    public final long f46479n;
    public final Object f46480r;
    public final Object f46481s;
    public final Object f46482w;

    public c70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f46475b = launchActivity;
        this.f46480r = bundle;
        this.f46476c = bArr;
        this.d = i7;
        this.f46477e = num;
        this.f46478f = str;
        this.h = i10;
        this.f46479n = j3;
        this.f46481s = j0Var;
        this.f46482w = g2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c70.run():void");
    }

    public c70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f46475b = launchActivity;
        this.f46480r = tLObject;
        this.f46477e = num;
        this.f46481s = num2;
        this.f46476c = bArr;
        this.f46479n = j3;
        this.f46482w = runnable;
        this.f46478f = str;
        this.d = i7;
        this.h = i10;
    }
}
