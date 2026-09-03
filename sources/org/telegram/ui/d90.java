package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class d90 implements Runnable {
    public final int f33374a = 1;
    public final LaunchActivity f33375b;
    public final byte[] f33376c;
    public final int d;
    public final Integer e;
    public final String f33377f;
    public final int h;
    public final long f33378n;
    public final Object f33379r;
    public final Object f33380s;
    public final Object v;

    public d90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, m0 m0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f33375b = launchActivity;
        this.f33379r = bundle;
        this.f33376c = bArr;
        this.d = i10;
        this.e = num;
        this.f33377f = str;
        this.h = i11;
        this.f33378n = j10;
        this.f33380s = m0Var;
        this.v = p2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d90.run():void");
    }

    public d90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f33375b = launchActivity;
        this.f33379r = tLObject;
        this.e = num;
        this.f33380s = num2;
        this.f33376c = bArr;
        this.f33378n = j10;
        this.v = runnable;
        this.f33377f = str;
        this.d = i10;
        this.h = i11;
    }
}
