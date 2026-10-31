package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class w11 implements org.telegram.messenger.o20, org.telegram.messenger.p20, fe.e {
    public final o21 f31966a;

    public w11(o21 o21Var) {
        this.f31966a = o21Var;
    }

    @Override
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        o21 o21Var = this.f31966a;
        boolean z10 = false;
        if (!o21Var.M.f30823j3 && !o21Var.F.f30823j3) {
            Object obj = a51Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = o21Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        o21.a(this.f31966a, (a51) obj);
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.f31966a.h();
    }

    @Override
    public void E(float f7, int i10) {
    }
}
