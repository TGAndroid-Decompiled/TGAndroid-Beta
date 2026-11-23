package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class wi implements org.telegram.messenger.z10 {
    public final int f41830a;
    public final Object f41831b;

    public wi(Object obj, int i7) {
        this.f41830a = i7;
        this.f41831b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7;
        int i10 = this.f41830a;
        boolean z10 = true;
        Object obj2 = this.f41831b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(ej.P((ej) obj2, (org.telegram.messenger.gj) obj));
            case 1:
                th.f fVar = (th.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i11 = org.telegram.ui.ActionBar.m6.Gc;
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    i7 = 3;
                } else {
                    i7 = 6;
                }
                org.telegram.messenger.mz c10 = org.telegram.messenger.u5.c(i7 * 0.12f, i11);
                c10.f25706t = true;
                c10.f25699m = org.telegram.ui.ActionBar.m6.f29463hf;
                imageReceiver.s0(org.telegram.messenger.gc.p(org.telegram.messenger.i20.b(fVar.f58269b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f24045p)))), null, null, null, new eq(c10), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.m8(imageReceiver, 1));
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
                return new sc(4, imageReceiver, view.getContext().getResources().getDrawable(2131231647).mutate());
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
                h51 h51Var = (h51) obj2;
                View view2 = (View) obj;
                h51Var.getClass();
                if (view2.getParent() != h51Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!c51.K(h51Var.T(view2).f59169f));
        }
    }
}
