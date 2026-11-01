package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class x11 implements org.telegram.messenger.p20, org.telegram.messenger.q20, fe.e {
    public final p21 f32359a;

    public x11(p21 p21Var) {
        this.f32359a = p21Var;
    }

    @Override
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        p21 p21Var = this.f32359a;
        boolean z10 = false;
        if (!p21Var.J.f31187j3 && !p21Var.f29342y.f31187j3) {
            Object obj = b51Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = p21Var.o((TLRPC.TL_forumTopic) obj, view, false);
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
        p21.a(this.f32359a, (b51) obj);
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.f32359a.h();
    }

    @Override
    public void E(float f7, int i10) {
    }
}
