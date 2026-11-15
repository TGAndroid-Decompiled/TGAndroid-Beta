package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hb implements li0 {
    public final ib f35208a;

    public hb(ib ibVar) {
        this.f35208a = ibVar;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        ib ibVar = this.f35208a;
        org.telegram.ui.ActionBar.e2 e2Var = ibVar.f35530f;
        if (ibVar.f35529e == null) {
            return;
        }
        long e10 = org.telegram.messenger.m10.i(e2Var.getCurrentAccount()).e();
        if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).a() == e10) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < ibVar.f35529e.size(); i10++) {
            int keyAt = ibVar.f35529e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = e2Var.getUserConfig().e();
            message.f28072id = keyAt;
            org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(e2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(p0Var);
            e2Var.getSendMessagesHelper().s0(gjVar, arrayList, p0Var, false, false, ibVar.f35530f, null);
            i7 = message.f28072id;
        }
        ibVar.f();
        xb.e();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.pw(this, p0Var, !z12, e2Var.getCurrentAccount(), i7), 300L);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final void K() {
    }

    @Override
    public final void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
