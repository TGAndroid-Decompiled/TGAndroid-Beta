package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class fy0 implements GenericProvider, org.telegram.ui.Components.mm0, a70 {
    public final iy0 f37871a;

    public fy0(iy0 iy0Var) {
        this.f37871a = iy0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f37871a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        iy0 iy0Var = this.f37871a;
        if (i10 >= iy0Var.f39041r && i10 < iy0Var.f39042s) {
            if (iy0Var.f39045y == 1) {
                iy0Var.U(Long.valueOf(iy0Var.getMessagesController().blockePeers.keyAt(i10 - iy0Var.f39041r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        iy0 iy0Var = this.f37871a;
        iy0Var.getClass();
        if (((Integer) obj).intValue() != iy0Var.f39043w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20781p7, false)));
    }
}
