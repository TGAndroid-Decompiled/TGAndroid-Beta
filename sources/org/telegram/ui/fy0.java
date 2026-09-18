package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class fy0 implements GenericProvider, org.telegram.ui.Components.cl0, c70 {
    public final iy0 f33795a;

    public fy0(iy0 iy0Var) {
        this.f33795a = iy0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f33795a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        iy0 iy0Var = this.f33795a;
        if (i10 >= iy0Var.f34716r && i10 < iy0Var.f34717s) {
            if (iy0Var.f34720y == 1) {
                iy0Var.U(Long.valueOf(iy0Var.getMessagesController().blockePeers.keyAt(i10 - iy0Var.f34716r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        iy0 iy0Var = this.f33795a;
        iy0Var.getClass();
        if (((Integer) obj).intValue() != iy0Var.f34718w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19083p7, false)));
    }
}
