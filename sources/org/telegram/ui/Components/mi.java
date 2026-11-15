package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class mi implements org.telegram.messenger.a20 {
    public final int f37253a;
    public final Object f37254b;

    public mi(Object obj, int i7) {
        this.f37253a = i7;
        this.f37254b = obj;
    }

    @Override
    public final Object a(Object obj) {
        int i7;
        int i10 = this.f37253a;
        boolean z10 = true;
        Object obj2 = this.f37254b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(vi.P((vi) obj2, (org.telegram.messenger.gj) obj));
            case 1:
                th.f fVar = (th.f) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i11 = org.telegram.ui.ActionBar.j6.Gc;
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    i7 = 3;
                } else {
                    i7 = 6;
                }
                org.telegram.messenger.pz c10 = org.telegram.messenger.t5.c(i7 * 0.12f, i11);
                c10.f26043t = true;
                c10.f26036m = org.telegram.ui.ActionBar.j6.f28931hf;
                imageReceiver.s0(org.telegram.messenger.gc.p(org.telegram.messenger.k20.b(fVar.f57656b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f23608p)))), null, null, null, new vp(c10), null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.k8(imageReceiver, 1));
                imageReceiver.J0(org.telegram.messenger.g0.L(14.0f));
                return new jc(4, imageReceiver, view.getContext().getResources().getDrawable(2131231646).mutate());
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
                u41 u41Var = (u41) obj2;
                View view2 = (View) obj;
                u41Var.getClass();
                if (view2.getParent() != u41Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!p41.K(u41Var.T(view2).f58539f));
        }
    }
}
