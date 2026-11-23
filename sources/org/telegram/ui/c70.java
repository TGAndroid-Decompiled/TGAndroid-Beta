package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class c70 implements Runnable {
    public final int f46477a = 1;
    public final LaunchActivity f46478b;
    public final byte[] f46479c;
    public final int d;
    public final Integer f46480e;
    public final String f46481f;
    public final int h;
    public final long f46482n;
    public final Object f46483r;
    public final Object f46484s;
    public final Object f46485w;

    public c70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f46478b = launchActivity;
        this.f46483r = bundle;
        this.f46479c = bArr;
        this.d = i7;
        this.f46480e = num;
        this.f46481f = str;
        this.h = i10;
        this.f46482n = j3;
        this.f46484s = j0Var;
        this.f46485w = g2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c70.run():void");
    }

    public c70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f46478b = launchActivity;
        this.f46483r = tLObject;
        this.f46480e = num;
        this.f46484s = num2;
        this.f46479c = bArr;
        this.f46482n = j3;
        this.f46485w = runnable;
        this.f46481f = str;
        this.d = i7;
        this.h = i10;
    }
}
