package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class zb implements rk0 {
    public final ac f30870a;

    public zb(ac acVar) {
        this.f30870a = acVar;
    }

    @Override
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        ac acVar = this.f30870a;
        org.telegram.ui.ActionBar.n2 n2Var = acVar.f22618f;
        if (acVar.e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < acVar.e.size(); i11++) {
            int keyAt = acVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.f18364id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.p0> arrayList = new ArrayList<>();
            arrayList.add(p0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, p0Var, false, false, acVar.f22618f, null);
            i10 = message.f18364id;
        }
        acVar.f();
        pc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rj(this, p0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
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
    public final void o() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
