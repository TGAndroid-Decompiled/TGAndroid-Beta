package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class c70 implements Runnable {
    public final int f46461a = 1;
    public final LaunchActivity f46462b;
    public final byte[] f46463c;
    public final int d;
    public final Integer f46464e;
    public final String f46465f;
    public final int h;
    public final long f46466n;
    public final Object f46467r;
    public final Object f46468s;
    public final Object f46469w;

    public c70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f46462b = launchActivity;
        this.f46467r = bundle;
        this.f46463c = bArr;
        this.d = i7;
        this.f46464e = num;
        this.f46465f = str;
        this.h = i10;
        this.f46466n = j3;
        this.f46468s = j0Var;
        this.f46469w = g2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c70.run():void");
    }

    public c70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f46462b = launchActivity;
        this.f46467r = tLObject;
        this.f46464e = num;
        this.f46468s = num2;
        this.f46463c = bArr;
        this.f46466n = j3;
        this.f46469w = runnable;
        this.f46465f = str;
        this.d = i7;
        this.h = i10;
    }
}
