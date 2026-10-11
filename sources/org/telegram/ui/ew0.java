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
    public final gi0 f37503a;
    public final zn f37504b;
    public final org.telegram.ui.Components.rm0 f37505c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.p80 f37506e;
    public final org.telegram.ui.Components.p80 f37507f;
    public final lw0 h;

    public ew0(lw0 lw0Var, gi0 gi0Var, zn znVar, org.telegram.ui.Components.rm0 rm0Var, LinearLayout linearLayout, org.telegram.ui.Components.p80 p80Var, org.telegram.ui.Components.p80 p80Var2) {
        this.h = lw0Var;
        this.f37503a = gi0Var;
        this.f37504b = znVar;
        this.f37505c = rm0Var;
        this.d = linearLayout;
        this.f37506e = p80Var;
        this.f37507f = p80Var2;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f37503a;
        ArrayList arrayList = gi0Var.f38133b;
        ArrayList arrayList2 = gi0Var.f38134c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            lw0 lw0Var = this.h;
            zn znVar = this.f37504b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20215id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20068id);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                lw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(lw0Var.getContext()), lw0Var.f39781b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f44897n1 = t10;
                t10.f30833j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.rm0 rm0Var = this.f37505c;
            rm0Var.requestLayout();
            this.d.requestLayout();
            rm0Var.getAdapter().l();
            this.f37506e.K(this.f37507f);
        }
    }
}
