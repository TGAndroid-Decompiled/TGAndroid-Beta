package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class a80 implements Runnable {
    public final int f35705a = 1;
    public final LaunchActivity f35706b;
    public final byte[] f35707c;
    public final int d;
    public final Integer e;
    public final String f35708f;
    public final int h;
    public final long f35709n;
    public final Object f35710r;
    public final Object f35711s;
    public final Object f35712w;

    public a80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, k0 k0Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f35706b = launchActivity;
        this.f35710r = bundle;
        this.f35707c = bArr;
        this.d = i10;
        this.e = num;
        this.f35708f = str;
        this.h = i11;
        this.f35709n = j10;
        this.f35711s = k0Var;
        this.f35712w = k2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a80.run():void");
    }

    public a80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f35706b = launchActivity;
        this.f35710r = tLObject;
        this.e = num;
        this.f35711s = num2;
        this.f35707c = bArr;
        this.f35709n = j10;
        this.f35712w = runnable;
        this.f35708f = str;
        this.d = i10;
        this.h = i11;
    }
}
