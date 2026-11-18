package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class b70 implements Runnable {
    public final int f45778a = 1;
    public final LaunchActivity f45779b;
    public final byte[] f45780c;
    public final int d;
    public final Integer f45781e;
    public final String f45782f;
    public final int h;
    public final long f45783n;
    public final Object f45784r;
    public final Object f45785s;
    public final Object f45786w;

    public b70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f45779b = launchActivity;
        this.f45784r = bundle;
        this.f45780c = bArr;
        this.d = i7;
        this.f45781e = num;
        this.f45782f = str;
        this.h = i10;
        this.f45783n = j3;
        this.f45785s = j0Var;
        this.f45786w = h2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b70.run():void");
    }

    public b70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f45779b = launchActivity;
        this.f45784r = tLObject;
        this.f45781e = num;
        this.f45785s = num2;
        this.f45780c = bArr;
        this.f45783n = j3;
        this.f45786w = runnable;
        this.f45782f = str;
        this.d = i7;
        this.h = i10;
    }
}
