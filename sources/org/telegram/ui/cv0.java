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
public final class cv0 implements View.OnClickListener {
    public final oh0 f37227a;
    public final tn f37228b;
    public final org.telegram.ui.Components.jl0 f37229c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.j70 f37230e;
    public final org.telegram.ui.Components.j70 f37231f;
    public final iv0 h;

    public cv0(iv0 iv0Var, oh0 oh0Var, tn tnVar, org.telegram.ui.Components.jl0 jl0Var, LinearLayout linearLayout, org.telegram.ui.Components.j70 j70Var, org.telegram.ui.Components.j70 j70Var2) {
        this.h = iv0Var;
        this.f37227a = oh0Var;
        this.f37228b = tnVar;
        this.f37229c = jl0Var;
        this.d = linearLayout;
        this.f37230e = j70Var;
        this.f37231f = j70Var2;
    }

    @Override
    public final void onClick(View view) {
        oh0 oh0Var = this.f37227a;
        ArrayList arrayList = oh0Var.f41128b;
        ArrayList arrayList2 = oh0Var.f41129c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            iv0 iv0Var = this.h;
            tn tnVar = this.f37228b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f22539id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22392id);
                }
                tnVar.presentFragment(new ProfileActivity(bundle, null));
                iv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && tnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.mc t10 = new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(iv0Var.getContext()), iv0Var.f39343b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                tnVar.f42852j1 = t10;
                t10.f30652j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.jl0 jl0Var = this.f37229c;
            jl0Var.requestLayout();
            this.d.requestLayout();
            jl0Var.getAdapter().l();
            this.f37230e.K(this.f37231f);
        }
    }
}
