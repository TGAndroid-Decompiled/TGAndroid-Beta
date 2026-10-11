package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class k61 {
    public String[] f27852a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f27852a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(d61 d61Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(d61 d61Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f27852a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
