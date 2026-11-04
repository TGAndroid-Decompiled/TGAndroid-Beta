package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class di implements org.telegram.messenger.v10 {
    public final int f33106a;
    public final Object f33107b;

    public di(Object obj, int i3) {
        this.f33106a = i3;
        this.f33107b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i3;
        int i10 = this.f33106a;
        boolean z10 = true;
        Object obj2 = this.f33107b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(ni.O((ni) obj2, (org.telegram.messenger.zi) obj));
            case 1:
                uh.f fVar = (uh.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i11 = org.telegram.ui.ActionBar.k6.Dc;
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    i3 = 3;
                } else {
                    i3 = 6;
                }
                org.telegram.messenger.jz c2 = org.telegram.messenger.t5.c(i3 * 0.12f, i11);
                c2.f23777t = true;
                c2.f23770m = org.telegram.ui.ActionBar.k6.f27906ef;
                imageReceiver.s0(org.telegram.messenger.ac.p(org.telegram.messenger.e20.b(fVar.f56364b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f22607p)))), null, null, null, new np(c2), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.k8(imageReceiver, 1));
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
                return new mc(4, imageReceiver, view.getContext().getResources().getDrawable(2131231646).mutate());
            case 2:
                int i12 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i12 == -1) {
                    return Boolean.TRUE;
                }
                if (i12 != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                l41 l41Var = (l41) obj2;
                View view2 = (View) obj;
                l41Var.getClass();
                if (view2.getParent() != l41Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!f41.K(l41Var.T(view2).f55544f));
        }
    }
}
