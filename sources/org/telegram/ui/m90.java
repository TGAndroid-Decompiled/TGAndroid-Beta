package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class m90 implements Runnable {
    public final int f35728a = 1;
    public final LaunchActivity f35729b;
    public final byte[] f35730c;
    public final int d;
    public final Integer e;
    public final String f35731f;
    public final int h;
    public final long f35732n;
    public final Object f35733r;
    public final Object f35734s;
    public final Object v;

    public m90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, i0 i0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f35729b = launchActivity;
        this.f35733r = bundle;
        this.f35730c = bArr;
        this.d = i10;
        this.e = num;
        this.f35731f = str;
        this.h = i11;
        this.f35732n = j3;
        this.f35734s = i0Var;
        this.v = o2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m90.run():void");
    }

    public m90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f35729b = launchActivity;
        this.f35733r = tLObject;
        this.e = num;
        this.f35734s = num2;
        this.f35730c = bArr;
        this.f35732n = j3;
        this.v = runnable;
        this.f35731f = str;
        this.d = i10;
        this.h = i11;
    }
}
