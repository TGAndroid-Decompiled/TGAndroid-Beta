package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class dy0 implements GenericProvider, org.telegram.ui.Components.gm0, y60 {
    public final gy0 f37108a;

    public dy0(gy0 gy0Var) {
        this.f37108a = gy0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f37108a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        gy0 gy0Var = this.f37108a;
        if (i10 >= gy0Var.f38146r && i10 < gy0Var.f38147s) {
            if (gy0Var.f38150y == 1) {
                gy0Var.U(Long.valueOf(gy0Var.getMessagesController().blockePeers.keyAt(i10 - gy0Var.f38146r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        gy0 gy0Var = this.f37108a;
        gy0Var.getClass();
        if (((Integer) obj).intValue() != gy0Var.f38148w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21018p7, false)));
    }
}
