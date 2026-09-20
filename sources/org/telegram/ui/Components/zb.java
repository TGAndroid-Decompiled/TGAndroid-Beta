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
    public final ac f30800a;

    public zb(ac acVar) {
        this.f30800a = acVar;
    }

    @Override
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        ac acVar = this.f30800a;
        org.telegram.ui.ActionBar.n2 n2Var = acVar.f22645f;
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
            message.f18349id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.o0> arrayList = new ArrayList<>();
            arrayList.add(o0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, o0Var, false, false, acVar.f22645f, null);
            i10 = message.f18349id;
        }
        acVar.f();
        pc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rj(this, o0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
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
    public final boolean r() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
