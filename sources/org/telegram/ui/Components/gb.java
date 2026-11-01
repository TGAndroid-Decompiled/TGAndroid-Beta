package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gb implements mj0 {
    public final hb f26377a;

    public gb(hb hbVar) {
        this.f26377a = hbVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        hb hbVar = this.f26377a;
        org.telegram.ui.ActionBar.k2 k2Var = hbVar.f26742f;
        if (hbVar.e == null) {
            return;
        }
        long e = org.telegram.messenger.e20.i(k2Var.getCurrentAccount()).e();
        if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).a() == e) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < hbVar.e.size(); i11++) {
            int keyAt = hbVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = k2Var.getUserConfig().e();
            message.f19815id = keyAt;
            org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(k2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(o0Var);
            k2Var.getSendMessagesHelper().s0(kjVar, arrayList, o0Var, false, false, hbVar.f26742f, null);
            i10 = message.f19815id;
        }
        hbVar.f();
        wb.e();
        org.telegram.messenger.i0.h3(new org.telegram.messenger.ex(this, o0Var, !z12, k2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final void t() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
