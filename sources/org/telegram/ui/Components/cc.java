package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class cc implements ml0 {
    public final dc f24922a;

    public cc(dc dcVar) {
        this.f24922a = dcVar;
    }

    @Override
    public final void h(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        boolean z12;
        dc dcVar = this.f24922a;
        org.telegram.ui.ActionBar.m2 m2Var = dcVar.f25305f;
        if (dcVar.f25304e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(m2Var.getCurrentAccount()).getClientUserId();
        if ((m2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) m2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < dcVar.f25304e.size(); i11++) {
            int keyAt = dcVar.f25304e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = m2Var.getUserConfig().getClientUserId();
            message.f19823id = keyAt;
            MessageObject messageObject = new MessageObject(m2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.n0> arrayList = new ArrayList<>();
            arrayList.add(n0Var);
            m2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, n0Var, false, false, dcVar.f25305f, null);
            i10 = message.f19823id;
        }
        dcVar.f();
        sc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.hj(this, n0Var, !z12, m2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void p() {
    }

    @Override
    public final void o(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
