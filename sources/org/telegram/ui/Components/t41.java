package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class t41 {
    public String[] f30527a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f30527a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(m41 m41Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(m41 m41Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f30527a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
