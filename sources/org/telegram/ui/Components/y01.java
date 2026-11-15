package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class y01 implements org.telegram.messenger.x10, org.telegram.messenger.y10, te.b {
    public final p11 f41830a;

    public y01(p11 p11Var) {
        this.f41830a = p11Var;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        this.f41830a.h();
    }

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        p11 p11Var = this.f41830a;
        boolean z10 = false;
        if (!p11Var.K.f39895k3 && !p11Var.f38165y.f39895k3) {
            Object obj = b41Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = p11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        p11.a(this.f41830a, (b41) obj);
    }

    @Override
    public void E(float f10, int i7) {
    }
}
