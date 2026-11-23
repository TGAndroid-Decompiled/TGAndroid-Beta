package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class vi implements org.telegram.messenger.x10 {
    public final int f40706a;
    public final Object f40707b;

    public vi(Object obj, int i7) {
        this.f40706a = i7;
        this.f40707b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7;
        int i10 = this.f40706a;
        boolean z10 = true;
        Object obj2 = this.f40707b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(dj.P((dj) obj2, (org.telegram.messenger.fj) obj));
            case 1:
                th.f fVar = (th.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i11 = org.telegram.ui.ActionBar.n6.Gc;
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    i7 = 3;
                } else {
                    i7 = 6;
                }
                org.telegram.messenger.kz c10 = org.telegram.messenger.u5.c(i7 * 0.12f, i11);
                c10.f25423t = true;
                c10.f25416m = org.telegram.ui.ActionBar.n6.f29533hf;
                imageReceiver.t0(org.telegram.messenger.fc.p(org.telegram.messenger.g20.b(fVar.f58349b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f24225p)))), null, null, null, new bq(c10), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.l8(imageReceiver, 1));
                imageReceiver.K0(org.telegram.messenger.g0.L(14.0f));
                return new sc(4, imageReceiver, view.getContext().getResources().getDrawable(2131231650).mutate());
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
                g51 g51Var = (g51) obj2;
                View view2 = (View) obj;
                g51Var.getClass();
                if (view2.getParent() != g51Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!b51.K(g51Var.T(view2).f59249f));
        }
    }
}
