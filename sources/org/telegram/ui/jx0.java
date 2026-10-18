package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class jx0 implements GenericProvider, org.telegram.ui.Components.yl0, j60 {
    public final mx0 f38370a;

    public jx0(mx0 mx0Var) {
        this.f38370a = mx0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        mx0 mx0Var = this.f38370a;
        if (i10 >= mx0Var.f39291r && i10 < mx0Var.f39292s) {
            if (mx0Var.f39295y == 1) {
                mx0Var.U(Long.valueOf(mx0Var.getMessagesController().blockePeers.keyAt(i10 - mx0Var.f39291r)), view);
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
            this.f38370a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public Object provide(Object obj) {
        mx0 mx0Var = this.f38370a;
        mx0Var.getClass();
        if (((Integer) obj).intValue() != mx0Var.f39293w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21214p7, false)));
    }
}
