package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class dy0 implements GenericProvider, org.telegram.ui.Components.bl0, a70 {
    public final gy0 f33124a;

    public dy0(gy0 gy0Var) {
        this.f33124a = gy0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f33124a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        gy0 gy0Var = this.f33124a;
        if (i10 >= gy0Var.f33971r && i10 < gy0Var.f33972s) {
            if (gy0Var.f33975y == 1) {
                gy0Var.U(Long.valueOf(gy0Var.getMessagesController().blockePeers.keyAt(i10 - gy0Var.f33971r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        gy0 gy0Var = this.f33124a;
        gy0Var.getClass();
        if (((Integer) obj).intValue() != gy0Var.f33973w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19053p7, false)));
    }
}
