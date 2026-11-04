package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kb implements ki0 {
    public final lb f35360a;

    public kb(lb lbVar) {
        this.f35360a = lbVar;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        boolean z12;
        lb lbVar = this.f35360a;
        org.telegram.ui.ActionBar.d2 d2Var = lbVar.f35674f;
        if (lbVar.f35673e == null) {
            return;
        }
        long e10 = org.telegram.messenger.h10.i(d2Var.getCurrentAccount()).e();
        if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).a() == e10) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < lbVar.f35673e.size(); i10++) {
            int keyAt = lbVar.f35673e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = d2Var.getUserConfig().e();
            message.f27022id = keyAt;
            org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(d2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(n0Var);
            d2Var.getSendMessagesHelper().s0(ziVar, arrayList, n0Var, false, false, lbVar.f35674f, null);
            i3 = message.f27022id;
        }
        lbVar.f();
        ac.e();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.kw(this, n0Var, !z12, d2Var.getCurrentAccount(), i3), 300L);
    }

    @Override
    public final void J() {
    }

    @Override
    public final void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
