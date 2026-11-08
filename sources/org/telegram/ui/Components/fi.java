package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class fi implements org.telegram.messenger.d20 {
    public final int f33557a;
    public final Object f33558b;

    public fi(Object obj, int i7) {
        this.f33557a = i7;
        this.f33558b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7;
        int i10 = this.f33557a;
        boolean z9 = true;
        Object obj2 = this.f33558b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(ni.O((ni) obj2, (org.telegram.messenger.ij) obj));
            case 1:
                th.f fVar = (th.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i11 = org.telegram.ui.ActionBar.k6.Dc;
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    i7 = 3;
                } else {
                    i7 = 6;
                }
                org.telegram.messenger.rz c10 = org.telegram.messenger.t5.c(i7 * 0.12f, i11);
                c10.f25396t = true;
                c10.f25389m = org.telegram.ui.ActionBar.k6.f27879ef;
                imageReceiver.s0(org.telegram.messenger.hc.p(org.telegram.messenger.m20.b(fVar.f56060b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f22562p)))), null, null, null, new np(c10), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.l8(imageReceiver, 1));
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
                return new oc(4, imageReceiver, view.getContext().getResources().getDrawable(2131231646).mutate());
            case 2:
                int i12 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i12 == -1) {
                    return Boolean.TRUE;
                }
                if (i12 != 1) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            default:
                q41 q41Var = (q41) obj2;
                View view2 = (View) obj;
                q41Var.getClass();
                if (view2.getParent() != q41Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!l41.K(q41Var.T(view2).f57048f));
        }
    }
}
