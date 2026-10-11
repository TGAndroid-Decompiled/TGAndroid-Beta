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
    public final gi0 f37469a;
    public final zn f37470b;
    public final org.telegram.ui.Components.sm0 f37471c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.q80 f37472e;
    public final org.telegram.ui.Components.q80 f37473f;
    public final lw0 h;

    public ew0(lw0 lw0Var, gi0 gi0Var, zn znVar, org.telegram.ui.Components.sm0 sm0Var, LinearLayout linearLayout, org.telegram.ui.Components.q80 q80Var, org.telegram.ui.Components.q80 q80Var2) {
        this.h = lw0Var;
        this.f37469a = gi0Var;
        this.f37470b = znVar;
        this.f37471c = sm0Var;
        this.d = linearLayout;
        this.f37472e = q80Var;
        this.f37473f = q80Var2;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f37469a;
        ArrayList arrayList = gi0Var.f38099b;
        ArrayList arrayList2 = gi0Var.f38100c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            lw0 lw0Var = this.h;
            zn znVar = this.f37470b;
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
                lw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(lw0Var.getContext()), lw0Var.f39747b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f44863n1 = t10;
                t10.f30711j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.sm0 sm0Var = this.f37471c;
            sm0Var.requestLayout();
            this.d.requestLayout();
            sm0Var.getAdapter().l();
            this.f37472e.K(this.f37473f);
        }
    }
}
