package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class cy0 implements GenericProvider, org.telegram.ui.Components.hm0, y60 {
    public final fy0 f36887a;

    public cy0(fy0 fy0Var) {
        this.f36887a = fy0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f36887a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        fy0 fy0Var = this.f36887a;
        if (i10 >= fy0Var.f37844r && i10 < fy0Var.f37845s) {
            if (fy0Var.f37848y == 1) {
                fy0Var.U(Long.valueOf(fy0Var.getMessagesController().blockePeers.keyAt(i10 - fy0Var.f37844r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        fy0 fy0Var = this.f36887a;
        fy0Var.getClass();
        if (((Integer) obj).intValue() != fy0Var.f37846w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21043p7, false)));
    }
}
