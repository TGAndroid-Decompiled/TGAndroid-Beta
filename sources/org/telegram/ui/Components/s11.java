package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class s11 implements Runnable {
    public final int f27739a;
    public final int f27740b;
    public final Object f27741c;
    public final Object d;
    public final Object e;

    public s11(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f27739a = i11;
        this.f27740b = i10;
        this.f27741c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s11.run():void");
    }

    public s11(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f27739a = i11;
        this.f27741c = obj;
        this.f27740b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public s11(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f27739a = i11;
        this.f27741c = obj;
        this.d = obj2;
        this.f27740b = i10;
        this.e = obj3;
    }

    public s11(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f27739a = i11;
        this.f27741c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f27740b = i10;
    }

    public s11(qg.p2 p2Var, Bitmap bitmap, int i10, org.telegram.ui.or0 or0Var) {
        this.f27739a = 15;
        this.f27741c = p2Var;
        this.e = bitmap;
        this.f27740b = i10;
        this.d = or0Var;
    }
}
