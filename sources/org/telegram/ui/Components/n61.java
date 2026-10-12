package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class n61 {
    public String[] f28736a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f28736a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(g61 g61Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(g61 g61Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f28736a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
