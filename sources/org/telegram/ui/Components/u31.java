package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class u31 {
    public String[] f39892a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f39892a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(n31 n31Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(n31 n31Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f39892a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
    }
}
