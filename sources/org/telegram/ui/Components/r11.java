package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class r11 implements Runnable {
    public final int f29880a;
    public final int f29881b;
    public final Object f29882c;
    public final Object d;
    public final Object f29883e;

    public r11(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f29880a = i11;
        this.f29881b = i10;
        this.f29882c = obj;
        this.d = obj2;
        this.f29883e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r11.run():void");
    }

    public r11(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f29880a = i11;
        this.f29882c = obj;
        this.f29881b = i10;
        this.d = obj2;
        this.f29883e = obj3;
    }

    public r11(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f29880a = i11;
        this.f29882c = obj;
        this.d = obj2;
        this.f29881b = i10;
        this.f29883e = obj3;
    }

    public r11(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f29880a = i11;
        this.f29882c = obj;
        this.d = obj2;
        this.f29883e = obj3;
        this.f29881b = i10;
    }

    public r11(rg.o2 o2Var, Bitmap bitmap, int i10, org.telegram.ui.or0 or0Var) {
        this.f29880a = 16;
        this.f29882c = o2Var;
        this.f29883e = bitmap;
        this.f29881b = i10;
        this.d = or0Var;
    }
}
