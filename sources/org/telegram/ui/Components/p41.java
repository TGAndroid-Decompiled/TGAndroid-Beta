package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class p41 {
    public String[] f31578a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f31578a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(i41 i41Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(i41 i41Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f31578a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
