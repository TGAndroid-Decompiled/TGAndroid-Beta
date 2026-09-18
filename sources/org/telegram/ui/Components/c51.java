package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class c51 {
    public String[] f22937a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f22937a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(v41 v41Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(v41 v41Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f22937a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
