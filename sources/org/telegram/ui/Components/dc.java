package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class dc implements kl0 {
    public final ec f25641a;

    public dc(ec ecVar) {
        this.f25641a = ecVar;
    }

    @Override
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        boolean z12;
        ec ecVar = this.f25641a;
        org.telegram.ui.ActionBar.n2 n2Var = ecVar.f26005f;
        if (ecVar.f26004e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < ecVar.f26004e.size(); i11++) {
            int keyAt = ecVar.f26004e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.f20063id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.n0> arrayList = new ArrayList<>();
            arrayList.add(n0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, n0Var, false, false, ecVar.f26005f, null);
            i10 = message.f20063id;
        }
        ecVar.f();
        tc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.bj(this, n0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
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
    public final boolean v() {
        return false;
    }

    @Override
    public final void s() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
