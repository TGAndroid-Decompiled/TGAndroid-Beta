package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class lx0 implements GenericProvider, org.telegram.ui.Components.ll0, v60 {
    public final ox0 f38902a;

    public lx0(ox0 ox0Var) {
        this.f38902a = ox0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z4, boolean z10) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f38902a.V();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        ox0 ox0Var = this.f38902a;
        if (i10 >= ox0Var.f39861r && i10 < ox0Var.f39862s) {
            if (ox0Var.f39865y == 1) {
                ox0Var.U(Long.valueOf(ox0Var.getMessagesController().blockePeers.keyAt(i10 - ox0Var.f39861r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        ox0 ox0Var = this.f38902a;
        ox0Var.getClass();
        if (((Integer) obj).intValue() != ox0Var.f39863w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false)));
    }
}
