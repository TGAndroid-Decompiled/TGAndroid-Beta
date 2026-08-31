package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class sb implements qk0 {
    public final tb f31026a;

    public sb(tb tbVar) {
        this.f31026a = tbVar;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
        boolean z11;
        tb tbVar = this.f31026a;
        org.telegram.ui.ActionBar.p2 p2Var = tbVar.f31310f;
        if (tbVar.f31309e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(p2Var.getCurrentAccount()).getClientUserId();
        if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).a() == clientUserId) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < tbVar.f31309e.size(); i11++) {
            int keyAt = tbVar.f31309e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = p2Var.getUserConfig().getClientUserId();
            message.f20864id = keyAt;
            MessageObject messageObject = new MessageObject(p2Var.getCurrentAccount(), message, false, false);
            ArrayList<ng.q0> arrayList = new ArrayList<>();
            arrayList.add(q0Var);
            p2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, q0Var, false, false, tbVar.f31310f, null);
            i10 = message.f20864id;
        }
        tbVar.f();
        ic.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.uj(this, q0Var, !z11, p2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void m() {
    }

    @Override
    public final void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
