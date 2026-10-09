package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class x21 implements Runnable {
    public final int f32728a;
    public final int f32729b;
    public final Object f32730c;
    public final Object d;
    public final Object f32731e;

    public x21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f32728a = i11;
        this.f32729b = i10;
        this.f32730c = obj;
        this.d = obj2;
        this.f32731e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x21.run():void");
    }

    public x21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f32728a = i11;
        this.f32730c = obj;
        this.f32729b = i10;
        this.d = obj2;
        this.f32731e = obj3;
    }

    public x21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f32728a = i11;
        this.f32730c = obj;
        this.d = obj2;
        this.f32729b = i10;
        this.f32731e = obj3;
    }

    public x21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f32728a = i11;
        this.f32730c = obj;
        this.d = obj2;
        this.f32731e = obj3;
        this.f32729b = i10;
    }

    public x21(qg.o2 o2Var, Bitmap bitmap, int i10, org.telegram.ui.or0 or0Var) {
        this.f32728a = 17;
        this.f32730c = o2Var;
        this.f32731e = bitmap;
        this.f32729b = i10;
        this.d = or0Var;
    }
}
