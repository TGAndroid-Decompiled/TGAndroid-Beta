package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class d70 implements Runnable {
    public final int f44873a = 1;
    public final LaunchActivity f44874b;
    public final byte[] f44875c;
    public final int d;
    public final Integer f44876e;
    public final String f44877f;
    public final int h;
    public final long f44878n;
    public final Object f44879r;
    public final Object f44880s;
    public final Object f44881w;

    public d70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f44874b = launchActivity;
        this.f44879r = bundle;
        this.f44875c = bArr;
        this.d = i7;
        this.f44876e = num;
        this.f44877f = str;
        this.h = i10;
        this.f44878n = j3;
        this.f44880s = j0Var;
        this.f44881w = f2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d70.run():void");
    }

    public d70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f44874b = launchActivity;
        this.f44879r = tLObject;
        this.f44876e = num;
        this.f44880s = num2;
        this.f44875c = bArr;
        this.f44878n = j3;
        this.f44881w = runnable;
        this.f44877f = str;
        this.d = i7;
        this.h = i10;
    }
}
