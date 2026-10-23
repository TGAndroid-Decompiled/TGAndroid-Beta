package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class lx0 implements GenericProvider, org.telegram.ui.Components.cm0, l60 {
    public final ox0 f39342a;

    public lx0(ox0 ox0Var) {
        this.f39342a = ox0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f39342a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        ox0 ox0Var = this.f39342a;
        if (i10 >= ox0Var.f40295r && i10 < ox0Var.f40296s) {
            if (ox0Var.f40299y == 1) {
                ox0Var.U(Long.valueOf(ox0Var.getMessagesController().blockePeers.keyAt(i10 - ox0Var.f40295r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        ox0 ox0Var = this.f39342a;
        ox0Var.getClass();
        if (((Integer) obj).intValue() != ox0Var.f40297w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21404p7, false)));
    }
}
