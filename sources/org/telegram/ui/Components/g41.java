package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class g41 {
    public String[] f35313a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f35313a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(z31 z31Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(z31 z31Var, n nVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f35313a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
    }
}
