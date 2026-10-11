package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s21 implements Runnable {
    public final int f30598a;
    public final int f30599b;
    public final Object f30600c;
    public final Object d;
    public final Object f30601e;

    public s21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f30598a = i11;
        this.f30599b = i10;
        this.f30600c = obj;
        this.d = obj2;
        this.f30601e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s21.run():void");
    }

    public s21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f30598a = i11;
        this.f30600c = obj;
        this.f30599b = i10;
        this.d = obj2;
        this.f30601e = obj3;
    }

    public s21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f30598a = i11;
        this.f30600c = obj;
        this.d = obj2;
        this.f30599b = i10;
        this.f30601e = obj3;
    }

    public s21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f30598a = i11;
        this.f30600c = obj;
        this.d = obj2;
        this.f30601e = obj3;
        this.f30599b = i10;
    }

    public s21(pg.m1 m1Var, pg.h1 h1Var, int i10, ArrayList arrayList) {
        this.f30598a = 17;
        this.f30600c = m1Var;
        this.f30601e = h1Var;
        this.f30599b = i10;
        this.d = arrayList;
    }
}
