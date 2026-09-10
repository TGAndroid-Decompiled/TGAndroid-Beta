package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class zb implements ok0 {
    public final ac f29637a;

    public zb(ac acVar) {
        this.f29637a = acVar;
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
    public final void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        ac acVar = this.f29637a;
        org.telegram.ui.ActionBar.p2 p2Var = acVar.f21459f;
        if (acVar.e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(p2Var.getCurrentAccount()).getClientUserId();
        if ((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < acVar.e.size(); i11++) {
            int keyAt = acVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = p2Var.getUserConfig().getClientUserId();
            message.f17216id = keyAt;
            MessageObject messageObject = new MessageObject(p2Var.getCurrentAccount(), message, false, false);
            ArrayList<yg.p0> arrayList = new ArrayList<>();
            arrayList.add(p0Var);
            p2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, p0Var, false, false, acVar.f21459f, null);
            i10 = message.f17216id;
        }
        acVar.f();
        pc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ak(this, p0Var, !z12, p2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void s() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
