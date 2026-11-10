package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class p31 {
    public String[] f36793a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f36793a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(i31 i31Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(i31 i31Var, j jVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f36793a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z9, int i7) {
    }
}
