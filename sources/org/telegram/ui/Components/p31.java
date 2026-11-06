package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class p31 {
    public String[] f36775a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.f36775a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(i31 i31Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(i31 i31Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.f36775a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z9, int i7) {
    }
}
