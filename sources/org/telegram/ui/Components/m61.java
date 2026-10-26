package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class m61 {
    public String[] f30412a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f30412a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(f61 f61Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(f61 f61Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f30412a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
