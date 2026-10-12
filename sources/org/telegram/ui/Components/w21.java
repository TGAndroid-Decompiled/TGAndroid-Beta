package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class w21 implements Runnable {
    public final int f32240a;
    public final int f32241b;
    public final Object f32242c;
    public final Object d;
    public final Object f32243e;

    public w21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f32240a = i11;
        this.f32241b = i10;
        this.f32242c = obj;
        this.d = obj2;
        this.f32243e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w21.run():void");
    }

    public w21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f32240a = i11;
        this.f32242c = obj;
        this.f32241b = i10;
        this.d = obj2;
        this.f32243e = obj3;
    }

    public w21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f32240a = i11;
        this.f32242c = obj;
        this.d = obj2;
        this.f32241b = i10;
        this.f32243e = obj3;
    }

    public w21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f32240a = i11;
        this.f32242c = obj;
        this.d = obj2;
        this.f32243e = obj3;
        this.f32241b = i10;
    }

    public w21(pg.l1 l1Var, pg.g1 g1Var, int i10, ArrayList arrayList) {
        this.f32240a = 17;
        this.f32242c = l1Var;
        this.f32243e = g1Var;
        this.f32241b = i10;
        this.d = arrayList;
    }
}
