package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class ey0 implements GenericProvider, org.telegram.ui.Components.bl0, b70 {
    public final hy0 f36234a;

    public ey0(hy0 hy0Var) {
        this.f36234a = hy0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        hy0 hy0Var = this.f36234a;
        if (i10 >= hy0Var.f37164r && i10 < hy0Var.f37165s) {
            if (hy0Var.f37168y == 1) {
                hy0Var.U(Long.valueOf(hy0Var.getMessagesController().blockePeers.keyAt(i10 - hy0Var.f37164r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f36234a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public Object provide(Object obj) {
        hy0 hy0Var = this.f36234a;
        hy0Var.getClass();
        if (((Integer) obj).intValue() != hy0Var.f37166w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20908p7, false)));
    }
}
