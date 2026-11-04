package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class k31 {
    public String[] f35262a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f35262a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(d31 d31Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(d31 d31Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f35262a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z10, int i3) {
    }
}
