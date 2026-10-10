package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r21 implements Runnable {
    public final int f30347a;
    public final int f30348b;
    public final Object f30349c;
    public final Object d;
    public final Object f30350e;

    public r21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f30347a = i11;
        this.f30348b = i10;
        this.f30349c = obj;
        this.d = obj2;
        this.f30350e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r21.run():void");
    }

    public r21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f30347a = i11;
        this.f30349c = obj;
        this.f30348b = i10;
        this.d = obj2;
        this.f30350e = obj3;
    }

    public r21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f30347a = i11;
        this.f30349c = obj;
        this.d = obj2;
        this.f30348b = i10;
        this.f30350e = obj3;
    }

    public r21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f30347a = i11;
        this.f30349c = obj;
        this.d = obj2;
        this.f30350e = obj3;
        this.f30348b = i10;
    }

    public r21(pg.m1 m1Var, pg.h1 h1Var, int i10, ArrayList arrayList) {
        this.f30347a = 17;
        this.f30349c = m1Var;
        this.f30350e = h1Var;
        this.f30348b = i10;
        this.d = arrayList;
    }
}
