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
    public final gi0 f36223a;
    public final co f36224b;
    public final org.telegram.ui.Components.ll0 f36225c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.n70 f36226e;
    public final org.telegram.ui.Components.n70 f36227f;
    public final lw0 h;

    public ew0(lw0 lw0Var, gi0 gi0Var, co coVar, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, org.telegram.ui.Components.n70 n70Var, org.telegram.ui.Components.n70 n70Var2) {
        this.h = lw0Var;
        this.f36223a = gi0Var;
        this.f36224b = coVar;
        this.f36225c = ll0Var;
        this.d = linearLayout;
        this.f36226e = n70Var;
        this.f36227f = n70Var2;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f36223a;
        ArrayList arrayList = gi0Var.f36710b;
        ArrayList arrayList2 = gi0Var.f36711c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            lw0 lw0Var = this.h;
            co coVar = this.f36224b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20043id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19896id);
                }
                coVar.presentFragment(new ProfileActivity(bundle, null));
                lw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && coVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(lw0Var.getContext()), lw0Var.f38519b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                coVar.f35375n1 = t10;
                t10.f29706j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ll0 ll0Var = this.f36225c;
            ll0Var.requestLayout();
            this.d.requestLayout();
            ll0Var.getAdapter().l();
            this.f36226e.K(this.f36227f);
        }
    }
}
