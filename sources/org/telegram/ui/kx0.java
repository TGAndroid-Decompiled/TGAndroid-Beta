package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class kx0 implements GenericProvider, org.telegram.ui.Components.bm0, l60 {
    public final nx0 f39067a;

    public kx0(nx0 nx0Var) {
        this.f39067a = nx0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f39067a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        nx0 nx0Var = this.f39067a;
        if (i10 >= nx0Var.f40012r && i10 < nx0Var.f40013s) {
            if (nx0Var.f40016y == 1) {
                nx0Var.U(Long.valueOf(nx0Var.getMessagesController().blockePeers.keyAt(i10 - nx0Var.f40012r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        nx0 nx0Var = this.f39067a;
        nx0Var.getClass();
        if (((Integer) obj).intValue() != nx0Var.f40014w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21405p7, false)));
    }
}
