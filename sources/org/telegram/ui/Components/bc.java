package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class bc implements rk0 {
    public final cc f24916a;

    public bc(cc ccVar) {
        this.f24916a = ccVar;
    }

    @Override
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        cc ccVar = this.f24916a;
        org.telegram.ui.ActionBar.n2 n2Var = ccVar.f25313f;
        if (ccVar.f25312e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        if ((n2Var instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < ccVar.f25312e.size(); i11++) {
            int keyAt = ccVar.f25312e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.f20058id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.o0> arrayList = new ArrayList<>();
            arrayList.add(o0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, o0Var, false, false, ccVar.f25313f, null);
            i10 = message.f20058id;
        }
        ccVar.f();
        rc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qj(this, o0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
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
    public final boolean p() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
