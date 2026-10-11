package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class cc implements ll0 {
    public final dc f25187a;

    public cc(dc dcVar) {
        this.f25187a = dcVar;
    }

    @Override
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        boolean z12;
        dc dcVar = this.f25187a;
        org.telegram.ui.ActionBar.m2 m2Var = dcVar.f25530f;
        if (dcVar.f25529e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(m2Var.getCurrentAccount()).getClientUserId();
        if ((m2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) m2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < dcVar.f25529e.size(); i11++) {
            int keyAt = dcVar.f25529e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = m2Var.getUserConfig().getClientUserId();
            message.f20053id = keyAt;
            MessageObject messageObject = new MessageObject(m2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.n0> arrayList = new ArrayList<>();
            arrayList.add(n0Var);
            m2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, n0Var, false, false, dcVar.f25530f, null);
            i10 = message.f20053id;
        }
        dcVar.f();
        sc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.bj(this, n0Var, !z12, m2Var.getCurrentAccount(), i10), 300L);
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
