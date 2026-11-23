package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class ot0 implements org.telegram.messenger.i9, org.telegram.ui.Components.sj0, u40 {
    public final rt0 f50763a;

    public ot0(rt0 rt0Var) {
        this.f50763a = rt0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f50763a.a0();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        rt0 rt0Var = this.f50763a;
        if (i7 >= rt0Var.f51889r && i7 < rt0Var.f51890s) {
            if (rt0Var.E == 1) {
                rt0Var.Z(Long.valueOf(rt0Var.getMessagesController().H0.keyAt(i7 - rt0Var.f51889r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object h(Object obj) {
        rt0 rt0Var = this.f50763a;
        rt0Var.getClass();
        if (((Integer) obj).intValue() != rt0Var.f51892x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29672p7, false)));
    }
}
