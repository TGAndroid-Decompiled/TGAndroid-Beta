package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class qb implements tj0 {
    public final rb f31877a;

    public qb(rb rbVar) {
        this.f31877a = rbVar;
    }

    @Override
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        boolean z12;
        rb rbVar = this.f31877a;
        org.telegram.ui.ActionBar.o2 o2Var = rbVar.f32124f;
        if (rbVar.f32123e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId();
        if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < rbVar.f32123e.size(); i10++) {
            int keyAt = rbVar.f32123e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = o2Var.getUserConfig().getClientUserId();
            message.f22401id = keyAt;
            MessageObject messageObject = new MessageObject(o2Var.getCurrentAccount(), message, false, false);
            ArrayList<hg.r0> arrayList = new ArrayList<>();
            arrayList.add(r0Var);
            o2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, r0Var, false, false, rbVar.f32124f, null);
            i9 = message.f22401id;
        }
        rbVar.f();
        gc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.jj(this, r0Var, !z12, o2Var.getCurrentAccount(), i9), 300L);
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void t() {
    }

    @Override
    public final void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
