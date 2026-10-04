package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class z51 {
    public String[] f33390a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f33390a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(s51 s51Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(s51 s51Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f33390a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
    }
}
