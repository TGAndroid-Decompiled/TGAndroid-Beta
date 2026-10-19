package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ac implements bl0 {
    public final bc f24539a;

    public ac(bc bcVar) {
        this.f24539a = bcVar;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        bc bcVar = this.f24539a;
        org.telegram.ui.ActionBar.n2 n2Var = bcVar.f24903f;
        if (bcVar.e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        if ((n2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) n2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bcVar.e.size(); i11++) {
            int keyAt = bcVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.f20294id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<ah.i1> arrayList = new ArrayList<>();
            arrayList.add(i1Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, i1Var, false, false, bcVar.f24903f, null);
            i10 = message.f20294id;
        }
        bcVar.f();
        qc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.wi(this, i1Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void v() {
    }

    @Override
    public final void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
