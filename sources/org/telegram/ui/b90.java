package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class b90 implements Runnable {
    public final int f32848a = 1;
    public final LaunchActivity f32849b;
    public final byte[] f32850c;
    public final int d;
    public final Integer e;
    public final String f32851f;
    public final int h;
    public final long f32852n;
    public final Object f32853r;
    public final Object f32854s;
    public final Object v;

    public b90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, k0 k0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f32849b = launchActivity;
        this.f32853r = bundle;
        this.f32850c = bArr;
        this.d = i10;
        this.e = num;
        this.f32851f = str;
        this.h = i11;
        this.f32852n = j10;
        this.f32854s = k0Var;
        this.v = p2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b90.run():void");
    }

    public b90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f32849b = launchActivity;
        this.f32853r = tLObject;
        this.e = num;
        this.f32854s = num2;
        this.f32850c = bArr;
        this.f32852n = j10;
        this.v = runnable;
        this.f32851f = str;
        this.d = i10;
        this.h = i11;
    }
}
