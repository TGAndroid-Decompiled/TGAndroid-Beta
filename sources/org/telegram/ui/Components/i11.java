package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class i11 implements org.telegram.messenger.v10, org.telegram.messenger.w10, te.b {
    public final z11 f36026a;

    public i11(z11 z11Var) {
        this.f36026a = z11Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f36026a.h();
    }

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        z11 z11Var = this.f36026a;
        boolean z10 = false;
        if (!z11Var.K.f34610k3 && !z11Var.f42750y.f34610k3) {
            Object obj = l41Var.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = z11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        z11.a(this.f36026a, (l41) obj);
    }

    @Override
    public void D(float f10, int i7) {
    }
}
