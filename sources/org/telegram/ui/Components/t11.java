package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class t11 implements Runnable {
    public final int f27991a;
    public final int f27992b;
    public final Object f27993c;
    public final Object d;
    public final Object e;

    public t11(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f27991a = i11;
        this.f27992b = i10;
        this.f27993c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t11.run():void");
    }

    public t11(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f27991a = i11;
        this.f27993c = obj;
        this.f27992b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public t11(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f27991a = i11;
        this.f27993c = obj;
        this.d = obj2;
        this.f27992b = i10;
        this.e = obj3;
    }

    public t11(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f27991a = i11;
        this.f27993c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f27992b = i10;
    }

    public t11(qg.p2 p2Var, Bitmap bitmap, int i10, org.telegram.ui.qr0 qr0Var) {
        this.f27991a = 15;
        this.f27993c = p2Var;
        this.e = bitmap;
        this.f27992b = i10;
        this.d = qr0Var;
    }
}
