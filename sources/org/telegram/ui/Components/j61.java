package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class j61 {
    public String[] f27567a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f27567a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(c61 c61Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(c61 c61Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f27567a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
