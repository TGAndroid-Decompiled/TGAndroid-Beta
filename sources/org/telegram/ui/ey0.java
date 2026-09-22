package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class ey0 implements GenericProvider, org.telegram.ui.Components.ol0, a70 {
    public final hy0 f33444a;

    public ey0(hy0 hy0Var) {
        this.f33444a = hy0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f33444a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        hy0 hy0Var = this.f33444a;
        if (i10 >= hy0Var.f34336r && i10 < hy0Var.f34337s) {
            if (hy0Var.f34340y == 1) {
                hy0Var.U(Long.valueOf(hy0Var.getMessagesController().blockePeers.keyAt(i10 - hy0Var.f34336r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        hy0 hy0Var = this.f33444a;
        hy0Var.getClass();
        if (((Integer) obj).intValue() != hy0Var.f34338w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19330p7, false)));
    }
}
