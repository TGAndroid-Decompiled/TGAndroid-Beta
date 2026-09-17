package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class yb implements fk0 {
    public final zb f30162a;

    public yb(zb zbVar) {
        this.f30162a = zbVar;
    }

    @Override
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        zb zbVar = this.f30162a;
        org.telegram.ui.ActionBar.o2 o2Var = zbVar.f30460f;
        if (zbVar.e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId();
        if ((o2Var instanceof org.telegram.ui.bo) && ((org.telegram.ui.bo) o2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < zbVar.e.size(); i11++) {
            int keyAt = zbVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = o2Var.getUserConfig().getClientUserId();
            message.f18142id = keyAt;
            MessageObject messageObject = new MessageObject(o2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.p0> arrayList = new ArrayList<>();
            arrayList.add(p0Var);
            o2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, p0Var, false, false, zbVar.f30460f, null);
            i10 = message.f18142id;
        }
        zbVar.f();
        oc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.sj(this, p0Var, !z12, o2Var.getCurrentAccount(), i10), 300L);
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
