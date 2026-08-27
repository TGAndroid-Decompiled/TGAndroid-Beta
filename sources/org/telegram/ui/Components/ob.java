package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class ob implements vj0 {

    public final pb f31249a;

    public ob(pb pbVar) {
        this.f31249a = pbVar;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        pb pbVar = this.f31249a;
        org.telegram.ui.ActionBar.n2 n2Var = pbVar.f31576f;
        if (pbVar.f31575e == null) {
            return;
        }
        boolean z12 = (n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).a() == UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < pbVar.f31575e.size(); i11++) {
            int iKeyAt = pbVar.f31575e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.f22401id = iKeyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<ig.q0> arrayList = new ArrayList<>();
            arrayList.add(q0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, q0Var, false, false, pbVar.f31576f, null);
            i10 = message.f22401id;
        }
        pbVar.f();
        ec.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.nj(this, q0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void s() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
