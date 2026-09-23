package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class r11 implements Runnable {
    public final int f27524a;
    public final int f27525b;
    public final Object f27526c;
    public final Object d;
    public final Object e;

    public r11(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f27524a = i11;
        this.f27525b = i10;
        this.f27526c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r11.run():void");
    }

    public r11(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f27524a = i11;
        this.f27526c = obj;
        this.f27525b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public r11(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f27524a = i11;
        this.f27526c = obj;
        this.d = obj2;
        this.f27525b = i10;
        this.e = obj3;
    }

    public r11(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f27524a = i11;
        this.f27526c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f27525b = i10;
    }

    public r11(qg.p2 p2Var, Bitmap bitmap, int i10, org.telegram.ui.ir0 ir0Var) {
        this.f27524a = 15;
        this.f27526c = p2Var;
        this.e = bitmap;
        this.f27525b = i10;
        this.d = ir0Var;
    }
}
