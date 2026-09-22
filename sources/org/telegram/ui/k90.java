package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class k90 implements Runnable {
    public final int f35101a = 1;
    public final LaunchActivity f35102b;
    public final byte[] f35103c;
    public final int d;
    public final Integer e;
    public final String f35104f;
    public final int h;
    public final long f35105n;
    public final Object f35106r;
    public final Object f35107s;
    public final Object v;

    public k90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, i0 i0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35102b = launchActivity;
        this.f35106r = bundle;
        this.f35103c = bArr;
        this.d = i10;
        this.e = num;
        this.f35104f = str;
        this.h = i11;
        this.f35105n = j3;
        this.f35107s = i0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k90.run():void");
    }

    public k90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.f35102b = launchActivity;
        this.f35106r = tLObject;
        this.e = num;
        this.f35107s = num2;
        this.f35103c = bArr;
        this.f35105n = j3;
        this.v = runnable;
        this.f35104f = str;
        this.d = i10;
        this.h = i11;
    }
}
