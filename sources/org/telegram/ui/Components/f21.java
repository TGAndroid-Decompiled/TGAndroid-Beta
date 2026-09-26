package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class f21 implements Runnable {
    public final int f24049a;
    public final int f24050b;
    public final Object f24051c;
    public final Object d;
    public final Object e;

    public f21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f24049a = i11;
        this.f24050b = i10;
        this.f24051c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f21.run():void");
    }

    public f21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f24049a = i11;
        this.f24051c = obj;
        this.f24050b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public f21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f24049a = i11;
        this.f24051c = obj;
        this.d = obj2;
        this.f24050b = i10;
        this.e = obj3;
    }

    public f21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f24049a = i11;
        this.f24051c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f24050b = i10;
    }

    public f21(qg.n2 n2Var, Bitmap bitmap, int i10, org.telegram.ui.gr0 gr0Var) {
        this.f24049a = 15;
        this.f24051c = n2Var;
        this.e = bitmap;
        this.f24050b = i10;
        this.d = gr0Var;
    }
}
