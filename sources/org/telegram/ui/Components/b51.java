package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class b51 {
    public String[] f23556a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f23556a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(u41 u41Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(u41 u41Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z4);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f23556a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z4, int i10) {
    }
}
