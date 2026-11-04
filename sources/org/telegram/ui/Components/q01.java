package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class q01 implements org.telegram.messenger.s10, org.telegram.messenger.t10, qe.b {
    public final g11 f37307a;

    public q01(g11 g11Var) {
        this.f37307a = g11Var;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        this.f37307a.h();
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        g11 g11Var = this.f37307a;
        boolean z10 = false;
        if (!g11Var.K.f35597k3 && !g11Var.f33940y.f35597k3) {
            Object obj = r31Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z10 = g11Var.o((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        g11.a(this.f37307a, (r31) obj);
    }

    @Override
    public void F(float f10, int i3) {
    }
}
