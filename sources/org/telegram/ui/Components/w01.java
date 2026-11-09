package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class w01 implements org.telegram.messenger.a20, org.telegram.messenger.b20, te.b {
    public final n11 f39856a;

    public w01(n11 n11Var) {
        this.f39856a = n11Var;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f39856a.h();
    }

    @Override
    public Boolean a(y31 y31Var, View view, Integer num, Float f10, Float f11) {
        n11 n11Var = this.f39856a;
        boolean z9 = false;
        if (!n11Var.J.j3 && !n11Var.f36222y.j3) {
            Object obj = y31Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z9 = n11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z9);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        n11.a(this.f39856a, (y31) obj);
    }

    @Override
    public void F(float f10, int i7) {
    }
}
