package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class sb implements ok0 {
    public final tb f28685a;

    public sb(tb tbVar) {
        this.f28685a = tbVar;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        boolean z11;
        tb tbVar = this.f28685a;
        org.telegram.ui.ActionBar.p2 p2Var = tbVar.f28951f;
        if (tbVar.e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(p2Var.getCurrentAccount()).getClientUserId();
        if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).a() == clientUserId) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < tbVar.e.size(); i11++) {
            int keyAt = tbVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = p2Var.getUserConfig().getClientUserId();
            message.f19205id = keyAt;
            MessageObject messageObject = new MessageObject(p2Var.getCurrentAccount(), message, false, false);
            ArrayList<mg.q0> arrayList = new ArrayList<>();
            arrayList.add(q0Var);
            p2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, q0Var, false, false, tbVar.f28951f, null);
            i10 = message.f19205id;
        }
        tbVar.f();
        ic.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.uj(this, q0Var, !z11, p2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
