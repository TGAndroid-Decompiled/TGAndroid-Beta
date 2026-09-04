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
public final class ew0 implements View.OnClickListener {
    public final gi0 f36196a;
    public final co f36197b;
    public final org.telegram.ui.Components.ll0 f36198c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.n70 f36199e;
    public final org.telegram.ui.Components.n70 f36200f;
    public final lw0 h;

    public ew0(lw0 lw0Var, gi0 gi0Var, co coVar, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, org.telegram.ui.Components.n70 n70Var, org.telegram.ui.Components.n70 n70Var2) {
        this.h = lw0Var;
        this.f36196a = gi0Var;
        this.f36197b = coVar;
        this.f36198c = ll0Var;
        this.d = linearLayout;
        this.f36199e = n70Var;
        this.f36200f = n70Var2;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f36196a;
        ArrayList arrayList = gi0Var.f36683b;
        ArrayList arrayList2 = gi0Var.f36684c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            lw0 lw0Var = this.h;
            co coVar = this.f36197b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20016id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19869id);
                }
                coVar.presentFragment(new ProfileActivity(bundle, null));
                lw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && coVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(lw0Var.getContext()), lw0Var.f38492b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                coVar.f35348n1 = t10;
                t10.f29679j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ll0 ll0Var = this.f36198c;
            ll0Var.requestLayout();
            this.d.requestLayout();
            ll0Var.getAdapter().l();
            this.f36199e.K(this.f36200f);
        }
    }
}
