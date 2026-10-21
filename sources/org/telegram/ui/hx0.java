package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class hx0 implements GenericProvider, org.telegram.ui.Components.zl0, h60 {
    public final kx0 f37815a;

    public hx0(kx0 kx0Var) {
        this.f37815a = kx0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        kx0 kx0Var = this.f37815a;
        if (i10 >= kx0Var.f38686r && i10 < kx0Var.f38687s) {
            if (kx0Var.f38690y == 1) {
                kx0Var.U(Long.valueOf(kx0Var.getMessagesController().blockePeers.keyAt(i10 - kx0Var.f38686r)), view);
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
            this.f37815a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public Object provide(Object obj) {
        kx0 kx0Var = this.f37815a;
        kx0Var.getClass();
        if (((Integer) obj).intValue() != kx0Var.f38688w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false)));
    }
}
