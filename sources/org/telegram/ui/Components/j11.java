package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class j11 implements org.telegram.messenger.w10, org.telegram.messenger.x10, te.b {
    public final a21 f36315a;

    public j11(a21 a21Var) {
        this.f36315a = a21Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f36315a.h();
    }

    @Override
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        a21 a21Var = this.f36315a;
        boolean z10 = false;
        if (!a21Var.K.f35745k3 && !a21Var.f33268y.f35745k3) {
            Object obj = o41Var.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = a21Var.o((TLRPC.TL_forumTopic) obj, view, false);
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
        a21.a(this.f36315a, (o41) obj);
    }

    @Override
    public void D(float f10, int i7) {
    }
}
