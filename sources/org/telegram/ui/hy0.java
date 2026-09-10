package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class hy0 implements GenericProvider, org.telegram.ui.Components.ll0, a70 {
    public final ky0 f33486a;

    public hy0(ky0 ky0Var) {
        this.f33486a = ky0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f33486a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        ky0 ky0Var = this.f33486a;
        if (i10 >= ky0Var.f34478r && i10 < ky0Var.f34479s) {
            if (ky0Var.f34482y == 1) {
                ky0Var.U(Long.valueOf(ky0Var.getMessagesController().blockePeers.keyAt(i10 - ky0Var.f34478r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        ky0 ky0Var = this.f33486a;
        ky0Var.getClass();
        if (((Integer) obj).intValue() != ky0Var.f34480w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18144p7, false)));
    }
}
