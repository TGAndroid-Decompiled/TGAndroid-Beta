package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class k11 implements org.telegram.messenger.v10, org.telegram.messenger.w10, te.b {
    public final b21 f36745a;

    public k11(b21 b21Var) {
        this.f36745a = b21Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f36745a.h();
    }

    @Override
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        b21 b21Var = this.f36745a;
        boolean z10 = false;
        if (!b21Var.K.f35799k3 && !b21Var.f33725y.f35799k3) {
            Object obj = o41Var.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = b21Var.o((TLRPC.TL_forumTopic) obj, view, false);
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
        b21.a(this.f36745a, (o41) obj);
    }

    @Override
    public void D(float f10, int i7) {
    }
}
