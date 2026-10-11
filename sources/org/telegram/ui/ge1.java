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
public final class ge1 implements View.OnClickListener {
    public final gi0 f38061a;
    public final zn f38062b;
    public final org.telegram.ui.Components.sm0 f38063c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.q80 f38064e;
    public final org.telegram.ui.Components.q80 f38065f;
    public final le1 h;

    public ge1(le1 le1Var, gi0 gi0Var, zn znVar, org.telegram.ui.Components.sm0 sm0Var, LinearLayout linearLayout, org.telegram.ui.Components.q80 q80Var, org.telegram.ui.Components.q80 q80Var2) {
        this.h = le1Var;
        this.f38061a = gi0Var;
        this.f38062b = znVar;
        this.f38063c = sm0Var;
        this.d = linearLayout;
        this.f38064e = q80Var;
        this.f38065f = q80Var2;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f38061a;
        ArrayList arrayList = gi0Var.f38099b;
        ArrayList arrayList2 = gi0Var.f38100c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            le1 le1Var = this.h;
            zn znVar = this.f38062b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20179id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20032id);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                le1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(le1Var.getContext()), le1Var.f39632a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f44863n1 = t10;
                t10.f30711j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.sm0 sm0Var = this.f38063c;
            sm0Var.requestLayout();
            this.d.requestLayout();
            sm0Var.getAdapter().l();
            this.f38064e.K(this.f38065f);
        }
    }
}
