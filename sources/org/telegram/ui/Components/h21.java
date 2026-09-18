package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLObject;
public final class h21 implements Runnable {
    public final int f24534a;
    public final int f24535b;
    public final Object f24536c;
    public final Object d;
    public final Object e;

    public h21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.f24534a = i11;
        this.f24535b = i10;
        this.f24536c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h21.run():void");
    }

    public h21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f24534a = i11;
        this.f24536c = obj;
        this.f24535b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public h21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f24534a = i11;
        this.f24536c = obj;
        this.d = obj2;
        this.f24535b = i10;
        this.e = obj3;
    }

    public h21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f24534a = i11;
        this.f24536c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f24535b = i10;
    }

    public h21(qg.m2 m2Var, Bitmap bitmap, int i10, org.telegram.ui.pr0 pr0Var) {
        this.f24534a = 15;
        this.f24536c = m2Var;
        this.e = bitmap;
        this.f24535b = i10;
        this.d = pr0Var;
    }
}
