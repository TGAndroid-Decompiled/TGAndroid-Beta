package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class p80 implements Runnable {
    public final int f41360a = 1;
    public final LaunchActivity f41361b;
    public final byte[] f41362c;
    public final int d;
    public final Integer f41363e;
    public final String f41364f;
    public final int h;
    public final long f41365n;
    public final Object f41366r;
    public final Object f41367s;
    public final Object v;

    public p80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i9, Integer num, String str, int i10, long j10, l0 l0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f41361b = launchActivity;
        this.f41366r = bundle;
        this.f41362c = bArr;
        this.d = i9;
        this.f41363e = num;
        this.f41364f = str;
        this.h = i10;
        this.f41365n = j10;
        this.f41367s = l0Var;
        this.v = o2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p80.run():void");
    }

    public p80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i9, int i10) {
        this.f41361b = launchActivity;
        this.f41366r = tLObject;
        this.f41363e = num;
        this.f41367s = num2;
        this.f41362c = bArr;
        this.f41365n = j10;
        this.v = runnable;
        this.f41364f = str;
        this.d = i9;
        this.h = i10;
    }
}
