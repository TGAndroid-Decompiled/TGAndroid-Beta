package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class i11 implements org.telegram.messenger.u10, org.telegram.messenger.v10, te.b {
    public final z11 f35866a;

    public i11(z11 z11Var) {
        this.f35866a = z11Var;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        this.f35866a.h();
    }

    @Override
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        z11 z11Var = this.f35866a;
        boolean z10 = false;
        if (!z11Var.K.f35326k3 && !z11Var.f42645y.f35326k3) {
            Object obj = n41Var.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = z11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        z11.a(this.f35866a, (n41) obj);
    }

    @Override
    public void G(float f10, int i7) {
    }
}
