package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class b70 implements Runnable {
    public final int f45969a = 1;
    public final LaunchActivity f45970b;
    public final byte[] f45971c;
    public final int d;
    public final Integer f45972e;
    public final String f45973f;
    public final int h;
    public final long f45974n;
    public final Object f45975r;
    public final Object f45976s;
    public final Object f45977w;

    public b70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f45970b = launchActivity;
        this.f45975r = bundle;
        this.f45971c = bArr;
        this.d = i7;
        this.f45972e = num;
        this.f45973f = str;
        this.h = i10;
        this.f45974n = j3;
        this.f45976s = j0Var;
        this.f45977w = g2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b70.run():void");
    }

    public b70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f45970b = launchActivity;
        this.f45975r = tLObject;
        this.f45972e = num;
        this.f45976s = num2;
        this.f45971c = bArr;
        this.f45974n = j3;
        this.f45977w = runnable;
        this.f45973f = str;
        this.d = i7;
        this.h = i10;
    }
}
