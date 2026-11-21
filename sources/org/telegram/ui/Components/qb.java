package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qb implements wi0 {
    public final rb f38873a;

    public qb(rb rbVar) {
        this.f38873a = rbVar;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        rb rbVar = this.f38873a;
        org.telegram.ui.ActionBar.g2 g2Var = rbVar.f39132f;
        if (rbVar.f39131e == null) {
            return;
        }
        long e10 = org.telegram.messenger.j10.i(g2Var.getCurrentAccount()).e();
        if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).a() == e10) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < rbVar.f39131e.size(); i10++) {
            int keyAt = rbVar.f39131e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = g2Var.getUserConfig().e();
            message.f28452id = keyAt;
            org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(g2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(p0Var);
            g2Var.getSendMessagesHelper().s0(fjVar, arrayList, p0Var, false, false, rbVar.f39132f, null);
            i7 = message.f28452id;
        }
        rbVar.f();
        gc.e();
        org.telegram.messenger.g0.h3(new bi.t4(this, p0Var, !z12, g2Var.getCurrentAccount(), i7), 300L);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void z() {
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
