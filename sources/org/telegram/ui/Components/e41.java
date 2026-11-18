package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class e41 {
    public String[] f34602a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f34602a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(x31 x31Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(x31 x31Var, n nVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f34602a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
    }
}
