package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class c51 {
    public String[] f25802a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f25802a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(v41 v41Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(v41 v41Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z4);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f25802a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z4, int i10) {
    }
}
