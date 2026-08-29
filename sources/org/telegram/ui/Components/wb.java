package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class wb implements ek0 {
    public final xb f34362a;

    public wb(xb xbVar) {
        this.f34362a = xbVar;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        boolean z12;
        xb xbVar = this.f34362a;
        org.telegram.ui.ActionBar.o2 o2Var = xbVar.f34671f;
        if (xbVar.f34670e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId();
        if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < xbVar.f34670e.size(); i11++) {
            int keyAt = xbVar.f34670e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = o2Var.getUserConfig().getClientUserId();
            message.f22413id = keyAt;
            MessageObject messageObject = new MessageObject(o2Var.getCurrentAccount(), message, false, false);
            ArrayList<kg.q0> arrayList = new ArrayList<>();
            arrayList.add(q0Var);
            o2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, q0Var, false, false, xbVar.f34671f, null);
            i10 = message.f22413id;
        }
        xbVar.f();
        mc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qj(this, q0Var, !z12, o2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
