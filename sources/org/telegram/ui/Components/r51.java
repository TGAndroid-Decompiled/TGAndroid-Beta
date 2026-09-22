package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class r51 {
    public String[] f27826a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f27826a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(k51 k51Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(k51 k51Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f27826a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
