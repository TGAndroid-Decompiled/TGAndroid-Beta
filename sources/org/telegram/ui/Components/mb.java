package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mb implements ii0 {
    public final nb f36046a;

    public mb(nb nbVar) {
        this.f36046a = nbVar;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        boolean z11;
        nb nbVar = this.f36046a;
        org.telegram.ui.ActionBar.f2 f2Var = nbVar.f36318f;
        if (nbVar.f36317e == null) {
            return;
        }
        long e10 = org.telegram.messenger.p10.i(f2Var.getCurrentAccount()).e();
        if ((f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).a() == e10) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < nbVar.f36317e.size(); i10++) {
            int keyAt = nbVar.f36317e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = f2Var.getUserConfig().e();
            message.f26977id = keyAt;
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(f2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(o0Var);
            f2Var.getSendMessagesHelper().s0(ijVar, arrayList, o0Var, false, false, nbVar.f36318f, null);
            i7 = message.f26977id;
        }
        nbVar.f();
        cc.e();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.rw(this, o0Var, !z11, f2Var.getCurrentAccount(), i7), 300L);
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void M() {
    }

    @Override
    public final void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
