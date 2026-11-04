package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class ft0 implements org.telegram.messenger.e9, org.telegram.ui.Components.hj0, n40 {
    public final it0 f45368a;

    public ft0(it0 it0Var) {
        this.f45368a = it0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f45368a.a0();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean f(int i3, View view) {
        it0 it0Var = this.f45368a;
        if (i3 >= it0Var.f46416r && i3 < it0Var.f46417s) {
            if (it0Var.E == 1) {
                it0Var.Z(Long.valueOf(it0Var.getMessagesController().H0.keyAt(i3 - it0Var.f46416r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object k(Object obj) {
        it0 it0Var = this.f45368a;
        it0Var.getClass();
        if (((Integer) obj).intValue() != it0Var.f46419x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28102p7, false)));
    }
}
