package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class i21 implements Runnable {
    public final int f24947a;
    public final int f24948b;
    public final Object f24949c;
    public final Object d;
    public final Object e;

    public i21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f24947a = i11;
        this.f24948b = i10;
        this.f24949c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i21.run():void");
    }

    public i21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f24947a = i11;
        this.f24949c = obj;
        this.f24948b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public i21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f24947a = i11;
        this.f24949c = obj;
        this.d = obj2;
        this.f24948b = i10;
        this.e = obj3;
    }

    public i21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f24947a = i11;
        this.f24949c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f24948b = i10;
    }

    public i21(qg.n2 n2Var, Bitmap bitmap, int i10, org.telegram.ui.pr0 pr0Var) {
        this.f24947a = 15;
        this.f24949c = n2Var;
        this.e = bitmap;
        this.f24948b = i10;
        this.d = pr0Var;
    }
}
