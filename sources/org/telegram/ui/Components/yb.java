package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class yb implements el0 {
    public final zb f32875a;

    public yb(zb zbVar) {
        this.f32875a = zbVar;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        zb zbVar = this.f32875a;
        org.telegram.ui.ActionBar.o2 o2Var = zbVar.f33218f;
        if (zbVar.e == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId();
        if ((o2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) o2Var).a() == clientUserId) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < zbVar.e.size(); i11++) {
            int keyAt = zbVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = o2Var.getUserConfig().getClientUserId();
            message.f20365id = keyAt;
            MessageObject messageObject = new MessageObject(o2Var.getCurrentAccount(), message, false, false);
            ArrayList<ah.i1> arrayList = new ArrayList<>();
            arrayList.add(i1Var);
            o2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, i1Var, false, false, zbVar.f33218f, null);
            i10 = message.f20365id;
        }
        zbVar.f();
        oc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.zi(this, i1Var, !z12, o2Var.getCurrentAccount(), i10), 300L);
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void u() {
    }

    @Override
    public final void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
