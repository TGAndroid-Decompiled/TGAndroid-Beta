package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class h21 implements Runnable {
    public final int f24699a;
    public final int f24700b;
    public final Object f24701c;
    public final Object d;
    public final Object e;

    public h21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f24699a = i11;
        this.f24700b = i10;
        this.f24701c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h21.run():void");
    }

    public h21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f24699a = i11;
        this.f24701c = obj;
        this.f24700b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public h21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f24699a = i11;
        this.f24701c = obj;
        this.d = obj2;
        this.f24700b = i10;
        this.e = obj3;
    }

    public h21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f24699a = i11;
        this.f24701c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f24700b = i10;
    }

    public h21(qg.n2 n2Var, Bitmap bitmap, int i10, org.telegram.ui.jr0 jr0Var) {
        this.f24699a = 15;
        this.f24701c = n2Var;
        this.e = bitmap;
        this.f24700b = i10;
        this.d = jr0Var;
    }
}
