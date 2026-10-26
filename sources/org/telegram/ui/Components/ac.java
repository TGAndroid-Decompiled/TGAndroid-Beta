package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ac implements el0 {
    public final bc f26463a;

    public ac(bc bcVar) {
        this.f26463a = bcVar;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        bc bcVar = this.f26463a;
        org.telegram.ui.ActionBar.r2 r2Var = bcVar.f26820f;
        if (bcVar.e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(r2Var.getCurrentAccount()).getClientUserId();
        if ((r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bcVar.e.size(); i11++) {
            int keyAt = bcVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = r2Var.getUserConfig().getClientUserId();
            message.f22048id = keyAt;
            MessageObject messageObject = new MessageObject(r2Var.getCurrentAccount(), message, false, false);
            ArrayList<bh.x0> arrayList = new ArrayList<>();
            arrayList.add(x0Var);
            r2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, x0Var, false, false, bcVar.f26820f, null);
            i10 = message.f22048id;
        }
        bcVar.f();
        qc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.bj(this, x0Var, !z12, r2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final void m() {
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
