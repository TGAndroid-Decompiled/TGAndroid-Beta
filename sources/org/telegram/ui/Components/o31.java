package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class o31 {
    public String[] f36471a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f36471a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(h31 h31Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(h31 h31Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f36471a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z9, int i7) {
    }
}
