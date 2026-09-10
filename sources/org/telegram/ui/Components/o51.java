package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class o51 {
    public String[] f25677a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f25677a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(h51 h51Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(h51 h51Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f25677a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
