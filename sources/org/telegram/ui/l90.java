package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class l90 implements Runnable {
    public final int f38235a = 1;
    public final LaunchActivity f38236b;
    public final byte[] f38237c;
    public final int d;
    public final Integer f38238e;
    public final String f38239f;
    public final int h;
    public final long f38240n;
    public final Object f38241r;
    public final Object f38242s;
    public final Object v;

    public l90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, i0 i0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f38236b = launchActivity;
        this.f38241r = bundle;
        this.f38237c = bArr;
        this.d = i10;
        this.f38238e = num;
        this.f38239f = str;
        this.h = i11;
        this.f38240n = j3;
        this.f38242s = i0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l90.run():void");
    }

    public l90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f38236b = launchActivity;
        this.f38241r = tLObject;
        this.f38238e = num;
        this.f38242s = num2;
        this.f38237c = bArr;
        this.f38240n = j3;
        this.v = runnable;
        this.f38239f = str;
        this.d = i10;
        this.h = i11;
    }
}
