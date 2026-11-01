package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class di implements org.telegram.messenger.s20 {
    public final int f25493a;
    public final Object f25494b;

    public di(Object obj, int i10) {
        this.f25493a = i10;
        this.f25494b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i10;
        int i11 = this.f25493a;
        boolean z10 = false;
        Object obj2 = this.f25494b;
        switch (i11) {
            case 0:
                return Boolean.valueOf(mi.N((mi) obj2, (org.telegram.messenger.kj) obj));
            case 1:
                jh.h hVar = (jh.h) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i12 = org.telegram.ui.ActionBar.t6.Dc;
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    i10 = 3;
                } else {
                    i10 = 6;
                }
                org.telegram.messenger.d00 c10 = org.telegram.messenger.v5.c(i10 * 0.12f, i12);
                c10.f15277t = true;
                c10.f15270m = org.telegram.ui.ActionBar.t6.f20956ef;
                imageReceiver.s0(org.telegram.messenger.jc.p(org.telegram.messenger.c30.b(hVar.f10417b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.i0.f16171p)))), null, null, null, new up(c10), null, 0);
                view.addOnAttachStateChangeListener(new jh.f(imageReceiver, 0));
                imageReceiver.J0(org.telegram.messenger.i0.L(14.0f));
                return new jh.g(0, imageReceiver, view.getContext().getResources().getDrawable(2131231645).mutate());
            case 2:
                int i13 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i13 == -1) {
                    return Boolean.TRUE;
                }
                if (i13 == 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                v51 v51Var = (v51) obj2;
                View view2 = (View) obj;
                v51Var.getClass();
                if (view2.getParent() != v51Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!q51.K(v51Var.T(view2).f47912f));
        }
    }
}
