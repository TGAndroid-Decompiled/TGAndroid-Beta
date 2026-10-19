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
    public final ph0 f39062a;
    public final qn f39063b;
    public final org.telegram.ui.Components.im0 f39064c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.i80 e;
    public final org.telegram.ui.Components.i80 f39065f;
    public final qv0 h;

    public lv0(qv0 qv0Var, ph0 ph0Var, qn qnVar, org.telegram.ui.Components.im0 im0Var, LinearLayout linearLayout, org.telegram.ui.Components.i80 i80Var, org.telegram.ui.Components.i80 i80Var2) {
        this.h = qv0Var;
        this.f39062a = ph0Var;
        this.f39063b = qnVar;
        this.f39064c = im0Var;
        this.d = linearLayout;
        this.e = i80Var;
        this.f39065f = i80Var2;
    }

    @Override
    public final void onClick(View view) {
        ph0 ph0Var = this.f39062a;
        ArrayList arrayList = ph0Var.f40233b;
        ArrayList arrayList2 = ph0Var.f40234c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            qv0 qv0Var = this.h;
            qn qnVar = this.f39063b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20422id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20275id);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                qv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && qnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qv0Var.getContext()), qv0Var.f40983b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                qnVar.f40777n1 = t10;
                t10.f29596j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.im0 im0Var = this.f39064c;
            im0Var.requestLayout();
            this.d.requestLayout();
            im0Var.getAdapter().l();
            this.e.K(this.f39065f);
        }
    }
}
