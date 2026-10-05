package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class r21 implements Runnable {
    public final int f30333a;
    public final int f30334b;
    public final Object f30335c;
    public final Object d;
    public final Object f30336e;

    public r21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f30333a = i11;
        this.f30334b = i10;
        this.f30335c = obj;
        this.d = obj2;
        this.f30336e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r21.run():void");
    }

    public r21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f30333a = i11;
        this.f30335c = obj;
        this.f30334b = i10;
        this.d = obj2;
        this.f30336e = obj3;
    }

    public r21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f30333a = i11;
        this.f30335c = obj;
        this.d = obj2;
        this.f30334b = i10;
        this.f30336e = obj3;
    }

    public r21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f30333a = i11;
        this.f30335c = obj;
        this.d = obj2;
        this.f30336e = obj3;
        this.f30334b = i10;
    }

    public r21(qg.n2 n2Var, Bitmap bitmap, int i10, org.telegram.ui.jr0 jr0Var) {
        this.f30333a = 15;
        this.f30335c = n2Var;
        this.f30336e = bitmap;
        this.f30334b = i10;
        this.d = jr0Var;
    }
}
