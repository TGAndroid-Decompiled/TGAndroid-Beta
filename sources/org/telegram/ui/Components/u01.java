package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class u01 implements org.telegram.messenger.a20, org.telegram.messenger.b20, te.b {
    public final l11 f38460a;

    public u01(l11 l11Var) {
        this.f38460a = l11Var;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f38460a.h();
    }

    @Override
    public Boolean a(w31 w31Var, View view, Integer num, Float f10, Float f11) {
        l11 l11Var = this.f38460a;
        boolean z9 = false;
        if (!l11Var.J.j3 && !l11Var.f35499y.j3) {
            Object obj = w31Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z9 = l11Var.o((TLRPC.TL_forumTopic) obj, view, false);
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
        l11.a(this.f38460a, (w31) obj);
    }

    @Override
    public void F(float f10, int i7) {
    }
}
