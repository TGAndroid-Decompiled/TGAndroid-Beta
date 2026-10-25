package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class px0 implements GenericProvider, org.telegram.ui.Components.bm0, n60 {
    public final sx0 f42675a;

    public px0(sx0 sx0Var) {
        this.f42675a = sx0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f42675a.W();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        sx0 sx0Var = this.f42675a;
        if (i10 >= sx0Var.f43618r && i10 < sx0Var.f43619s) {
            if (sx0Var.f43622y == 1) {
                sx0Var.V(Long.valueOf(sx0Var.getMessagesController().blockePeers.keyAt(i10 - sx0Var.f43618r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        sx0 sx0Var = this.f42675a;
        sx0Var.getClass();
        if (((Integer) obj).intValue() != sx0Var.f43620w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23579p7, false)));
    }
}
