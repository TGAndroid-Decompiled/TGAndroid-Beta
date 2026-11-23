package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pb implements wi0 {
    public final qb f38443a;

    public pb(qb qbVar) {
        this.f38443a = qbVar;
    }

    @Override
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        qb qbVar = this.f38443a;
        org.telegram.ui.ActionBar.g2 g2Var = qbVar.f38754f;
        if (qbVar.f38753e == null) {
            return;
        }
        long e10 = org.telegram.messenger.i10.i(g2Var.getCurrentAccount()).e();
        if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).a() == e10) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < qbVar.f38753e.size(); i10++) {
            int keyAt = qbVar.f38753e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = g2Var.getUserConfig().e();
            message.f28513id = keyAt;
            org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(g2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(p0Var);
            g2Var.getSendMessagesHelper().s0(fjVar, arrayList, p0Var, false, false, qbVar.f38754f, null);
            i7 = message.f28513id;
        }
        qbVar.f();
        fc.e();
        org.telegram.messenger.g0.h3(new bi.w4(this, p0Var, !z12, g2Var.getCurrentAccount(), i7), 300L);
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void r() {
    }

    @Override
    public final void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
