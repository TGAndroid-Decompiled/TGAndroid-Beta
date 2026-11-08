package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class pt0 implements org.telegram.messenger.k9, org.telegram.ui.Components.dj0, s40 {
    public final st0 f48952a;

    public pt0(st0 st0Var) {
        this.f48952a = st0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z9, boolean z10) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f48952a.a0();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        st0 st0Var = this.f48952a;
        if (i7 >= st0Var.f49821r && i7 < st0Var.f49822s) {
            if (st0Var.D == 1) {
                st0Var.Z(Long.valueOf(st0Var.getMessagesController().G0.keyAt(i7 - st0Var.f49821r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object j(Object obj) {
        st0 st0Var = this.f48952a;
        st0Var.getClass();
        if (((Integer) obj).intValue() != st0Var.f49824x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28073p7, false)));
    }
}
