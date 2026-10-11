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
    public final gi0 f38095a;
    public final zn f38096b;
    public final org.telegram.ui.Components.rm0 f38097c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.p80 f38098e;
    public final org.telegram.ui.Components.p80 f38099f;
    public final le1 h;

    public ge1(le1 le1Var, gi0 gi0Var, zn znVar, org.telegram.ui.Components.rm0 rm0Var, LinearLayout linearLayout, org.telegram.ui.Components.p80 p80Var, org.telegram.ui.Components.p80 p80Var2) {
        this.h = le1Var;
        this.f38095a = gi0Var;
        this.f38096b = znVar;
        this.f38097c = rm0Var;
        this.d = linearLayout;
        this.f38098e = p80Var;
        this.f38099f = p80Var2;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f38095a;
        ArrayList arrayList = gi0Var.f38133b;
        ArrayList arrayList2 = gi0Var.f38134c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            le1 le1Var = this.h;
            zn znVar = this.f38096b;
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
                le1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(le1Var.getContext()), le1Var.f39666a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f44897n1 = t10;
                t10.f30833j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.rm0 rm0Var = this.f38097c;
            rm0Var.requestLayout();
            this.d.requestLayout();
            rm0Var.getAdapter().l();
            this.f38098e.K(this.f38099f);
        }
    }
}
