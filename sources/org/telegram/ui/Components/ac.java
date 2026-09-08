package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ac implements ek0 {
    public final bc f24355a;

    public ac(bc bcVar) {
        this.f24355a = bcVar;
    }

    @Override
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        boolean z12;
        bc bcVar = this.f24355a;
        org.telegram.ui.ActionBar.n2 n2Var = bcVar.f24685f;
        if (bcVar.f24684e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        if ((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bcVar.f24684e.size(); i11++) {
            int keyAt = bcVar.f24684e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.f19917id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<ah.j1> arrayList = new ArrayList<>();
            arrayList.add(j1Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, j1Var, false, false, bcVar.f24685f, null);
            i10 = message.f19917id;
        }
        bcVar.f();
        qc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.sj(this, j1Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void J() {
    }

    @Override
    public final void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
