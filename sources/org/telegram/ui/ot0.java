package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class ot0 implements org.telegram.messenger.k9, org.telegram.ui.Components.dj0, s40 {
    public final rt0 f48550a;

    public ot0(rt0 rt0Var) {
        this.f48550a = rt0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z9, boolean z10) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f48550a.a0();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        rt0 rt0Var = this.f48550a;
        if (i7 >= rt0Var.f49550r && i7 < rt0Var.f49551s) {
            if (rt0Var.D == 1) {
                rt0Var.Z(Long.valueOf(rt0Var.getMessagesController().G0.keyAt(i7 - rt0Var.f49550r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object j(Object obj) {
        rt0 rt0Var = this.f48550a;
        rt0Var.getClass();
        if (((Integer) obj).intValue() != rt0Var.f49553x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28069p7, false)));
    }
}
