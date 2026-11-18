package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class pt0 implements org.telegram.messenger.i9, org.telegram.ui.Components.qj0, v40 {
    public final st0 f51015a;

    public pt0(st0 st0Var) {
        this.f51015a = st0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f51015a.a0();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        st0 st0Var = this.f51015a;
        if (i7 >= st0Var.f52078r && i7 < st0Var.f52079s) {
            if (st0Var.E == 1) {
                st0Var.Z(Long.valueOf(st0Var.getMessagesController().H0.keyAt(i7 - st0Var.f52078r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object m(Object obj) {
        st0 st0Var = this.f51015a;
        st0Var.getClass();
        if (((Integer) obj).intValue() != st0Var.f52081x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29617p7, false)));
    }
}
