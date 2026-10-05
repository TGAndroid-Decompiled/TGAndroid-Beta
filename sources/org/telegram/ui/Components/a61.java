package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class a61 {
    public String[] f24507a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f24507a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(t51 t51Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(t51 t51Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f24507a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
