package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class ei implements org.telegram.messenger.d20 {
    public final int f33266a;
    public final Object f33267b;

    public ei(Object obj, int i7) {
        this.f33266a = i7;
        this.f33267b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7;
        int i10 = this.f33266a;
        boolean z9 = true;
        Object obj2 = this.f33267b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(mi.O((mi) obj2, (org.telegram.messenger.ij) obj));
            case 1:
                th.f fVar = (th.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i11 = org.telegram.ui.ActionBar.m6.Dc;
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    i7 = 3;
                } else {
                    i7 = 6;
                }
                org.telegram.messenger.rz c10 = org.telegram.messenger.t5.c(i7 * 0.12f, i11);
                c10.f25400t = true;
                c10.f25393m = org.telegram.ui.ActionBar.m6.f27917ef;
                imageReceiver.s0(org.telegram.messenger.hc.p(org.telegram.messenger.m20.b(fVar.f56071b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f22566p)))), null, null, null, new np(c10), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.l8(imageReceiver, 1));
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
                return new nc(4, imageReceiver, view.getContext().getResources().getDrawable(2131231646).mutate());
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
                r41 r41Var = (r41) obj2;
                View view2 = (View) obj;
                r41Var.getClass();
                if (view2.getParent() != r41Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!m41.K(r41Var.T(view2).f57056f));
        }
    }
}
