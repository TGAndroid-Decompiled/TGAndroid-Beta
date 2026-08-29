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
public final class ad1 implements View.OnClickListener {
    public final oh0 f36514a;
    public final tn f36515b;
    public final org.telegram.ui.Components.jl0 f36516c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.j70 f36517e;
    public final org.telegram.ui.Components.j70 f36518f;
    public final fd1 h;

    public ad1(fd1 fd1Var, oh0 oh0Var, tn tnVar, org.telegram.ui.Components.jl0 jl0Var, LinearLayout linearLayout, org.telegram.ui.Components.j70 j70Var, org.telegram.ui.Components.j70 j70Var2) {
        this.h = fd1Var;
        this.f36514a = oh0Var;
        this.f36515b = tnVar;
        this.f36516c = jl0Var;
        this.d = linearLayout;
        this.f36517e = j70Var;
        this.f36518f = j70Var2;
    }

    @Override
    public final void onClick(View view) {
        oh0 oh0Var = this.f36514a;
        ArrayList arrayList = oh0Var.f41128b;
        ArrayList arrayList2 = oh0Var.f41129c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            fd1 fd1Var = this.h;
            tn tnVar = this.f36515b;
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
                fd1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && tnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.mc t10 = new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(fd1Var.getContext()), fd1Var.f38108a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                tnVar.f42852j1 = t10;
                t10.f30652j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.jl0 jl0Var = this.f36516c;
            jl0Var.requestLayout();
            this.d.requestLayout();
            jl0Var.getAdapter().l();
            this.f36517e.K(this.f36518f);
        }
    }
}
