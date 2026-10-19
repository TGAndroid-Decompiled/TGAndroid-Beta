package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lv0 implements View.OnClickListener {
    public final qh0 f39027a;
    public final qn f39028b;
    public final org.telegram.ui.Components.im0 f39029c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.i80 e;
    public final org.telegram.ui.Components.i80 f39030f;
    public final qv0 h;

    public lv0(qv0 qv0Var, qh0 qh0Var, qn qnVar, org.telegram.ui.Components.im0 im0Var, LinearLayout linearLayout, org.telegram.ui.Components.i80 i80Var, org.telegram.ui.Components.i80 i80Var2) {
        this.h = qv0Var;
        this.f39027a = qh0Var;
        this.f39028b = qnVar;
        this.f39029c = im0Var;
        this.d = linearLayout;
        this.e = i80Var;
        this.f39030f = i80Var2;
    }

    @Override
    public final void onClick(View view) {
        qh0 qh0Var = this.f39027a;
        ArrayList arrayList = qh0Var.f40572b;
        ArrayList arrayList2 = qh0Var.f40573c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            qv0 qv0Var = this.h;
            qn qnVar = this.f39028b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20420id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20273id);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                qv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && qnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qv0Var.getContext()), qv0Var.f40975b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                qnVar.f40769n1 = t10;
                t10.f29594j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.im0 im0Var = this.f39029c;
            im0Var.requestLayout();
            this.d.requestLayout();
            im0Var.getAdapter().l();
            this.e.K(this.f39030f);
        }
    }
}
