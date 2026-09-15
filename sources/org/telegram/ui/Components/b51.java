package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class b51 {
    public String[] f22628a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f22628a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(u41 u41Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(u41 u41Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f22628a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
