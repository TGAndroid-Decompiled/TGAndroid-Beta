package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class s41 {
    public String[] f30124a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f30124a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(l41 l41Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(l41 l41Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f30124a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
