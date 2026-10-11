package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class cy0 implements GenericProvider, org.telegram.ui.Components.im0, y60 {
    public final fy0 f36853a;

    public cy0(fy0 fy0Var) {
        this.f36853a = fy0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f36853a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        fy0 fy0Var = this.f36853a;
        if (i10 >= fy0Var.f37810r && i10 < fy0Var.f37811s) {
            if (fy0Var.f37814y == 1) {
                fy0Var.U(Long.valueOf(fy0Var.getMessagesController().blockePeers.keyAt(i10 - fy0Var.f37810r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        fy0 fy0Var = this.f36853a;
        fy0Var.getClass();
        if (((Integer) obj).intValue() != fy0Var.f37812w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21007p7, false)));
    }
}
