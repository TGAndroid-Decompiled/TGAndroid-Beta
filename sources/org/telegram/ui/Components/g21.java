package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class g21 implements Runnable {
    public final int f24236a;
    public final int f24237b;
    public final Object f24238c;
    public final Object d;
    public final Object e;

    public g21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f24236a = i11;
        this.f24237b = i10;
        this.f24238c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g21.run():void");
    }

    public g21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f24236a = i11;
        this.f24238c = obj;
        this.f24237b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public g21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f24236a = i11;
        this.f24238c = obj;
        this.d = obj2;
        this.f24237b = i10;
        this.e = obj3;
    }

    public g21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f24236a = i11;
        this.f24238c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f24237b = i10;
    }

    public g21(qg.n2 n2Var, Bitmap bitmap, int i10, org.telegram.ui.pr0 pr0Var) {
        this.f24236a = 15;
        this.f24238c = n2Var;
        this.e = bitmap;
        this.f24237b = i10;
        this.d = pr0Var;
    }
}
