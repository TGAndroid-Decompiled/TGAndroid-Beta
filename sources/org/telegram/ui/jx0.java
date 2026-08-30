package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class jx0 implements GenericProvider, org.telegram.ui.Components.kl0, u60 {
    public final mx0 f35525a;

    public jx0(mx0 mx0Var) {
        this.f35525a = mx0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z4, boolean z10) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f35525a.V();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        mx0 mx0Var = this.f35525a;
        if (i10 >= mx0Var.f36405r && i10 < mx0Var.f36406s) {
            if (mx0Var.f36409y == 1) {
                mx0Var.U(Long.valueOf(mx0Var.getMessagesController().blockePeers.keyAt(i10 - mx0Var.f36405r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        mx0 mx0Var = this.f35525a;
        mx0Var.getClass();
        if (((Integer) obj).intValue() != mx0Var.f36407w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20122p7, false)));
    }
}
