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
public final class fw0 implements View.OnClickListener {
    public final gi0 f33632a;
    public final zn f33633b;
    public final org.telegram.ui.Components.wl0 f33634c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.w70 e;
    public final org.telegram.ui.Components.w70 f33635f;
    public final mw0 h;

    public fw0(mw0 mw0Var, gi0 gi0Var, zn znVar, org.telegram.ui.Components.wl0 wl0Var, LinearLayout linearLayout, org.telegram.ui.Components.w70 w70Var, org.telegram.ui.Components.w70 w70Var2) {
        this.h = mw0Var;
        this.f33632a = gi0Var;
        this.f33633b = znVar;
        this.f33634c = wl0Var;
        this.d = linearLayout;
        this.e = w70Var;
        this.f33635f = w70Var2;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f33632a;
        ArrayList arrayList = gi0Var.f33878b;
        ArrayList arrayList2 = gi0Var.f33879c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            mw0 mw0Var = this.h;
            zn znVar = this.f33633b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f18443id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18296id);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                mw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(mw0Var.getContext()), mw0Var.f35754b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f40363n1 = t10;
                t10.f27550j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.wl0 wl0Var = this.f33634c;
            wl0Var.requestLayout();
            this.d.requestLayout();
            wl0Var.getAdapter().l();
            this.e.K(this.f33635f);
        }
    }
}
