package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class cc implements fl0 {
    public final dc f24028a;

    public cc(dc dcVar) {
        this.f24028a = dcVar;
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        dc dcVar = this.f24028a;
        org.telegram.ui.ActionBar.m2 m2Var = dcVar.f24351f;
        if (dcVar.e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(m2Var.getCurrentAccount()).getClientUserId();
        if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < dcVar.e.size(); i11++) {
            int keyAt = dcVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = m2Var.getUserConfig().getClientUserId();
            message.f19237id = keyAt;
            MessageObject messageObject = new MessageObject(m2Var.getCurrentAccount(), message, false, false);
            ArrayList<ah.i1> arrayList = new ArrayList<>();
            arrayList.add(i1Var);
            m2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, i1Var, false, false, dcVar.f24351f, null);
            i10 = message.f19237id;
        }
        dcVar.f();
        sc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ej(this, i1Var, !z12, m2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final void y() {
    }

    @Override
    public final void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
