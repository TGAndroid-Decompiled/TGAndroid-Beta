package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class mt0 implements org.telegram.messenger.j9, org.telegram.ui.Components.ij0, s40 {
    public final pt0 f49315a;

    public mt0(pt0 pt0Var) {
        this.f49315a = pt0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f49315a.a0();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        pt0 pt0Var = this.f49315a;
        if (i7 >= pt0Var.f50367r && i7 < pt0Var.f50368s) {
            if (pt0Var.E == 1) {
                pt0Var.Z(Long.valueOf(pt0Var.getMessagesController().H0.keyAt(i7 - pt0Var.f50367r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object o(Object obj) {
        pt0 pt0Var = this.f49315a;
        pt0Var.getClass();
        if (((Integer) obj).intValue() != pt0Var.f50370x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29070p7, false)));
    }
}
