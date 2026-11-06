package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class v01 implements org.telegram.messenger.a20, org.telegram.messenger.b20, te.b {
    public final m11 f38772a;

    public v01(m11 m11Var) {
        this.f38772a = m11Var;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f38772a.h();
    }

    @Override
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        m11 m11Var = this.f38772a;
        boolean z9 = false;
        if (!m11Var.J.j3 && !m11Var.f35836y.j3) {
            Object obj = x31Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z9 = m11Var.o((TLRPC.TL_forumTopic) obj, view, false);
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
        m11.a(this.f38772a, (x31) obj);
    }

    @Override
    public void F(float f10, int i7) {
    }
}
