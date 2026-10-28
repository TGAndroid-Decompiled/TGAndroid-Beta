package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public final class cg0 implements Runnable {
    public final int f38339a;
    public final Object f38340b;
    public final Object f38341c;
    public final Object d;
    public final Object e;

    public cg0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38339a = i10;
        this.f38341c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f38340b = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cg0.run():void");
    }

    public cg0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f38339a = i10;
        this.f38341c = obj;
        this.e = obj2;
        this.d = obj3;
        this.f38340b = obj4;
    }

    public cg0(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f38339a = i10;
        this.f38341c = obj;
        this.d = obj2;
        this.f38340b = str;
        this.e = obj3;
    }

    public cg0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f38339a = i10;
        this.f38341c = obj;
        this.e = tLObject;
        this.f38340b = obj2;
        this.d = obj3;
    }
}
