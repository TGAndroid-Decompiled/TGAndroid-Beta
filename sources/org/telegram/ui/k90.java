package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class k90 implements Runnable {
    public final int f34287a = 1;
    public final LaunchActivity f34288b;
    public final byte[] f34289c;
    public final int d;
    public final Integer e;
    public final String f34290f;
    public final int h;
    public final long f34291n;
    public final Object f34292r;
    public final Object f34293s;
    public final Object v;

    public k90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f34288b = launchActivity;
        this.f34292r = bundle;
        this.f34289c = bArr;
        this.d = i10;
        this.e = num;
        this.f34290f = str;
        this.h = i11;
        this.f34291n = j3;
        this.f34293s = j0Var;
        this.v = p2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k90.run():void");
    }

    public k90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f34288b = launchActivity;
        this.f34292r = tLObject;
        this.e = num;
        this.f34293s = num2;
        this.f34289c = bArr;
        this.f34291n = j3;
        this.v = runnable;
        this.f34290f = str;
        this.d = i10;
        this.h = i11;
    }
}
