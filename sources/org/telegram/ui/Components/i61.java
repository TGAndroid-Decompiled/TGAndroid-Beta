package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class i61 {
    public String[] f27254a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f27254a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(b61 b61Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(b61 b61Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f27254a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
