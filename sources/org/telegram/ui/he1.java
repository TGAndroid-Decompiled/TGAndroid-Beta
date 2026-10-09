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
public final class he1 implements View.OnClickListener {
    public final hi0 f38303a;
    public final zn f38304b;
    public final org.telegram.ui.Components.qm0 f38305c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.p80 f38306e;
    public final org.telegram.ui.Components.p80 f38307f;
    public final me1 h;

    public he1(me1 me1Var, hi0 hi0Var, zn znVar, org.telegram.ui.Components.qm0 qm0Var, LinearLayout linearLayout, org.telegram.ui.Components.p80 p80Var, org.telegram.ui.Components.p80 p80Var2) {
        this.h = me1Var;
        this.f38303a = hi0Var;
        this.f38304b = znVar;
        this.f38305c = qm0Var;
        this.d = linearLayout;
        this.f38306e = p80Var;
        this.f38307f = p80Var2;
    }

    @Override
    public final void onClick(View view) {
        hi0 hi0Var = this.f38303a;
        ArrayList arrayList = hi0Var.f38352b;
        ArrayList arrayList2 = hi0Var.f38353c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            me1 me1Var = this.h;
            zn znVar = this.f38304b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20185id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20038id);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                me1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.tc t10 = new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(me1Var.getContext()), me1Var.f39878a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f44864n1 = t10;
                t10.f31130j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.qm0 qm0Var = this.f38305c;
            qm0Var.requestLayout();
            this.d.requestLayout();
            qm0Var.getAdapter().l();
            this.f38306e.K(this.f38307f);
        }
    }
}
