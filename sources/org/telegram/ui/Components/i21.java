package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class i21 implements Runnable {
    public final int f24989a;
    public final int f24990b;
    public final Object f24991c;
    public final Object d;
    public final Object e;

    public i21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f24989a = i11;
        this.f24990b = i10;
        this.f24991c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i21.run():void");
    }

    public i21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f24989a = i11;
        this.f24991c = obj;
        this.f24990b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public i21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f24989a = i11;
        this.f24991c = obj;
        this.d = obj2;
        this.f24990b = i10;
        this.e = obj3;
    }

    public i21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f24989a = i11;
        this.f24991c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f24990b = i10;
    }

    public i21(qg.n2 n2Var, Bitmap bitmap, int i10, org.telegram.ui.gr0 gr0Var) {
        this.f24989a = 15;
        this.f24991c = n2Var;
        this.e = bitmap;
        this.f24990b = i10;
        this.d = gr0Var;
    }
}
