package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class k90 implements Runnable {
    public final int f37892a = 1;
    public final LaunchActivity f37893b;
    public final byte[] f37894c;
    public final int d;
    public final Integer f37895e;
    public final String f37896f;
    public final int h;
    public final long f37897n;
    public final Object f37898r;
    public final Object f37899s;
    public final Object v;

    public k90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37893b = launchActivity;
        this.f37898r = bundle;
        this.f37894c = bArr;
        this.d = i10;
        this.f37895e = num;
        this.f37896f = str;
        this.h = i11;
        this.f37897n = j3;
        this.f37899s = j0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k90.run():void");
    }

    public k90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f37893b = launchActivity;
        this.f37898r = tLObject;
        this.f37895e = num;
        this.f37899s = num2;
        this.f37894c = bArr;
        this.f37897n = j3;
        this.v = runnable;
        this.f37896f = str;
        this.d = i10;
        this.h = i11;
    }
}
