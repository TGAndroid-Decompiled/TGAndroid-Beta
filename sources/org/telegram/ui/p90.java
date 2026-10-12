package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class p90 implements Runnable {
    public final int f39157a = 1;
    public final LaunchActivity f39158b;
    public final byte[] f39159c;
    public final int d;
    public final Integer e;
    public final String f39160f;
    public final int h;
    public final long f39161n;
    public final Object f39162r;
    public final Object f39163s;
    public final Object v;

    public p90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, k0 k0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f39158b = launchActivity;
        this.f39162r = bundle;
        this.f39159c = bArr;
        this.d = i10;
        this.e = num;
        this.f39160f = str;
        this.h = i11;
        this.f39161n = j10;
        this.f39163s = k0Var;
        this.v = m2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p90.run():void");
    }

    public p90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f39158b = launchActivity;
        this.f39162r = tLObject;
        this.e = num;
        this.f39163s = num2;
        this.f39159c = bArr;
        this.f39161n = j10;
        this.v = runnable;
        this.f39160f = str;
        this.d = i10;
        this.h = i11;
    }
}
